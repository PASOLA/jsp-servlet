<%@page contentType="text/html; charset=euc-kr" %>
<jsp:useBean id="hello" class="sds.edu.jsp.HelloBean"/>
<jsp:setProperty name="hello" property="name" param="name" /> 
<html>
<body>
<center>
<h1> Hello <jsp:getProperty name="hello" property="name"/>  !  �湮 ���ڴ�  <jsp:getProperty name="hello" property="month"/> �� <jsp:getProperty name="hello" property="date"/>�� �Դϴ�. </h1>
</center>
</body>
</html>
