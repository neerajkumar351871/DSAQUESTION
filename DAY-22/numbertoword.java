class numbertoword
{
     static  String digit[]={"ZERO","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE","",};
     public static void printdigit(int n)
     {
        //BASE CASE.
        if(n==0)
        {
            return;
        }
        // kaam.
        int lastdigit= n%10;
        printdigit(n/10);
        System.out.print(digit[lastdigit]+" ");
     }
    public static void main(String arsg[])
    {
      printdigit(1234);
    }
}