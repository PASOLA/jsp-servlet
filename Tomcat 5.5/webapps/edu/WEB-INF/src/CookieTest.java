import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CookieTest extends HttpServlet {
   public void doGet (HttpServletRequest req, HttpServletResponse res)
    						throws ServletException, IOException {
    		Cookie obj = new Cookie("topic","java");
    		obj.setMaxAge(60*60*24*10);
    		res.addCookie(obj);
    		
    		Cookie obj2 = new Cookie("id","purum");
    		res.addCookie(obj2);
    		
    		Cookie[] cookies = req.getCookies();.
    		
    		PrintWriter out = res.getWriter();
    		
    		if(cookies != null){
    			for(int i= 0;i<cookies.length;i++){
    				out.print("<h2>"+cookies[i].getName()+":"+cookies[i].getValue()+"</h2>");
    				}
    				
    			}
    		out.close();	
    		}
  }			
    							