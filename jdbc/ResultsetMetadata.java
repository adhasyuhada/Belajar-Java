import java.sql.*;


class ResultsetMetadata {
	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/zurich","root","123456");
			PreparedStatement ps = con.prepareStatement("select * from address");
			ResultSet rs = ps.executeQuery();
			ResultSetMetaData ResultsetMetadata = ps.getMetaData();
			
			System.out.println("Total column " + ResultsetMetadata.getColumnCount());
			System.out.println("Column name of 1st column " + ResultsetMetadata.getColumnName(1));
			System.out.println("Column Type name of 1st column " + ResultsetMetadata.getColumnTypeName(1));
			con.close();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
