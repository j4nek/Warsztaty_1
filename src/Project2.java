import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Project2 {

    public static void main(String[] args) {

        System.out.println("Wpisz 6 liczb!");
        Scanner scan = new Scanner(System.in);
        int[] liczbyGracza = new int[6];
        int index = 0;

        while (index<6) {
            while (!scan.hasNextInt()) {
                System.out.println("To nie jest liczba!");
                System.out.print("Spróbuj ponownie: ");
                scan = new Scanner(System.in);
            }
            int liczba = scan.nextInt();
            if (liczba < 50 && liczba > 0) {
                if (IntStream.of(liczbyGracza).anyMatch(x -> x == liczba)) {
                    System.out.print("Liczba została już użyta. Spróbuj ponownie: ");

                } else {
                    liczbyGracza[index] = liczba;
                    index++;
                }
            } else {
                System.out.println("Liczba poza interval 1-49! Spróbuj ponownie: ");
            }
        }

        Arrays.sort(liczbyGracza);
        System.out.println("Liczby gracza to " + Arrays.toString(liczbyGracza));

        Integer[] randomNumbers = new Integer[49];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = i + 1;
        }
        int[] liczbyWylosowane = new int[6];
        Collections.shuffle(Arrays.asList(randomNumbers));
        for (int i = 0; i < 6; i++) {
            liczbyWylosowane[i] = randomNumbers[i];
        }
        System.out.println("Liczby wylosowane to " + Arrays.toString(liczbyWylosowane));
        int licznik = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (liczbyGracza[i]==liczbyWylosowane[j]) {
                    licznik++;
                }
            }
        }
        if (licznik>2) {
            System.out.println("Brawo, wygrałeś! Trafiłeś: " + licznik);
        } else {
            System.out.println("Niestety nie wygrałeś. Spróbuj jeszcze raz! " + licznik + "/6");
        }
    }
}
