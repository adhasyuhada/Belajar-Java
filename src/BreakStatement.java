class BreakStatement{
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,6,12,11,13};
		int searchfor = 12;
		int i;
		boolean foundit = false;
		for(i = 0; i < arr.length; i++){
			if(arr[i] == searchfor){
				foundit = true;
				break;
			}
		}
		if(foundit){
			System.out.println("found 12 at index : " + i);
		}else{
			System.out.println("invalid number ");
		}

	}
}