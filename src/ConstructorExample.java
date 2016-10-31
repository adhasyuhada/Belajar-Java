public class ConstructorExample{
	int id;
	String name;

	//create parametirzed constructor
	ConstructorExample(int i, String nm){
		id = i;
		name = nm;
	}

	//create default constructor
	ConstructorExample(){
		System.out.println("ConstructorExample is created");
	}
	//create method display for print constructor parameter
	void display(){
		System.out.println(id +" "+ name);
	}

	public static void main(String[] args) {
		//create object b and default contstructor will be print
		ConstructorExample b = new ConstructorExample();
		//create constructor parameter and call method display
		ConstructorExample print = new ConstructorExample(1212,"Adha");
		print.display();
	}
}