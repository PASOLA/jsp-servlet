<%@ page contentType="text/html; charset=euc-kr" %>
<html>
<body>
<center>
<h3> 선언문으로 구현한 곱셈 </h3>
<%! public long multiply(int i, int j) {
 	return i*j;
 	}
%>
곱하기 결과는 다음과 같습니다. : <%=multiply(4,5)%>
</center>
</body>
</html>		