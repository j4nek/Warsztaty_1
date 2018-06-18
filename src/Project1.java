import java.util.Random;
import java.util.Scanner;

public class Project1 {

    public static void main(String[] args) {

        System.out.print("Zgadnij liczbę: ");
        Scanner scan = new Scanner(System.in);
        int i = 0;
        Random rand = new Random();
        int number = rand.nextInt(100) + 1;

        for (i = 2; i > 1; i++) {
            while (!scan.hasNextInt()) {
                System.out.print("To nie jest liczba, spróbuj ponownie: ");
                scan = new Scanner(System.in);
            }
            int guess = scan.nextInt();

            if (guess == number) {
                System.out.print("Brawo zgadłeś za " + (i - 1)+ " razem!");
                i=0;
            } else if (guess < number) {
                System.out.print("Za mało, spróbuj ponownie: ");
            } else {
                System.out.print("Za dużo, spróbuj ponownie: ");
            }
        }
    }
}
