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
		obj1.setStr("��ü���� �׽�Ʈ-1");
		ShareObject obj2 = new ShareObject();
		obj2.setCount(1000);
		obj2.setStr("��ü���� �׽�Ʈ-2");
		context.setAttribute("objtest2", obj2);
		out.println("<html><head><tilte>ServletContent Ȱ�뿹�� </title></head>");
		out.println("<body><h3>ServletContext�� Ȱ���� ��ü����</h3>");
		out.println("<h4>���ؽ�Ʈ�� ShareObject��ü�� ����Ͽ����ϴ�.(object1)</h4>");
		out.println("<h4>���ؽ�Ʈ�� ShareObject��ü�� ����Ͽ����ϴ�.(object2)</h4>");
		out.println("</body></html>");
}
}		
		