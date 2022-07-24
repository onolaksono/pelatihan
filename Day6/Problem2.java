public class Problem2 {
    static int fib(int n) {
        if (n <= 1)
            return n;
        // System.out.print(fib(n - 1) + fib(n - 2));
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String args[]) {
        int n = 4;
        System.out.println("\n" + fib(n - 1));
    }
}
