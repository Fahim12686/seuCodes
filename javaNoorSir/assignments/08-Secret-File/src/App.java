import java.io.RandomAccessFile;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        while (n != 5) {
            System.out.println("\nEnter your Option: ");
            System.out.println("1. add student info");
            System.out.println("2. read student info");
            System.out.println("3. add course");
            System.out.println("4. view advised courses");
            System.out.println("5. exit \n");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    writeFile();
                    break;
                case 2:
                    readFile();
                    break;
                case 3:
                    addCourse();
                    break;
                case 4:
                    viewCourse();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid input!");
                    break;
            }
        }
        sc.close();
    }

    static void loggedIn(){
        
    }

    static boolean courseChecker(int id, String course) {
        try {
            String fileName = id + ".txt";
            RandomAccessFile r = new RandomAccessFile(fileName, "r");
            String line;
            while ((line = r.readLine()) != null) {
                if (course.equals(line)) {
                    r.close();
                    return true;
                }
            }
            r.close();
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    static boolean idChecker(int id) {
        try {
            RandomAccessFile r = new RandomAccessFile("studentsData.txt", "r");
            String line;
            while ((line = r.readLine()) != null) {
                String arr[] = line.split(",");
                int x = Integer.parseInt(arr[0]);
                if (id == x) {
                    r.close();
                    return true;
                }
            }
            r.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    static void viewCourse() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        if (idChecker(id)) {
            String fileName = id + ".txt";
            try {
                RandomAccessFile r = new RandomAccessFile(fileName, "r");
                String line;
                while ((line = r.readLine()) != null) {
                    System.out.println(line);
                }
                r.close();
            } catch (Exception e) {
                System.out.println("No course added");
            }
        } else {
            System.out.println("ID not registered!");
        }

    }

    static void addCourse() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        if (idChecker(id)) {
            System.out.print("Enter course name: ");
            String course = sc.nextLine();
            if (courseChecker(id, course)) {
                System.out.println("Course already added");
            } else {
                String fileName = id + ".txt";
                try {
                    RandomAccessFile w = new RandomAccessFile(fileName, "rw");
                    w.seek(w.length());
                    w.writeBytes(course + "\n");
                    w.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } else {
            System.out.println("ID not registered");
        }
    }

    static void readFile() {
        try {
            RandomAccessFile r = new RandomAccessFile("studentsData.txt", "r");
            String line;
            while ((line = r.readLine()) != null) {
                System.out.println(line);
            }
            r.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    static void writeFile() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("ID: ");
            String id = sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Password: ");
            String password = sc.nextLine();
            System.out.print("Program: ");
            String program = sc.nextLine();
            System.out.print("Batch: ");
            String batch = sc.nextLine();
            System.out.print("CGPA: ");
            double cgpa = sc.nextDouble();
            String line = id + ", " + name + ", " + password + ", " + program + ", " + batch + ", " + cgpa + "\n";

            RandomAccessFile w = new RandomAccessFile("studentsData.txt", "rw");
            w.seek(w.length());
            w.writeBytes(line);
            w.close();
        } catch (Exception e) {
            System.out.println("Invalid input!");
            e.printStackTrace();
        }

    }

}