// ���ϸ� : TestServletContextListener.java
import javax.servlet.*;
public class TestServletContextListener implements ServletContextListener {
   public TestServletContextListener() {
      System.out.println("TestServletContextListener ��ü ����");
   }
   public void contextInitialized(ServletContextEvent e) {
      System.out.println("ServletContext ��ü �ʱ�ȭ"); 	 
   }
   public void contextDestroyed(ServletContextEvent e) {
      System.out.println("ServletContext ��ü ����"); 
   }
}
