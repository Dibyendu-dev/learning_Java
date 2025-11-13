package anonymousInnerClass;

abstract class Greet {
    abstract void sayHello();
}

public class Test {
    public static void main(String[] args) {
      Greet greet = new Greet() {
            @Override
            void sayHello(){
                System.out.println("hello from anonymous inner class");
            }
        };

        greet.sayHello();
    }
}
