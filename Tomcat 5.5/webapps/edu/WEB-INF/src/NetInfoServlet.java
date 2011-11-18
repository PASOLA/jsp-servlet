import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
public class NetInfoServlet extends HttpServlet{
  public void doGet (HttpServletRequest req,
                     HttpServletResponse res)
                     throws ServletException, IOException{                    
        PrintWriter out;
        res.setContentType("text/html; charset = EUC-KR");
        out = res.getWriter();
        out.println("<html>");
        out.println("<head><title>Request 정보출력 Servlet</title></head>");
        out.println("<body>");
        out.println("<h3>네트워크 관련 요청정보</h3>");
        out.println("<pre>");
        out.println("Request Scheme : "+req.getScheme());
        out.println("Server Name : "+req.getServerName());
        out.println("Server Address : "+req.getLocalAddr());
        out.println("Server Port : "+req.getServerPort());
        out.println("Client Address : "+req.getRemoteAddr());
        out.println("Client Host : "+req.getRemoteHost());
        out.println("Client Port : "+req.getRemotePort());
        out.println("</pre>");
        out.println("</body></html>");
        }
}        
        
                     