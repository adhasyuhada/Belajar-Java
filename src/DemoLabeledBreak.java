class DemoLabeledBreak{
	public static void main(String[] args){
		int[][] data = {{1,2,4,5,6,7,8,9,10},{11,12,13,14,15,16,17,18,19,20},{21,22,23,24,25,26,27,28,29,30}};
		//int searchfor;
		int i;
		int j = 0;
		boolean foundit = false;
		System.out.println("Masukkan angka yang akan di cari ");
		java.util.Scanner scann = new java.util.Scanner(System.in);
		int searchfor = scann.nextInt();

		search:
		for(i = 0; i < data.length; i++){
			for (j = 0; j < data[i].length; j++) {
				if(data[i][j] == searchfor){
					foundit = true;
					break search;
				}				
			}
		}

		if(foundit){
			System.out.println("Found "+ searchfor +" value at index " + "[" + i + "][" + j +"]");
		}else{
			System.out.println("invalid value");
		}
	}
}