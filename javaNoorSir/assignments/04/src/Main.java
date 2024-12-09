
public class Main {
    public static void main(String[] args) {

        Rectangle r1Rectangle = new Rectangle();
        r1Rectangle.length = 8.8;
        r1Rectangle.width = 2.2;
        System.err.printf("The area of the Rectangle is %.2f \n\n", (r1Rectangle.length * r1Rectangle.width));

        Employee e1Employee = new Employee();
        e1Employee.name = "Fahim";
        e1Employee.id = 103;
        e1Employee.salary = 100;
        System.out.printf("Employee name: %s \nEmployee ID: %d \nEmployee salary: %dk/yr \n\n", e1Employee.name,
                e1Employee.id, e1Employee.salary);

        Circle c1Circle = new Circle();
        c1Circle.radious = 16.14;
        System.out.printf("The area of the circle is %.2f \n\n", (3.14 * Circle(2.2)));

        Car c1Car = new Car();
        c1Car.brand = "Ford";
        c1Car.model = "Mustang GT";
        c1Car.year = 1964;
        System.out.printf("Brand: %s \nModel: %s \nYear: %d \n\n", c1Car.brand, c1Car.model, c1Car.year);

        Student s1Student = new Student();
        s1Student.name = "Fahim";
        s1Student.rollNumber = 103;
        s1Student.program = "CSE";
        s1Student.batch = 63;
        System.out.printf("Your name: %s \nRoll: %d \nProgram: %s \nBatch: %d", s1Student.name, s1Student.rollNumber, s1Student.program, s1Student.batch);
    }
}