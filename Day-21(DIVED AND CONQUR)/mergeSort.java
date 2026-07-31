
class mergeSort {

    public static void pintArr(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void Mergesort(int array[], int si, int ei) {
        // BASE CASE.
        if (si == ei) {
            return;
        }
        // kaam
        int mid = si + (ei - si) / 2;
        Mergesort(array, si, mid);// left side.
        Mergesort(array, mid + 1, ei); // right side.
        merge(array, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        // left(0,3) =4 rigth (4,6=3 , 6-0+1 =7
        int temp[] = new int[ei - si + 1];

        int i = si;    // make iterator  for left part.
        int j = mid + 1;    // make iterator for right part.
        int k = 0; // This iterator for  temporary array.

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;

        }
        // left part.
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        // RIGHT PART.
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        // copy temp to original arr.
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String args[]) {
        int array[] = {6, 3, 9, 5, 2, 8};
        Mergesort(array, 0, array.length - 1);
        pintArr(array);
    }
}
