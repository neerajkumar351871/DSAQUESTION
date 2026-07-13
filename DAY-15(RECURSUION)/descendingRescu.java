
class descendingRescu {

    public static void descendingorder(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n + " ");
        descendingorder(n - 1);

    }
  

    public static void main(String args[]) {
    //descendingorder(10);

    }
}
