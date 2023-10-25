import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utils {
    public static void searchStudent(Scanner input, String name, ArrayList<Student> students){
        students.stream()
                .filter(e->e.getName().toLowerCase().contains(name))
                .forEach(System.out::println);
    }
    public static void addStudent(ArrayList<Student> students, Scanner input){
        students.add(new Student().input(input));
    }

}
