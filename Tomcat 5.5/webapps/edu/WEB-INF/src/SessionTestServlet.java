// 파일명 : SessionTestServlet.java
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class SessionTestServlet extends HttpServlet {
   protected void doGet(HttpServletRequest req,  HttpServletResponse  res)  throws ServletException, IOException {
      
    	res.setContentType("text/html; charset=EUC-KR");
    	PrintWriter out = res.getWriter();
    	HttpSession session = null;
    	String msg = null;
    	String param = req.getParameter("comm");
	
	if (param.equals("create")) {
		session = req.getSession();
		if (session.isNew()) 
			msg = "세션 객체가 생성되었습니다.";
		else
			msg = "세션 객체가 이미 생성되었습니다.";
		}
	else if (param.equals("destroy")) {
			session = req.getSession(false);
			if (session != null) {
				session.invalidate();
				msg = "세션 객체가 삭제되었습니다.";
			} else {
				msg = "삭제될 세션 객체가 없습니다.";
			}
	} else if (param.equals("attradd")) {
			session = req.getSession(false);
			if (session != null) {
				session.setAttribute("test",new String("텍스트입니다."));
				msg = "세션 객체에 속성을 추가하였습니다.";
			} else {
				msg = "속성을 등록할 세션 객체가 없습니다.";
			}
	} else if (param.equals("attrrem")) {
			session = req.getSession(false);
			if(session != null) {
				session.removeAttribute("test");
				msg = "세션 객체에서 속성을 삭제 하였습니다.";
			}else {
				msg = "속성을 삭제할 세션 객체가 없습니다.";
			}
	} else if (param.equals("attrrep")) {
			session = req.getSession(false);
			if (session != null) {
				session.setAttribute("test",new String("대체된 텍스트입니다"));
				msg = "세션 객체에서 속성을 대체하였습니다.";
			} else {
				msg = "속성을 대체할 세션 객체가 없습니다.";
			}
	} else if (param.equals("attrget")) {
			session = req.getSession(false);
			if (session != null) {
				String str = (String)session.getAttribute("test");
				msg = "세션 객체에서 등록된 속성의 내용 : " + str;
			} else {
				msg = "속성을 추출할 세션 객체가 없습니다.";
			}
	} else {
		msg= "전달된 명령을 해석할 수 없습니다..";
	}
	out.println("<html><body><h3>처리 결과 : </h3>" + msg);
	out.println("</body><html>");
	out.close();
     }
}