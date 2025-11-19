import java.lang.reflect.Method;

public class App {
    public static void main(String[] args) throws Exception {
      Class eagle =  Eagle.class;

      System.out.println(eagle.getName());
      Method[] methods = eagle.getMethods();

      for(Method method: methods){
        System.out.println("Method name: "+ method.getName());
      }

     
    }
}
