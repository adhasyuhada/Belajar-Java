public class Palindrome {
	public static void main(String[] args) {
		int i, sum =0, temp;
		int n = 454;
		temp = n;
		
		while(n>0){ //*454 **45 ***4 ****0
			i = n%10; // *454 % 10 = 4 **45 % 10 = 5 ***4 % 10 = 4
			sum = (sum*10)+i; //*0 x 10 + 4 = 4 **4 x 10 + 5 = 45 ***45 x 10 + 4 = 454
			n = n/10; //*454 / 10 = 45 **45 / 10 = 4 ***4 / 10 = 0
		}
		if(sum == temp){
			System.out.println("Palindrom number");
		}else{
			System.out.println("Not palindrom number");
		}
		
	}

}
