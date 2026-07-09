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
    public static void main(String args[])
    {
    ANDoperator(4,5);
    ORoperator(5,6);
    XORoperator(5,6);
    onesCOmplementes(5);
    }
}