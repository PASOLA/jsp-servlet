// ���ϸ� : SessionTestServlet.java
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class SessionTestServlet extends HttpServlet {
   protected void doGet(HttpServletRequest req,  HttpServletResponse  res)  throws ServletException, IOException {
      
    	**********************
	
	if (param.equals("create")) {
		****************
		if (****************) 
			msg = "���� ��ü�� �����Ǿ����ϴ�.";
		else
			msg = "���� ��ü�� �̹� �����Ǿ����ϴ�.";
		}
	else if (param.equals("destroy")) {
			****************
			if (session != null) {
				****************
				msg = "���� ��ü�� �����Ǿ����ϴ�.";
			} else {
				msg = "������ ���� ��ü�� �����ϴ�.";
			}
	} else if (param.equals("attradd")) {
			****************
			if (session != null) {
				****************
				msg = "���� ��ü�� �Ӽ��� �߰��Ͽ����ϴ�.";
			} else {
				msg = "�Ӽ��� ����� ���� ��ü�� �����ϴ�.";
			}
	} else if (param.equals("attrrem")) {
			****************
			if(session != null) {
				****************
				msg = "���� ��ü���� �Ӽ��� ���� �Ͽ����ϴ�.";
			else {
				msg = "�Ӽ��� ������ ���� ��ü�� �����ϴ�.";
			}
	} else if (param.equals("attrep")) {
			****************
			if (session != null) {
				****************
				msg = "���� ��ü���� �Ӽ��� ��ü�Ͽ����ϴ�.";
			} else {
				msg = "�Ӽ��� ��ü�� ���� ��ü�� �����ϴ�.".";
			}
	} else if (param.equals("attget")) {
			****************
			if (session != null) {
				****************
				msg = "���� ��ü���� ��ϵ� �Ӽ��� ���� : " + str;
			} else {
				msg = "�Ӽ��� ������ ���� ��ü�� �����ϴ�.".";
			}
	} else {
		msg= "���޵� ����� �ؼ��� �� �����ϴ�..";
	}
	out.println("<html><body><h3>ó�� ��� : </h3>" + msg);
	out.println("</body><html>");
	out.close();
     }
}