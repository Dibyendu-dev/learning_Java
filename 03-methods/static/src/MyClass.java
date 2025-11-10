public class MyClass {
    public static int staticCounter = 0;
   
    public MyClass(){
        staticCounter++;
    }

    public void displayCounter(){
        System.out.println("Static counter" + staticCounter);
    }

    public static void main(String[] args){
        MyClass obj1 = new MyClass();
        obj1.displayCounter();

        MyClass obj2 = new MyClass();
        obj2.displayCounter();

        System.out.println("Direct access to static counter" + MyClass.staticCounter);
    }
}
