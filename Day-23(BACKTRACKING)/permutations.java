
class permutations {

    public static void Permutation(String str, String ans) {
        // base case.
        if (str.length() == 0) {
            System.out.print(ans+" ");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            // "abcd"= "ab"+"de"="abde"
            String newString = str.substring(0, i) + str.substring(i + 1);
            Permutation(newString, ans + curr);
        }
    }

    public static void main(String args[]) {
      Permutation("abc","");
    }
}
