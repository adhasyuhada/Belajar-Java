
import java.util.Iterator;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args){
        Stack<String> buah = new Stack<String>();
        buah.push("Alpukat");
        buah.push("Jeruk");
        buah.push("Manggis");
        buah.push("Semangka");
        
       
        Iterator<String> iterator = buah.iterator();
        
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
