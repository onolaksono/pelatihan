package TimeComplexity;

public class Problem2 {
    public static int pow(int x, int y) {
        if (y == 0) {
            return 1;
        } else {
            return x * pow(x, y - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(pow(2, 3));
        System.out.println(pow(5, 3));
        System.out.println(pow(10, 2));
        System.out.println(pow(2, 5));
        System.out.println(pow(7, 3));
    }
}
