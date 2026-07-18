class RemoveDuplicateString {

    public static void duplicateString(String str, int idx,
                                       StringBuilder newString,
                                       boolean map[]) {

        // Base Case
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }

        char currentChar = str.charAt(idx);

        if (map[currentChar - 'a']== true) {
            // Duplicate character
            duplicateString(str, idx + 1, newString, map);
        } else {
            // First occurrence
            map[currentChar - 'a'] = true;
            duplicateString(str, idx + 1,newString.append(currentChar), map);
        }
    }

    public static void main(String args[]) {

        String str = "appnnacollege";
        boolean map[] = new boolean[26];
        map[1]=true;
        for(int i=0;i<map.length;i++)
        {
            System.out.println(map[i]);
        }

        duplicateString(str, 0, new StringBuilder(), map);
    }
}