import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ShareObjectServlet1 extends HttpServlet{
 protected void doGet (HttpServletRequest req,
                     HttpServletResponse res)	
		throws ServletException, IOException{
		res.setContentType("text/html; charset=EUC-KR");
		PrintWriter out = res.getWriter();
		ServletContext context = getServletContext();
		ShareObject obj1 = new ShareObject();
		obj1.setCount(1000);
		obj1.setStr("객체공유 테스트-1");
		ShareObject obj2 = new ShareObject();
		obj2.setCount(1000);
		obj2.setStr("객체공유 테스트-2");
		context.setAttribute("objtest2", obj2);
		out.println("<html><head><tilte>ServletContent 활용예제 </title></head>");
		out.println("<body><h3>ServletContext를 활용한 객체공유</h3>");
		out.println("<h4>컨텍스트에 ShareObject객체를 등록하였습니다.(object1)</h4>");
		out.println("<h4>컨텍스트에 ShareObject객체를 등록하였습니다.(object2)</h4>");
		out.println("</body></html>");
}
}		
		