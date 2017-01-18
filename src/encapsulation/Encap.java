class Data{
    private String name; //variable private hanya bisa diakses di classnya sendiri
    private int nim; //variable private tidak bisa diakses di luar class
    
    public void setNim(int yournim){ //method return public untuk user dari luar kelas agar dapat mengakses memberikan nilai pada variable private 
        nim = yournim; //nilai parameter method sama menjadi nilai private 
    }
    
    public void setName(String yourname){
        name = yourname;
    }
    
    public String getName(){ 
        return name;
    }
    
    public int getNim(){ //method return variable nim yang mempunyai nilai yang di input oleh user
        return nim;
    }

}

public class Encap {
    public static void main(String[] args){
        Data obj =  new Data();
        obj.setName("adha");
        obj.setNim(12345);
        System.out.println(obj.getName());
        System.out.println(obj.getNim());
    }
    
}
