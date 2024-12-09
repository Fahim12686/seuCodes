import java.util.Scanner;

public class assignment_2c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        double length = sc.nextDouble();
        System.out.println("Enter width: ");
        double width = sc.nextDouble();

        System.out.printf("The area of the rectangle is %.2f square unit.", (width * length));
    }
}
