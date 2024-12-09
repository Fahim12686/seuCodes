import java.util.Scanner;

public class assignment_3e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int largeNum;
        if (num1 > num2 && num1 > num3) {
            largeNum = num1;
        } else if (num2 > num1 && num2 > num3) {
            largeNum = num2;
        } else {
            largeNum = num3;
        }
        System.out.printf("Largest number is %d.", largeNum);
    }
}
