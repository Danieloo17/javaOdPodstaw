package exercises;

public class exString {
    public static void main(String[] args) {
        String kurs = "  Jak nauczyć się programowania   ";
        kurs = kurs.strip();
        kurs = kurs.toUpperCase();
        kurs = kurs.substring(4);
        System.out.println(kurs);
    }
}