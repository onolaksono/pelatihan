public class Problem4 {
    public static void main(String[] args) {
        soal1();
        soal2();
    }

    static void soal1() {
        int money = 50000;
        int[] productPrice = { 25000, 25000, 10000, 14000 };
        int sisa = 0, c = 0;
        for (int i = 0; i < productPrice.length; i++) {
            if (i == 0) {
                sisa = money - productPrice[i];
                // System.out.println("1" + sisa);
                c++;
            } else if (i != 0 && productPrice[i] != productPrice[i - 1]) {
                if (sisa > productPrice[i]) {
                    sisa = sisa - productPrice[i];
                    // System.out.println("2" + sisa);
                    c++;
                }
            }
            // System.out.println(sisa);
        }
        System.out.println(c);
    }

    static void soal2() {
        int money = 30000;
        int[] productPrice = { 15000, 10000, 12000, 5000, 3000 };
        int sisa = 0, c = 0;
        for (int i = 0; i < productPrice.length; i++) {
            if (i == 0) {
                sisa = money - productPrice[i];
                // System.out.println("1" + sisa);
                c++;
            } else if (i != 0 && productPrice[i] != productPrice[i - 1]) {
                if (sisa > productPrice[i]) {
                    sisa = sisa - productPrice[i];
                    // System.out.println("2" + sisa);
                    c++;
                }
            }
            // System.out.println(sisa);
        }
        System.out.println(c);
    }
}
