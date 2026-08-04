public class leetcode493
{    // code are failed.
    public  static int reversePairs(int[] nums) {
      int counter=0;
      for(int i= 0;i<nums.length-1;i++)
      {
        for(int j=i+1;j<nums.length;j++)
        {
            if(nums[i]> (2*nums[j]))
            {
                counter++;
            }
        }
      }
      return counter;
    }
    public static  int count(int[] nums)
    {
        int counts=0;
        for(int i=0;i<nums.length-1;i++)
        {
          for(int j=i+1;j<nums.length;j++)
          {  
             if(nums[i]>nums [j])
             {
                counts++;
             }
          }
        }
        return counts;
    }
    public static void main(String args[])
    {
     int [] num={6,3,5,2,7};
     // System.out.println(reversePairs(num));
      System.out.println(count(num));
    }
}