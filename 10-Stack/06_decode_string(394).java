import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public String decodeString(String s) {

        Deque<String> st = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {

            // CASE 1: Collect everything until ']'
            if (s.charAt(i) != ']') {
                st.push(String.valueOf(s.charAt(i)));
            }

            // CASE 2: Decode when ']' appears
            else {

                // Extract string inside [...]
                String curr = "";

                while (!st.peek().equals("[")) {
                    curr = st.pop() + curr;
                }

                st.pop(); // remove '['

                // Extract number
                String numStr = "";

                while (!st.isEmpty() && Character.isDigit(st.peek().charAt(0))) {
                    numStr = st.pop() + numStr;
                }

                int k = Integer.parseInt(numStr);

                // Repeat
                String expanded = "";

                while (k-- > 0) {
                    expanded += curr;
                }

                // Push expanded string back
                st.push(expanded);
            }
        }

        // Build final answer
        String result = "";

        while (!st.isEmpty()) {
            result = st.pop() + result;
        }

        return result;
    }
}