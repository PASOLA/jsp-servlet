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
      
      
      Cookie[] cookies = req.getCookies();
      if(cookies != null && cookies.length > 0) {
      	out.println("추출된 쿠키정보 <br><table border = 1>");
      	for(int i = 0; i<cookies.length; i++){
      	  Cookie cookie = cookies[i];
      	  out.print("<tr><td>쿠키이름 :</td><td>"+cookie.getName() +"</td>");
      	  out.print("<tr><td>쿠키값 :</td><td>"+cookie.getValue() +"</td>");
      	}
      	out.print("</table>");
	}else{
	 out.println("클라이언트로부터 전달된 쿠키가 없습니다<br>");
	}
	String cookieName = req.getParameter("cookiename");
	String cookieValue = req.getParameter("cookievalue");
	String expireTime = req.getParameter("expiretime");
	if(cookieName != null && cookieValue != null){
		if(cookieName.length() != 0 && cookieValue.length() != 0){
			Cookie cookie = new Cookie(cookieName, cookieValue);
			if(expireTime !=null && expireTime.length() != 0) {
				int hour = Integer.parseInt(expireTime);
				if(hour>0)
				cookie.setMaxAge(60*60*hour);
			}	
		res.addCookie(cookie);
		out.println("<P>");
		out.println("다음과 같은 내용의 쿠키를 설정합니다.<br>");
		out.print("쿠키이름 : "+cookieName);
		out.print("쿠키값 : "+cookieValue +"<br>");
	}
	}
      	  	
      	



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

