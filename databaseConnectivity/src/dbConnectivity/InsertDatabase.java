package dbConnectivity;
import java.sql.*;

public class InsertDatabase {

	public static void main(String[] args) {
		try {
		String uname="java_user";
		String pwd="An@gram12345";
		String url="jdbc:mysql://localhost:3306/my_database";
		Connection conn=DriverManager.getConnection(url,uname,pwd);
		Statement stmt=conn.createStatement();
		String insertQuery="INSERT INTO employees(name,position,salary)"+"VALUES('John Deo','Doctor',45000)";
		
		stmt.executeUpdate(insertQuery);
		System.out.println("REcord updated successfully");
		conn.close();
	}catch(SQLException e) {
		System.out.println("Unable to connect to mySQL server");
		e.printStackTrace();
	}
	}
}
