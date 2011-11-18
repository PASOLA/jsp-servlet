// ���ϸ� : SessionTestServlet.java
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class SessionTestServlet extends HttpServlet {
   protected void doGet(HttpServletRequest req,  HttpServletResponse  res)  throws ServletException, IOException {
      
    	res.setContentType("text/html; charset=EUC-KR");
    	PrintWriter out = res.getWriter();
    	HttpSession session = null;
    	String msg = null;
    	String param = req.getParameter("comm");
	
	if (param.equals("create")) {
		session = req.getSession();
		if (session.isNew()) 
			msg = "���� ��ü�� �����Ǿ����ϴ�.";
		else
			msg = "���� ��ü�� �̹� �����Ǿ����ϴ�.";
		}
	else if (param.equals("destroy")) {
			session = req.getSession(false);
			if (session != null) {
				session.invalidate();
				msg = "���� ��ü�� �����Ǿ����ϴ�.";
			} else {
				msg = "������ ���� ��ü�� �����ϴ�.";
			}
	} else if (param.equals("attradd")) {
			session = req.getSession(false);
			if (session != null) {
				session.setAttribute("test",new String("�ؽ�Ʈ�Դϴ�."));
				msg = "���� ��ü�� �Ӽ��� �߰��Ͽ����ϴ�.";
			} else {
				msg = "�Ӽ��� ����� ���� ��ü�� �����ϴ�.";
			}
	} else if (param.equals("attrrem")) {
			session = req.getSession(false);
			if(session != null) {
				session.removeAttribute("test");
				msg = "���� ��ü���� �Ӽ��� ���� �Ͽ����ϴ�.";
			}else {
				msg = "�Ӽ��� ������ ���� ��ü�� �����ϴ�.";
			}
	} else if (param.equals("attrrep")) {
			session = req.getSession(false);
			if (session != null) {
				session.setAttribute("test",new String("��ü�� �ؽ�Ʈ�Դϴ�"));
				msg = "���� ��ü���� �Ӽ��� ��ü�Ͽ����ϴ�.";
			} else {
				msg = "�Ӽ��� ��ü�� ���� ��ü�� �����ϴ�.";
			}
	} else if (param.equals("attrget")) {
			session = req.getSession(false);
			if (session != null) {
				String str = (String)session.getAttribute("test");
				msg = "���� ��ü���� ��ϵ� �Ӽ��� ���� : " + str;
			} else {
				msg = "�Ӽ��� ������ ���� ��ü�� �����ϴ�.";
			}
	} else {
		msg= "���޵� ����� �ؼ��� �� �����ϴ�..";
	}
	out.println("<html><body><h3>ó�� ��� : </h3>" + msg);
	out.println("</body><html>");
	out.close();
     }
}