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
      Account obj = (Account)req.getAttribute("userinfo"); 
      if (obj != null)
        out.println("�̸� : " + obj.getName() + "  ��ȣ : " + obj.getNumber() + "<br>");
      out.println("javax.servlet.forward.request_uri : " + 
                   req.getAttribute ("javax.servlet.forward.request_uri"));
      out.println("<br>");
      out.println("javax.servlet.forward.context_path : " + 
                   req.getAttribute ("javax.servlet.forward.context_path"));
      out.println("<br>");
      out.println("javax.servlet.forward.servlet_path : " +      
                    req.getAttribute ("javax.servlet.forward.servlet_path"));		
      out.println("<br>");
      out.println("</BODY></HTML>");   
      out.close();
   }
}	
