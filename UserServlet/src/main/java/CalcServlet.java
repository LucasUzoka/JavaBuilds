import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CalcServlet extends HttpServlet {



    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Welcome to Calculator</h1>");

        int num1 = Integer.parseInt(request.getParameter("number_1"));
        int num2 = Integer.parseInt(request.getParameter("number_2"));

//        int total = num1 + num2;

        out.println(num1 + num2);


    }
}
