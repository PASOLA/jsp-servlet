<%@ page contentType = "text/html;charset=euc-kr" %>
<%@ page isErrorPage = "true"%>
<!--this error page is for JSP errors. -->
<html>
<head><title>���ܻ�Ȳ ó�� </title></head>
<body>
<center>
<HR size = "1" noshade="noshade">
<h4>������ ���� ������ �߻��Ͽ����ϴ�.</h4>
<HR size = "1" noshade="noshade">
����Ÿ�� :<%=exception.getClass().getName()%><br>
�����޼��� :<B><%=exception.getMessage()%></B>
</center>
</body>
</html>