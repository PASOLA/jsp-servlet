<%@ page contentType = "text/html;charset=euc-kr" %>
<%@ page errorPage = "example3_4.jsp"%>
<% String param = request.getParameter("id");
if(param.equals("test"))
 param = "파라미터가 입력되었습니다. (예외상황이 발생하지 않았습니다.)";
 %>
 
<html>
<body>
<center>
<h4><%=param%></h4>
</center>
</body>
</html>