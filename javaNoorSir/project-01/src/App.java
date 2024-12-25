import java.io.RandomAccessFile;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int attempts = 4;
        try {
            while ((attempts--) != 0) {
                System.out.print("Enter username: ");
                String userName = sc.nextLine();
                System.out.print("Enter password: ");
                String pass = sc.nextLine();
                RandomAccessFile r = new RandomAccessFile("login.txt", "r");
                if (userName.equals(r.readLine()) && pass.equals(r.readLine())) {
                    System.out.println("\nWelcome Admin!");
                    loggedIn(sc);
                    break;
                } else if (attempts != 0) {
                    System.out.println("\nWrong credentials, Try again!");
                    System.out.println(attempts + ((attempts > 1) ? " attempts left..." : " attempt left..."));
                } else {
                    System.out.println("\nWrong credentials!");
                    System.out.println("Exiting...");
                }
                r.close();
            }
        } catch (Exception e) {
            System.out.println("Invalid input 0");
        }
        sc.close();
    }

    static void loggedIn(Scanner sc) {
        int n = 0;
        while (n != 5) {
            System.out.println("\nEnter your Option: ");
            System.out.println("1. register student");
            System.out.println("2. add course");
            System.out.println("3. view registered student list");
            System.out.println("4. view student details");
            System.out.println("5. logout \n");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    writeFile(sc);
                    break;
                case 3:
                    readFile(0);
                    break;
                case 2:
                    addCourse(sc);
                    break;
                case 4:
                    viewDetails(sc);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid input!");
                    break;
            }
        }
    }

    static boolean courseChecker(int id, String course) {
        try {
            String fileName = id + "_CourseList.txt";
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
            RandomAccessFile r = new RandomAccessFile("studentData.txt", "r");
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
        }
        return false;
    }

    static void viewDetails(Scanner sc) {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        if (idChecker(id)) {
            readFile(id);
            String fileName = id + "_CourseList.txt";
            try {
                System.out.println("\nCourses:");
                RandomAccessFile r = new RandomAccessFile(fileName, "r");
                String line;
                while ((line = r.readLine()) != null) {
                    System.out.print(line + " ");
                }
                System.out.println();
                r.close();
            } catch (Exception e) {
                System.out.println("No course added");
            }
        } else {
            System.out.println("ID not registered!");
        }
    }

    static void addCourse(Scanner sc) {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        if (idChecker(id)) {
            System.out.print("Enter course name: ");
            String course = sc.nextLine();
            if (courseChecker(id, course)) {
                System.out.println("Course already added");
            } else {
                String fileName = id + "_CourseList.txt";
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

    static void readFile(int id) {
        try {
            RandomAccessFile r = new RandomAccessFile("studentData.txt", "r");
            String line;

            while ((line = r.readLine()) != null) {
                String arr[] = line.split(",");
                if (id == Integer.parseInt(arr[0])) {
                    System.out.println("ID: " + arr[0] + "   Name:" + arr[1] + "   Program:" + arr[3] + "   Batch:"
                            + arr[4] + "   CGPA:" + arr[5]);
                    break;
                } else if (id == 0) {
                    System.out.println("ID: " + arr[0] + "   Name:" + arr[1] + "   Program:" + arr[3] + "   Batch:"
                            + arr[4] + "   CGPA:" + arr[5]);
                }
            }
            r.close();
        } catch (Exception e) {
            System.out.println("No student info added");
        }

    }

    static void writeFile(Scanner sc) {
        try {
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            if (idChecker(id)) {
                System.out.println("ID already registered!");
            } else {
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
                sc.nextLine();
                String line = id + ", " + name + ", " + password + ", " + program + ", " + batch + ", " + cgpa + "\n";

                RandomAccessFile w = new RandomAccessFile("studentData.txt", "rw");
                w.seek(w.length());
                w.writeBytes(line);
                w.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}