public class Rectangle {
    private double length;
    private double width;

    Rectangle() {
    }

    Rectangle(double length, double width) {
        setLenght(length);
        setWidth(width);
    }

    void setLenght(double length) {
        this.length = length;
    }

    void setWidth(double width) {
        this.width = width;
    }

    double getWidth() {
        return width;
    }

    double getLength() {
        return length;
    }
}
