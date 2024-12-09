public class Circle {
    private double radious;

    Circle() {
    }

    Circle(double radious) {
        setRadious(radious);
    }

    void setRadious(double radious) {
        this.radious = radious; // Didn't use any condition for now
    }

    double getRadious() {
        return radious;
    }
}
