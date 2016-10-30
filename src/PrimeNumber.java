import java.util.Scanner;
public class PrimeNumber{
	int i, j, k=0;
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Masukkan angka "); 
		int print = input.nextInt();
	//modulus integer value input 
		if(print % 2 == 0){ 
			System.out.println("Number is not prime number");
		}
		else{
			System.out.println("This is a prime number");
		}
	}
}