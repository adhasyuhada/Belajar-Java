class Parent{
	public void show(){
		System.out.println("tampil depan");
	}
}

interface InOne{
	public void event();
}

public class AnonymousClass {
	public static void main(String[] args) {
		
		Parent child = new Parent(){
			@Override
			public void show(){
				System.out.println("child object with anonymous class...");
			}
		};
		child.show();
		
		InOne in = new InOne() {
			@Override
			public void event() {
				System.out.println("interface anonymous classs");
				
			}
		};
		in.event();
	}
	
}
