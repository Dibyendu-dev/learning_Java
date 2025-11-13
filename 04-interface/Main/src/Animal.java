 public  class Animal {
        void makeSound() {
            System.out.println("Animal makes a sound");
        }

         public static void main(String[] args) {
            Dog dog = new Dog();
            dog.makeSound();
        }
    }

  class Dog extends Animal {

        @Override
        void makeSound() {
            super.makeSound(); // Calls Animal's makeSound()
            System.out.println("Dog barks");
        }
     
    }