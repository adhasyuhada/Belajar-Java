public class StringBuilderExample {
    public static void main( String[] args ){
    	
    	String name = "";
    	//Iefficient
    	name += "Nama saya joe";
    	name += " ";
    	name += "saya seorang dokter";
    	
    	System.out.println(name);
    	
    	
    	//More Efficient
    	StringBuilder sb = new StringBuilder("");
    	sb.append("nama saya randi");
    	sb.append(" ");
    	sb.append("saya seorang pelaut");
    	System.out.println(sb.toString());
    	
    	System.out.print("Here is some text.\tThat was a tab.\nThat was a newline.");
    	StringBuilder s = new StringBuilder();
    	s.append("nama saya heru").append(" ").append("saya seorang bajak laut");
    	System.out.println(s.toString());
    	//String Formatting
    	System.out.printf("merubah nilai dalam string %d, %d",87,43 );
    	
    	for(int i =0; i <10; i++){
    		System.out.printf("%-2d : %s\n", i, "string ini diambil oleh s");
    	}
    	
    	System.out.printf("nilai floating point %.2f \n", 234.12345); //yg akan diambil hanya 2 angka dari belakang
    	System.out.printf("nilai float 2 angka di depan %3.2f \n", 3214.44232);
    	System.out.printf("Total value:%2.1f \n", 343.23423);
    }
}
