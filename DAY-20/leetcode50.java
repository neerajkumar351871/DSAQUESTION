class leetcode50
{ 
    public double power(double x, long n) {
        // Base case
        // System.out.println(n);
        if (n == 0) {
            return 1.0;
        }

        // Recursive call
        double smaller = power(x, n / 2);

        // Square the result
        double values = smaller * smaller;

        // If n is odd, multiply by x once more
        if (n % 2 != 0) {
            values = values * x;
        }

        return values;
    }

    public double myPow(double x, long n) {

        if (x == 0)
            return 0;

        if (x == 1)
            return 1;

        long N = n;

        // Handle negative powers
        if (N < 0) {
            x = 1.0 / x;
            N = -N;
        }
    //  System.out.println(n);
        return power(x, N);
    }

    public static void main(String args[])
    {  leetcode50 obj = new leetcode50();
        double sc=2.000;
        int minus=-2;
        double result = obj.myPow(sc, minus);
        System.out.println(result);
      }
}