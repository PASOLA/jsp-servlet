// 파일명 : ForwardTestServlet3.java
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class ForwardTestServlet3 extends HttpServlet {
   protected void doGet(HttpServletRequest req,  HttpServletResponse res)	
				throws ServletException, IOException {
      res.setContentType("text/html; charset=EUC-KR");
      PrintWriter out = res.getWriter();
      out.println("<HTML><HEAD><TITLE>forward 예제</TITLE>");
      out.println("</HEAD><BODY><H3>ForwardTestServlet3의 수행 결과</H3>");
      out.println("</BODY></HTML>");   
      // forward 되는 SecondServletForwars2 에 Account 객체를 전달한다.
    **********************  
    **********************  
    **********************  
    **********************  
      // HttpServletRequest의 getRequestDispatcher()를 사용하였다.
     **********************  
    **********************  
      out.close();
   }
}

 
