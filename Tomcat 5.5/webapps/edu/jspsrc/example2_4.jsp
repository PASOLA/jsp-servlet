<%@ page contentType="text/html; charset=euc-kr" %>
<%@ page import="java.util.Calendar" %>
<html>
<body>
<% Calendar cal = Calendar.getInstance(); %> 
<center>
<h1> Hello ${param.name==null?"Guest":param.name} !   �湮 ���ڴ� <%=cal.get(Calendar.MONTH) %> �� <%=cal.get(Calendar.DATE) %>�� �Դϴ�. </h1>
</body>
</html>
