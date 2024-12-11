import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        // ArrayList:
        ArrayList<Integer> myList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            myList.add(i);
        }
        System.out.println("The sum is " + ArrayListSum(myList));
        ArrayListMax(myList);
        ArrayListMin(myList);
        ArrayListAvg(myList);
        System.out.println();

        // HashSet:
        HashSet<String> mySet = new HashSet<>();
        mySet.add("Bangladesh");
        mySet.add("Palestine");
        mySet.add("Pakistan");
        mySet.add("Iran");
        mySet.add("Iraq");
        for (String i : mySet) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        // HashMap:
        HashMap<Integer, Integer> employeeData = new HashMap<>();
        employeeData.put(1, 100000);
        employeeData.put(2, 110000);
        employeeData.put(3, 120000);
        employeeData.put(4, 130000);
        employeeData.put(5, 140000);
        for (int i : employeeData.keySet()) {
            System.out.println("ID: " + i + " Salary: " + employeeData.get(i));
        }
        employeeAvgSalary(employeeData);
    }

    static void employeeAvgSalary(HashMap<Integer, Integer> employee) {
        int sum = 0;
        for (int i : employee.keySet()) {
            sum += employee.get(i);
        }
        System.out.println("Avarage salary: " + (sum / employee.size()));
    }

    static int ArrayListSum(ArrayList<Integer> myList) {
        int sum = 0;
        for (int i : myList) {
            sum += i;
        }
        return sum;
    }

    static void ArrayListMax(ArrayList<Integer> myList) {
        int max = myList.get(0);
        for (int i : myList) {
            if (i > max)
                max = i;
        }
        System.out.println("The maximum element is " + max);
    }

    static void ArrayListMin(ArrayList<Integer> myList) {
        int min = myList.get(0);
        for (int i : myList) {
            if (i < min)
                min = i;
        }
        System.out.println("The minimum element is " + min);
    }

    static void ArrayListAvg(ArrayList<Integer> myList) {
        System.out.println("The avarage is " + (ArrayListSum(myList) / myList.size()));
    }

}
