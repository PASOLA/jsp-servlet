// ���ϸ� : IncludeTestServlet1.java

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class IncludeTestServlet1 extends HttpServlet {
	protected void doGet(HttpServletRequest req,  HttpServletResponse res)
			throws ServletException, IOException {
		res.setContentType("text/html; charset=EUC-KR");
		PrintWriter out = res.getWriter();
		out.println("<HTML><HEAD><TITLE>include ����1</TITLE>");
		out.println("</HEAD><BODY><H3>IncludeTestServlet1�� ���� ���</H3>");
		out.println("</BODY></HTML>");
		************************************
	      
	      out.println("<HR>");
	      ************************************	
	      out.println("<HR>");
	      ************************************
      out.close();
   }
}
