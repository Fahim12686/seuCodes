public class Employee {
    private String name;
    private int id;
    private int salary;

    Employee() {
    }

    Employee(String name, int id, int salary) {
        setName(name);
        setId(id);
        setSalary(salary);
    }

    void setName(String name) {
        this.name = name;
    }

    void setId(int id) {
        this.id = id;
    }

    void setSalary(int salary) {
        this.salary = salary;
    }

    String getName() {
        return name;
    }

    int getId() {
        return id;
    }

    int getSalary() {
        return salary;
    }
}
