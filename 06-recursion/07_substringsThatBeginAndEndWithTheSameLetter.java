public class Main {

    static int validSubstring(String s) {

        int n = s.length();

        // Base case: empty or single-character string
        if (n <= 1) {
            return n;
        }

        int count = 0;

        // Kaam: check the whole current string
        if (s.charAt(0) == s.charAt(n - 1)) {
            count++;
        }

        // Faith 1: remove last character
        count += validSubstring(s.substring(0, n - 1));

        // Faith 2: remove first character
        count += validSubstring(s.substring(1));

        // Remove overlap: remove both first and last
        count -= validSubstring(s.substring(1, n - 1));

        return count;
    }

    public static void main(String[] args) {

        String s = "abca";

        int count = validSubstring(s);

        System.out.println(count);
    }
}