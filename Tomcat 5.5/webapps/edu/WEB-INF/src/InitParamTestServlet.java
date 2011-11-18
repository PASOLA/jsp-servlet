import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class InitParamTestServlet extends HttpServlet{
	String name;
	String pwd;
	
	public void init(ServletConfig sc){
		name = sc.getInitParameter("account");
		pwd = sc.getInitParameter("password");		
	}
	public void doGet (HttpServletRequest req,
                     HttpServletResponse res)	
		throws ServletException, IOException{
		PrintWriter out = res.getWriter();
		out.print("<h3>"+name+"</h3>");
		out.print("<h3>"+pwd+"</h3>");
		out.close();
		}
}