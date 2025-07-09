abstract class Shape {
    abstract void draw();

}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Drawing a square");
    }
}

class Hexagon extends Shape {
    void draw() {
        System.out.println("Drawing a hexagon");
    }
}
