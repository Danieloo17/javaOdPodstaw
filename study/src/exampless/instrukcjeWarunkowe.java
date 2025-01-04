package exampless;

import java.util.Scanner;

public class instrukcjeWarunkowe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = scanner.nextLine();
        System.out.println("How old are U?");
        int age = scanner.nextInt();    {
            if (age < 18 && name.endsWith("a"))  {
                System.out.println("U are not of age my girl!");
            } else if (age < 18 && !name.endsWith("a")) {
                System.out.println("Kid, U are not of age!");
            } else if (age >= 18 && name.endsWith("a") ) {
                System.out.println("Girl, U are of age.");
            }   else {
                System.out.println("Kid, U are of age.");
            }

        }


            }

//        System.out.println("What color is the light? Pick one: green, yellow or red.");
//        String light = scanner.nextLine();
//        if (light.equals("green")) {
//            System.out.println("U can go.");
//        } else if (light.equals("yellow")) {
//            System.out.println("Watch out!");
//        } else if (light.equals("red")) {
//            System.out.println("U must stop!");
//        } else {
//            System.out.println("U put the wrong color!");

    }




