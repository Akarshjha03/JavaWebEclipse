package pkg;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.io.*;

/**
 * Servlet implementation class saveStudentServlet
 */
@WebServlet("/stdadddServlet")
public class stdadddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public stdadddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String rollno = request.getParameter("rollno");
		String sname = request.getParameter("sname");
		String course = request.getParameter("course");
		String fees = request.getParameter("fees"); 
		
	    PrintWriter pw =response.getWriter();
	
	    ServletConfig sc = getServletConfig();
	    String dburl = sc.getInitParameter("dburl");
	    String uname = sc.getInitParameter("uname");
	    String ps = sc.getInitParameter("ps");
	    
	    ServletContext ct = getServletContext();
		String dpname = ct.getInitParameter("devname");		
	    
	    try
	    {
	    	Connection con = ConClass.getCon();
	    	PreparedStatement pstmt = con.prepareStatement("insert into student values (?,?,?,?)");
	    	pstmt.setInt(1,Integer.parseInt(rollno));
	    	pstmt.setString(2,sname);
	    	pstmt.setString(3,course);
	    	pstmt.setInt(4,Integer.parseInt(fees));
	    	
	    	pstmt.executeUpdate();
	    	pw.println("Record saved - ");	    	
	    	
	    } catch(Exception e) {
	    	
	    	pw.println(e);
	    }

		
	}

}


/*	
 * 
 * 	//    	Class.forName("com.mysql.cj.jdbc.Driver");
	//    	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db01","root","admin@123");
	//    	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db01?allowPublicKeyRetrieval=true&useSSL=False","root","admin@123");
	    	// Statement st = con.createStatement();


 * 		//int rollno1 = Integer.parseInt(rollno);
			//String sname1 = "'"+sname+"'" ;
			//String course1 = "'" + course +"'";
			//int fees1 = Integer.parseInt(fees);
			
	    	//String sql = "insert into student (rollno, sname, course, fees ) values ("+rollno1+','+sname1+','+course1+','+fees1+')';
	    	
	    	
	    	//st.executeUpdate(sql);
	    	//pw.println(sql); 
*/
	    	
