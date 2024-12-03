package Studies.Lab5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ZadB {

    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("plikNIO1.txt");
             FileChannel writeChannel = fos.getChannel()) {

            ByteBuffer buffer = ByteBuffer.allocate(4096);

            for (int i = 1000; i <= 5000; i++) {
                String number = String.valueOf(i);
                String separator = (i % 10 == 0) ? "\n" : ",";

                if (buffer.remaining() < number.length() + separator.length()) {
                    buffer.flip();
                    writeChannel.write(buffer);
                    buffer.clear();
                }

                buffer.put(number.getBytes());
                buffer.put(separator.getBytes());
            }

            if (buffer.position() > 0) {
                buffer.flip();
                writeChannel.write(buffer);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        copyFile("plikNIO1.txt", "plikNIO2.txt");
    }

    public static void copyFile(String sourcePath, String destinationPath) {
        try (FileInputStream fis = new FileInputStream(sourcePath);
             FileOutputStream fos = new FileOutputStream(destinationPath);
             FileChannel sourceChannel = fis.getChannel();
             FileChannel destinationChannel = fos.getChannel()) {

            ByteBuffer buffer = ByteBuffer.allocate(4096);

            while (sourceChannel.read(buffer) > 0) {
                buffer.flip();
                destinationChannel.write(buffer);
                buffer.clear();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
