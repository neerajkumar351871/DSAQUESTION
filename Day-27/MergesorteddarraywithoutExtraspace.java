class MergesorteddarraywithoutExtraspace
{  
     public  void merge(int[] nums1, int m, int[] nums2, int n)
    {
      int idx=m+n-1;
      int i=m-1;
      int j=n-1;
      while(i>=0 && j>=0)
      {
        if(nums1[i]>=nums2[j])
        {
            nums1[idx]=nums1[i];
            i--;
        }
        else
        {
            nums1[idx]=nums2[j];
            j--;
        }
           idx--;
      }
      while(j>=0)
      {
        nums1[idx--]=nums2[j--];
      }
      printarray(nums1);
        
    }
     public void printarray(int nums[])
     {
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i]+" ");
        }
     }
    public static  void main(String args[])
    {MergesorteddarraywithoutExtraspace obj= new MergesorteddarraywithoutExtraspace();
        int nums1[] = {1,2,3,0,0,0};
        int nums2[]={2,5,6};
       obj.merge(nums1, 3, nums2,3);
    }
}