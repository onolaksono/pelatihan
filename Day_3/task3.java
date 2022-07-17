import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        int bil;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan : ");
        bil = input.nextInt();
        input.close();
        for (int i = 1; i <= bil; i++) {
            if (bil % i == 0) {
                System.out.println(i);
            } 
        }
    }
}
