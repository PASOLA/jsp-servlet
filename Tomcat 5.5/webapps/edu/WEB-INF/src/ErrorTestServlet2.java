// ���ϸ� : ErrorTestServlet1.java
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class ErrorTestServlet2 extends HttpServlet {
   public void doGet (HttpServletRequest req, HttpServletResponse res){
      PrintWriter out = null;
      try{
      res.setContentType("text/html; charset=EUC-KR");
	  out = res.getWriter();
	  String getquery = req.getQueryString();		
      out.println("<html><head><title>���� ó�� ����</title></head>");
      out.println("<body><h3>Query ���ڿ� ����</h3>");
      out.println("GET������� ���޵� ��ü Query : " + getquery + "<br>");
      out.println("GET������� ���޵� ��ü Query ���� : " + getquery.length());
	  out.println("</body></html>");		
   }catch(Exception e){
   	out.println("<html><head><title>���� ó�� ����</title></head>");
        out.println("<body><h3>�����߻�</h3>");
        out.println("��û�� ó���ϴ� ���� ������ �߻��Ͽ����ϴ�<br>");
        out.println("�˼��մϴ�.<br>");
        getServletContext().log("���� �߻� ����" +e);
        out.println("</body></html>");
	}finally{
		if(out!=null)
		out.close();
	}
	}
}
