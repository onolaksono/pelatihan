import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        String pesan;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Karakter : ");
        pesan = input.nextLine();
        input.close();
        int x = 0, o = 0;
        for (int i = 0; i < pesan.length(); i++) {
            if (pesan.charAt(i) == 'x') {
                x++;
            } else {
                o++;

            }
        }
        System.out.println("Input = " + pesan);
        System.out.println("Total X = " + x);
        System.out.println("Total O = " + o);
        if (x == o) {
            System.out.println("Hasil : "+true);
        } else {
            System.out.println("Hasil : "+false);
        }
    }
}
