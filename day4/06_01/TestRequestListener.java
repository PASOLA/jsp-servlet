// 颇老疙 : TestRequestListener.java
import javax.servlet.*;
public class TestRequestListener implements  ServletRequestListener {
   public TestRequestListener() {
      System.out.println("TestRequestListener 按眉 积己");
   }
   public void requestInitialized(ServletRequestEvent e) {
	  System.out.println("HttpServletRequest 按眉 檬扁拳"); 	 
   }
   public void requestDestroyed(ServletRequestEvent e) {
      System.out.println("HttpServletRequest 按眉 秦力"); 
   }
}
