package exercises;

import java.util.Scanner;

public class grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many points did you manage to score? (0-100)");
        int points = scanner.nextInt();
        if (points > 100 || points < 0) {
            System.out.println("Wrong number!");
            System.exit(0);
        }
        if (points >= 90) {
            System.out.println("Your rating is 5!");
        } else if (points >= 80) {
            System.out.println("Your rating is 4.");
        } else if (points >= 70) {
            System.out.println("Your rating is 3.");
        } else if (points >= 60) {
            System.out.println("Your rating is 2.");
        } else if (points >= 0) {
            System.out.println("Your rating is 1!");
        } else if (points < 0 || points > 100) {
            System.out.println("Wrong number.");
        }
    }
}
