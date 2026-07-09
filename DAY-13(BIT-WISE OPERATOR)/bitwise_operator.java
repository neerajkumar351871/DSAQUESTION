class bitwise_operator
{   public static void  ANDoperator(int a , int b)
{
      System.out.println(a&b);
}
   public static void ORoperator(int a, int b)
   {
    System.out.println(a|b);
   }  
   public static void XORoperator(int a,int b)
   {
    System.out.println(a^b);
   }
   public static void onesCOmplementes(int a)
   {
    System.out.println(~a);
   }
   // LEFT SHIFT OPERATOR.
   public static void lefShift(int a, int b)
   {
      System.out.println(a<<b);
      System.out.println(a*(int)(Math.pow(2,b)));
   }
   // Right shift operator.
   public static void rightShift(int a, int b)
   {
      System.out.println(a>>b);
   }
    public static void main(String args[])
    {
    ANDoperator(4,5);
    ORoperator(5,6);
    XORoperator(5,6);
    onesCOmplementes(5);
    lefShift(5,2);
    rightShift(5,2);
    }
}