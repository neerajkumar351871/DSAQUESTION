import java.util.Arrays;

class retrunpossiblelement {

    public int[] possibltarget(int arr[], int key) {
        int[] store = new int[arr.length];
        int idx = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                store[idx++] = i;
            }
        }

        return store;
    }

    public static void main(String args[]) {
        retrunpossiblelement obj = new retrunpossiblelement();

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 2};
        int target = 2;

        int[] result = obj.possibltarget(arr, target);
        System.out.println(Arrays.toString(result));
    }
}