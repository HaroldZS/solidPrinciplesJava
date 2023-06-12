package OCP.Ejemplo1;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args){
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        Square square = new Square(3.0);
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        
        shapes.add(circle);
        shapes.add(rectangle);
        shapes.add(square);
        
        for(int i = 0; i<shapes.size(); i++){
            System.out.println("Area figura "+(i+1)+" = "+shapes.get(i).calculateArea());
        }
    }    
}