// ���ϸ� : ErrorTestServlet1.java
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class ErrorTestServlet1 extends HttpServlet {
   public void doGet (HttpServletRequest req, HttpServletResponse res)
    						throws ServletException, IOException {
      res.setContentType("text/html; charset=EUC-KR");
	  PrintWriter out;
	  out = res.getWriter();
	  String getquery = req.getQueryString();		
      out.println("<html><head><title>���� ó�� ����</title></head>");
      out.println("<body><h3>Query ���ڿ� ����</h3>");
      out.println("GET������� ���޵� ��ü Query : " + getquery + "<br>");
      out.println("GET������� ���޵� ��ü Query ���� : " + getquery.length());
	  out.println("</body></html>");		
	  out.close();
   }
}
