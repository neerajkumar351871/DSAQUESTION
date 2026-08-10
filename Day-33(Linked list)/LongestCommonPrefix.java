
class LongestCommonPrefix {

    public static void longestCommonPrefix(String[] strs) {
        String str = new String();

        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < strs[i].length(); j++) {
                System.out.print(strs[i].charAt(j) + " ");
            }
            System.out.println();
        }
        System.out.println(strs.length);
    }

    public static void main(String args[]) {
        String[] str = {"flowe", "flow", "flight"};
        longestCommonPrefix(str);
    }
}
