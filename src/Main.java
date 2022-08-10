import java.util.Objects;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //СalculatorSwitch();
        СalculatorIfElse();
    }
    static void СalculatorSwitch() {


        System.out.println("The user enters the first number:");
        double number1 = sc.nextDouble();
        System.out.println("The user enters the second number:");
        double number2 = sc.nextDouble();
        System.out.println( "Choose and Enter the type of operation you want to perform (+, -, *, /): ");
        String operation = sc.next();
        System.out.println("Result:");

        switch (operation) {
            case "+":

                System.out.println(number1 + number2);
                break;
            case "-":
                System.out.println(number1 - number2);
                break;
            case "*":
                System.out.println(number1 * number2);
                break;
            case "/":
                System.out.println(number1 / number2);
                break;
        }
    }
    ////////////////////////////////////////////////////////

    static int СalculatorIfElse(){


        System.out.println("The user enters the first number:");
        int number1 = sc.nextInt();
        System.out.println("The user enters the second number:");
        int number2 = sc.nextInt();;
        System.out.println("Choose and Enter the type of operation you want to perform (+, -, *, /):");
        String operation = sc.next();


        int values = 0;

        if(Objects.equals(operation, "+")){
            values = number1 + number2;
        } else if ((Objects.equals(operation, "-"))) {
            values = number1 - number2;
        } else if ((Objects.equals(operation, "*"))) {
            values = number1 * number2;
        } else if ((Objects.equals(operation, "/"))) {
            values = number1 / number2;
        }

        System.out.println("Result:" + values);
        return values;

    }

}