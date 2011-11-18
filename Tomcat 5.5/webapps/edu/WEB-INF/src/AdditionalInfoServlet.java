import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
public class AdditionalInfoServlet extends HttpServlet{
  public void doGet (HttpServletRequest req,
                     HttpServletResponse res)
                     throws ServletException, IOException{                    
        PrintWriter out;
        res.setContentType("text/html;charset=EUC-KR");
        out = res.getWriter();
        out.println("<html>");
        out.println("<head><title>Request 정보출력 Servlet</title></head>");
        out.println("<body>");
        out.println("<h3>추가적인 요청 정보</h3>");
        out.println("<pre>");
        out.println("Request Method : "+req.getMethod());
        out.println("Path Info : "+req.getPathInfo());
        out.println("Path Translated : "+req.getPathTranslated());
        out.println("Query String : "+req.getQueryString());
        out.println("Content Length : "+req.getContentLength());

        out.println("</pre>");
        out.println("</body></html>");
        }
}        