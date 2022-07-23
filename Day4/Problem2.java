import java.util.*;

public class Problem2 {

    public static void main(String[] args) {
        System.out.println(getUnique("7", "6", "5", "2", "3", "7", "5", "2"));
        System.out.println(getUnique("1", "1", "2", "2"));
    }

    public static List<String> getUnique(String... arr) {
        List<String> list = new ArrayList<>();

        System.out.print("Input: " + Arrays.toString(arr) + " Hasil : ");

        Arrays.sort(arr);

        for (int i = 0, j = 0; i < arr.length; i++) {
            boolean cek = false;
            for (j = i + 1; j < arr.length && arr[i] == arr[j]; j++) {
                cek = true;
                i = j;
            }
            if (cek) {
                continue;
            }
            list.add(arr[i]);
        }
        return list;
    }
}
