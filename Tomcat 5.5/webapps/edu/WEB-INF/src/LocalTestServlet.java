import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LocalTestServlet extends HttpServlet{
 protected void doGet (HttpServletRequest req,
                     HttpServletResponse res)	
		throws ServletException, IOException{
		String str = null;
		int number = 0;
		str = req.getParameter("sendmessage");
		
		res.setContentType("text/html; charset=EUC-KR");
		PrintWriter out = res.getWriter();
		out.println("<html><head><title>Multithread Test</title></head>");
		out.println("<body><h2>처리결과(지역변수)</h2>");
		while(number++ <10){
		String strnum = "["+number +"]";
		out.println("MultiThreadTest:"+str+" "+strnum+"<br>");
		out.flush();
		System.out.println("MultiThreadTest : " + str + " "+ 
		strnum + "<br>");
		try{
		Thread.sleep(1000);
		} catch(Exception e){
		System.out.println(e);
		}
		}
		out.println("<h2>Done " + str + "!!</h2>");
		out.println("</body></html>");
		out.close();
		
		
}
}		