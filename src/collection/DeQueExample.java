import java.util.ArrayDeque;
import java.util.Iterator;

public class DeQueExample {
    public static void main(String[] args){
        ArrayDeque<String> minuman = new ArrayDeque<String>();
        minuman.push("Hilman");
        minuman.push("Endy");
        minuman.push("Koko");
        minuman.push("Tiqa");
        
        Iterator<String> iterator = minuman.iterator();
        
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
