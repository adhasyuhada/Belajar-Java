class FibonaciWithRecursion{
	static int n1=0, n2=1, n3=0;
		static void printFibonaci(int count){ //parameter value is 8
			if(count>0){
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" "+ n3);
			printFibonaci(count-1);
			}
		}

	public static void main(String[] args){
		int count = 10;
		System.out.print(" "+ n1 + " " + n2); //print 0 and 1
		printFibonaci(count-2); //10 - 2 = 8
	}
}