// 파일명 : CookieTestServlet.java
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CookieTestServlet extends HttpServlet {
   public void doGet(HttpServletRequest req,  HttpServletResponse 
	    			res) throws IOException, ServletException {
    
      res.setContentType("text/html; charset=EUC-KR");

      PrintWriter out = res.getWriter();
      out.println("<html>");
      out.println("<body bgcolor=\"white\">");
      out.println("<head>");
      out.println("<title>쿠키 설정과 추출</title>");
      out.println("</head>");
      out.println("<body>");
      out.println("<h3>쿠키 설정과 추출 예제</h3>");

    ********************************************8

       out.println("<hr><p>");
       out.println("설정하고자 하는 쿠키 정보를 입력하십시오<br>");
       out.print("<form method=POST action=/edu/servlet/CookieTestServlet><br>");
       out.println("쿠키 이름 : <input type=text length=20 name=cookiename><br>");
       out.println("쿠키 값 : <input type=text length=20 name=cookievalue><br>");
       out.println("유효시간 :<input type=text length=20 name=expiretime>(시간단위)<br>");
       out.println("<input type=submit value=쿠키설정><br></form>");
       out.println("</body>");
       out.println("</html>");
    }

    public void doPost(HttpServletRequest req,  HttpServletResponse res)  
             throws IOException, ServletException {
			  req.setCharacterEncoding("EUC-KR");
        doGet(req, res);
    }
}

