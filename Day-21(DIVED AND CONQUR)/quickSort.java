
class quickSort {

    public static void pintArr(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void QuickSort(int arr[], int si, int ei) {  
        // BASE CASE.
        if (si >= ei) {
            return;
        }
        // KAAM
        // Partition.
        int pidx = partition(arr, si, ei);
        // let part.
        QuickSort(arr, si, pidx-1 );// LEFT PART.
        QuickSort(arr, pidx + 1, ei);// RIGHT PART.

    }

    public static int partition (int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;// MAKE A SPACE FOR ELEMENT.

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        // swap
        int temp = arr[ei];
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void main(String args[]) {
        int array[] = {6, 3, 9, 8, 2, 5};
        QuickSort(array, 0, array.length - 1);
        pintArr(array);
    }
}
