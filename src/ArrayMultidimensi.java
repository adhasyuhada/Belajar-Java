public class ArrayMultidimensi{
	  public static void main(String[] args){
	  //membuat array dengan 2 row dan 3 column
	  String[][] Person = new String[2][3];
	  Person[0][0] = "Ahmad";
	  Person[0][1] = "Andi";
	  Person[0][2] = "Rendi";
	  Person[1][0] = "Harun";
	  Person[1][1] = "Denada";
	  Person[1][2] = "Darwin";

	  for(int i = 0; i < Person.length; i++){
	    System.out.println(Person[0][i]);
	    System.out.println(Person[1][i]);
 	  }
	}
}
