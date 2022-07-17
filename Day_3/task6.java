import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        int x, y;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan : ");
        x = input.nextInt();
        System.out.print("Masukkan bilangan : ");
        y = input.nextInt();
        input.close();
        int hasil;
        hasil = (int) Math.pow(x, y);
        System.out.print(x + " Pangkat " + y + " adalah " + hasil);
    }
}
