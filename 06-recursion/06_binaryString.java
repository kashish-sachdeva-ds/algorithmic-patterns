class Main {

    static void binString(int n, String ans) {

        if (n == 0) {
            System.out.println(ans);
            return;
        }

        if (ans.isEmpty() || ans.charAt(ans.length() - 1) != '1') {
            binString(n - 1, ans + '0');
            binString(n - 1, ans + '1');
        } else {
            binString(n - 1, ans + '0');
        }
    }

    public static void main(String[] args) {
        String ans = "";
        binString(3, ans);
    }
}