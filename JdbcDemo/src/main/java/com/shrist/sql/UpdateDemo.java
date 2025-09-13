package com.shrist.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateDemo {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/jfsjulybatch";
		String username="root";
		String password="root";
//		String query = "update employee set department=? where employee_id=?";
		String query = "delete from employee where employee_id=?";

		// create a connection object
		try(Connection connection = DriverManager.getConnection(url, username, password);
			//create a PreparedStatement
			PreparedStatement st = connection.prepareStatement(query);){
			//set values for placeholder
//			this is for update
//			st.setString(1, "HR");
//			st.setInt(2, 101);
			
//			this is for delete
			st.setInt(1, 101);
			
			// execute the query
			int count = st.executeUpdate();
			System.out.println("Row updated "+count);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
