import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class ThirdServlet extends HttpServlet {
    public ThirdServlet() {
    }

//    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        System.out.println("this is post method of my servlet");
//        response.setContentType("text/html");
//        PrintWriter out = response.getWriter();
//        out.print("<h1>Get Method called</h1>");
//        out.print((new Date()).toString());
//    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("this is post method of my servlet");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("<h1>Post Method called</h1>");
        out.print((new Date()).toString());
    }
}


