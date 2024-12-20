import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File userData = new File("userData.txt");

        try {
            FileWriter myWriter = new FileWriter("userData.txt");
            myWriter.write("admin");
            myWriter.write("\n");
            myWriter.write("1234");
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Enter your Username: ");
        String userName = sc.nextLine();
        System.out.println("Enter your Password: ");
        String userPass = sc.nextLine();
        try {
            Scanner myReader = new Scanner(userData);
            if (userName.equals(myReader.nextLine()) && userPass.equals(myReader.nextLine())) {
                myReader.close();
                System.out.println("IN");
            } else {
                System.out.println("Try again");
            }

        } catch (IOException e) {
            System.out.println("Something went wrong!");
        }

    }
}
