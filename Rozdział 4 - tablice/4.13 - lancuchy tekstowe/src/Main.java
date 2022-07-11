import java.util.Scanner;

public class Main {
    public static void main(String[] args){

//4.13
        System.out.println("\n===========================================================================================");
        System.out.println("4.13 - Napisz program ktory umozliwia odczytanie dlugosci lancucha zapamietanego w odpowiedniej" +
                "zmiennej. Skorzystaj z metody length(), a wynik wyswietl na ekranie monitora.  \n");

        String imie, nazwisko;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj imie: ");
        imie = scanner.nextLine();

        System.out.print("Podaj nazwisko: ");
        nazwisko = scanner.nextLine();

        System.out.println("\nImie " + imie + " zawiera " + imie.length() + " liter.");
        System.out.println("Nazwisko " + nazwisko + " zawiera " + nazwisko.length() + " liter.");


    }
}
