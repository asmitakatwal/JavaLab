package dbConnectivity;

import java.sql.*;

public class DeleteDatabase {

	public static void main(String[] args) {
		try {
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/my_database","java_user","An@gram12345");
		Statement stmt=conn.createStatement();
	 String deleteQuery="DELETE FROM employees WHERE id=4";
			 stmt.executeUpdate(deleteQuery);
	 System.out.println("Record deleted successfuly");
	 conn.close();

	}catch(SQLException e) {
		System.out.println("Unable to connect");
		e.printStackTrace();
	}
	}
}
