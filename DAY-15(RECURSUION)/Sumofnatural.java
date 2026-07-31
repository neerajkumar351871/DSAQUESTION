class Sumofnatural
{  public static int sumofnumber(int n)
{
    if(n==0)
    {
        return 0;       
    }
    int no= sumofnumber(n-1);
    int sum=n+sumofnumber(n-1);
    return sum;
}
    public static void main(String args[])
    {
      System.out.println(sumofnumber(6));  
    }
}