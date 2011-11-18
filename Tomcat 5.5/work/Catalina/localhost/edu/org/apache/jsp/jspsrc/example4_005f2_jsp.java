package org.apache.jsp.jspsrc;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class example4_005f2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  public java.util.List getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html;charset=EUC-KR");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<HTML>\r\n");
      out.write("<BODY bgcolor=\"white\">\r\n");
      out.write("<H3>요청 정보 </H3>\r\n");

response.setDateHeader("Expires",0);
response.setHeader("Pragma","no-cache");
if(request.getProtocol().equals("HTTP/1.1")){
	response.setHeader("Cache-Control","no-cache");
}

      out.write("\r\n");
      out.write("<FONT size=\"4\">\r\n");
      out.write("JSP Request Method:");
      out.print(request.getMethod() );
      out.write("<BR>\r\n");
      out.write("Request URI:");
      out.print(request.getRequestURI() );
      out.write("<BR>\r\n");
      out.write("Request Protocol:");
      out.print(request.getProtocol() );
      out.write("<BR>\r\n");
      out.write("Servlet path:");
      out.print(request.getServletPath() );
      out.write("<BR>\r\n");
      out.write("Query string:");
      out.print(request.getQueryString() );
      out.write("<BR>\r\n");
      out.write("Content length:");
      out.print(request.getContentLength() );
      out.write("<BR>\r\n");
      out.write("Content type:");
      out.print(request.getContentType() );
      out.write("<BR>\r\n");
      out.write("Server name:");
      out.print(request.getServerName() );
      out.write("<BR>\r\n");
      out.write("Server port:");
      out.print(request.getServerPort() );
      out.write("<BR>\r\n");
      out.write("Remote address:");
      out.print(request.getRemoteAddr() );
      out.write("<BR>\r\n");
      out.write("Remote host:");
      out.print(request.getRemoteHost() );
      out.write("<BR>\r\n");
      out.write("<HR>\r\n");
      out.write("The browser you are using is ");
      out.print(request.getHeader("User-Agent"));
      out.write("\r\n");
      out.write("</FONT>\r\n");
      out.write("</BODY>\r\n");
      out.write("</HTML>\r\n");
      out.write("\t");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
