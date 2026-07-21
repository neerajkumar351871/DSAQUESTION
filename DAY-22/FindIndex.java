class FindIndex {

    public static void printIndex(int arr[], int i, int key) {
        //  BASE CASE.
        if (i ==arr.length) {
            return;
        }
        // kaam.
        if (arr[i] == key) {
            System.out.print(i + " ");
        }
        // INNER FUNCTION CALL.
        printIndex(arr, i + 1, key);
    }

    public static void main(String args[]) {
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key=2;
        printIndex(arr, 0, key);
    }
}
 