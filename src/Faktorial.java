public class Faktorial{
	public static void main(String[] args){
		int i, fact =1;
		int value = 5;
		for (i =1;i<=value;i++) {
			fact = fact * i;
			System.out.println(fact);
		}
	}
}