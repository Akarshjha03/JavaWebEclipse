package pkg;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
/**
 * Servlet implementation class readStudentData
 */
@WebServlet("/readStudentData")
public class readStudentData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public readStudentData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter pw = response.getWriter();
		int rn1;
		try
		{
			Connection con = ConClass.getCon();
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from student");
			pw.println("<html><body>");
			pw.println("<table border='1'>");
			
			while (rs.next())
			{
					pw.println("<tr>");
						rn1 = rs.getInt(1);
						pw.println("<td>" +  rs.getInt(1) + "</td>");
						pw.println("<td>" +  rs.getString(2) + "</td>");
						pw.println("<td>" +  rs.getString(3) + "</td>");
						pw.println("<td>" +  rs.getInt(4) + "</td>");
						pw.println("<td>"+ "<a href='editServlet?rollno=" + rn1 +"'>" +  "Edit" +"</a> " + "</td>"); 
						pw.println("<td>"+ "<a href='deleteServlet?rollno=" + rn1 +"'>" +  "Delete" +"</a> " + "</td>"); 
						//pw.println("<td>" +  "Delete" + "</td>");

					pw.println("</tr>");
			}
			pw.println("</table>");
			pw.println("</body></html>");
		    	
		} catch(Exception e) {}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	}

}
