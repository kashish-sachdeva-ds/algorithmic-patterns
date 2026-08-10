class Main {
    
    static void permutations(String str, String ans) {
        int n = str.length();

        // Base Case
        if (n == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            // In Java, we use charAt(i) instead of str[i]
            char ch = str.charAt(i);
            
            // Java's substring takes (startIndex, endIndex) unlike C++'s (startIndex, length)
            // substring(i + 1) automatically takes everything from i+1 to the end of the string
            String nextStr = str.substring(0, i) + str.substring(i + 1);
            
            permutations(nextStr, ans + ch); // ith char choice to add in permutation
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        String ans = "";

        permutations(str, ans);
    }
}