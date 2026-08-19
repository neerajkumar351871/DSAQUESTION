
class leetcode_189 {

    public void roatedArray(int[] nums, int k) {
        int n = nums.length;
        if (n == 0) {
            return;
        }
        k =k% n; // k>n
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = nums[i];
        }

        // copy kardo.
        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
        printarray(nums);
    }
    public void printarray(int[] nums)
    {
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i]+" ");
        }
    }

    public static void main(String args[]) {
    leetcode_189 obj= new leetcode_189();
    int[]nums={1,2,3,4,5,6,7};
    int k=3;
    obj.roatedArray(nums, k);
    }
}
