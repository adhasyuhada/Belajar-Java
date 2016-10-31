public class StaticVar {
	
	int id;
	String name;
	static String kampus = "ITB";
	
	StaticVar(int i, String nm) {
		id = i;
		name = nm;	}
	
	void display(){
		System.out.println(id + " " + name + " " + kampus);
	}
	
	public static void main(String[] args) {
		StaticVar mhs1 = new StaticVar(1212, "Aryan");
		StaticVar mhs2 = new StaticVar(2121, "Alwansyah");
		mhs1.display();
		mhs2.display();
	}

}
