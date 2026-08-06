
import java.util.ArrayList;

public class roatedPairsum {

    public static boolean roatedPairsum(ArrayList<Integer> list, int tg) {    // find breakPoint.
        int bp = -1;
        int n = list.size();
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                bp = i;
                break;
            }
        }
        int lp = bp + 1;// smallest value
        int rp = bp;// largest value.
        while (lp != rp) {
            // case:1 .
            int sum = list.get(lp) + list.get(rp);
            if (sum == tg) {
                return true;
            }
            if (sum < tg) {
                lp = (lp + 1) % n;
            } else {
                rp = (n + rp - 1) % n;
            }
        }

        return false;
    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
list.add(1);
list.add(2);
list.add(3);
list.add(4);
list.add(5);
        System.out.println(roatedPairsum(list, 9));
    }
}
