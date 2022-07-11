import java.util.Scanner;

class osoba
{
    String nazwisko, imie, ulica, kod, miasto;

    public void inicjuj()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoje dane: ");
        System.out.println("Nazwisko: ");
        nazwisko = scanner.nextLine();
        System.out.println("Imie: ");
        imie = scanner.nextLine();
        System.out.println("Ulica: ");
        ulica = scanner.nextLine();
        System.out.println("Kod pocztowy: ");
        kod = scanner.nextLine();
        System.out.println("Miasto: ");
        miasto = scanner.nextLine();


    }

    public void drukuj()
    {
        System.out.println("--------------------");
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Imie: " + imie);
        System.out.println("Ulica: " + ulica);
        System.out.println("Kod pocztowy: " + kod);
        System.out.println("Miasto: " + miasto);
    }

}

public class Main {
    public static void main(String[] args){

        osoba osoba1 = new osoba();
        osoba1.inicjuj();
        osoba1.drukuj();


    }
}
