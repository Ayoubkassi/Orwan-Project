package net.codejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class H2ServerModeExamples {

	public static void main(String[] args) {
		String jdbcURL = "jdbc:h2:tcp://localhost/~/test";
		
		String username = "aaak";
		String password = "123456";
		
		try {
			Connection connection = DriverManager.getConnection(jdbcURL, username, password);
			System.out.println("Connected to H2 in server mode.");
			
			String sql = "SELECT * FROM students";
			
			Statement statement = connection.createStatement();
			
			ResultSet resultSet = statement.executeQuery(sql);
			
			int count = 0;
			while (resultSet.next()) {
				count++;
				
				int ID = resultSet.getInt("ID");
				String name = resultSet.getString("name");
				System.out.println("Student #" + count + ": " + ID + "," + name);
			}
			
			connection.close();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
