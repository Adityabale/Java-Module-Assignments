class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
   // @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    //@Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Jungle {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();      

        Animal a1 = new Cat();
        a1.sound();
    }
}