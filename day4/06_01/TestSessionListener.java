// ���ϸ� : TestSessionListener.java
import javax.servlet.http.*;
public class TestSessionListener implements  HttpSessionListener {
   public TestSessionListener() {
      System.out.println("TestSessionListener ��ü ����");
   }
   public void sessionCreated(HttpSessionEvent e) {
      System.out.println("���� ��ü ����"); 
   }
   public void sessionDestroyed(HttpSessionEvent e) {
      System.out.println("���� ��ü ����"); 
   }
}
