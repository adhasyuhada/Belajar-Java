class Person{
	void speak(String text1){
		System.out.println("I say "text1);
	}

	void jump(int jmp){
		System.out.println("I jum " + jmp + "m");
	}

	void run(int rn){
		System.out.println("I run for " + rn + "m");
	}
}

public class AppMethodParameter extends Person{
	public static void main(String[] args){
		Person person1 = new Person();
		person1.speak("Hello");
		person1.run(100);

	}
}