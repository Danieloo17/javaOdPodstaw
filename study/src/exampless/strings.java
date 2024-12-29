package exampless;

public class strings {
    public static void main(String[] args) {
        String name = "Daniel";
        String nameLower = name.toLowerCase();
        int length = name.length();

        System.out.println(name);
        System.out.println(nameLower);
        System.out.println(length);

        String text = "Jak nauczyć się programowania";
        text = text.replace(" ", "-");


        System.out.println(text);
    }
}
