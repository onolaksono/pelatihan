import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        String reverse = "", teks;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Kalimat : ");
        teks = input.nextLine();
        input.close();
        for (int i = teks.length(); i > 0; i--) {
            String tmp = teks.substring(i - 1, i);
            reverse += tmp;
        }
        // System.out.println(reverse);

        if (teks.equals(reverse)) {
            System.out.println("'" + teks + "' dibalik menjadi '" + reverse + "'" + " adalah Palindrome");
        } else {
            System.out.println("'" + teks + "' dibalik menjadi '" + reverse + "'" + " bukan Palindrome");
        }
    }
}
