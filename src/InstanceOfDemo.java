class InstanceOfDemo{
	public static void main(String[] args){
		Parent obj1 = new Parent();
		Parent obj2 = new Child();

		System.out.println("obj1 InstanceOf Parent " + (obj1 instanceof Parent));
		System.out.println("obj1 InstanceOf MyInterface " + (obj1 instanceof MyInterface));
		System.out.println("obj1 InstanceOf Child " + (obj1 instanceof Child));
		System.out.println("obj2 InstanceOf Parent " + (obj2 instanceof Parent));
		System.out.println("obj2 InstanceOf MyInterface " + (obj2 instanceof MyInterface));
		System.out.println("obj2 InstanceOf Child " + (obj2 instanceof Child));
	}
}

class Parent{}
class Child extends Parent implements MyInterface{
}
interface MyInterface{}