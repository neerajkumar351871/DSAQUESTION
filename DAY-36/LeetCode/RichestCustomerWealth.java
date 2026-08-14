class RichestCustomerWealth
{
    public int maximumWealth(int[][] accounts) {
        int  calWeal=Integer.MIN_VALUE;
        for(int i=0;i<accounts.length;i++)
        {
            int  sumWeal=0;
            for(int j=0;j<accounts[0].length;j++)
            {
                sumWeal+=accounts[i][j];
            }
            calWeal=Math.max(sumWeal,calWeal);
        }
        return calWeal;
    }
    public static void main(String args[])
    {    RichestCustomerWealth obj= new RichestCustomerWealth();
        int[][]accounts={{1,2,3,},{4,5,6},{7,8,9}};
        System.out.println("MAX WEALTH:"+obj.maximumWealth(accounts));
    }
}