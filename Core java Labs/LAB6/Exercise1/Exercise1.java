import java.util.*;

class Exercise1
{
public static List<String> getValues(HashMap<Integer,String> map)
{
         List<String> list = new ArrayList<> (map.values());
          Collections.sort(list);
          return list;
}
public static void main (String args[])
{
     HashMap<Integer,String> hashmap =new HashMap<>();
     hashmap.put(0,"rohit");
     hashmap.put(4,"ram");
     hashmap.put(1,"hitesh");
     hashmap.put(3,"akshay");

      List<String> list = getValues(hashmap);

      System.out.println(list);
}
}