
import java.util.ArrayList;

class OperationList {

    public static void main(String args[]) {
        // Integer
        ArrayList<Integer> obj = new ArrayList<>();
        // Add values.
        for (int i = 1; i <= 5; i++) {
            obj.add(i);
        }
        // System.out.print(obj);

        ArrayList<Character> obj1 = new ArrayList<>();
        // Add values.

        for (char i = 'a'; i <= 'z'; i++) {
            obj1.add(i);
        }
        // System.out.print(obj1+" ");
        // get element.

        // char getelement= obj1.get(24);
        // System.out.println(getelement);
        // Delete element.
        // obj1.remove(24);
        // System.out.println(obj1);
// set value
// obj1.set(24,'y');
// System.out.print(obj);

// Contain elements.

System.out.print(obj1+" ");
System.out.print(obj1.contains('A'));
    }
}
