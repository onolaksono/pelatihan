import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        int bil;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan : ");
        bil = input.nextInt();
        input.close();
        boolean prima = true;
        if (bil > 2) {
            // bil=5
            // i = 5 bil = 4 ===> 4/5
            for (int i = 2; i < bil - 1; i++) {
                if (bil % i == 0) {
                    prima = false;
                }
            }
        }
        if (prima) {
            System.out.println("Bilangan Prima");
        } else {
            System.out.println("Bukan Bilangan Prima");
        }
    }
}
