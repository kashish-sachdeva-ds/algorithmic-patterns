import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    @SuppressWarnings({"ConvertToStringSwitch", "UnnecessaryContinue"})
    public String simplifyPath(String path) {
        // Deque ko list/stack ki tarah use karenge taaki order maintain rahe
        Deque<String> stack = new ArrayDeque<>();
        
        // Path ko '/' se split kar lete hain taaki saare folders alag ho jayein
        String[] parts = path.split("/");
        
        for (String part : parts) {
            // Agar empty string hai ya '.' hai, toh kuch nahi karna (ignore karo)
            if (part.equals("") || part.equals(".")) {
                continue;
            } 
            // Agar '..' hai, toh ek step peeche jana hai (stack se pop/poll karo)
            else if (part.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pollLast();
                }
            } 
            // Agar koi normal folder name hai, toh stack mein add kar lo
            else {
                stack.addLast(part);
            }
        }
        
        // Agar stack khali hai, toh root directory '/' return kar do
        if (stack.isEmpty()) {
            return "/";
        }
        
        // Stack ke elements ko jod kar final path bana lo
        StringBuilder result = new StringBuilder();
        for (String dir : stack) {
            result.append("/").append(dir);
        }
        
        return result.toString();
    }
}