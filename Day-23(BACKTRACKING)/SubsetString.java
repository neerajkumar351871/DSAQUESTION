
class SubsetString {
    // print subString.

    public static void printstring(String str, int i, String ans) {
//BASE CASE
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.print("null");
            } else {
                System.out.print(ans + " ");
            }

            return;
        }
// RECURSION.
// YES CHOICE.
        printstring(str, i + 1, ans + str.charAt(i));
// NO CHOICE.
        printstring(str, i + 1, ans);

    }

    public static void main(String[] args) {
        //String output a,b,c ,ab,bc,ca, abc
        printstring("abc", 0, "");
    }
}
