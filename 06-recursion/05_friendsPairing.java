public class Main {

    static int friendsPairing(int n) {

        // Base case
        if (n == 1 || n == 2) {
            return n;
        }

        // Choice 1:
        // Current friend stays single
        int singleWays = friendsPairing(n - 1);

        // Choice 2:
        // Current friend pairs with one of the remaining (n - 1) friends
        int pairWays = (n - 1) * friendsPairing(n - 2);

        // Total ways
        return singleWays + pairWays;
    }

    public static void main(String[] args) {

        System.out.println(friendsPairing(3));
    }
}