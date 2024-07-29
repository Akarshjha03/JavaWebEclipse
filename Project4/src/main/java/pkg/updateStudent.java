package pkg;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class updateStudent
 */
@WebServlet("/updateStudent")
public class updateStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateStudent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String urn = request.getParameter("rn");
		String usn = "'" + request.getParameter("sn") + "'";
		String ucs = "'"+ request.getParameter("cs") +"'";
		String ufs = request.getParameter("fs");
		
		try
		{
			Connection con = ConClass.getCon(); 
			
			Statement st = con.createStatement();
			String sql = "update student set sname = " + usn + ", " + "course = " + ucs + "," + " fees = " + ufs + " where rollno = "+ urn;
			System.out.println(sql);
			st.executeUpdate(sql);
		   
		} catch(Exception e) {}
	
		 //RequestDispatcher rd = request.getRequestDispatcher("readStudentData"); 
		response.sendRedirect("readStudentData");
		// rd.forward(request, response);
		
	}

}
