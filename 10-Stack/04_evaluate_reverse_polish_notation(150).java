import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    @SuppressWarnings({"UnnecessaryTemporaryOnConversionFromString", "ConvertToStringSwitch"})
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        
        for (String token : tokens) {
            // Agar token operator hai, toh pichle do numbers par operation perform karo
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int b = stack.pop();
                int a = stack.pop();

                int result = 0;
                if (token.equals("+")) {
                    result = a + b;
                } else if (token.equals("-")) {
                    result = a - b;
                } else if (token.equals("*")) {
                    result = a * b;
                } else if (token.equals("/")) {
                    result = a / b;
                }
                
                stack.push(result);
            } else {
                // Agar token number hai, toh seedha integer mein convert karke stack mein daal do
                stack.push(Integer.parseInt(token));
            }
        }
        
        return stack.peek();
    }
}