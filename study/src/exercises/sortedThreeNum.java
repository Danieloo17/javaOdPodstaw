package exercises;

import java.util.Scanner;

public class sortedThreeNum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input three numbers, first: ");
        int first = scanner.nextInt();
        System.out.println("Second: ");
        int second = scanner.nextInt();
        System.out.println("Third");
        int third = scanner.nextInt();

        if (first > second) {
            int temp = first;
            first = second;
            second = temp;
        }
        if (second > third) {
            int temp = second;
            second = third;
            third = temp;
        }
        if (first > second) {
            int temp = first;
            first = second;
            second = temp;
        }
        System.out.println("Sorted numbers: " + first + ", " + second + ", " + third + "!");
    }
}
