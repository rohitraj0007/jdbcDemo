package jdbcDemo;

import java.sql.*;

public class MakeConnection {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			/*
			 * connection is an interface
			 * DriverManager.getConnection returns object of connection type
			 * 
			 */
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "password");
			Statement stmt = con.createStatement();
			System.out.println("Created DB Connection....");
			ResultSet rs = stmt.executeQuery("select * from customer");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "  " + rs.getInt(2) + "  " + rs.getString(3));
				String st= rs.getString("first_name");
				System.out.println(st);
			}
			/*
			 * stmt.close(); con.close();
			 */

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
