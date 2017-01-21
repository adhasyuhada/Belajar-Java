
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args){
        LinkedList<String> nama = new LinkedList();
        nama.add("danil");
        nama.add("chandra");
        nama.add("dewi");
        nama.add("nini");
        
        Iterator<String> iterator = nama.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
