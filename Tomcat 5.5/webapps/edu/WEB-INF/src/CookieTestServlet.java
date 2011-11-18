// ���ϸ� : CookieTestServlet.java
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
      out.println("<title>��Ű ������ ����</title>");
      out.println("</head>");
      out.println("<body>");
      out.println("<h3>��Ű ������ ���� ����</h3>");
      
      
      Cookie[] cookies = req.getCookies();
      if(cookies != null && cookies.length > 0) {
      	out.println("����� ��Ű���� <br><table border = 1>");
      	for(int i = 0; i<cookies.length; i++){
      	  Cookie cookie = cookies[i];
      	  out.print("<tr><td>��Ű�̸� :</td><td>"+cookie.getName() +"</td>");
      	  out.print("<tr><td>��Ű�� :</td><td>"+cookie.getValue() +"</td>");
      	}
      	out.print("</table>");
	}else{
	 out.println("Ŭ���̾�Ʈ�κ��� ���޵� ��Ű�� �����ϴ�<br>");
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
		out.println("������ ���� ������ ��Ű�� �����մϴ�.<br>");
		out.print("��Ű�̸� : "+cookieName);
		out.print("��Ű�� : "+cookieValue +"<br>");
	}
	}
      	  	
      	



       out.println("<hr><p>");
       out.println("�����ϰ��� �ϴ� ��Ű ������ �Է��Ͻʽÿ�<br>");
       out.print("<form method=POST action=/edu/servlet/CookieTestServlet><br>");
       out.println("��Ű �̸� : <input type=text length=20 name=cookiename><br>");
       out.println("��Ű �� : <input type=text length=20 name=cookievalue><br>");
       out.println("��ȿ�ð� :<input type=text length=20 name=expiretime>(�ð�����)<br>");
       out.println("<input type=submit value=��Ű����><br></form>");
       out.println("</body>");
       out.println("</html>");
    }

    public void doPost(HttpServletRequest req,  HttpServletResponse res)  
             throws IOException, ServletException {
			  req.setCharacterEncoding("EUC-KR");
        doGet(req, res);
    }
}

