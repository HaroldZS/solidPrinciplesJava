package LSP.Ejemplo1;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Square(5);
        rectangle.setWidth(10);
        rectangle.setHeight(20);
        System.out.println(rectangle.getArea());
    }
}