// 파일명 : MemberAuthServlet.java
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
                  out.print("<H4>회원 인증이  완료되었습니다 !!</H4>");
      	       else
                  out.print("<H4>이미 회원 인증을 하셨군요!!</H4>");             
   	        } else 
               out.print("<H4>패스워드가 틀립니다.!!<BR>"+
          				"회원 인증 절차를 다시 수행하여 주십시오.....</H4>");
         } else {
   	       out.print("<H4>입력하신 계정이 존재하지 않습니다!!</H4>");
         }
    	} catch (ClassNotFoundException e1) {
  	     out.print("<H4>시스템 장애로 처리가 불가능합니다.</H4>");  	     
  	     System.out.println("드라이버 로딩 오류 발생 : " + e1);  	  
  	  } catch (SQLException e2) {
  	     out.print("<H4>시스템 장애로 처리가 불가능합니다.</H4>");  	     
  	     System.out.println("DB 연동 오류 발생 : " + e2);
  	  } finally {
  	     out.close();
  	     try {
            if (conn != null)
               conn.close();
         } catch (Exception e) {
            System.out.println("DB 접속 해제 오류 발생 :"+e);
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
         out.print("<H4>인증 상태가 해제되었습니다!!</H4>");
      } else {
         out.print("<H4>인증을 수행하지 않으셨네요!!</H4>");
      }
      out.close();
   }
}
