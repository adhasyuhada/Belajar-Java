import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

public class QueueExample {
    public static void main(String[] args){
        QueueExample obj = new QueueExample();
        obj.treeMapExample();
        obj.hashMapExample();
        obj.linkedHashMapExample();
    }
    
    
    void hashMapExample(){ //mengurutkan secara acak
        HashMap<Integer, String> buah = new HashMap<Integer, String>();
        buah.put(5, "timun");
        buah.put(6, "jambu");
        buah.put(1, "anggur");
        buah.put(2, "jeruk");
        buah.put(3, "manggis");
        buah.put(4, "alpukat");
        
        System.out.println("========================HashMap Mengurutkan Secara acak========================");
        for(Map.Entry list : buah.entrySet()){
            System.out.println("key : "+ list.getKey() + " value :" + list.getValue());
        }
        System.out.println("========================HashMap Mengurutkan Secara acak========================");
    }
    
    
    void linkedHashMapExample(){
        LinkedHashMap<Integer, String> buah = new LinkedHashMap<Integer, String>();
        buah.put(5, "timun");
        buah.put(6, "jambu");
        buah.put(1, "anggur");
        buah.put(2, "jeruk");
        buah.put(3, "manggis");
        buah.put(4, "alpukat");
        
        System.out.println("========================LinkedHashMap mengurutkan dari inputan pertama========================");
        for(Map.Entry list : buah.entrySet()){
            System.out.println("key : "+ list.getKey() + " value :" + list.getValue());
        }
        System.out.println("========================LinkedHashMap mengurutkan dari inputan pertama========================");
    }
    
    void treeMapExample(){
        TreeMap<Integer, String> buah = new TreeMap<Integer, String>();
        buah.put(5, "timun");
        buah.put(6, "jambu");
        buah.put(1, "anggur");
        buah.put(2, "jeruk");
        buah.put(3, "manggis");
        buah.put(4, "alpukat");
        
        System.out.println("========================treeMap mengurutkan dari key number paling kecil========================");
        for(Map.Entry list : buah.entrySet()){
            System.out.println("key : "+ list.getKey() + " value :" + list.getValue());
        }
        System.out.println("========================treeMap mengurutkan dari key number paling kecil========================");
    }
}
