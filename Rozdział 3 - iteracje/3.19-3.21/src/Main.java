public class Main {
    public static void main(String[] args){


//3.19
        System.out.println("\n===========================================================================================");
        System.out.println("3.19 - Napisz program wyswietlajacy tabliczke mnozenia dla liczb od 1 do 100" +
                " z wykorzystaniem podwójnej petli for.\n");

        for(int i=1; i<=10; i++){
            for(int j=1; j<=10;j++){
                System.out.print(i*(j)+ "\t");
            }
            System.out.println();
        }


//3.20
        System.out.println("\n===========================================================================================");
        System.out.println("3.20 - Napisz program wyswietlajacy tabliczke mnozenia dla liczb od 1 do 100" +
                " z wykorzystaniem podwójnej petli do...while.\n");

        int wiersze = 1;
        int kolumny = 1;


        do {
            do {
                System.out.print(wiersze * kolumny + "\t");
                wiersze++;
            } while (wiersze <= 10);
            kolumny++;
            wiersze = 1;
            System.out.println();
        }while(kolumny<=10);


//3.21
        System.out.println("\n===========================================================================================");
        System.out.println("3.21 - Napisz program wyswietlajacy tabliczke mnozenia dla liczb od 1 do 100" +
                " z wykorzydwójnej petlistaniem po while.\n");

        wiersze = 1;
        kolumny = 1;

        while(kolumny<=10){
            while(wiersze<=10){
                System.out.print(wiersze*kolumny + "\t");
                wiersze++;
            }
            System.out.println();
            kolumny++;
            wiersze=1;
        }


    }
}
