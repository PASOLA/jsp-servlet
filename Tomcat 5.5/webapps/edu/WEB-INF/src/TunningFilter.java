import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class TunningFilter implements Filter{
	ServletContext context = null;
	public void init(FilterConfig config){
	 context = config.getServletContext();
	 }
	public void doFilter (ServletRequest req, ServletResponse res,FilterChain chain)
    						throws java.io.IOException,ServletException {
    	HttpServletRequest httpreq = (HttpServletRequest)req;
    	String path = httpreq.getRequestURI();
    	long time = System.currentTimeMillis();
    	chain.doFilter(req,res);
    	context.log("���࿡ �ҿ�Ƚð�("+path+"):"+(System.currentTimeMillis()-time)+"�и���");
    	}
    	public void destroy(){
    	}
   } 	 							