class Main {

    static boolean isSorted(int[] arr, int idx, int n) {

        if (idx == n - 1) {
            return true;
        }

        if (arr[idx] < arr[idx + 1]) {
            return isSorted(arr, idx + 1, n);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 5};

        System.out.println(isSorted(arr, 0, arr.length));
    }
}