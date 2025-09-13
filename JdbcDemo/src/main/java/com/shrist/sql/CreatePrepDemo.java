package com.shrist.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class CreatePrepDemo {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/jfsjulybatch";
		String username="root";
		String password="root";
		String query = """
				create table student(student_name varchar(20),
				student_id int primary key,department varchar(20))
				""";
	
		// create a connection object
		try(Connection connection = DriverManager.getConnection(url, username, password);
			//create a PreparedStatement
			PreparedStatement st = connection.prepareStatement(query);){
			// execute the query
			boolean isCreated = st.execute();
			System.out.println("Table created "+!isCreated);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

}
