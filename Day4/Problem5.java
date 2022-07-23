import java.util.*;

public class Problem5 {
    public static void main(String[] args) {
        int a[] = { 2, 3, 3, 3, 6, 9, 9 };
        int b[] = { 2, 2, 2, 11 };

        removeDuplicates(a);
        removeDuplicates(b);
    }

    public static void removeDuplicates(int[] a) {
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();

        for (int i = 0; i < a.length; i++)
            set.add(a[i]);

        // Print size dari array
        System.out.println("Input : " + Arrays.toString(a) + " Hasil : " + set.size());
    }

}
