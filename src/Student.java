import java.util.InputMismatchException;
import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private int age;
    private double score;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    public Student(){}

    public Student(int id, String name, int age, double score) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.score = score;
    }


    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setId(int id){
        this.id = id;
    }



    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }

    public Student input(Scanner input){
        this.id = Helper.readInteger("Input ID : ",input);
        input.nextLine();
        this.name = Helper.readString("Input Name : ",input);
        this.age = this.id = Helper.readInteger("Input age : ",input);
        this.score = Helper.readDouble("Input Score : ",input);
        return this;
    }

}
