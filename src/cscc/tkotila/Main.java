package cscc.tkotila;

public class Main {
    public static void main(String[] args) {
        UserInputCollector inputCollector = new UserInputCollector();

        String stringInput = inputCollector.promptString("Enter a string:");
        int intInput = inputCollector.promptInt("Enter an int:");
        double doubleInput = inputCollector.promptDouble("Enter a double:");

        System.out.println("String input: " + stringInput);
        System.out.println("Integer input: " + intInput);
        System.out.println("Double input: " + doubleInput);
    }
}
