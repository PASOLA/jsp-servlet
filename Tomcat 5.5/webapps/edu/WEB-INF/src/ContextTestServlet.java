import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ContextTestServlet extends HttpServlet{
 protected void doGet (HttpServletRequest req,
                     HttpServletResponse res)	
		throws ServletException, IOException{
		res.setContentType("text/html; charset=EUC-KR");
		PrintWriter out = res.getWriter();
		out.println("<html><head><tilte>ServletContent Ȱ�뿹�� </title></head>");
		out.println("<body><h3>ServletContext�� Ȱ���� ��������</h3>");
		ServletContext context = getServletContext();
		out.println("<h4>Servlet �����̳ʰ� �����ϴ� JAVA Servlet API�� major version:"
		+context.getMajorVersion() +"</h4>");
		out.println("<h4>Servlet �����̳ʰ� �����ϴ� JAVA Servlet API�� mimor version:"
		+context.getMinorVersion() +"</h4>");
		out.println("<h4>���ؽ�Ʈ�� �̸�:"
		+context.getServletContextName() +"</h4>");
		out.println("<h4>Servlet�� ����ǰ� �ִ� Servlet �����̳��� �̸��� ����:"
		+context.getServerInfo() +"</h4>");
		out.println("<h4>/edu/test.html�� �������:"
		+context.getRealPath("/test.html") +"</h4>");
		context.log("�α׸޼������!!!");
		out.println("<body></html>");
		out.close();
}
}		
		