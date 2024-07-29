package pkg;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class editServlet
 */
@WebServlet("/editServlet")
public class editServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public editServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		String srno = request.getParameter("rollno");
		PrintWriter pw = response.getWriter();

		
		int rn=0,fs=0;
		String sn="",cs="";
		
		Connection con;
		try
		{
			con = ConClass.getCon();
			Statement st = con.createStatement();
			String sql = "Select * from student where rollno ="+srno;
			ResultSet rs = st.executeQuery(sql);	
			while (rs.next())
			{
				rn=rs.getInt(1);
				sn = rs.getString(2);
				cs = rs.getString(3);
				fs = rs.getInt(4);				
			}
			pw.println(sn + " " + cs);
		}
		catch (Exception e) {}
		response.setContentType("text/html");
		pw.println("<html><body>");
		
		//pw.println("<form method=\"POST\" action='updateStudent?rollno=" + rn + "'>");
		
		//pw.println("<form method="POST" action='updateStudent?rollno=+ rn + "'>");
		
		pw.println("<form action = 'updateStudent' method='POST'>");
		pw.println("<table>");
		
		pw.println("<tr>");
		pw.println("<td>" + "Roll no :" + "</td>");
		pw.println("<td>" + "<input type='text' name='rn' value='" + rn + "'/>" +"</td>");
		pw.println("</tr>");
		
		pw.println("<tr>");
		pw.println("<td>" + "Name :" + "</td>");
		pw.println("<td>" + "<input type='text' name='sn' value='" + sn +"'/>" + "</td>");	
		pw.println("</tr>");	
		
		pw.println("<tr>");
		pw.println("<td>" + "Course :" + "</td>");
		pw.println("<td>" + "<input type='text' name='cs' value='" + cs +"'/>" + "</td>");	
		pw.println("</tr>");	
		
		pw.println("<tr>");
		pw.println("<td>" + "Fees :" + "</td>");
		pw.println("<td>" + "<input type='text' name='fs' value='" + fs +"'/>" + "</td>");	
		pw.println("</tr>");	
		
		pw.println("<tr>");
		pw.println("<td>" + "" + "</td>");
		pw.println("<td>" + "<input type='submit' value='Update'/>" + "</td>");	
		pw.println("</tr>");	
		
		pw.println("</table>"); 
		pw.println("</form>");
		
		pw.println("</body></html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
	}

}
