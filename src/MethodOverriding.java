class SprClass{ //parent class
	int id = 11; //instance variable
	
	int setId(){ //method set mengembalikan nilai id = 11
            return id;
	}
	
}
	class MethodOverriding extends SprClass{ //inheritance class SprClass
	int id = 22; //instance variable
		
	int setId(int id){ //method set mengembalikan nilai id = 11 diambil dari class parent dengan kata kunci super
            return super.id; //kata kunci super mengacu ke id yang ada di parent class
	}
        
	void printId(){ //method print untuk mencetak hasil dari overriding dengan kata kunci super
		System.out.println(super.setId()); //mengambil nilai id = 11 dari class parent SprClass
	}
        
	public static void main(String[] args) { //main method
		MethodOverriding pr = new MethodOverriding(); //membuat objek baru pr
		pr.printId(); //menjalankan method printId di dalam class MethodOverriding
		
	}
}
