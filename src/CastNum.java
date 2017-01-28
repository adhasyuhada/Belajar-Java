public class CastNum {
    public static void main(String []args){
        byte byteValue = 22;
        short shortValue = 3323;
        int intValue = 4355;
        long longValue = 232121;
        double doubleValue = 123.33;
        float floatValue = 4334.43f;
        
        intValue = (int)doubleValue;
        
        System.out.println(intValue);
        //output 123 angka dibelakang koma di potong
    }
}
