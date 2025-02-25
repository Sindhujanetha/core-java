package com.tnsif.jdbsprogram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class JDBCselect {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("org.postgresql.Driver");
		System.out.println("load is over");
		
		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/welcome","postgres","postsql");
		
		Statement st=con.createStatement();
	
		String strselect="slect sname, sbranch from student";
		System.out.println("The sql statement is"+strselect);
		
		ResultSet rs=st.executeQuery(strselect);
		System.out.println("The record are");
		int rowcount=0;
		while(rs.next()) {
			String sname=rs.getString("sname");
			String sbranch=rs.getString("sbranch");
			
			System.out.println(sname+" "+sbranch);
		}
		
		
		
	}

}
