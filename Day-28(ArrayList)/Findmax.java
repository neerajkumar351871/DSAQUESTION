
import java.util.*;

public class Findmax {

    public static void main(String args[]) {
        ArrayList<Integer> vl = new ArrayList<>();
        vl.add(2);
        vl.add(5);
        vl.add(9);
        vl.add(3);
        vl.add(6);
        int max = Integer.MIN_VALUE;
        int  min= Integer.MAX_VALUE;
        for (int i = 0; i < vl.size(); i++) {
            // if(max < vl.get(i))
            // {
            //     max=vl.get(i);
            // }
       
            max= Math.max(vl.get(i),max);
            min= Math.min(vl.get(i),min);
       
        }
             System.out.println("MAX VALUE IS : " + max);
            System.out.println("MIN VALUE IS : " + min);

    }

}
