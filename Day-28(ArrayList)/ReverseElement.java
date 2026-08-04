import java.util.ArrayList;
class ReverseElement {

    public static void main(String args[]) {
        ArrayList<Integer> obj = new ArrayList<>();
        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);
        obj.add(5);
// Reverse element.
        for (int i = obj.size()-1; i >= 0; i--) {
            System.out.print(obj.get(i)+" ");
        }
    }
}
