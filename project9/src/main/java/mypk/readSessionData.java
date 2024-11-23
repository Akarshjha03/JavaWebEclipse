package mypk;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class readSessionData
 */
@WebServlet("/readSessionData")
public class readSessionData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public readSessionData() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession ses = request.getSession();
		String s_un = (String) ses.getAttribute("ses_username");
		String s_ps = (String) ses.getAttribute("ses_password");
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<html><body>");
		pw.println("User name : " + s_un + "<br>");
		pw.println("Password : " + s_ps + "<br>");
		pw.println("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
