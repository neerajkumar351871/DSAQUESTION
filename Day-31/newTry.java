import java.util.HashMap;
public class newTry
{
    public static void main(String args[])
    {
        HashMap<String,Integer>list= new HashMap<>();
        list.put("HINDI",98);
        list.put("ENGLISH",98);
        list.put("MATH",35);
        list.put("SCIENCE",34);
        // System.out.println("HASHMAP :"+list.size());
        // System.out.println(list);

        // get values.
        // System.out.println("GET VALUES :"+list.get("MATH"));

        // UPDATE VALUES WITH THE HELP OF PUT FUN list.put(key, values);
        //  list.put("MATH",96);
        //  System.out.println(list);

        // REMOVE ELEMENT.
        // System.out.println(list.remove("ENGLISH"));
        // System.out.println(list);

        // Check key.
        //System.out.println("key"+list.containsKey("HINDI"));

        // Check value.
        // System.out.println("VALUE : "+list.containsValue(34));
        
        //CHECK SIZE.
        //System.out.println("HASHMAP SIZE="+list.size());

        // CHECK EMPTY.
        //System.out.println("CHECK EMPTY="+list.isEmpty());

        // CLEAR MAP.
        // list.clear();
        // System.out.println("CLEAR MAP"+list);
        
        // print keys.
        // System.out.println("ALL KEY"+list.keySet());

        // Print values.
       // System.out.println("ALL KEY ="+list.values());

     // Print all key values pair.

      //System.out.println(list.getKey() + " = " + list.getValue());
    }
}