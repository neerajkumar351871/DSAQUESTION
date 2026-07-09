
class Question_5 {

    public static String countalpha(String str) {
        StringBuilder strs = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {
            Integer counter = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                counter++;
                i++;
            }
            strs.append(str.charAt(i));
            if (counter > 1) {
                strs.append(counter.toString());
            }
        }

        return strs.toString();
    }

    public static void main(String args[]) {
        String str = "abbcd";
        System.out.println(countalpha(str));
    
    }
}
