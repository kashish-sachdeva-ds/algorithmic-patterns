class Main {

    static void subsequences(String str, int idx, String newString) {

        // Base case
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);

        // Choice 1: TAKE current character
        subsequences(str, idx + 1, newString + currChar);

        // Choice 2: DON'T TAKE current character
        subsequences(str, idx + 1, newString);
    }

    public static void main(String[] args) {

        String str = "abc";

        subsequences(str, 0, "");
    }
}