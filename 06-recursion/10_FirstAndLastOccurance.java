public class Main {

    static int first = -1;
    static int last = -1;

    static void findOccurrence(String str, int idx, char element) {

        // Base case
        if (idx == str.length()) {
            System.out.println("First occurrence: " + first);
            System.out.println("Last occurrence: " + last);
            return;
        }

        char currChar = str.charAt(idx);

        if (currChar == element) {

            if (first == -1) {
                first = idx;
            }

            last = idx;
        }

        // Recursion
        findOccurrence(str, idx + 1, element);
    }

    public static void main(String[] args) {

        String str = "abaacdaefaah";

        findOccurrence(str, 0, 'a');
    }
}