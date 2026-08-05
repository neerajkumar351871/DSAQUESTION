
import java.util.ArrayList;

class twoDArraylist {

    public static void main(String args[]) {
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
// Give the values.
        for (int i = 1; i <= 5; i++) {
            list1.add(i*1);
            list2.add(i * 2);
            list3.add(i * 3);
        }
        mainlist.add(list1);
        mainlist.add(list2);
        mainlist.add(list3);

// printlist.
        for (int i = 0; i < mainlist.size(); i++) {
            ArrayList<Integer> list = mainlist.get(i);
            for (int j = 0; j < list.size(); j++) {
                System.out.print(list.get(j)+" ");
            }
            System.out.println();
        }

        // // create main list.
        // ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        // // create row and columns.
        // ArrayList<Integer> list1 = new ArrayList<>();
        // list1.add(1);
        // list1.add(2);
        // list1.add(3);
        // list1.add(4);
        // list1.add(5);
        // mainList.add(list1);
        // ArrayList<Integer> list2 = new ArrayList<>();
        // list2.add(2);
        // list2.add(4);
        // list2.add(6);
        // list2.add(8);
        // list2.add(10);
        // mainList.add(list2);
        // ArrayList<Integer> list3 = new ArrayList<>();
        // list3.add(3);
        // list3.add(6);
        // list3.add(9);
        // list3.add(12);
        // list3.add(315);
        // mainList.add(list3);
        // // System.out.print(mainList + " ");
        // // System.out.println("check size of List :" + mainList.size());
        // // System.out.println("check size of List :" + list2.size());
        // // print main list.
        // for(int i=0;i<mainList.size();i++)
        // {
        //    ArrayList<Integer> lists= mainList.get(i);
        //    for(int j=0;j<lists.size();j++)
        //    {
        //     System.out.print(lists.get(j)+" ");
        //    }
        //    System.out.println();
        // }
    }
}
