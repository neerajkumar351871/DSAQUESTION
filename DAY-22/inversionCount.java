
class inversionCount {

    public static void InverSion(int arr[]) {
        int counter = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    counter++;
                    System.out.println("(" + arr[i] + "," + arr[j] + ")");
                }
            }
        }
        System.out.println("TOTAL INVERSIN COUNT :" + counter);
    }

    public static void main(String args[]) {
        int arr[] = {2, 4, 1, 3, 5};
        InverSion(arr);
    }
}
