import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class LogFilter implements Filter{
	ServletContext context = null;
	public void init(FilterConfig config){
	 context = config.getServletContext();
	 }
	public void doFilter (ServletRequest req, ServletResponse res,FilterChain chain)
    						throws java.io.IOException,ServletException {
    	HttpServletRequest httpreq = (HttpServletRequest)req;
    	context.log("***"+httpreq.getRemoteAddr()+"로부터 " + httpreq.getRequestURI()+
    	 		"이 요청이 전달되었습니다.("+new Date()+")");
    	chain.doFilter(req,res);
    	}
    	public void destroy(){
    	}
   } 	 							