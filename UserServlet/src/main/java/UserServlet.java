import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class UserServlet extends HttpServlet {


    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Welcome User</h1>");
        out.println("<table class = table table-dark>");

        String fName = request.getParameter("first_name");
        String lName = request.getParameter("last_name");
        String email = request.getParameter("user_email");
        String gender = request.getParameter("gender");
        String location = request.getParameter("location");


        out.println("<tr><td>" + fName + "</td><td>" + lName + "</td><td>" + email + "</td><td>" + gender + "</td><td>" +
                location + "</td></tr>");

        out.println("</table>");


        out.println("Welcome " + fName + " " + lName);
        out.println("confirmation will be sent to: " + email);
        out.println("You are a " + gender + " from " + location);

    }
}
