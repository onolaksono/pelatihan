import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        int x;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan : ");
        x = input.nextInt();
        input.close();
        for (int i = 1; i <= x; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(' ');
            }
            for (int k = 1; k <= i; k++) {
                System.out.print('*');
            }
            for (int l = 1; l <= i - 1; l++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
