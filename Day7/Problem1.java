public class Problem1 {
    static int Fibonacci(int N) {
        if (N <= 1)
            return N;
        return Fibonacci(N - 1) + Fibonacci(N - 2);
    }

    public static void main(String[] args) {

        int n = 5;
        System.out.println("\n" + Fibonacci(n));
    }
}