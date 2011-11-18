<%@ page contentType ="text/html;charset=EUC-KR"%>
<HTML>
<BODY bgcolor="white">
<H3>요청 정보 </H3>
<%
response.setDateHeader("Expires",0);
response.setHeader("Pragma","no-cache");
if(request.getProtocol().equals("HTTP/1.1")){
	response.setHeader("Cache-Control","no-cache");
}
%>
<FONT size="4">
JSP Request Method:<%=request.getMethod() %><BR>
Request URI:<%=request.getRequestURI() %><BR>
Request Protocol:<%=request.getProtocol() %><BR>
Servlet path:<%=request.getServletPath() %><BR>
Query string:<%=request.getQueryString() %><BR>
Content length:<%=request.getContentLength() %><BR>
Content type:<%=request.getContentType() %><BR>
Server name:<%=request.getServerName() %><BR>
Server port:<%=request.getServerPort() %><BR>
Remote address:<%=request.getRemoteAddr() %><BR>
Remote host:<%=request.getRemoteHost() %><BR>
<HR>
The browser you are using is <%=request.getHeader("User-Agent")%>
</FONT>
</BODY>
</HTML>
	