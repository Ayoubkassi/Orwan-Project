
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class H2EmbeddedExample {

	public static void main(String[] args) {
		String jdbcURL = "jdbc:h2:~/test";
		
		String username = "aaak";
		String password = "123456";
		
		try {
			Connection connection = DriverManager.getConnection(jdbcURL, username, password);
			System.out.println("Connected to H2 embedded database.");
			
			String sql = "INSERT INTO students (name)values('Ayoub')";
			
			Statement statement = connection.createStatement();
			int rows = statement.executeUpdate(sql);
			
			if (rows >0) {
				System.out.println("A row inserted");
			}
			sql = "SELECT * FROM students";
			
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
