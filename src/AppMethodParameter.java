class Person{
	void speak(String text1){
		System.out.println("I say "+ text1);
	}

	void jump(int jmp){
		System.out.println("I jum " + jmp + " m");
	}

	void run(int rn){
		System.out.println("I run for " + rn + " m");
	}
}

public class AppMethodParameter{
	public static void main(String[] args){
		//create object person1
		Person person1 = new Person();
		//call method speak and input String "Hello" to parameter text1
		person1.speak("Hello");
		//call method run and input integer value of jmp
		person1.run(100);
		//call method jum and input integer value of rn
		person1.jump(1);

		//use String variable value
		String spk = "How are you";
		//call method speak to use variable spk value
		person1.speak(spk);
	}
}