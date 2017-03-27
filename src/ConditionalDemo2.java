class ConditionalDemo2{
	public static void main(String[] args){
		int i = 1;
		int j = 2;

		boolean condition = false;
		int print = condition ? i : j;
		//because condition is false 2 will be print
		System.out.println(print);
	}
}