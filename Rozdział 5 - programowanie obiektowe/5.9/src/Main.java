import java.util.Scanner;

class osoba {
    String nazwisko, imie, ulica, kod, miasto;

    public void inicjuj() {
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

    public void drukuj() {
        System.out.println("--------------------");
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Imie: " + imie);
        System.out.println("Ulica: " + ulica);
        System.out.println("Kod pocztowy: " + kod);
        System.out.println("Miasto: " + miasto);
    }
}

class kadra extends osoba{

    String wykrztalcenie, stanowisko;

    public void inicjuj1(){
        Scanner scanner = new Scanner(System.in);
        inicjuj();
        System.out.println("Wykrztałcenie: ");
        wykrztalcenie = scanner.nextLine();
        System.out.println("Stanowisko: ");
        stanowisko = scanner.nextLine();
    }

    public void drukuj1(){
        drukuj();
        System.out.println("Wykrztalceie: " + wykrztalcenie);
        System.out.println("Stanowisko: " + stanowisko);
    }
}


public class Main {
    public static void main(String[] args){

    kadra kadra1 = new kadra();
    kadra1.inicjuj1();
    kadra1.drukuj1();


    }
}
