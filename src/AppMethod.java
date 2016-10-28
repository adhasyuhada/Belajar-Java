public class AppMethod{
  //initialize variable
  String name;
  int age;


  //create method not return Person
  void Person(){
	System.out.println("My name is " + name + " and I am " + age);
  }

  public static void main(String[] xx){
	//create object person1
	AppMethod person1 = new AppMethod();
	person1.name = "Jaki";
	person1.age = 26;
	//call the method Person
	person1.Person();
	
  }
}
