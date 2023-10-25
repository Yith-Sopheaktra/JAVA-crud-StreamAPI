import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.CellStyle;
import org.nocrala.tools.texttablefmt.CellStyle.HorizontalAlign;
import org.nocrala.tools.texttablefmt.ShownBorders;
import org.nocrala.tools.texttablefmt.Table;

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

    public static void displayStudent(ArrayList<Student> students){
        CellStyle centerStyle = new CellStyle(CellStyle.HorizontalAlign.center);
        Table t = new Table(4, BorderStyle.UNICODE_BOX_DOUBLE_BORDER,
                ShownBorders.SURROUND_HEADER_AND_COLUMNS);
        t.setColumnWidth(0, 5, 10);
        t.setColumnWidth(1, 5, 30);
        t.setColumnWidth(2, 5, 10);
        t.setColumnWidth(3, 5, 15);

        t.addCell("ID",centerStyle);
        t.addCell("NAME",centerStyle);
        t.addCell("AGE",centerStyle);
        t.addCell("SCORE",centerStyle);

        students.stream().forEach((e)->{
            t.addCell(e.getId()+"",centerStyle);
            t.addCell(e.getName());
            t.addCell(e.getAge()+"",centerStyle);
            t.addCell(e.getScore()+"",centerStyle);
        });
        System.out.println(t.render());
    }

    public static void deleteStudent(ArrayList<Student> students, Scanner input){
        displayStudent(students);
        int delID = Helper.readInteger("Input Student ID to delete : ",input);
        List<Student> list = students.stream().filter(e -> !(e.getId() == delID)).toList();
        students = new ArrayList<>(list);
        displayStudent(students);
    }

    public static void updateStudent(ArrayList<Student> students,Scanner input){
        int upID = Helper.readInteger("Input ID to update data : ",input);
    }

}
