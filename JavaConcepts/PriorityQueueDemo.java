// Java code to illustrate the use of comparator()
import java.util.Comparator;
import java.util.PriorityQueue;
 
class The_Comparator implements Comparator<String> {
    public int compare(String str1, String str2)
    {
        String first_Str;
        String second_Str;
        first_Str = str1;
        second_Str = str2;
        return second_Str.compareTo(first_Str);
    }
}
 
public class PriorityQueueDemo {
    public static void main(String[] args)
    {
        PriorityQueue<String> queue = new
        PriorityQueue<String>(new The_Comparator());
 
        queue.add("G");
        queue.add("E");
        queue.add("E");
        queue.add("K");
        queue.add("S");
        queue.add("4");
         
 
        System.out.println("The elements with the highest priority element at front of queue"
                           + "order:");
        while(!queue.isEmpty()){
          System.out.print(" "+queue.poll());
        }
   }
}
