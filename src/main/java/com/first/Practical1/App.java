package com.first.Practical1;

import java.sql.*;

class DbOperation  // create and read record
{
	 public static void createRecord()
	    {
	    	String rollno = "0023";
	    	String sname = "AKARSH JHA";
	    	String course = "Java";
	    	String fees = "23000";
	    	Connection con =null;
	    	try {
			    	con = ConClass.getCon();
			    	Statement st = con.createStatement();
			    	String insSql = "insert into student values (";
			    	insSql = insSql + rollno + ",'" ;
			    	insSql = insSql + sname + "','" ;
			    	insSql = insSql + course + "'," ;
			    	insSql = insSql + fees + ")" ;
			    	st.execute(insSql);
			    	System.out.println("Record saved - ");	    	
			    	
	    	} catch (Exception e) 
	    	{
				e.printStackTrace();
			}
	    }
	 
	 	public static void readRecord()
	 	{
	 		try
			{
				Connection con = ConClass.getCon();	
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("select * from student");
				
				while (rs.next())
				{
						System.out.println(rs.getInt(1));
						System.out.println(rs.getString(2));
						System.out.println(rs.getString(3));
						System.out.println(rs.getInt(4));
				}
			} catch(Exception e) {}
	 	}
}

public class App 
{
    public static void main( String[] args )
    {
    	DbOperation.createRecord();
    	DbOperation.readRecord();
    }   
}
