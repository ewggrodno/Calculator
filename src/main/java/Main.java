import util.MathParser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        System.out.println("My console calculator");
        printAllOperations();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            printMassageEnterAndEsc();
            String expression;
            while (!(expression = reader.readLine()).equals("esc")) {
                if (expression.equals("help")){
                    printAllOperations();
                    printMassageEnterAndEsc();
                    continue;
                }
                if (MathParser.isCorrectExpression(expression)) {
                    String result = MathParser.mathParser(expression);
                    if (result.equals("Infinity")) {
                        printNotCorrectResult();
                    } else printResult(result);
                } else {
                    printNotCorrectResult();
                }
                printMassageEnterAndEsc();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void printAllOperations() {
        System.out.println("All Operations:");
        System.out.println("     summation: example 10 + 10 | 10 + -10 | -10 + -10");
        System.out.println("   subtraction: example 10 - 10 | 10 - -10 | -10 - -10");
        System.out.println("multiplication: example 10 * 10 | 10 * -10 | -10 * -10");
        System.out.println("      division: example 10 / 10 | 10 / -10 | -10 / -10");
        System.out.println("          help: help");
        System.out.println("          exit: esc");
    }

    private static void printResult(String result) {
        System.out.printf("Result: %s\n", result);
    }

    private static void printNotCorrectResult() {
        System.out.println("You entered an incorrect expression, please try again");
    }

    private static void printMassageEnterAndEsc(){
        System.out.print("Please, type expression and press Enter or type \"esc\" to exit: ");
    }
}
