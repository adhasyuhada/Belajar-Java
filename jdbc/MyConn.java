import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

class MysqlConn {
	public static void main(String[] args) {
			try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/zurich","root","123456");
				PreparedStatement pm = con.prepareStatement("INSERT INTO address VALUES (?,?,?,?,?,?) ");
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				do{
					System.out.println("enter id");
					int id = Integer.parseInt(br.readLine());
					System.out.println("enter street");
					String street = br.readLine();
					System.out.println("enter city");
					String city = br.readLine();
					System.out.println("enter province");
					String province = br.readLine();
					System.out.println("enter zipcode");
					String zip = br.readLine();
					System.out.println("enter country");
					String country = br.readLine();
					
					pm.setInt(1, id);
					pm.setString(2, street);
					pm.setString(3, city);
					pm.setString(4, province);
					pm.setString(5, zip);
					pm.setString(6, country);
					int i = pm.executeUpdate();
					System.out.println(i + "records affected ");
					
					System.out.println("Do you want to continue y/n");
					String s = br.readLine();
					if(s.startsWith("n")){
						break;
					}
				}while(true);
				con.close();
			}catch(Exception e){
				System.out.println(e);
			}
	}
}
