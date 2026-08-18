class RemoveDuplicatesfromSortedArray
{   
    public int removeDuplicates(int[] nums) {
       int counter=0;
       for(int i=0;i<nums.length;i++)
       {
        for(int j=i+1;j<nums.length;j++)
        {
            if(nums[i]==nums[j])
            {
                counter++;
            }
        }
       }  
       return counter;
    }
    public static void main(String args[])
    {RemoveDuplicatesfromSortedArray obj= new RemoveDuplicatesfromSortedArray();
        int[]nums={0,0,1,1,1,2,2,3,3,4};
       System.out.println(obj.removeDuplicates(nums));
    }
}