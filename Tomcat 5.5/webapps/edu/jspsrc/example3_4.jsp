<%@ page contentType = "text/html;charset=euc-kr" %>
<%@ page isErrorPage = "true"%>
<!--this error page is for JSP errors. -->
<html>
<head><title>예외상황 처리 </title></head>
<body>
<center>
<HR size = "1" noshade="noshade">
<h4>다음과 같은 에러가 발생하였습니다.</h4>
<HR size = "1" noshade="noshade">
에러타입 :<%=exception.getClass().getName()%><br>
에러메세지 :<B><%=exception.getMessage()%></B>
</center>
</body>
</html>