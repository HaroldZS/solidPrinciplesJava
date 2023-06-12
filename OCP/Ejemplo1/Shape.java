package OCP.Ejemplo1;

public class Shape {
    private String type;

    public Shape(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public double calculateArea() {
        double area = 0.0;

        if (type.equals("circle")) {
            double radius = 5.0;
            area = Math.PI * radius * radius;
        } else if (type.equals("rectangle")) {
            double length = 5.0;
            double width = 3.0;
            area = length * width;
        }

        return area;
    }
}