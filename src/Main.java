import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>(){{
            add(new Student(1,"Yith Sopheaktra",23,78.54));
            add(new Student(2,"Meas Thida",16,56.00));
            add(new Student(3,"Oun Kimlang",18,60.48));
            add(new Student(4,"Ou Reaksmey",32,89.00));
            add(new Student(5,"Chan Veasna",27,92.36));
        }};

//        System.out.println("Input Student name : ");
//        String name = input.nextLine();
//        Utils.searchStudent(input,name,students);

        Utils.addStudent(students,input);
        System.out.println(students);
    }
}
