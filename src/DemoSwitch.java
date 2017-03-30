import java.util.ArrayList;

class DemoSwitch{
	public static void main(String[] args){
		
		ArrayList<String> arr = new ArrayList<String>();
		int month = 8;

		switch(month){
			case 1 : arr.add("January");
			case 2 : arr.add("February");
			case 3 : arr.add("March");
			case 4 : arr.add("April");
			case 5 : arr.add("May");
			case 6 : arr.add("June");
			case 7 : arr.add("July");
			case 8 : arr.add("Augustus");
			case 9 : arr.add("September");
			case 10 : arr.add("October");
			case 11 : arr.add("November");
			case 12 : arr.add("December");
			break;
			default : break;
		}

		if(arr.isEmpty()){
			System.out.println("Invalid month ");
		}else{
			for(String bulan : arr){
				System.out.println(bulan);
			}
		}
	}
}