import java.util.Scanner;

public class Project3 {

    public static void main(String[] args) {

        System.out.println("Pomyśl liczbę od 0 do 1000, a ja zgadnę w max. 10 próbach.");

        int max = 1000;
        int min = 0;
        int licznik = 0;

        Scanner scan = new Scanner(System.in);
        String odpowiedz = "";

        while (licznik<10) {
            int guess = ((max-min)/2) + min;
            System.out.println(guess);
            odpowiedz = scan.nextLine();
            if (odpowiedz.equals("zgadles")) {
                System.out.println("Wygrałem!");
                licznik = 10;
            } else if (odpowiedz.equals("za duzo")) {
                max = guess;
                licznik++;
            } else if (odpowiedz.equals("za malo")) {
                min = guess;
                licznik++;
            } else {
                System.out.println("Nie oszukuj!");
            }
        }

    }
}