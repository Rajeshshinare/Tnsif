package com.tnsif.day15.jdbcoperation;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class  JDBCInsertData {

	public static void main(String[] args) {
		
		try {
			//step 1: Load or register the driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver is load successfully");
			
			//step 2: create connection 
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/TNSIF", "root", "Rajesh");
			System.out.println("Connection created successfully");
			
			//step 3: create a statement 
			Statement stmt=con.createStatement();
			
			System.out.println("Statement created succesfully");
			
			//step 4: write a query
			
//			String q="insert into student values (101, 'Rajesh', 'Java', 55.02);";
//			String q="insert into student values (102, 'Aayan', 'PHP', 72.07);";
			String q="insert into student values (103, 'Datta', 'Python', 65.86);";
			
			
			boolean s=stmt.execute(q);
		}
		catch(Exception e)
		{
			System.err.println(e);
		}

	}

}

