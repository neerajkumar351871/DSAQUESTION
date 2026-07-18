class Tilingproblem
{
    public static int Tiling(int n)
    {
        // BASE CASE
        if(n==0||n==1)
        {
            return 1;
        }
        //kaam
        // vertical
        // int fnm1= Tiling(n-1);
        // int fnm2=Tiling(n-2);
        // int Totalway= fnm1+fnm2;
        // return Totalway;
        return Tiling(n-1)+Tiling(n-2);
    }
    public static void main(String args[])
    {
        int n=6;
        System.out.println("TOTAL WAYS:"+Tiling(n));
    }
}