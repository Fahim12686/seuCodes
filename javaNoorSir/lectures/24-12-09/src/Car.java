public class Car {
    String model;
    String color;
    int year;
    private double fuel;   /// Access Modifire
    Car(){}   // Default constructor

    public Car(String model, String color, int year) {   // Parameterized constructor
        this.model = model;
        this.color = color;
        this.year = year;
        this.fuel = 50;
    }

    void setFuel(double amount) {   // Setter
        if (amount > 0) {
            fuel = amount;
        } else {
            System.out.println("Invalid fuel");
        }
    }

    double getFuel() {   // Getter
        return fuel;
    }

    void run(int time) {   // Method Overriding
        int millage = 5;
        int consumedFuel = time * millage;
        fuel = fuel - consumedFuel;
    }

    void refill(double fuel) {
        this.fuel = this.fuel + fuel;
    }
}
