// 파일명 : InfoServlet.java
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class InfoServlet extends HttpServlet {
   public void doGet (HttpServletRequest req, HttpServletResponse res)
    						throws ServletException, IOException {
      **********************  
      if (cookie == null || cookie.length == 0) {
        **********************   
      } else {
         for(int i = 0; i < cookie.length; i++) {            
            if (**********************  ) {
               if (**********************  ) {
                  res.sendRedirect("http://www.educakorea.co.kr/educa/home/educakorea/mall.php?cat=3407");            
                  return;
               } else if (**********************  ) {
                  res.sendRedirect("http://www.educakorea.co.kr/educa/home/educakorea/mall.php?cat=3401");            
                  return;
               } else if (**********************  ) {
                  res.sendRedirect("http://www.educakorea.co.kr/educa/home/educakorea/mall.php?cat=3408");            
                  return;
               } else if (**********************  ) {
                  res.sendRedirect("http://www.educakorea.co.kr/educa/home/educakorea/mall.php?cat=04");            
                  return;
               }
            } 
         } res.sendRedirect("/edu/info.html");
      }       	             
   }
   
   public void doPost (HttpServletRequest req, HttpServletResponse res)
    						throws ServletException, IOException {
      req.setCharacterEncoding("EUC-KR");
      String item = req.getParameter("item");
      res.setContentType("text/html; charset=EUC-KR");
      PrintWriter out= res.getWriter();
      boolean flag = true;
      **********************  
      for(int i = 0; cookie != null && i < cookie.length; i++) {
        if (**********************  ) {
           flag= **********************  
        }
      }
      Cookie newcookie = null;
      if (flag == true) {
         if (item.equals("유치원생")) {
            newcookie = **********************         
         } else if (item.equals("초등학생")) {
            newcookie = **********************             
         } else if (item.equals("중고등학생")) {
            newcookie =**********************         
         } else if (item.equals("교육교구")) {
            newcookie = **********************         
         } 
         **********************  
        **********************  
         out.print("<H4>관심 항목을 설정하였습니다.</H4>");
         out.print("<H4><A href="+**********************  +">여기</A>를 선택하십시오...</H4>");
         out.close();
         return;
      }   	
      out.print("<H4>관심 항목이 이미 설정되어 있습니다.</H4>");
      out.close();
   }
}
