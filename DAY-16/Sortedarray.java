
class Sortedarray {

    public static boolean isSorted(int array[], int i) {
        if (i ==array.length - 1) {
            return true;
        }
        if (array[i] > array[i + 1]) {
            return false;
        }
      return  isSorted(array, i + 1);
      
    }

     public static boolean isSorteddesc(int array[], int i) {
        if (i ==array.length - 1) {
            return true;
        }
        if (array[i] <array[i + 1]) {
            return false;
        }
      return  isSorteddesc(array, i + 1);
      
    }
    
    

    public static void main(String args[]) {
        int array[] = {5};

        System.out.println(isSorted(array,0));
        System.out.println(isSorteddesc(array,0));
       
    }
}
