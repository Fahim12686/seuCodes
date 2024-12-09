public class Student {
    private String name;
    private int rollNumber;
    private String program;
    private int batch;

    Student() {
    }

    Student(String name, int rollNumber, String program, int batch) {
        setName(name);
        setRollNumber(rollNumber);
        setProgram(program);
        setBatch(batch);
    }

    void setName(String name) {
        this.name = name;
    }

    void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    void setProgram(String program) {
        this.program = program;
    }

    void setBatch(int batch) {
        this.batch = batch;
    }

    String getName() {
        return name;
    }

    int getRollNumber() {
        return rollNumber;
    }

    String getProgram() {
        return program;
    }

    int getBatch() {
        return batch;
    }
}
