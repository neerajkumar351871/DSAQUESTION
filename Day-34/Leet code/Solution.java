import java.util.*;
class Solution 
{
   public static  int[] plusOne(int[] digits)
    { 
        for (int i = digits.length - 1; i >= 0; i--)
         { 
            if(digits[i]==9)
            {
                digits[i]=0;
            }
            else
            {
                digits[i]++;
                return digits;
            }
          }
          digits= new int[digits.length+1];
          digits[0]=1;
          return digits;
    }
    public static void main(String args[])
    {
        Solution  obj= new Solution();
        int[] digits={9,9,9};
        int []store=plusOne(digits);
       System.out.println(Arrays.toString(store));
    }
}