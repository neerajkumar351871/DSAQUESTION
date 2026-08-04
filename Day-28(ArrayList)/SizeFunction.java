import java.util.ArrayList;
class SizeFunction
{
    public static void main(String args[])
    {
       ArrayList<Integer> in= new ArrayList<>();
       for(int i=1;i<=5;i++)
       {
        in.add(i);
       }
       for(int i=0;i<in.size();i++)
       {
        System.out.print(in.get(i)+" ");
       }
    }
}