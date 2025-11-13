package staticNested;
class Outer {
    static String message = "hello das!";

    static class Nested {
        void display(){
            System.out.println(message);
        }
    }
}

public class Test {
    public static void main(String[] args) {
       Outer.Nested nested = new Outer.Nested();
       nested.display();
    }
}
