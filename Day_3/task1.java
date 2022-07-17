public class task1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String pesan = "Alterra Indonesia";

        int vokal = 0, konsonan = 0;
        for (int i = 0; i < pesan.length(); i++) {
            if (cekHuruf(pesan.charAt(i)) == true) {
                if (getHuruf(pesan.charAt(i)) == 1) {
                    vokal++;
                } else {
                    konsonan++;
                }
            }
        }
        System.out.println(pesan);
        System.out.println("Jumlah vokal : " + vokal);
        System.out.println("Jumlah konsonan : " + konsonan);
        System.out.println("Total Karakter : " + (vokal+konsonan));
    }

    private static boolean cekHuruf(char text) {

        if ((text >= 65 && text <= 90) || (text >= 97 && text <= 122)) {
            return true;
        } else {
            return false;
        }
    }

    private static int getHuruf(char text) {
        int teks;
        if (text == 'A' || text == 'E' || text == 'I' || text == 'O' || text == 'U'
                || text == 'a' || text == 'e' || text == 'i' || text == 'o' || text == 'u') {
            teks = 1;
        } else {
            teks = 0;
        }

        return teks;
    }

}