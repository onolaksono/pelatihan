
public class Problem2 {
    static int[] Fib;
    static int i;

    static int Fibonacci(int N) {

        Fib = new int[N + 1];

        Fib[0] = 0;
        Fib[1] = 1;

        for (i = 2; i <= N; i++)
            Fib[i] = Fib[i - 1] + Fib[i - 2];

        return Fib[N];
    }

    public static void main(String[] args) {
        int n = 5;
        if (n <= 1)
            System.out.print("Fib(" + n + ") = " + n + "\n");

        else
            System.out.print("Fib(" + n + ") = " + Fibonacci(n));
    }
}
