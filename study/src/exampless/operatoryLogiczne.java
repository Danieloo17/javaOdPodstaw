package exampless;

public class operatoryLogiczne {
    public static void main(String[] args) {
        String name = "Daniel";

        System.out.println(name.startsWith("d") && (name.endsWith("l")));
        System.out.println(name.startsWith("d") || (name.endsWith("l")));

        int a = 5;
        int b = 10;

//        System.out.println(a < b && a <= 4);
//        System.out.println(a < b || a <= 4);
        System.out.println(!(a < b || a <= 4));
    }
}
