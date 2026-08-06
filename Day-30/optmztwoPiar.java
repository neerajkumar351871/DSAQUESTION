
import java.util.ArrayList;

class optmztwoPiar {

    public static boolean sumofTWOPairs(ArrayList<Integer> list, int target) {
        int LP = 0;
        int Rp = list.size() - 1;
        while (LP < Rp) {
            if (list.get(LP) + list.get(Rp) == target) {
                return true;
            }
            if (list.get(LP) + list.get(Rp) < target) {
                LP++;

            } else {
                Rp--;
            }
        }

        return false;
    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
       System.out.println( sumofTWOPairs(list, 5));
    }
}
