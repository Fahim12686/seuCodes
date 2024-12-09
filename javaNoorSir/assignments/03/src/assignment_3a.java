import java.util.Scanner;

public class assignment_3a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two integers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.printf("The sum is %d. \n", (num1 + num2));
        System.out.printf("The difference is %d. \n", Math.abs(num1 - num2));
        System.out.printf("The product is %d. \n", (num1 * num2));
//        System.out.printf(((num2 == 0) ? "Error! Divided by zero." : "The quotient is %d."), (num1 / num2));
        if (num2 == 0) {
            System.out.println("Error! Divided by zero.");
        } else {
            System.out.printf("The quotient is %d", (num1 / num2));
        }
    }
}