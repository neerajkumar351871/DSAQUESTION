
class pairFreinds {

    public static int friendsPair(int n) {
        // BASE CASE.
        if (n == 1 || n == 2) {
            return n;
        }
        // kaam.
        // chooise ->single (n-1) , pair->(n-2).
        int single = friendsPair(n - 1);
        int pair = friendsPair(n - 2);
        int totalPair = single+single*pair;
        return totalPair;
    }

    public static void main(String args[]) {
        
        System.out.println(friendsPair(3));
    }
}
