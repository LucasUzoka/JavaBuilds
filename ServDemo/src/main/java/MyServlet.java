import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class MyServlet implements Servlet {

    ServletConfig config;// Can also be ServletConfig config

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        this.config = servletConfig;
        System.out.println("Servlet is initialized");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("servicing...service called");
        servletResponse.setContentType("text.html");
        PrintWriter pw = servletResponse.getWriter();
        pw.print("<html></body>");
        pw.print("<h1>Welcome servlet</h1>");
        pw.print("<html></body>");
    }

    @Override
    public void destroy() {
        System.out.println("destroying...destroyed");
    }


    @Override
    public ServletConfig getServletConfig() {
        return this.config;
    }


    @Override
    public String getServletInfo() {
        return "Servlet created";
    }


}
