public class WhileDo{
	public static void main(String[] aa){
		String[] mie = {"Indomie","Mie Sedap Kari","Sarimi"};

		int i=0;
		do{
			System.out.println("Mi instan : " + mie[i]);
			i++;
		}
		while(i < mie.length);
	}
}