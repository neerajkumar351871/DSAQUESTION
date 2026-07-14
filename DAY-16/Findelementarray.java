
class Findelementarray {

    public static int findelement(int array[], int key, int i) {
        // BASE CASE 
        if(i==array.length-1)
        {
            return -1;
        }
        if (array[i] == key) {
            return i;
        }
        //kaam
        
        return findelement(array, key, i + 1) ;
    }

    public static void main(String args[]) {
        int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        int key = 100;
        int i = 0;
        System.out.println(findelement(arr, key, i));
    }
}
