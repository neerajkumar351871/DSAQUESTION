
class optimizedpower {

    public static int ispower(int base, int power) {
        // BASE CASE.
        if (power == 0) {
            return 1;
        }
        //kaam

        int powers = ispower(base, power / 2) * ispower(base, power / 2);
        // value is odd
        if (power % 2 != 0) {
            powers = base * powers;
        }
        return powers;
    }
    // optimze code.
    public static double ispowers(int x, int n) {
        // BASE CASE.
        if (n == 0) {
            return 1;
        }
        //kaam
         double powerS=(double)ispower(x, n / 2);
        double powers =powerS*powerS ;
        // value is odd
        if ((double)n % 2 != 0 ) {
            powers = x * powers;
        }
        return powers;
    }
    

    public static void main(String args[]) {
        int base = 2;
        int power = -2;
        char a='a';
        char b='b';
        System.out.println(b-a);
        System.out.println(ispowers(base, power));
    }
}
