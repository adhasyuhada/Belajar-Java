class ContinueWithLabel{
	public static void main(String[] args){
		String superstring = "ini super string ";
		String substring = "ini substring ";
		boolean foundIt = false;
		int max = substring.length() - substring.length();

		test:
		for (int i = 0; i < max; i++) {
			int n = substring.length();
			int j = i;
			int k = 0;
			while(n-- != 0){
				if(superstring.charAt(j++) != substring.charAt(k++)){
					continue test;
				}
			}
			foundIt = true;
			break test;
		}
		System.out.println( foundIt ? " Found it " : "Not Found");
	}
}