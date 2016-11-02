	class BII{
	int getRateOfInterest(){
		return 0;
		}
	}
	class BCA extends BII{
		int getRateOfInterest(){
			return 8;
		}
	}
	class BNI extends BII{
		int getRateOfInterest(){
			return 7;
		}
	}
class Bank{
	public static void main(String[] args) {
		BCA pr1 = new BCA();
		BNI pr2 = new BNI();
		System.out.println(pr1.getRateOfInterest());
		System.out.println(pr2.getRateOfInterest());
	}
}
