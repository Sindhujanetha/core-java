package com.tnsif.jdbsprogram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class IUdemo {
	
	public static void main(String[] args) throws SQLException {
		
		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/welcome", "postgres", "postsql");
		
		Statement st=con.createStatement();
		
		String str="insert into student values(7,'vinny','mech')";
		System.out.println("the sql statement "+str);
		
		int countno=st.executeUpdate(str);
		System.out.println(countno+"record inserted");
		
		String sqldelete="delete from student where stuid=1";
		System.out.println("the sql statement"+sqldelete);
		
		int countdelete=st.executeUpdate(sqldelete);
		System.out.println(countdelete+"record deleted");
		
	}

}

