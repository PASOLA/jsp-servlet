// 파일명 : SessionTestServlet.java
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class SessionTestServlet extends HttpServlet {
   protected void doGet(HttpServletRequest req,  HttpServletResponse  res)  throws ServletException, IOException {
      
    	**********************
	
	if (param.equals("create")) {
		****************
		if (****************) 
			msg = "세션 객체가 생성되었습니다.";
		else
			msg = "세션 객체가 이미 생성되었습니다.";
		}
	else if (param.equals("destroy")) {
			****************
			if (session != null) {
				****************
				msg = "세션 객체가 삭제되었습니다.";
			} else {
				msg = "삭제될 세션 객체가 없습니다.";
			}
	} else if (param.equals("attradd")) {
			****************
			if (session != null) {
				****************
				msg = "세션 객체에 속성을 추가하였습니다.";
			} else {
				msg = "속성을 등록할 세션 객체가 없습니다.";
			}
	} else if (param.equals("attrrem")) {
			****************
			if(session != null) {
				****************
				msg = "세션 객체에서 속성을 삭제 하였습니다.";
			else {
				msg = "속성을 삭제할 세션 객체가 없습니다.";
			}
	} else if (param.equals("attrep")) {
			****************
			if (session != null) {
				****************
				msg = "세션 객체에서 속성을 대체하였습니다.";
			} else {
				msg = "속성을 대체할 세션 객체가 없습니다.".";
			}
	} else if (param.equals("attget")) {
			****************
			if (session != null) {
				****************
				msg = "세션 객체에서 등록된 속성의 내용 : " + str;
			} else {
				msg = "속성을 추출할 세션 객체가 없습니다.".";
			}
	} else {
		msg= "전달된 명령을 해석할 수 없습니다..";
	}
	out.println("<html><body><h3>처리 결과 : </h3>" + msg);
	out.println("</body><html>");
	out.close();
     }
}