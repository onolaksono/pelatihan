import java.util.Scanner;

public class Prima {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka = 30;
        int pilih;
        int c = 0;
        int[] urutan = new int[20];
        System.out.print("Pilih deret : ");
        pilih = input.nextInt();
        input.close();
        for (int a = 2; a <= angka; a++) {
            int mod = 1;
            for (int b = 2; b < a; b++) {
                if (a % b == 0) {
                    mod = 0;
                }
            }
            if (mod == 1) {
                System.out.print(a + " ");
                urutan[c] = a;
                c++;
            }
        }
        System.out.println("\n" + urutan[pilih - 1]);
        System.out.println();
    }
}