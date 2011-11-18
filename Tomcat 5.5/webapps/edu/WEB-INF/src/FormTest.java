import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class FormTest extends HttpServlet{
	public void doGet(HttpServletRequest req,
                     HttpServletResponse res)	
		throws ServletException, IOException{
			res.setContentType("text/html; charset=euc-kr");
			PrintWriter out = res.getWriter();
			//Query String 추출
			String name = req.getParameter("name");
			try{
			name = new String(name.getBytes("8859_1"),"ksc5601");
			}catch(Exception e){}
			String age = req.getParameter("age");
		        out.print("<h2>Get방식 </h2>");
		        out.print("<h2>"+name+" </h2>");
		        out.print("<h2>"+age+"</h2>");
		        out.close();
		
		}


	public void doPost(HttpServletRequest req,
                     HttpServletResponse res)	
		throws ServletException, IOException{
			res.setContentType("text/html; charset=euc-kr");
			PrintWriter out = res.getWriter();
			req.setCharacterEncoding("euc-kr");
			//Query String 추출
			String name = req.getParameter("name");
			String age = req.getParameter("age");
			String[]colors = req.getParameterValues("color");
		        out.print("<h2>Post방식 </h2>");
		        out.print("<h2>"+name+" </h2>");
		        out.print("<h2>"+age+"</h2>");
		        if(colors!=null){
		        	for(int i=0;i<colors.length;i++){
		        		out.print("<h2>"+colors[i]+" </h2>");
		        		}
		        	}
		        out.close();
		
	}
}	