// 파일명 : ForwardTestServlet4.java
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class ForwardTestServlet4 extends HttpServlet {
   protected void doGet(HttpServletRequest req,  HttpServletResponse res)	
				throws ServletException, IOException {
      res.setContentType("text/html; charset=EUC-KR");
      PrintWriter out = res.getWriter();
      out.println("<HTML><HEAD><TITLE>forward 예제</TITLE>");
      out.println("</HEAD><BODY><font color=blue><H3>ForwardTestServlet4의 수행 결과</H3></font>");
      out.println("추출된 Account 객체 정보 : ");
      Account obj = (Account)req.getAttribute("userinfo"); 
      if (obj != null)
        out.println("이름 : " + obj.getName() + "  번호 : " + obj.getNumber() + "<br>");
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
