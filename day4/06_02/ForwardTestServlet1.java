// ���ϸ� : ForwardTestServlet1.java
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ForwardTestServlet1 extends HttpServlet {
   protected void doGet(HttpServletRequest req,  HttpServletResponse res)	
				throws ServletException, IOException {
      res.setContentType("text/html; charset=EUC-KR");
      PrintWriter out = res.getWriter();
      out.println("<HTML><HEAD><TITLE>forward ����</TITLE>");
      out.println("</HEAD><BODY><H3>ForwardTestServlet1�� ���� ���</H3>");
      out.println("</BODY></HTML>");   
      **********************  
      **********************  
      **********************  
     
      out.close();
   }
}	
