// 파일명 : CreateMemberTable.java
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*; 

public class CreateMemberTable extends HttpServlet{
  protected void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
                 res.setContentType("text/html;charset=EUC-KR");
	 PrintWriter out=res.getWriter();
  	out.println("<HTML><HEAD><TITLE>Query String Test</TITLE>");
	out.println("<HEAD><BODY>");


         try{	
	Class.forName("oracle.jdbc.driver.OracleDriver");
     	Connection conn =  DriverManager.getConnection("jdbc:oracle:thin:@70.12.220.120:1521:ORA9", "jsp17", "jsp17");       
    	Statement stmt = conn.createStatement();              
    	String query=
    	" create table member(name varchar2(30), id varchar2(20), passwd varchar2(20),address varchar2(50),memo varchar2(100))";
    	stmt.executeUpdate(query);
    	out.println("<h3>member table 이 생성되었습니다.</h3>");
    	stmt.close();
       	conn.close();
             }catch(Exception e){
    	e.printStackTrace();
    	out.println("<h3>처리중 오류가 발생하였습니다.</h3>");
            }
           out.println("</BODY></HTML>");
          out.close();
   }

}