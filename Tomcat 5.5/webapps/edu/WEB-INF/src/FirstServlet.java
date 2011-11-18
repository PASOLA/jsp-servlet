import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FirstServlet extends HttpServlet{
	protected void doGet(HttpServletRequest req,
                     HttpServletResponse res)
                     throws ServletException, IOException{
                     PrintWriter out = res.getWriter();
                     out.println("<HTML><HEAD><TITLE>Response Exemple</TITLE>");
                     out.println("</HEAD><BODY><H1>Have a nice day!</H1>");
                     out.println("</BODY></HTML>");
                     out.close();
                     }
}                     