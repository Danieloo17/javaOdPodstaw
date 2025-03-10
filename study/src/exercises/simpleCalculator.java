package exercises;

import java.util.Scanner;

public class simpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hey. Please input first of two numbers: ");
        int a = scanner.nextInt();
        System.out.println("Ok, now input second number: ");
        int c = scanner.nextInt();
        System.out.println("result of addition: " + (a + c));
        System.out.println("result of the subtraction: " + (a - c));
        System.out.println("result of the multiplication: " + (a * c));
        System.out.println("result of the division: " + (a / c));
    }
}
