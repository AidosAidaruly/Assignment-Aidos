public class Cylinder {
    private double radius;
    private double height;

    // Constructor to initialize the cylinder with a given radius and height
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Method to calculate the surface area of the cylinder
    public double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    // Method to calculate the volume of the cylinder
    public double volume() {
        return Math.PI * radius * radius * height;
    }

    // String representation of the cylinder
    @Override
    public String toString() {
        return "Cylinder with radius: " + radius + " and height: " + height;
    }
}
