class Data{
	private int id;
	private String name;
	
	public Data(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	public String toString(){
//    	StringBuilder sb = new StringBuilder();
//    	sb.append(id).append(" : ").append(name);
//		return sb.toString();
		return String.format("%-2d: %s", id, name);
	}
	
}

public class ToStringMethod {
	
    public static void main( String[] args ){
    	Data obj1 = new Data(4,"ardi");
    	Data obj2 = new Data(5,"rendi"); 
    	System.out.println(obj1);
    	System.out.println(obj2);
    }
}
