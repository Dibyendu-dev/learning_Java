package localInnerClass;

class Outer {
    void outerMethod() {
        int number = 32;

        class LocalInner {
            void printNumber() {
                System.out.println("number:" + number);
            }
        }

        LocalInner localInner = new LocalInner();
        localInner.printNumber();
    }
}

public class Test {
    public static void main(String[] args) {
         new Outer().outerMethod();
        
    }
}
