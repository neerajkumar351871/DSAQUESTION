class FibonacciSeries
{   public static int findterm(int n)
{
    if(n==0 || n==1)
    {
        return n;

    }
    int nm1= findterm(n-1);
    int nm2=findterm(n-2);
    int fb= nm1+nm2;
    return fb;
}

    public static void main(String args[])
    {
       System.out.println(findterm(25 ));
    }
}