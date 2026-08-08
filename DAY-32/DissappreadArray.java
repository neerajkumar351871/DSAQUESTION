import  java.util.HashMap;
public class DissappreadArray {

    public static void DissappreadArrays(int[] nums) 
    {
     // make HaspMap.
     HashMap<Integer,Boolean> maps= new HashMap<>();
     for(int i=0;i<nums.length;i++)
     {
        for(int j=1;j<nums.length;j++)
        {
            if(nums[i]==nums[j])
            {
                maps.put(nums[j],true);
              break;
            }
            
    
        }
        
     }
     System.out.print(maps);
    }

    public static void main(String args[]) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        DissappreadArrays(nums);
    }
}
