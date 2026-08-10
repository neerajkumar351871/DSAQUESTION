import java.util.*;
class ProductofArrayExceptSelf
{   
    public static int[] Product(int [] nums)
    {    int []  val= new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {   int store=1;
            for(int j=0;j<nums.length;j++)
            {   
                if(nums[i]!=nums[j])
                {
                   store*=nums[j];
                }
                else
                {
                    continue;
                }
            }
            val[i]=store;
        }
        return val;
    }
    public static void main(String args[])
    {
     int []nums = {1,2,3,4};
     int []data= Product(nums);
     System.out.println(Arrays.toString(data));
    }
}