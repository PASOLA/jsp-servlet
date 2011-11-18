<%@ page contentType="text/html; charset=euc-kr" %>
<%@ page import="java.util.Calendar" %>
<html>
<body>
<% Calendar cal = Calendar.getInstance(); %> 
<center>
<h1> Hello ${param.name==null?"Guest":param.name} !   방문 일자는 <%=cal.get(Calendar.MONTH) %> 월 <%=cal.get(Calendar.DATE) %>일 입니다. </h1>
</body>
</html>
