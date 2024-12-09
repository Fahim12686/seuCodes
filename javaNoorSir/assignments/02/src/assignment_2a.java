import java.util.Scanner;

public class assignment_2a {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Enter your height in feet: ");
        double height = sc.nextDouble();

        System.out.printf("Your name is %s and your age is %d and your height is %.2f feet.", name, age, height);
    }
}