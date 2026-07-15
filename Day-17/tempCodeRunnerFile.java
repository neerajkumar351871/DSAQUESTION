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