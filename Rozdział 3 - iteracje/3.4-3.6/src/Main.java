

public class Main {
    public static void main(String[] args){


        System.out.println("\n3.4 - Napisz program, ktory za pomoca instrukcji for wyswietla liczby calkowite od 1 do 20.");

        int liczba;

        for(liczba=1;liczba<=20;liczba++) {
            if (liczba < 20) System.out.print(liczba + ", ");
            else System.out.println(liczba + ".");
        }
        System.out.println("========================================");


        System.out.println("\n3.5 - Napisz program, ktory za pomoca instrukcji do...while wyswietla liczby calkowite od 1 do 20.");

        int i = 1;

        do{
            System.out.println(i);
            i++;
        } while(i<=20);
        System.out.println("========================================");


        System.out.println("\n3.6 - Napisz program, ktory za pomoca instrukcji while wyswietla liczby calkowite od 1 do 20.");

        i = 1;

        while(i<=20){
            System.out.println(i);
            i++;
        }


    }
}
