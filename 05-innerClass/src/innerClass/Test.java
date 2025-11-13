package innerClass;

class Outer {
    private String message = "Hello from Outer!";

    class Inner {
        void display() {
            System.out.println(message);
        }
    }
}

public class Test {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.display();
    }
}
