
class meresortedarray {

    public static void mersorted(int[] nums1, int[] nums2) {
        
        int[] store = new int[nums1.length+nums2.length];
        int i = 0, j = 0, k = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                store[k] = nums1[i];
                i++;
            } else {
                store[k] = nums2[j];
                j++;
            }
            k++;
        }
        // insert element t .
        while(i<nums1.length)
        {
          store[k++]=nums1[i++];
        }
        while(j <nums2.length)
        {
            store[k++]=nums2[j++];
        }
        printarray(store);
    }

    public static void printarray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int num1[] = {1, 2, 3,};
        int num2[] = {2, 5, 6};
        mersorted(num1, num2);
    }
}
