package dbConnectivity;

import java.sql.*;

public class UpdateDatabase {

	public static void main(String[] args) {
		try {
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/my_database","java_user","An@gram12345");
			Statement stmt=conn.createStatement();
			int rowsAffected=stmt.executeUpdate("UPDATE employees SET name='Birendra' WHERE id=1");
			if(rowsAffected>0) {
				System.out.println("Record updated successfully");
			}
			else {
				System.out.println("No record found with the specified condition");
			}
			conn.close();
	}
catch(SQLException e) {
	System.out.println("Unable to connect to mySQL server");
	e.printStackTrace();
}
	}
		
}
