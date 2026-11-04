public class Shape {

    String shapeName;
    double area;

    // Circle
    public void setParameters(String name, double radius) {
        shapeName = name;
        area = Math.round(Math.PI * radius * radius * 100.0) / 100.0;
    }

    // Triangle
    public void setParameters(String name, int base, int height) {
        shapeName = name;
        area = 0.5 * base * height;
    }

    // Rectangle
    public void setParameters(String name, double length, double width) {
        shapeName = name;
        area = length * width;
    }

    public String details() {
        return "Shape Name: " + shapeName + "\nArea: " + area;
    }
}
