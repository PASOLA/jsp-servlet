import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ContextTestServlet extends HttpServlet{
 protected void doGet (HttpServletRequest req,
                     HttpServletResponse res)	
		throws ServletException, IOException{
		res.setContentType("text/html; charset=EUC-KR");
		PrintWriter out = res.getWriter();
		out.println("<html><head><tilte>ServletContent 활용예제 </title></head>");
		out.println("<body><h3>ServletContext를 활용한 정보추출</h3>");
		ServletContext context = getServletContext();
		out.println("<h4>Servlet 컨테이너가 지원하는 JAVA Servlet API의 major version:"
		+context.getMajorVersion() +"</h4>");
		out.println("<h4>Servlet 컨테이너가 지원하는 JAVA Servlet API의 mimor version:"
		+context.getMinorVersion() +"</h4>");
		out.println("<h4>컨텍스트의 이름:"
		+context.getServletContextName() +"</h4>");
		out.println("<h4>Servlet이 실행되고 있는 Servlet 컨테이너의 이름과 버전:"
		+context.getServerInfo() +"</h4>");
		out.println("<h4>/edu/test.html의 실제경로:"
		+context.getRealPath("/test.html") +"</h4>");
		context.log("로그메세지출력!!!");
		out.println("<body></html>");
		out.close();
}
}		
		