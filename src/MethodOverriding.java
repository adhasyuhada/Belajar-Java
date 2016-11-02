class SprClass{
	void run(){
		System.out.println("Invoke method run");
	}
}

	class MethodOverriding extends SprClass{
	void run(){
			System.out.println("Invoke method overriding");
		}
	public static void main(String[] args) {
		MethodOverriding pr = new MethodOverriding();
		pr.run();
		
	}
}