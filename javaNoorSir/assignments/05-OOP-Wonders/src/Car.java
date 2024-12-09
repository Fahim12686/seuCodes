public class Car {
    private String brand;
    private String model;
    private int year;

    Car() {
    }

    Car(String brand, String model, int year) {
        setBrand(brand);
        setModel(model);
        setYear(year);
    }

    // Didn't use any condition in setter for now
    void setBrand(String brand) {
        this.brand = brand;
    }

    void setModel(String model) {
        this.model = model;
    }

    void setYear(int year) {
        this.year = year;
    }

    String getBrand() {
        return brand;
    }

    String getModel() {
        return model;
    }

    int getYear() {
        return year;
    }
}
