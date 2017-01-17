public class Array2D {
    
    public static void main(String[] args) {
        String[][] Arr = new String[][]{
            {"Anggur","Jeruk"}, //kolom ke 0 array memiliki 0 1 baris
            {"Nanas","Rambutan"}, //kolom ke 1 array memiliki 0 1 baris
            {"Semangka","Jambu","Salak","Sirsak"} //kolom ke 2 array memiliki 0 1 2 3 baris
        };
        System.out.println("=================");
        for(int i = 0; i < Arr.length; i++){ //panjang kolom  
            //System.out.print(i); // jika di print akan menampilkan 0 1 2 jumlah kolom diawali dari 0
            
            for(int y = 0; y < Arr[i].length; y++){ // [i] = 0 1 2 isi dari jumlah kolom 
                                                    //jumlah baris = 0 1 {"Anggur","Jeruk"} 0 1 {"Nanas","Rambutan"} 0 1 2 3 {"Semangka","Jambu","Salak","Sirsak"}
                System.out.println(Arr[i][y]);
                
            }
            System.out.println("=================");
        }
    }
}
