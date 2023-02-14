package cscc.tkotila;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInputCollector {
    Scanner scanner;

    public UserInputCollector() {
        this.scanner = new Scanner(System.in);
    }

    public String promptString(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }

    public int promptInt(String message) {
        System.out.println(message);
        int result;

        do {
            try {
                result = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input.");
                scanner.nextLine();
            }
        } while (true);

        return result;
    }

    public double promptDouble(String message) {
        System.out.println(message);
        double result;

        do {
            try {
                result = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input.");
                scanner.nextLine();
            }
        } while (true);

        return result;
    }
}
