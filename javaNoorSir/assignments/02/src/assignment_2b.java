import java.util.Scanner;

public class assignment_2b {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name: ");
    String name = sc.nextLine();
    System.out.println("Enter your birth year: ");
    int bYear = sc.nextInt();
    int age = 2024 - bYear;
    System.out.printf("Hi %s! Your birth year is %d and you are " + ((age > 1)? "%d years old." : "%d year old."), name, bYear, age);
    }
}