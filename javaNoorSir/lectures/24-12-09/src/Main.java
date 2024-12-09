public class Main {
    public static void main(String[] args) {
        Car car = new Car("toyota", "red", 2024);
        System.out.println(car.model + " " + car.getFuel());
        car.setFuel(-10);
        System.out.println(car.model + " " + car.getFuel());
        car.run(2);
        System.out.println(car.model + " " + car.getFuel());
        car.run(3);
        System.out.println(car.model + " " + car.getFuel());

        Car car2 = new Car("honda", "blue", 2023);
        System.out.println(car2.model + " " + car2.getFuel());
        car2.run(4);
        System.out.println(car2.model + " " + car2.getFuel());
        car2.refill(10);
        System.out.println(car2.model + " " + car2.getFuel());

        BatteryCar batteryCar = new BatteryCar();
        batteryCar.model = "tesla";
        batteryCar.color = "black";
        batteryCar.year = 2020;
        batteryCar.recharge(20);
        batteryCar.run(4);
        System.out.println(batteryCar.model + " " + batteryCar.getBattery());
        System.out.println(batteryCar.model + " " + batteryCar.getBattery());
    }
}
