package TimeComplexity;

public class Problem1 {
    static void primeNumber(int n) {
        int i, m = 0, flag = 0;
        m = n / 2;
        if (n == 0 || n == 1) {
            System.out.println(n + " bukan bilangan prima");
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println(n + " bukan bilangan prima");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(n + " bilangan prima");
            }
        }
    }

    public static void main(String[] args) {
        primeNumber(1000000007);
        primeNumber(13);
        primeNumber(17);
        primeNumber(20);
        primeNumber(35);
    }
}
