import java.io.*;
import java.util.*;
public class Reverse {
	public static void main(String[] args){
		String input = "";
		System.out.println("Masukan keyword yang akan dibalik :");
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			input = br.readLine();
			char[] try1 = input.toCharArray();
			for (int i=try1.length-1;i>=0;i--)
				System.out.print(try1[i]);
				System.out.println();
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
