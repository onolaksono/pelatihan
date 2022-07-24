import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bil1, bil2, pil, hasil = 0;
        int operasi;

        menu_awal();
        System.out.print("MASUKKAN PILIHAN ANDA : ");
        pil = input.nextInt();

        if (pil == 1) {
            System.out.println("+++++++++++CALCULATOR+++++++++++");
            System.out.print("Masukkan Value 1 : ");
            bil1 = input.nextInt();
            System.out.print("Masukkan Value 2 : ");
            bil2 = input.nextInt();
            System.out.println("+++++++++++CALCULATOR+++++++++++");
            System.out.println("Please Enter Calculation Operatiaon :");
            System.out.println("1: Add Value");
            System.out.println("2. Sub Value");
            System.out.println("3. Multiply Value");
            System.out.println("4. Divide Value");
            System.out.print("PILIHAN ANDA : ");
            operasi = input.nextInt();
            input.close();
            switch (operasi) {
                case 1:
                    hasil = bil1 + bil2;
                    System.out.println("Hasil : " + hasil);
                    break;
                case 2:
                    hasil = bil1 - bil2;
                    System.out.println("Hasil : " + hasil);
                    break;
                case 3:
                    hasil = bil1 * bil2;
                    System.out.println("Hasil : " + hasil);
                    break;
                case 4:
                    hasil = bil1 / bil2;
                    System.out.println("Hasil : " + hasil);
                    break;
                default:
                    System.out.println("Pilihan Salah");
                    break;
            }
        } else if (pil == 99) {
            System.exit(0);
        } else {
            System.out.println("Pilihan Salah!");
        }

    }

    static void menu_awal() {
        System.out.println("+++++++++++CALCULATOR+++++++++++");
        System.out.println("1: Open Calculator");
        System.out.println("99: Exit");
    }
}
