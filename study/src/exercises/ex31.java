package exercises;

import java.util.Scanner;

public class ex31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("How old are U?");
        int age = scanner.nextInt();
        System.out.println("My name is " + name + " and I'm " + age + " years old!");

    }
}
