package exampless;

import java.util.Scanner;

public class instrukcjeWarunkowe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How old are U?");
        int age = scanner.nextInt();    {
            if (age <= 18)  {
                System.out.println("U are not of age!");
            }   else {
                System.out.println("U are of age.");
            }
        }



    }
}
