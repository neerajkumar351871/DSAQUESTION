
class getithbit {

    public static int getithbits(int n, int i) {
        int bitmask = 1 << i;
        if ((n & bitmask) == 0) {
            return 0;
        }
        return 1;
    }
    public static  int setithbits(int n, int i)
    {
        int bitmask=1<<i;
       // System.out.println(n|bitmask);
       return n|bitmask;
    }
    public static int clearithbit(int n, int i)
    {
        int bitmask=~(1<<i);
       // System.out.println(n&bitmask);
       return n&bitmask;
    }
    public static void updatebits(int n, int i, int newbits)
    {

        // if(newbits==0)
        // {
        //     System.out.println(clearithbit(n,i));
        // }
        // else
        // {
        //  System.out.println(setithbits(n,i));
        // }
        n=clearithbit(n,i);
        int bitmask=newbits<<i;
        System.out.println(n|bitmask);
    }

    public static void main(String args[]) {
      //  System.out.println(getithbits(10, 2));
        // setithbits(10,2);
        // clearithbit(10,1);
        updatebits(9,2,6);
        
    }
}
