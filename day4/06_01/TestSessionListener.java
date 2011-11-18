// 颇老疙 : TestSessionListener.java
import javax.servlet.http.*;
public class TestSessionListener implements  HttpSessionListener {
   public TestSessionListener() {
      System.out.println("TestSessionListener 按眉 积己");
   }
   public void sessionCreated(HttpSessionEvent e) {
      System.out.println("技记 按眉 积己"); 
   }
   public void sessionDestroyed(HttpSessionEvent e) {
      System.out.println("技记 按眉 秦力"); 
   }
}
