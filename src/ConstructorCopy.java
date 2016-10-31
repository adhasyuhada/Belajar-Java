class ConstructorCopy{
	//create variable inside class
	int id;
	String name;
	//create constructor with 2 parameter
	ConstructorCopy(int aydi, String nem){
		id = aydi;
		name = nem;
	}
	//create constructor with copy parameter value
	ConstructorCopy(ConstructorCopy i){
		id = i.id;
		name = i.name;
	}

	//create method display for print constructor variable value from parameter
	void display(){
		System.out.println(id + " " + name);
	}

	public static void main(String[] args){
		//create object from class
		ConstructorCopy sb1 = new ConstructorCopy(1212,"Ardiansyah");
		ConstructorCopy sb2 = new ConstructorCopy(sb1);
		//call method to print
		sb1.display();
		sb2.display();
	}
}