public class polymorphism {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        cat.sound();
        dog.sound();
    }
}
