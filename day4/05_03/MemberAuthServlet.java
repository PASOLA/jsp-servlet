// ���ϸ� : MemberAuthServlet.java
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class MemberAuthServlet extends HttpServlet {
   public void doPost (HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException {
        *********************************
         if(rs.next()) {
            if(rs.getString(2).trim().equals(passwd)) {
               if(**********************  )
                  out.print("<H4>ȸ�� ������  �Ϸ�Ǿ����ϴ� !!</H4>");
      	       else
                  out.print("<H4>�̹� ȸ�� ������ �ϼ̱���!!</H4>");             
   	        } else 
               out.print("<H4>�н����尡 Ʋ���ϴ�.!!<BR>"+
          				"ȸ�� ���� ������ �ٽ� �����Ͽ� �ֽʽÿ�.....</H4>");
         } else {
   	       out.print("<H4>�Է��Ͻ� ������ �������� �ʽ��ϴ�!!</H4>");
         }
    	} catch (ClassNotFoundException e1) {
  	     out.print("<H4>�ý��� ��ַ� ó���� �Ұ����մϴ�.</H4>");  	     
  	     System.out.println("����̹� �ε� ���� �߻� : " + e1);  	  
  	  } catch (SQLException e2) {
  	     out.print("<H4>�ý��� ��ַ� ó���� �Ұ����մϴ�.</H4>");  	     
  	     System.out.println("DB ���� ���� �߻� : " + e2);
  	  } finally {
  	     out.close();
  	     try {
            if (conn != null)
               conn.close();
         } catch (Exception e) {
            System.out.println("DB ���� ���� ���� �߻� :"+e);
         }  	  
      }
   }
   public boolean session_set(HttpServletRequest req,  HttpServletResponse
   			res, String id) throws ServletException, IOException {
  	  **********************  
  	  if (**********************  ) {
      	  **********************  
	       return true;
  	  } else {
   	     return false;
 	    }
   }

   public void doGet (HttpServletRequest req, HttpServletResponse res)
   	     throws ServletException, IOException {
   	  res.setContentType("text/html; charset=EUC-KR");
      PrintWriter out= res.getWriter();
     **********************  
  	  if (**********************  ) {
         **********************  
         out.print("<H4>���� ���°� �����Ǿ����ϴ�!!</H4>");
      } else {
         out.print("<H4>������ �������� �����̳׿�!!</H4>");
      }
      out.close();
   }
}
