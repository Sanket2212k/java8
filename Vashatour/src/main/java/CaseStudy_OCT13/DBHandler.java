package CaseStudy_OCT13;

import java.sql.*;
public class DBHandler {
	
	public static Connection connectkk() {
		Connection connection=null;
		try
		{
		Class.forName("org.postgresql.Driver");
		 connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/CaseStudy","Postgres","1234");
		
		
		
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		return connection;
	}

}
