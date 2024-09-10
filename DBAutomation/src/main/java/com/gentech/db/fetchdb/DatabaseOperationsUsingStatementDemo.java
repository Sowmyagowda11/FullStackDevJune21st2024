package com.gentech.db.fetchdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseOperationsUsingStatementDemo {

	public static void main(String[] args) {
		readRecords();

	}
	
	private static void readRecords()
	{
		Connection conn=null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gentech", "root", "root");
			Statement stmt=conn.createStatement();
			String query="select * from dept";
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next())
			{
				String dno=rs.getString("DEPTNO");
				String deptname=rs.getString("DNAME");
				String place=rs.getString("LOC");
				System.out.printf("%-12s",dno);
				System.out.printf("%-12s",deptname);
				System.out.printf("%-12s",place);
				System.out.printf("\n");
			}
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				conn.close();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}

}
