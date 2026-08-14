class NumberofGoodPairs
{ public int numIdenticalPairs(int[] nums) {
      int counter=0;
      for(int i=0;i<nums.length;i++)
      {
        for(int j=0;j<nums.length;j++)
        {
            if(nums[i]==nums[j]&& i<j)
            {   System.out.print("["+nums[i]+","+nums[j]+"]");
                counter++;
            }
     
        }
            System.out.println();
      }
      return counter;  
    }
    public static void main(String args[])
    {
    NumberofGoodPairs obj= new NumberofGoodPairs();
    int[]nums={1,2,3,1,1,3};
    System.out.println(obj.numIdenticalPairs(nums));    
    }
}