<%@ page contentType="text/html; charset=euc-kr" %>
<%@ page import="java.util.Calendar" %>
<%! String defaultUser = "Guest " ; 
public String getUser(String user)
{
  return user==null ? defaultUser : user ;
}
%>
<html>
<body>
<% String  user =  getUser(request.getParameter("name")) ; 
Calendar cal = Calendar.getInstance(); %> 
<center>
<h1> Hello <%= user%> !   방문 일자는 <%=cal.get(Calendar.MONTH) +1 %> 월 <%=cal.get(Calendar.DATE) %>일 입니다. </h1>
</center>
</body>
</html>
