package exercises;

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert date: ");
        try {
            int year = scanner.nextInt();
            if (year <= 0) {
                System.out.println("Wrong year!");
                return;
            }
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println(" This is Leap year");
            } else {
                System.out.println("This is  not a Leap year");

            }

        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a valid year:");
        }
    }
}