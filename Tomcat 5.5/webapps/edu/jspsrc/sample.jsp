<%@ page contentType="text/html; charset=euc-kr" %>
<HTML>
<TITLE> 선언문 JSP 예제</TITLE>
<BODY>
<H1> Function Definition Example  </H1>
<HR>
<%-- Function Definition --%>
<BR><BR>
<%@ page language="java" %>
<%! int i=0; %>
<%! public String sample(String s, PageContext pc) {
        try {
           JspWriter out = pc.getOut();
           out.println("TEST!!!");
        } catch(Exception e) {}
	return "Function call --> " + s + " " + (i++);
} %>
<H1> <% out.println(sample("one", pageContext)); %> </H1>
<H2> <% out.println(sample("two", pageContext)); %> </H2>
<H3> <% out.println(sample("three", pageContext)); %> </H3>
<H4> <% out.println(sample("four", pageContext)); %> </H4>
</BODY>
</HTML>