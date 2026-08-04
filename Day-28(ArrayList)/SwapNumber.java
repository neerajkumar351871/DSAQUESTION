
import java.util.ArrayList;

public class SwapNumber {

    public static void swapvalues(ArrayList<Integer> list, int idx1, int idx2) {
        while ( idx1>=0 && idx2 <= list.size()) {
            int temp = list.get(idx2);
            list.set(idx2, list.get(idx1));
            list.set(idx1, temp);
            idx1--;
            idx2++;
        }
    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);//->0
        list.add(5);//->1
        list.add(9);//->2
        list.add(3);//->3
        list.add(6);//->4
        list.add(9);
        //int idx1 = 1, idx2 = 3;
        System.out.println(list);
        swapvalues(list, 1, 3);
        System.out.println(list);

    }
}
