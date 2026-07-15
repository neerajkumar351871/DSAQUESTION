
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
    public static int ispowers(int base, int power) {
        // BASE CASE.
        if (power == 0) {
            return 1;
        }
        //kaam
         int powerS=ispower(base, power / 2);
        int powers =powerS*powerS ;
        // value is odd
        if (power % 2 != 0) {
            powers = base * powers;
        }
        return powers;
    }
    

    public static void main(String args[]) {
        int base = 2;
        int power = 9;
        System.out.println(ispower(base, power));
    }
}
