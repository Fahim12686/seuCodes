import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class App {
    public static void main(String[] args) throws Exception {
        // int id = 103;
        // String name = "Fahim";
        // double cgpa = 3.88;

        // String line = id + ", " + name + ", " + cgpa + "\n";
        // System.out.println(line);
        // writeFile(line);

        readFile();

    }

    static void readFile() {
        try {
            RandomAccessFile reader = new RandomAccessFile("students.txt", "r");
            String line;
            while ((line = reader.readLine()) != null) {

                String arr[] = line.split(","); // Delimiter
                int id = Integer.parseInt(arr[0]);
                String name = arr[1];
                double cgpa = Double.parseDouble(arr[2]);
                line = id + ", " + name + ", " + cgpa;
                System.out.println(line);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void writeFile(String line) {
        try {
            RandomAccessFile writer = new RandomAccessFile("students.txt", "rw");
            writer.seek(writer.length());
            writer.writeBytes(line);
        } catch (FileNotFoundException e) {
            System.out.println("Error!");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error!");
            e.printStackTrace();
        }

    }
}
