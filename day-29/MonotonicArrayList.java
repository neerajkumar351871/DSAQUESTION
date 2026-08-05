
class MonotonicArrayList {

    public boolean isMonotonic(int[] nums) {
         boolean incraseorder= false ;
          int st=0;
          int next= st+1;
          while(st<nums.length-1 &&  next<nums.length)
          {
             if(nums[st]<nums[next])
             {
                return true;
             }
             st++;
             next++;
          }
        return incraseorder;
    }

    public static void main(String args[]) {
        MonotonicArrayList obj = new MonotonicArrayList();
        int arr[]={1,2,2,3};
       System.out.println(obj.isMonotonic(arr));
    }
}
