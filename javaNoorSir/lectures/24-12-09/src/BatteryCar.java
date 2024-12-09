public class BatteryCar extends Car {
    private double battery;

    void run(int time) {   // Method Overriding
        int millage = 2;
        int consumed = millage * time;
        this.battery = this.battery - consumed;
    }

    void recharge(double battery) {
        this.battery = this.battery + battery;
    }

    double getBattery() {
        return battery;
    }
}