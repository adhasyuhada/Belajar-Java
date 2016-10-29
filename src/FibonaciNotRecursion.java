class FibonaciNotRecursion{
	public static void main(String[] aaa){
		//create variable
		int n1 = 0, n2 = 1, n3, count = 8;

		System.out.print (n1 + " " + n2); 

		//loop until 8 because 0 and 1 printed
		for(int i = 0; i < count; i++){

			n3 = n1+n2; // sum n1 and n2
			System.out.print(" "+n3); //print n3
			n1 = n2; // n2 = 1 and will adding the next loop value
			n2 = n3; // n3 = n1+n2
		}
	}
}