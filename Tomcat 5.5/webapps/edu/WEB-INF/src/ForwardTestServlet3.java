// ���ϸ� : ForwardTestServlet3.java
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class ForwardTestServlet3 extends HttpServlet {
   protected void doGet(HttpServletRequest req,  HttpServletResponse res)	
				throws ServletException, IOException {
      res.setContentType("text/html; charset=EUC-KR");
      PrintWriter out = res.getWriter();
      out.println("<HTML><HEAD><TITLE>forward ����</TITLE>");
      out.println("</HEAD><BODY><H3>ForwardTestServlet3�� ���� ���</H3>");
      out.println("</BODY></HTML>");   
      // forward �Ǵ� SecondServletForwars2 �� Account ��ü�� �����Ѵ�.
    String name = req.getParameter("name");
    String number = req.getParameter("number");
    req.setAttribute("userinfo", new Account(name,number));

      // HttpServletRequest�� getRequestDispatcher()�� ����Ͽ���.
    RequestDispatcher rd = req.getRequestDispatcher("ForwardTestServlet4");
    rd.forward(req,res);
      out.close();
   }
}

 
