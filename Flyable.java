interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Fish implements Swimmable {
    public void swim() {
        System.out.println("Fish swimming");
    }
}

class Eagle implements Flyable {
    public void fly() {
        System.out.println("Eagle flying");
    }
}

class Duck implements Flyable, Swimmable {
    public void fly() {
        System.out.println("Duck flying");
    }

    public void swim() {
        System.out.println("Duck swimming");
    }
}
