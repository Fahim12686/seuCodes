import java.util.Scanner;

public class assignment_3c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ctr = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                ctr++;
            }
        }
        System.out.printf("Total sum of even numbers is %d.", ctr);
    }
}