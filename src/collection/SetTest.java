import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args){
        SetTest obj1 = new SetTest();
        obj1.hashSet();
        obj1.linkedHashSet();
        obj1.treeSet();
    }
    
    void hashSet(){ //tidak berurutan / beraturan
        HashSet<String> minuman = new HashSet<String>();
        minuman.add("es Teh manis");
        minuman.add("es Jeruk");
        minuman.add("kopi Manis");
        minuman.add("avokado");
        minuman.add("bersoda");
        minuman.add("susu");
        
        
        Iterator iterator = minuman.iterator();
        
        while(iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }
        System.out.println("=================================");
    }
    
    void linkedHashSet(){ //beraturan data yang di input pertama yang akan di print
        LinkedHashSet<String> minuman = new LinkedHashSet<String>();
        minuman.add("es Teh manis");
        minuman.add("es Jeruk");
        minuman.add("kopi Manis");
        minuman.add("avokado");
        minuman.add("bersoda");
        minuman.add("susu");
        
        
        Iterator iterator = minuman.iterator();
        
        while(iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }
        System.out.println("=================================");
    }
    
    void treeSet(){ //mengurutkan sesuai abjad
        TreeSet<String> minuman = new TreeSet<String>();
        minuman.add("es Teh manis");
        minuman.add("es Jeruk");
        minuman.add("kopi Manis");
        minuman.add("avokado");
        minuman.add("bersoda");
        minuman.add("susu");
        
        
        Iterator iterator = minuman.iterator();
        
        while(iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }
        System.out.println("=================================");
    }
    
}
