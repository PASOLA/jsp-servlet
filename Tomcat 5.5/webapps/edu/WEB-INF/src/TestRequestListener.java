// ���ϸ� : TestRequestListener.java
import javax.servlet.*;
public class TestRequestListener implements  ServletRequestListener {
   public TestRequestListener() {
      System.out.println("TestRequestListener ��ü ����");
   }
   public void requestInitialized(ServletRequestEvent e) {
	  System.out.println("HttpServletRequest ��ü �ʱ�ȭ"); 	 
   }
   public void requestDestroyed(ServletRequestEvent e) {
      System.out.println("HttpServletRequest ��ü ����"); 
   }
}
