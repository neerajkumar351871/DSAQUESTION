
import java.util.ArrayList;
import java.util.Collections;
class pairsum // This function ony work with sort array.we are used Collection.Sort().
{

    public boolean parisums(ArrayList<Integer> list, int target) {
        int lp = 0;
        int rp = list.size() - 1;
        while (lp < rp) {
            int sum = list.get(lp) + list.get(rp);
            // case1 .
            if (sum == target) {
                return true;
            }
            // update left pointer.
            // case:2
            if (sum < target) {
                lp++;
            } 
            //case3
            else {
                rp--;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        pairsum obj = new pairsum();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        Collections.sort(list);
        int target = 11;
        System.out.println("TARGET SUM : " + obj.parisums(list, target));
    }
}
