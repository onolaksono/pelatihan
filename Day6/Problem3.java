
public class Problem3 {
    public static void main(String[] args) {
        nilaiMax();
        nilaiMin();
    }

    static void nilaiMax() {
        int[] urutan = { 5, 7, 4, -2, -1, 8 };
        int tmpValue = 0, indexMax = 0;
        for (int i = 0; i <= urutan.length - 1; i++) {
            // if (tmpValue<current) {

            // }
            // System.out.println(tmpValue = urutan[i]);
            if (i != urutan.length - 1 && urutan[i + 1] >= tmpValue) {
                if (urutan[i] < urutan[i + 1]) {
                    tmpValue = urutan[i + 1];
                    indexMax = i + 1;
                }
            }
        }
        System.out.println("Max : " + tmpValue);
        System.out.println("index Max : " + indexMax);
    }

    static void nilaiMin() {
        int[] urutan = { 5, 7, 4, -2, -1, 8 };
        int tmpValue = 0, indexMin = 0;
        for (int i = 0; i <= urutan.length - 1; i++) {
            // if (tmpValue<current) {

            // }
            // System.out.println(tmpValue = urutan[i]);
            if (i != urutan.length - 1 && urutan[i + 1] <= tmpValue) {
                if (urutan[i] > urutan[i + 1]) {
                    tmpValue = urutan[i + 1];
                    indexMin = i + 1;
                }
            }
        }
        System.out.println("Min : " + tmpValue);
        System.out.println("index Min : " + indexMin);
    }
}
