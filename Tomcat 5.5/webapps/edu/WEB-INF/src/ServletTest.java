import javax.servlet.*;
import javax.servlet.http.*;

public class ServletTest extends HttpServlet{
public void init(ServletConfig config)
{
	System.out.println("init()...call");
}
	protected void doGet(HttpServletRequest req,
                     HttpServletResponse resp)
	{
		System.out.println("DoGet()...call");
	}		                   			
}