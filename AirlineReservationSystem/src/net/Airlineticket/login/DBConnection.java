package net.Airlineticket.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBConnection {
	
public static void main(String[] args) {
		
		try {
			// 1. Get a connection to the database
			String userName = "root";
			   String password = "lilson12";
			   String url = "jdbc:mysql://localhost:3306/demojava?useSSL=false";
			Connection Conn = DriverManager.getConnection(url, userName, password);	
			
			// 2. Create a statement
			Statement myStatement = Conn.createStatement();
			// 3. execute the sql query
			//ResultSet Rs = myStatement.executeQuery("SELECT * FROM user");
			
			String sql = "INSERT INTO user " 
						+ "(username, email, password)"
						+ "VALUES ('Marie', 'santa@mail.com', 'test123')";
			myStatement.executeUpdate(sql);
			
			System.out.println("Insert complete");
						
			// 4. Process result
		//	while(Rs.next()) {
		//		System.out.println(Rs.getString("username") + " , " + Rs.getString("email"));
		//	}
			
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
