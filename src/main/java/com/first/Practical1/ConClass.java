package com.first.Practical1;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConClass {
	public static  Connection getCon()
	{
		Connection con =null;
    	try {
			// Class.forName("com.mysql.cj.jdbc.Driver");		
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaerp?allowPublicKeyRetrieval=true&useSSL=False","root","helix1083");
    	} catch (Exception e) 
    	{
			e.printStackTrace();
		}
    	return con;
	}
}
