// 파일명 : ForwardTestServlet2.java
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ForwardTestServlet2 extends HttpServlet {
   protected void doGet(HttpServletRequest req,  HttpServletResponse res)	
				throws ServletException, IOException {
      res.setContentType("text/html; charset=EUC-KR");
      PrintWriter out = res.getWriter();
      out.println("<HTML><HEAD><TITLE>forward 예제</TITLE>");
      out.println("</HEAD><BODY><font color=blue><H3>ForwardTestServlet2의 수행 결과</H3></font>");
      out.println("</BODY></HTML>");   
      out.close();
   }
}	
