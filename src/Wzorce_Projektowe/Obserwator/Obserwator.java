package Wzorce_Projektowe.Obserwator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Interfejs klienta
interface Client {
    void receiveMessage(String message);

    String name();

    int id();
}

record ClientImpl(int id, String name) implements Client {
    @Override
    public void receiveMessage(String message) {
        System.out.println("[" + name + "] Received: " + message);
    }

    public void sendMessage(Server server, String message) {
        server.broadcastMessage(this, message);
    }
}


// Interfejs Serwera
interface Server {
    void addClient(Client client);

    void removeClient(Client client);

    void broadcastMessage(Client sender, String message);
}

class ServerImpl implements Server {
    final List<Client> clients = new ArrayList<>();

    // dodawanie klienta do serwera
    @Override
    public void addClient(Client client) {
        clients.add(client);
        System.out.println("Client " + client.name() + " (ID: " + client.id() + ") connected to the server.");
    }

    // usuwanie klienta
    @Override
    public void removeClient(Client client) {
        clients.remove(client);
        System.out.println("Client " + client.name() + " (ID: " + client.id() + ") disconnected from the server.");
    }

    // wysylanie wiadomosci do podlaczonych klientow
    @Override
    public void broadcastMessage(Client sender, String message) {
        for (Client client : clients) {
            if (client != sender) {
                client.receiveMessage("From " + sender.name() + ": " + message);
            }
        }
    }
}


public class Obserwator{

    // funkcja sprawdza czy klient jest podlaczony do serwera
    private static boolean serverContainsClient(Server server, ClientImpl client) {
        return server != null && ((ServerImpl) server).clients.contains(client);
    }

    public static void main(String[] args) {
        Server server = new ServerImpl();
        List<ClientImpl> allClients = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        boolean running = true;
        int clientIdCounter = 1;

        while (running) {
            System.out.println("\n--- Server Menu ---");
            System.out.println("1. Create New Client");
            System.out.println("2. Add Client to Server");
            System.out.println("3. Remove Client from Server");
            System.out.println("4. Send Message");
            System.out.println("5. Exit");
            System.out.println();
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter client name: ");
                    String name = scanner.nextLine();
                    ClientImpl newClient = new ClientImpl(clientIdCounter++, name);
                    allClients.add(newClient);
                    System.out.println("Client " + name + " created with ID " + newClient.id() + ".");
                }
                case 2 -> {
                    System.out.println("Available clients:");
                    for (ClientImpl client : allClients) {
                        if (!serverContainsClient(server, client)) {
                            System.out.println(client.id() + ". " + client.name());
                        }
                    }
                    System.out.print("Enter Client ID to add: ");
                    int idToAdd = scanner.nextInt();
                    scanner.nextLine();

                    allClients.stream()
                            .filter(client -> client.id() == idToAdd && !serverContainsClient(server, client))
                            .findFirst()
                            .ifPresentOrElse(server::addClient, () -> System.out.println("Invalid Client ID or already connected."));
                }
                case 3 -> {
                    System.out.println("Connected clients:");
                    for (ClientImpl client : allClients) {
                        if (serverContainsClient(server, client)) {
                            System.out.println(client.id() + ". " + client.name());
                        }
                    }
                    System.out.print("Enter Client ID to remove: ");
                    int idToRemove = scanner.nextInt();
                    scanner.nextLine();

                    allClients.stream()
                            .filter(client -> client.id() == idToRemove && serverContainsClient(server, client))
                            .findFirst()
                            .ifPresentOrElse(server::removeClient, () -> System.out.println("Invalid Client ID or not connected."));
                }
                case 4 -> {
                    System.out.println("Connected clients:");
                    for (ClientImpl client : allClients) {
                        if (serverContainsClient(server, client)) {
                            System.out.println(client.id() + ". " + client.name());
                        }
                    }
                    System.out.print("Enter your Client ID: ");
                    int senderId = scanner.nextInt();
                    scanner.nextLine();

                    allClients.stream()
                            .filter(client -> client.id() == senderId && serverContainsClient(server, client))
                            .findFirst()
                            .ifPresentOrElse(sender -> {
                                System.out.print("Enter message: ");
                                String message = scanner.nextLine();
                                sender.sendMessage(server, message);
                            }, () -> System.out.println("Invalid Client ID or not connected."));
                }
                case 5 -> running = false;
                default -> System.out.println("Invalid option. Try again.");
            }
        }

        scanner.close();
    }


}