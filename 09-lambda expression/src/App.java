import java.util.function.Supplier;

public class App {
    public static void main(String[] args) throws Exception {
      Calculator add = (a, b)-> a+b;
      System.out.println(add.operate(5, 9));
      
      Supplier<String> supplier = ()-> "hello world";
      System.out.println(supplier.get());
    }
}
