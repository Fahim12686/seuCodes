import java.util.Scanner;

public class assignment_3d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a temperature in Fahrenheit: ");
        double fahr = sc.nextDouble();
        System.out.printf("The tempreture is %.2f degree Celsius", ((fahr-32.0)*(5.0/9)));
    }
}