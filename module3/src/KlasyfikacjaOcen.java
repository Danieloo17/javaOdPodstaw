import java.util.Scanner;

class KlasyfikacjaOcen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe punktów: ");
        int score = scanner.nextInt();

        if (score > 100 || score < 0) {
            System.out.println("Podałeś wartość poza skalą!");
            System.exit(0);
        } else if (score >= 90) {
            System.out.println("Otrzymujesz ocenę 5!");
        } else if (score >= 80) {
            System.out.println("Tym razem 4!");
        } else if (score >= 70) {
            System.out.println("Otrzyujesz 3!");
        } else if (score >= 60) {
            System.out.println("Dostajesz dopalacza!");
        } else {
            System.out.println("Przykro mi, ale nie zdałeś!");

        }

    }
}