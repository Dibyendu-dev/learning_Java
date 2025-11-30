import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // Create a Vector of Strings
        Vector<String> fruits = new Vector<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println("Vector elements: " + fruits);

        // Access an element by index
        String firstFruit = fruits.get(0);
        System.out.println("First fruit: " + firstFruit);

        // Remove an element
        fruits.remove("Banana");
        System.out.println("Vector after removing Banana: " + fruits);

        // Check size
        System.out.println("Vector size: " + fruits.size());
    }
}
