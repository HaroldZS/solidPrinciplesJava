package OCP.Ejemplo1;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args){
        Shape circle = new Shape("circle");
        Shape rectangle = new Shape("rectangle");
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        
        shapes.add(circle);
        shapes.add(rectangle);
        
        for(int i = 0; i<shapes.size(); i++){
            System.out.println("Area figura "+(i+1)+" = "+shapes.get(i).calculateArea());
        }
    }    
}