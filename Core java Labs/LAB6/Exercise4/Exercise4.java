import java.util.HashMap;
import java.util.Set;

class Exercise4
{
       public HashMap<String,String> getStudent(HashMap<String,Integer> student)
       {
              HashMap<String,String> medal = new HashMap<>();
              Set<String> set = student.keySet();
              for(String s:set)
              {
                     Integer marks = student.get(s);
                     if(marks>=90)
                     {
                           medal.put(s,"Gold");
                     }
                     else if(marks >=80)
                     {
                           medal.put(s,"Silver");
                     }
                     else if(marks>=70)
                     {
                           medal.put(s,"Bronze");
                     }
              }
              return medal;
       }
       public static void main(String[] ar)
       {
              HashMap<String,Integer> student = new HashMap<>();
              Exercise4 ref = new Exercise4();
              
              student.put("RollNo1",88);
              student.put("RollNo3",89);
              student.put("RollNo5",90);
              student.put("RollNo34",90);

              System.out.println(ref.getStudent(student));
       }
}