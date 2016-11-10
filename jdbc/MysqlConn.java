import java.sql.*;

class MysqlConn {
	public static void main(String[] args) {
			try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/zurich","root","123456");
				PreparedStatement pm = con.prepareStatement("INSERT INTO address VALUES (?,?,?,?,?,?) ");
				pm.setInt(1, 1); //index 1 di isi dengan tipe int 1
				pm.setString(2,"Padjajaran"); //index 2 di isi dengan tipe String Padjajaran
				pm.setString(3,"Bogor");
				pm.setString(4,"Jawa Barat");
				pm.setString(5,"12820");
				pm.setString(6,"Indonesia");
				int i = pm.executeUpdate();
				System.out.println(i + " records inserted");
				con.close();
			}catch(Exception e){
				System.out.println(e);
			}
	}
}
