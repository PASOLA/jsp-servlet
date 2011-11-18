// ���ϸ� : MemberAuthServlet.java
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class MemberAuthServlet extends HttpServlet {
   public void doPost (HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException {
        Connection conn = null;
        res.setContentType("text/html; charset=EUC-KR");
        PrintWriter out =res.getWriter();
        String id = req.getParameter("id");
        String passwd = req.getParameter("passwd");
        try{
          Class.forName("oracle.jdbc.driver.OracleDriver");
          conn =  DriverManager.getConnection("jdbc:oracle:thin:@70.12.220.120:1521:ORA9", "jsp17", "jsp17");
          Statement stmt = conn.createStatement();
          String selectquery = "select id, passwd from member where id = '"+id+"'";
          ResultSet rs = stmt.executeQuery(selectquery);
          
         if(rs.next()) {
            if(rs.getString(2).trim().equals(passwd)) {
               if(session_set(req,res,id))
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
  	  HttpSession session = req.getSession(true);  
  	  if (session.isNew()||session.getAttribute("memberid")==null) {
      	     session.setAttribute("memberid",id); 
	       return true;
  	  } else {
   	     return false;
 	    }
   }

   public void doGet (HttpServletRequest req, HttpServletResponse res)
   	     throws ServletException, IOException {
   	  res.setContentType("text/html; charset=EUC-KR");
      PrintWriter out= res.getWriter();
     HttpSession session = req.getSession(false); 
  	  if (session != null && session.getAttribute("memberid") != null) {
         session.removeAttribute("memberid");  
         out.print("<H4>���� ���°� �����Ǿ����ϴ�!!</H4>");
      } else {
         out.print("<H4>������ �������� �����̳׿�!!</H4>");
      }
      out.close();
   }
}
