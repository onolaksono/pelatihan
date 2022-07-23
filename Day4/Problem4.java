// import java.util.*;

public class Problem4 {
    public static void main(String[] args) {
        int[] nums = { 2, 3 };
        int[] nums2 = { 1, 5, 10, 16 };
        cari(nums, nums2);
    }

    public static void cari(int[] nums, int[] nums2) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ",");
        }
        System.out.println("");
        for (int j = 0; j < nums2.length; j++) {
            System.out.print(nums2[j] + ",");
        }
        System.out.println("");
        for (int k = 0; k < nums.length; k++) {
            for (int l = 0; l < nums2.length; l++) {
                if (nums[k] != nums2[l])
                    System.out.print(nums[k] + ",");
            }
        }
    }

}