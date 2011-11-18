// 颇老疙 : TestSessionAttributeListener.java
import javax.servlet.http.*;
public class TestSessionAttributeListener implements 
                  HttpSessionAttributeListener {
   public TestSessionAttributeListener() {
      System.out.println("TestSessionAttributeListener 按眉 积己");
   }
   public void attributeAdded(HttpSessionBindingEvent e) {
      System.out.println("技记 按眉俊 加己 眠啊"); 
   }
   public void attributeRemoved(HttpSessionBindingEvent e) {
      System.out.println("技记 按眉俊 眠啊等 加己 昏力"); 
   }
   public void attributeReplaced(HttpSessionBindingEvent e) {
      System.out.println("技记 按眉俊 眠啊等 加己 措眉"); 
   }
}
