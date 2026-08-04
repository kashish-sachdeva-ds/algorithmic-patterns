public class Main {

    static void removeDuplicates(String str, String ans, boolean[] map) {

        // Base case
        if (str.length() == 0) {
            System.out.println("ans : " + ans);
            return;
        }

        int n = str.length();

        // Take last character
        char ch = str.charAt(n - 1);

        int mapIdx = ch - 'a';

        // Remove last character from string
        str = str.substring(0, n - 1);

        if (map[mapIdx]) { // duplicate

            removeDuplicates(str, ans, map);

        } else { // not duplicate

            map[mapIdx] = true;
            removeDuplicates(str, ans + ch, map);
        }
    }

    public static void main(String[] args) {

        String str = "appnnacollege";
        boolean[] map = new boolean[26];

        removeDuplicates(str, "", map);
    }
}