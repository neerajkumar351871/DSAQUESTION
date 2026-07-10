
class countbits {

    public static void countBits(int n) {
        String str = Integer.toBinaryString(n);
        int one = 0;
        int zero = 0;
        // for (int i = 0; i < str.length(); i++) {
        //     if (str.charAt(i) == '1') {
        //         one++;
        //     } else {
        //         zero++;
        //     }
        // }
        while (0 < n) {
            if ((n & 1) == 1) {
                one++;
            } else {
                zero++;
            }
            n = n >> 1;
        }
        System.out.println("TOTAL: " + one);
        System.out.println("ZERO :" + zero);

    }
    // // Toggel the i- th bit.
    // public static void  toggel(int n,  int i)
    // {  int bitmask=~(1<<i);
    //     System.out.println(n&bitmask);
    // }

    public static void main(String args[]) {
        countBits(13);
       // toggel(10,1);
    }
}
