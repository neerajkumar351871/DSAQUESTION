import java.util.*;
class AscendingRec
{   public static void Ascendingorder(int n)
{ 
    if(n==1)
    {
        System.out.println(n);
        return ;
    }
    Ascendingorder(n-1);
    System.out.println(n+" ");
     
}
 public static void printSquare(int n)
   {
    if(n==1)
    {
        System.out.println(n+":"+" "+(int)Math.pow(n,2));
        return ;
    }
      printSquare(n-1);
    System.out.println(n+":"+" "+(int)Math.pow(n,2));
   }
    public static void main(String args[])
    {
        //Ascendingorder(10);
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        int n= sc.nextInt();
        printSquare(n);
    }
}