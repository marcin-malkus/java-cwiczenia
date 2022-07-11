
//      Napisz program, ktory za pomoca instrukcji for dla danych wartosci x zmieniajacych sie od 0 do 10 oblicza wartosc funkcji y=3x.

public class Main {
    public static void main(String[] args){

        System.out.println("\n3.1 - Napisz program, ktory za pomoca instrukcji for dla danych wartosci x zmieniajacych sie od 0 do 10 oblicza wartosc funkcji y=3x.");
        int x;
        int y;
        for(x=0; x<=10; x++){
            y=3*x;
            System.out.println("x=" + x + "   y=" +y);
        }
        /*          mozna tez tak
        System.out.println();
        x=0;

        for(int i=0;i<=10;i++){
            y=3*x;
            System.out.println("x=" + x + "   y=" +y);
            x++;
        }
       */
        System.out.println("========================================");

        System.out.println("\n3.2 - Napisz program, ktory za pomoca instrukcji do..while dla danych wartosci x zmieniajacych sie od 0 do 10 oblicza wartosc funkcji y=3x.");
        x = 0;
        //int y;
        do{
            y=3*x;
            System.out.println("x="+x+"   y="+y);
            x++;
        } while(x<=10);
        System.out.println("========================================");

        System.out.println("\n3.3 - Napisz program, ktory za pomoca instrukcji while dla danych wartosci x zmieniajacych sie od 0 do 10 oblicza wartosc funkcji y=3x.");
        x = 0;
        //int y;
        while(x<=10){
            y=3*x;
            System.out.println("x= " + x + "  y= " + y);
            x++;
        }

    }
}
