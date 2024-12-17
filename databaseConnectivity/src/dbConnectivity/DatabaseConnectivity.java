//package dbConnectivity;
//
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.sql.Connection;
//
//public class DatabaseConnectivity{
//	public static void main(String[] args) {
//		
//
//        try {
////        	String uname="java_user";
////        	String pwd="An@gram12345";
////        	String url="jdbc:mysql://localhost:3306/my_database";
//        	
//            // Establish connection to the MySQL database
//            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_database","java_user","An@gram12345");
//            Statement stmt=conn.createStatement();
//            
//            ResultSet rs=stmt.executeQuery("SELECT * FROM employees");
//            while(rs.next()) {
//            	System.out.println("Id:"+rs.getInt(1) +"Name:"+rs.getString(2) +"Position:"+rs.getString(3));
//            }
//            conn.close();
//         
//        } catch (SQLException e) {
//            // Print the exception if connection fails
//            System.out.println("Error: Unable to connect to MySQL server.");
//            e.printStackTrace();
//        }
//        
//    }
//}
package dbConnectivity;
import java.sql.*;

public class DatabaseConnectivity{
	public static void main(String [] args){
		try {
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/my_database","java_user","An@gram12345");
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT * FROM employees");
			
			while(rs.next()) {
				System.out.println("Id:"+rs.getInt(1)+"Name:"+rs.getString(2)+"position:"+rs.getString(3)+"Salary:"+rs.getString(4));
			}
			
			conn.close();
		}catch(SQLException e) {
			System.out.println("Unable to connect to mySQL server");
			e.printStackTrace();
		}
	}
}











