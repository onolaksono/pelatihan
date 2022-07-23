import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * ArrayMerge
 */
public class Problem1 {
    public static void main(String[] args) {
        ArrayList<String> namaOne = new ArrayList<String>(Arrays.asList("kazuya", "jin", "lee"));
        ArrayList<String> namaTwo = new ArrayList<String>(Arrays.asList("kazuya", "feng"));

        // Print the ArrayList 1
        System.out.println("ArrayList 1: " + namaOne);

        // Print the ArrayList 2
        System.out.println("ArrayList 2: " + namaTwo);

        Set<String> gabungArray = new LinkedHashSet<>(namaOne);
        gabungArray.addAll(namaTwo);
        List<String> hasilGabung = new ArrayList<>(gabungArray);

        // Print hasil array tanpa duplikat
        System.out.println("Hasil setelah digabung : " + hasilGabung);
    }

}