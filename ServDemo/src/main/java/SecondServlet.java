import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SecondServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest2, ServletResponse servletResponse2) throws ServletException, IOException {
        System.out.println("Service called...");
        System.out.println("servicing...service called");
        servletResponse2.setContentType("text.html");
        PrintWriter pw = servletResponse2.getWriter();
        pw.print("<html></body>");
        pw.print("<h1>Welcome to my Second servlet</h1>");
        pw.print("<html></body>");
    }
}
