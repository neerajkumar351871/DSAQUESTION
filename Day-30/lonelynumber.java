
import java.util.*;

class lonelynumber {

    public static List<Integer> findLonely(int[] nums) {

        Arrays.sort(nums);

        ArrayList<Integer> ans = new ArrayList<>();

        int n = nums.length;

        for (int i = 0; i < n; i++) {

            // Duplicate check
            if ((i > 0 && nums[i] == nums[i - 1])
                    || (i < n - 1 && nums[i] == nums[i + 1])) {
                continue;
            }

            // Previous adjacent value
            if (i > 0 && nums[i - 1] == nums[i] - 1) {
                continue;
            }

            // Next adjacent value
            if (i < n - 1 && nums[i + 1] == nums[i] + 1) {
                continue;
            }

            ans.add(nums[i]);
        }

        return ans;
    }

    public static void main(String args[]) {
        int[] nums = {10, 6, 5, 8};
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(findLonely(nums));
        System.out.println(nums);
    }
}
