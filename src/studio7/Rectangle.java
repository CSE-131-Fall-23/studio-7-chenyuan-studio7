package studio7;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double initLength, double initWidth) {
        length = initLength;
        width = initWidth;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public boolean isSmallerThan(Rectangle other) {
        return getArea() < other.getArea();
    }

    public boolean isSquare() {
        return length == width;
    }

    public String toString() 
    { 
      return "Area: " + getArea() + ", Perimeter: " + getPerimeter() + ", Square: " + isSquare();
    }

	
}

