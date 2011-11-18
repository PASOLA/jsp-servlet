<%@page contentType="text/html; charset=euc-kr" %>
<jsp:useBean id="hello" class="sds.edu.jsp.HelloBean"/>
<jsp:setProperty name="hello" property="name" param="name" /> 
<html>
<body>
<center>
<h1> Hello <jsp:getProperty name="hello" property="name"/>  !  방문 일자는  <jsp:getProperty name="hello" property="month"/> 월 <jsp:getProperty name="hello" property="date"/>일 입니다. </h1>
</center>
</body>
</html>
