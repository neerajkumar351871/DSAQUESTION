import java.util.Arrays;
class ShuffletheArray {

    public ShuffletheArray(String EXPLATION) {
        System.out.println("-----------" +EXPLATION+ "-----------");
    }

    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < n; i++) {
            ans[2 * i] = nums[i];
            ans[2 * i + 1] = nums[n + i];
        }
        return ans;
    }

    public static void main(String args[]) {
        ShuffletheArray obj = new ShuffletheArray("Inut nums={Input: nums = [2,5,1,3,4,7], n = 3} Output: [2,3,5,4,1,7] ,Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].");
        int num[] = {2, 5, 1, 3, 4, 7};
        int n = 3;
        System.out.println(Arrays.toString(obj.shuffle(num, n)));

    }
}
