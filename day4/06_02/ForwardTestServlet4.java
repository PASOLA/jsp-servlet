// ���ϸ� : ForwardTestServlet4.java
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class ForwardTestServlet4 extends HttpServlet {
   protected void doGet(HttpServletRequest req,  HttpServletResponse res)	
				throws ServletException, IOException {
      res.setContentType("text/html; charset=EUC-KR");
      PrintWriter out = res.getWriter();
      out.println("<HTML><HEAD><TITLE>forward ����</TITLE>");
      out.println("</HEAD><BODY><font color=blue><H3>ForwardTestServlet4�� ���� ���</H3></font>");
      out.println("����� Account ��ü ���� : ");
      **********************  
      if (obj != null)
        out.println("�̸� : " + ******** + "  ��ȣ : " + ********** + "<br>");
      out.println("javax.servlet.forward.request_uri : " + 
                   ********** ("javax.servlet.forward.request_uri"));
      out.println("<br>");
      out.println("javax.servlet.forward.context_path : " + 
                     ********** ("javax.servlet.forward.context_path"));
      out.println("<br>");
      out.println("javax.servlet.forward.servlet_path : " +      
                    ********** ("javax.servlet.forward.servlet_path"));		
      out.println("<br>");
      out.println("</BODY></HTML>");   
      out.close();
   }
}	
