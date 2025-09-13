package com.shrist.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertDemo {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/jfsjulybatch";
		String username="root";
		String password="root";
		String query = "insert into employee values(?,?,?)";
	
		// create a connection object
		try(Connection connection = DriverManager.getConnection(url, username, password);
			//create a PreparedStatement
			PreparedStatement st = connection.prepareStatement(query);){
			//set values for placeholder
			st.setString(1,"Sri" );
			st.setInt(2, 102);
			st.setString(3, "Tech");
			// execute the query
			boolean isInserted = st.execute();
			System.out.println("Row Inserted "+!isInserted);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
