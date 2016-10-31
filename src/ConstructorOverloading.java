class ConstructorOverloading{
	//create variable inside class
	int id;
	String name;
	int age;
	String address;

	//create constructor with 2 parameter
	ConstructorOverloading(int i, String nm){
		id = i;
		name = nm;
	}

	//create constructor with 3 parameter
	ConstructorOverloading(int i, String nm, int a){
		id = i;
		name = nm;
		age = a;
	}

	//create constructor with 4 parameter
	ConstructorOverloading(int i, String nm, int a, String add){
		id = i;
		name = nm;
		age = a;
		address = add;
	}
	//create method display for print constructor variable value from parameter
	void display(){
		System.out.println(id + " " + name + " " + age + " " + address);
	}

	public static void main(String[] args){
		//create object from class
		ConstructorOverloading sb1 = new ConstructorOverloading(1212,"Ardiansyah");
		ConstructorOverloading sb2 = new ConstructorOverloading(1111,"Alfiansyah",49);
		ConstructorOverloading sb3 = new ConstructorOverloading(1331,"Amirudin",50,"Jakarta");
		//call method to print
		sb1.display();
		sb2.display();
		sb3.display();
	}
}