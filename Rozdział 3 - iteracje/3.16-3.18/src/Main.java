import java.util.Scanner;

public class Main {
    public static void main(String[] args){


//  3.16
        System.out.println("\n===========================================================================================");
        System.out.println("3.16 - Napisz program, ktory za pomoca instrukcji for znajduje największą i najmniejszą liczbę\n" +
                "ze zbioru n wylosowanych liczb człkowitych od 0 do 99 oraz oblicza średnią z wylosowanych liczb.\n");

        double min, max, avg, ile, liczba, suma;
        int i;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj ile liczb chcesz wylosowac: ");
        ile = scanner.nextDouble();

        min = Math.floor((Math.random())*100);
        max = min;
        suma = min;
        System.out.print("Wylosowano liczby: " + min + ", ");
        for(i=1;i<=ile-1;i++){
            liczba = Math.floor((Math.random())*100);
            if(liczba>max) max = liczba;
            if(liczba<min) min = liczba;
            System.out.print(liczba + ", ");
            suma += liczba;
        }
        avg = suma/ile;
        System.out.println("\nNajmniejsza to: " + min);
        System.out.println("Największa to: " + max);
        System.out.println("Srednia: " + avg);



//3.17
        System.out.println("\n===========================================================================================");
        System.out.println("3.17 - Napisz program, ktory za pomoca instrukcji do...while znajduje największą i najmniejszą liczbę\n" +
                "ze zbioru n wylosowanych liczb człkowitych od 0 do 99 oraz oblicza średnią z wylosowanych liczb.\n");

        min = Math.floor(Math.random()*100);
        max = min;
        suma = min;
        i=1;
        System.out.print("Wylosowano liczby: " + min + ", ");
        do{
            liczba = Math.floor(Math.random()*100);
            System.out.print(liczba + ", ");
            if(liczba > max) max = liczba;
            if(liczba < min) min = liczba;
            suma += liczba;
            i++;
        }while(i<=ile-1);

        avg = suma/ile;
        System.out.println("\nNajmniejsza to: " + min);
        System.out.println("Największa to: " + max);
        System.out.println("Srednia: " + avg);



//3.18
        System.out.println("\n===========================================================================================");
        System.out.println("3.18 - Napisz program, ktory za pomoca instrukcji while znajduje największą i najmniejszą liczbę\n" +
                "ze zbioru n wylosowanych liczb człkowitych od 0 do 99 oraz oblicza średnią z wylosowanych liczb.\n");

        min = Math.floor(Math.random()*100);
        max = min;
        suma = min;
        i=1;
        System.out.print("Wylosowano liczby: " + min + ", ");
        while(i<=ile-1){
            liczba = Math.floor(Math.random()*100);
            System.out.print(liczba + ", ");
            if(liczba>max) max = liczba;
            if(liczba<min) min = liczba;
            suma+=liczba;
            i++;
        }
        avg = suma/ile;
        System.out.println("\nNajmniejsza to: " + min);
        System.out.println("Największa to: " + max);
        System.out.println("Srednia: " + avg);



    }
}
