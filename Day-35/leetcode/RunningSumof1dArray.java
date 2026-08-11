public class RunningSumof1dArray
{
  public int findNumbers(int[] nums) 
    {
        int[] ans= new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            int n=nums[i];
            int count=0;
            while(n!=0)
            {
                int last=n%10;
                n/=10;
                count++;
            }
            ans[i]=count;
        }
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(ans[i]%2==0)
            {
             count++;
            }
        }
        return count;
    }
    public static void main(String args[])
    {  RunningSumof1dArray obj= new RunningSumof1dArray();
    // 
        int[] nums={555,901,482,1771};
        System.out.println(obj.findNumbers(nums));
    }
}