class TowerOfHanoi {

    public static void towerOfHanoi(int n, String source, String destination, String helper) {
        if (n == 1) {
            System.out.println("Transfer disk " + n + " from " + source + " to " + destination);
            return;
        }

        towerOfHanoi(n - 1, source, helper, destination); 

        System.out.println("Transfer disk " + n + " from " + source + " to " + destination);

        towerOfHanoi(n - 1, helper, destination, source);
    }

    public static void main(String[] args) {
        int n = 3; // Number of disks
        
        // Function call: n disks, Source = "S", Destination = "D", Helper = "H"
        towerOfHanoi(n, "S", "D", "H");
    }
}