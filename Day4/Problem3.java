public class Problem3 {
    public static void main(String args[]) {
        int[] nums = { 1, 2, 3, 4, 6 };
        int target = 6;

        int[] nums2 = { 2, 5, 9, 11 };
        int target2 = 11;

        findPair(nums, target);
        findPair(nums2, target2);
    }

    public static void findPair(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("Hasil : (" + i + "," + j + ")");
                    return;
                }
            }
        }
        System.out.println("Tidak ditemukan");
    }
}
