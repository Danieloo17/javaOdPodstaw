package exercises;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, please input first from two integers:");
        int a = scanner.nextInt();
        System.out.println("Now, please input second integer: ");
        int b = scanner.nextInt();
        System.out.println("Select actions to be performed on these numbers: addition, subtraction, division, multiplication ");
        scanner.nextLine();
        String action = scanner.nextLine();

        switch (action) {
            case "addition" -> System.out.println(a + b);
            case "subtraction" -> System.out.println(a - b);
            case "division" -> System.out.println(a / b);
            case "multiplication" -> System.out.println(a * b);
            default -> System.out.println("Wrong command. Again dude!");
        }


    }
}
