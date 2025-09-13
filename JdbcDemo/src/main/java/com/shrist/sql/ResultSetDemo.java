package com.shrist.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ResultSetDemo {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/jfsjulybatch";
		String username="root";
		String password="root";
		String query = "select * from employee";

		try(Connection connection = DriverManager.getConnection(url, username, password);
			PreparedStatement st = connection.prepareStatement(query);
			//create a ResultSet object
			ResultSet rs = st.executeQuery();){
			
			while(rs.next()) {
				String name = rs.getString("name");
				int empId = rs.getInt(2); //column number
				String department = rs.getString("department");
				System.out.println(name+"\t"+empId+"\t"+department);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	
	}
}


