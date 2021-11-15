import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CookieServlet1 extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet State Management - Cookies</title>");
        out.println("</head>");
        out.println("<body>");

        String name = request.getParameter("name");

        //create cookie
        Cookie cookie = new Cookie("user_name", name);
        response.addCookie((cookie));
        out.println("<h1>Hello "+name+", Welcome to my website</h1>");
        out.println("<h1><a href='servlet2'>Go to Cookie Servlet</a></h1>");
        out.println("<body>");
        out.println("</html>");


    }

}
