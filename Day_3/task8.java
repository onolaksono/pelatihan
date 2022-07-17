import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        int x;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan : ");
        x = input.nextInt();
        input.close();
        System.out.println("Tabel Perkalian 1-" + x);
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x; j++) {
                System.out.print(" " + i * j + "\t");
            }
            System.out.print("\n");
        }
    }
}
