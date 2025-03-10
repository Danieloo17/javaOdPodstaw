package exampless;

import java.util.Scanner;

public class swicz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which color is the light?");
        String light = scanner.nextLine();

        switch (light) {
            case "green" -> System.out.println("U can go!");
            case "yellow" -> System.out.println("Watch out!");
            case "red" -> System.out.println("STOP!");
            default -> System.out.println("Wrong colour.");
        }
    }
}
