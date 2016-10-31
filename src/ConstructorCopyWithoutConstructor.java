public class ConstructorCopyWithoutConstructor{
	int id;
	String name;

	//create parametirzed constructor
	ConstructorCopyWithoutConstructor(int i, String nm){
		id = i;
		name = nm;
	}
	ConstructorCopyWithoutConstructor(){

	}
	//create method display for print constructor parameter
	void display(){
		System.out.println(id +" "+ name);
	}

	public static void main(String[] args) {
		//create object b and default contstructor will be print
		ConstructorCopyWithoutConstructor b1 = new ConstructorCopyWithoutConstructor(232,"Adha");

		//create constructor parameter and call method display
		ConstructorCopyWithoutConstructor b2 = new ConstructorCopyWithoutConstructor();
		b2.id = b1.id;
		b2.name = b1.name;
		b1.display();
		b2.display();
	}
}