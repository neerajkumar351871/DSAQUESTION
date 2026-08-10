class plusone
{   
    public static  int[] plusOne(int[] digits) {
         int lastidx= digits.length-1;
         digits[lastidx]+=1;
        //  if(digits[lastidx]>10)
        //  {   i=0;
        //      while(digits[lastidx])
        //  }
         return digits; 
    }
    public static void main(String  args[])
    {
    int arr[]={1,2,3};
    System.out.println(plusOne(arr));

    }
}

