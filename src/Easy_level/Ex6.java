package Easy_level;

public class Ex6 {
    public int climbStairs(int n) {
        if (n == 0 || n == 1) return 1;

        int [] results = new int[n + 1];
        results[0]= 1;
        results[1]=1;
        for (int i = 2; i <= n ; i++) {
            results[i] = results [i -1] + results[i-2];
        }
        return results[n];
    }

    public static void main(String[] args) {
        Ex6 ex6 = new Ex6();
        int n = 10;
        System.out.println(ex6.climbStairs(n));
    }
}
