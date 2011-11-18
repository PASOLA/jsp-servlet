import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*; 
import java.util.*;

public class MemberJoinServlet extends HttpServlet{
  protected void doPost (HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
  		 Connection conn = null;
                 res.setContentType("text/html;charset=EUC-KR");
	 	 PrintWriter out=res.getWriter();
	 	 req.setCharacterEncoding("EUC-KR");
	 	 String name = req.getParameter("name");
	 	 String id = req.getParameter("id");
	 	 String passwd = req.getParameter("passwd");
	 	 String address = req.getParameter("address");
	 	 String memo = req.getParameter("memo");
	 	 try{
	 	 	Class.forName("oracle.jdbc.driver.OracleDriver");
     			conn =  DriverManager.getConnection("jdbc:oracle:thin:@70.12.220.120:1521:ORA9", "jsp17", "jsp17");       
    			Statement stmt = conn.createStatement();
    			ResultSet rs = stmt.executeQuery("select name from member where id = '"+id+"'");
    			if(rs.next()){
    				out.print("<h4>이미존재하는 계정입니다.<br> 다른계정을 입력하여 주십시오!</h4>");
    			}
    			else{
    			PreparedStatement pstmt = conn.prepareStatement 
    			("insert into member values(?,?,?,?,?)");
    			pstmt.setString(1,name);
    			pstmt.setString(2,id);
    			pstmt.setString(3,passwd);
    			pstmt.setString(4,address);
    			pstmt.setString(5,memo);
    			out.print("<h4>회원 등록이 완료되었습니다. 감사합니다.</h4>");
    			}	           
//	 	 }catch(ClassNotFoundException e1){
//	 	 	out.print("<h4>시스템 장애로 처리가 불가능합니다.</h4>");
//	 	 	System.out.println("드라이버 로딩오류발생 : " +e1);
	 	}catch(SQLException e2){
	 		out.print("<h4>시스템 장애로 처리가 불가능합니다.</h4>");
	 	 	System.out.println("DB 연동오류발생 : " +e2);
	 	}finally{
	 		out.close();
			try{
			if(conn != null)
 				conn.close();
			}catch(Exception e){
			 System.out.println("DB접속해제 오류 발생 : " +e);
			}
			}	
		}
}
	 	 