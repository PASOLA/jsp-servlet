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

    ********************************************8

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

