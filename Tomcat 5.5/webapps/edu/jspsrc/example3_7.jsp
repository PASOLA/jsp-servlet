<%@ page contentType="text/html; charset=euc-kr" %>
<html>
<body>
<center>
<h1> 스크립트릿으로 구구단을 외워보자 </h1>
</center>
<% for(int i= 2; i<10; i++){
	for(int j=1;j<10; j++){
		out.println(i +"X" +j+"=" +i*j);%><br>
<% } %>
  <br>
<% } %>
</body>
</html>		