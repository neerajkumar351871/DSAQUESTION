
import java.util.ArrayList;
class optContainerWithMostWater {

    public static int maxContainWater(ArrayList<Integer> height) {
        int max = Integer.MIN_VALUE;
        int LP = 0;
        int RP = height.size() - 1;
        while (LP < RP) {
            // calculate height.
            int ht = Math.min(height.get(LP), height.get(RP));
            int wt = RP - LP;
            int waterLevel = ht * wt;
            max = Math.max(waterLevel, max);
            // update index.
            if (height.get(LP) < height.get(RP)) {
                LP++;
            } else {
                RP--;
            }
        }

        return max;
    }
      public static int maxWater(int[]height) {
        int max = Integer.MIN_VALUE;
        int LP = 0;
        int RP = height.length-1;
        while (LP < RP) {
            // calculate height.
            
            int ht = Math.min(height[LP], height[RP]);
            int wt = RP - LP;
            int waterLevel = ht * wt;
            max = Math.max(waterLevel, max);
            // update index.
            if (height[LP] < height[RP]) {
                LP++;
            } else {
                RP--;
            }
        }

        return max;
    }

    public static void main(String args[]) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        int arr[]={1,8,6,2,5,4,8,3,7};
        System.out.println("MAX CONTAIN WATEr : " + maxContainWater(height));
    }
}
