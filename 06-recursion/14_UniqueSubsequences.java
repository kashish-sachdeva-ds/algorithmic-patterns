import java.util.HashSet;

class Main {

    static void subsequences(String str, int idx, String newString, HashSet<String> set) {

        if (idx == str.length()) {
            if (set.contains(newString)) {
                return;
            }

            System.out.println(newString);
            set.add(newString);

            return;
        }

        char currChar = str.charAt(idx);

        subsequences(str, idx + 1, newString + currChar, set);
        subsequences(str, idx + 1, newString, set);
    }

    public static void main(String[] args) {

        String str = "aaa";

        HashSet<String> set = new HashSet<>();

        subsequences(str, 0, "", set);
    }
}