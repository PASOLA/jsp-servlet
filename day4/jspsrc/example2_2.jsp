<jsp:directive.page contentType="text/html; charset=euc-kr" />
<jsp:directive.page  import="java.util.Calendar" />
<jsp:declaration> String defaultUser = "Guest " ; 
public String getUser(String user)
{
  return user==null ? defaultUser : user ;
}
</jsp:declaration>
<html>
<body>
<jsp:scriptlet> String  user =  getUser(request.getParameter("name")) ; 
Calendar cal = Calendar.getInstance();
</jsp:scriptlet>

<center>
<h1> Hello <jsp:expression>user</jsp:expression>! 방문일자는   <jsp:expression>cal.get(Calendar.MONTH) +1 </jsp:expression> 월 <jsp:expression>cal.get(Calendar.DATE) </jsp:expression>일 입니다.
</h1>
</center>
</body>
</html>
