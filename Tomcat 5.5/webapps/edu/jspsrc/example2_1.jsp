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
<h1> Hello <%= user%> !   �湮 ���ڴ� <%=cal.get(Calendar.MONTH) +1 %> �� <%=cal.get(Calendar.DATE) %>�� �Դϴ�. </h1>
</center>
</body>
</html>
