
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

class ArraylistPractice {

    public static void main(String args[]) {
        // ArrayList<Integer> data = new ArrayList<>();

        // for (int i = 0; i < 5; i++) {
        //     data.add(i);
        // }
        // System.out.println(data);
        //     // }
        //     // Add element with idex.
        //     // data.add(10);
        //     // data.add(10);
        //     // data.add(10);
        //     // data.add(10);
        //     data.add(2,50);
        //    System.out.println(data);
        // remove element.
        // System.out.println(data.remove(0));
        // System.out.println(data);
        // Set element.
        // data.set(2,10);
        // System.out.println(data);
        // Contain element.
        // System.out.println(data.contains(4));
        // Size of arrayList.
        //  System.out.println(data.size());
        // Collections.sort(data,Collections.reverseOrder());
        // System.out.println(data);
        // 2D ArrayList.
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }
        mainList.add(list);
        ArrayList<Integer> list1 = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            list1.add((int) Math.pow(i, 2));
        }
           mainList.add(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            list2.add((int) Math.pow(i, 3));
        }
           mainList.add(list2);
        // Print arrayList.
        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> datas = mainList.get(i);
            for (int j = 0; j < datas.size(); j++) {
                System.out.print(datas.get(j)+" g");
            }
            System.out.println();

        }

    }
}
