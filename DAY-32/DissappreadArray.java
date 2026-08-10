import java.util.*;
 class DissappreadArray {

    public  static List<Integer> findDisappearedNumbers(int[] nums) {

        HashMap<Integer, Boolean> tracker = new HashMap<>();

        // Store 1 to n
        for (int i = 1; i <= nums.length; i++) {
            tracker.put(i, false);
        }

        // Mark present numbers
        for (int i = 0; i < nums.length; i++) {
            tracker.put(nums[i], true);
        }

        // Find missing numbers
        List<Integer> ans = new ArrayList<>();

        for (int i = 1; i <= nums.length; i++) {
            if (tracker.get(i) == false) {
                ans.add(i);
            }
        }

        return ans;
    }


    public static void main(String args[]) {
        int nums[] = {4, 3, 2, 7, 8, 2, 3, 1};
      System.out.println(findDisappearedNumbers(nums));
    }
}
