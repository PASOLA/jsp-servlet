import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
public class URLInfoServlet extends HttpServlet{
  public void doGet (HttpServletRequest req,
                     HttpServletResponse res)
                     throws ServletException, IOException{                    
        PrintWriter out;
        res.setContentType("text/html;charset=EUC-KR");
        out = res.getWriter();
        out.println("<html>");
        out.println("<head><title>Request 정보출력 Servlet</title></head>");
        out.println("<body>");
        out.println("<h3>요청방식과  프로토콜 정보</h3>");
        out.println("<pre>");
        out.println("Request URI : "+req.getRequestURI());
        out.println("Request URL : "+req.getRequestURL());
        out.println("Context Path : "+req.getContextPath());
        out.println("Request Protocol : "+req.getProtocol());
        out.println("Servlet Path : "+req.getServletPath());

        out.println("</pre>");
        out.println("</body></html>");
        }
}        