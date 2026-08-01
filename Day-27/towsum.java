
class towsum {

    public int[] twoSum(int[] nums, int target) {
        int[] storedata = new int[2];

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    storedata[0] = i;
                    storedata[1] = j;
                    return storedata;
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String args[]) {
        towsum obj = new towsum();   // Create object

        int[] nums = {2, 7, 11, 5};

        int[] data = obj.twoSum(nums, 16);

        System.out.println(data[0] + " " + data[1]);
    }
}
