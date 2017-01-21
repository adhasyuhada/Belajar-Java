import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueExample {
    public static void main(String[] args){
        PriorityQueue<String> minuman = new PriorityQueue<String>();
        minuman.add("Kopi");
        minuman.add("Teh");
        minuman.add("Mineral");
    
        Iterator<String> iterator = minuman.iterator();
        
        while(iterator.hasNext()){
            System.out.print(" "+iterator.next());
        }
    }
}
