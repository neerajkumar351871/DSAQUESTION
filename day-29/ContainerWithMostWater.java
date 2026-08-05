
import java.util.ArrayList;

class ContainerWithMostWater {
  public static int maxContainWater(ArrayList<Integer> height)
  {
    int  max =Integer.MIN_VALUE;
    for(int i=0;i<height.size();i++)
    {
        for(int j=i+1;j<height.size();j++)
        {
          int ht =Math.min(height.get(i),height.get(j));  
         int width= j-i;
         int waterLevel= ht*width;
         max=Math.max(max,waterLevel);
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
        System.out.println("MAX CONTAIN WATEr :"+ maxContainWater(height));
    }
}
