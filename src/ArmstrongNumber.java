public class ArmstrongNumber {
	public static void main(String[] args) {
		int a, b = 0, temp;
		int n = 153;
		temp = n;
		while(n>0){
			a = n%10; //*153%10=3 **15%10=5 ***1%10=1
			n = n/10; //*153/10=15 **15/10=1 ***1/10=0
			b = b + (a*a*a); //*0+(3x3x3)=27 **27+(5x5x5)=152 ***152+(1x1x1)=153
		}
		if(temp == b){
			System.out.println("Armstrong number");
		}else{
			System.out.println("This is'nt armstrong number");
		}
	}
}
