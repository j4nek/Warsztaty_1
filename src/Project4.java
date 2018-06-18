import java.util.Scanner;

public class Project4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String kod = scan.nextLine();
        int x = 0;
        int y = 0;
        int z = 0;

        if (kod.charAt(7) == 'D') {
            x = kod.charAt(6);
            if (kod.charAt(10) == '+') {
                char numer = kod.charAt(8);
                char numer2 = kod.charAt(9);
                y = numer + numer2;
                char numer3 = kod.charAt(11);
                char numer4 = kod.charAt(12);
                z = numer3 + numer4;
                System.out.println(x + "D" + y + "+" + z);
            } else {
                char numer = kod.charAt(8);
                char numer2 = kod.charAt(9);
                y = numer + numer2;
                char numer3 = kod.charAt(11);
                char numer4 = kod.charAt(12);
                char numer5 = kod.charAt(13);
                z = numer3 + numer4 + numer5;
                System.out.println(x + "D" + y + "-" + z);
            }
        } else if (kod.charAt(6)=='D') {
            System.out.println("halo");

        }
    }
}
