package LSP.Ejemplo1;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        rectangle.setWidth(5);
        rectangle.setHeight(10);
        System.out.println(rectangle.getArea());

        Square square = new Square(5);
        square.setSide(10);
        System.out.println(square.getArea());
    }
}