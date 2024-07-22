package pk;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CheckUser
 */
@WebServlet("/CheckUser")
public class CheckUser extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public CheckUser() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String un = request.getParameter("uname");
        String ps = request.getParameter("uword");

        // Create cookies
        Cookie un_ck = new Cookie("ck_username", un);
        Cookie ps_ck = new Cookie("ck_password", ps);

        // Set cookie expiration time (optional, e.g., 1 day)
        un_ck.setMaxAge(24 * 60 * 60);
        ps_ck.setMaxAge(24 * 60 * 60);

        // Add cookies to the response
        response.addCookie(un_ck);
        response.addCookie(ps_ck);

        // Redirect or forward to another page (optional)
        response.sendRedirect("readcookie");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Typically, form submissions should use POST, not GET
        doPost(request, response);
    }
}
