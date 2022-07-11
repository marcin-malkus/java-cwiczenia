import java.util.Scanner;

class pole_prostokata
{
    double a, b, pole;

    public void czytaj_dane()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Liczymy pole prostokata \nPodaj dlugosc pierwszego boku:   ");
        a = scanner.nextDouble();
        System.out.print("Podaj dlugosc drugiego boku: ");
        b = scanner.nextDouble();
    }
    public void przetworz_dane()
    {
        pole = a*b;
    }
    public void wyswietl_wynik()
    {
        System.out.printf("Dlugosc boku a to: %.2f \nDlugosc boku b to: %.2f \nPole prostokata wynosi: %.2f", a, b, pole);
    }
}



public class Main {
    public static void main(String[] args){

        pole_prostokata pole1 = new pole_prostokata();

        pole1.czytaj_dane();
        pole1.przetworz_dane();
        pole1.wyswietl_wynik();

    }
}
