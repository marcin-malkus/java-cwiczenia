import java.util.Scanner;

class trojmian
{
    double a, b, c, x1, x2, delta;
    char pierwiastki;

    public void wczytaj_dane()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nProgram oblicza pierwiastki rownania kwadratowego ax^2+bx+c=0. Podaj a, b i c.");

        System.out.print("Podaj a: ");
        a = scanner.nextDouble();

        if(a == 0){
            System.out.println("Liczba a musi byc rozna od zera.");
        }else {

            System.out.print("Podaj b: ");
            b = scanner.nextDouble();
            System.out.print("Podaj c: ");
            c = scanner.nextDouble();
        }
    }
    public void przetworz_dane()
    {
        // liczymy delte ze wzoru delta=b^2-4ac
        // jezeli delta wieksza od 0 to mamy dwa miejsca zerowe(pierwiastki rownania kwadratowego,
        // jezeli rowna 0 to jedno miejsce zerowe, jezeli mniejsza od 0 to brak miejsc zerowych. dalej liczymy ze wzorow

        delta = (b * b) - 4 * a * c;

        if (delta > 0) {
            pierwiastki = 2;

        } else if (delta == 0) {
            pierwiastki = 1;

        } else {
            pierwiastki = 0;
        }

        switch (pierwiastki) {
            case 0:
                break;
            case 1: {
                x1 = (b * (-1)) / (2 * a);
                break;
            }
            case 2: {
                x1 = ((b * (-1)) + (Math.sqrt(delta))) / (2 * a);
                x2 = ((b * (-1)) - (Math.sqrt(delta))) / (2 * a);
                break;
            }
        }

    }
    public void wyswietl_wynik()
    {
        switch (pierwiastki) {
            case 0:
                System.out.println("Brak miejsc zerowych.");
                break;
            case 1: {
                System.out.printf("Rownanie posiada jedno miejsce zerowe:  x1 = %2.2f", x1);
                break;
            }
            case 2: {
                System.out.printf("Rownanie posiada dwa pierwiastki(miejsca zerowe):   x1 = %2.2f  x2 = %2.2f ", x1, x2);
                break;
            }
        }
    }
}



public class Main {
    public static void main(String[] args){

        trojmian rownanie1 = new trojmian();

        rownanie1.wczytaj_dane();
        rownanie1.przetworz_dane();
        rownanie1.wyswietl_wynik();
    }
}
