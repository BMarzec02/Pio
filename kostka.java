import java.util.Random;
import java.util.Scanner;

public class kostka {
    public static void main(String[] args) {
        Random rand = new Random();
        int dice;
        int guess;
        
        do {
            Scanner scan = new Scanner(System.in);
            System.out.print("Wprowadz swój typ: ");
            guess = scan.nextInt();
            
            dice = rand.nextInt(6) + 1;
            System.out.println("Kostka: " + dice);

            if (dice != guess) {
                System.out.println("Nie udalo sie, sprobuj jeszcze raz.");
            } else {
                System.out.println("Udalo ci sie odgadnac liczbe oczek na kostce!");
            }
            System.out.println("================");
            
        } while (dice != guess);
    }
}
