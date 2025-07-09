public class abstraction {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();

        Shape square = new Square();
        square.draw();

        Shape hexagon = new Hexagon();
        hexagon.draw();
    }

}
