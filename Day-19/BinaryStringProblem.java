
class BinaryStringProblem {

    public static void printBinary(int n, int lastdigit, String str) {
        // base case.
        if (n == 0) {
            System.out.println(str);
            return;
        }
        //kaam.
        printBinary((n - 1), 0, str + "0");
        if (lastdigit == 0) {
            printBinary(n - 1, 1, str + "1");
        }
        // System.out.println(str);
    }

    public static void main(String arsg[]) {
        printBinary(3, 0, "");
    }
}
