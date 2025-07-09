public class Car {
    String color;
    int speed;

    Car(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    void showDetails() {
        System.out.println(color + " car, Speed: " + speed);
    }
}
