import java.util.InputMismatchException;
import java.util.Scanner;

public class Helper {
    public static int readInteger(String message, Scanner input) {
        while (true) {
            try {
                System.out.print(message);
                return input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("ID must be Integer!!");
                input.nextLine();
            }
        }
    }

    public static String readString(String message, Scanner input) {
        while (true) {
            try {
                System.out.print(message);
                return (String) input.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Name must be Text");
                input.nextLine();
            }
        }
    }
    public static double readDouble(String message, Scanner input) {
        while (true) {
            try {
                System.out.print(message);
                return input.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Score must be Double");
                input.nextLine();
            }
        }
    }

}
