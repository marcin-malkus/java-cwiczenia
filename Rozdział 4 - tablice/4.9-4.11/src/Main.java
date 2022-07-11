public class Main {
    public static void main(String[] args){

//4.9
        System.out.println("\n===========================================================================================");
        System.out.println("4.9 - Dane sa dwie macierze 10x10. Macierz a ma same 1, a macierz b same 2. Napisz program," +
                "ktory dodaje obie macierze i wyswietla na ekranie wynik dodawania c = a+ b. \n");


        int i, j;
        int n=10;
        int a[][] = new int[n][n];
        int b[][] = new int[n][n];
        int c[][] = new int[n][n];

        // ustawienie 1 w macierzy a
        for (i=0; i<a.length; i++){
            for(j=0; j<a.length; j++){
                a[i][j] = 1;
            }
        }
        // wyswietlenie macierzy a
        System.out.println("Macierz a:");
        for (i=0; i<a.length; i++) {
            for (j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }


        // ustawienie 2 w macierzy b
        for (i=0; i<b.length; i++){
            for(j=0; j<b.length; j++){
                b[i][j] = 2;
            }
        }
        // wyswietlenie macierzy b
        System.out.println("Macierz b:");
        for (i=0; i<b.length; i++) {
            for (j = 0; j < b.length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

        // ustawienie a+b w macierzy c
        for (i=0; i<c.length; i++){
            for(j=0; j<c.length; j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        // wyswietlenie macierzy c
        System.out.println("Macierz c = a+b :");
        for (i=0; i<c.length; i++) {
            for (j = 0; j < c.length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

//4.10
        System.out.println("\n===========================================================================================");
        System.out.println("4.10 - Dane sa dwie macierze 10x10. Macierz a ma same 1, a macierz b same 2. Napisz program," +
                "ktory odejmuje obie macierze i wyswietla na ekranie wynik odejmowania c = a - b. \n");

// macierze a i b ustawione w poprzednim zadaniu

        // ustawienie a-b w macierzy c
        for (i=0; i<c.length; i++){
            for(j=0; j<c.length; j++){
                c[i][j] = a[i][j] - b[i][j];
            }
        }
        // wyswietlenie macierzy c
        System.out.println("Macierz c = a-b :");
        for (i=0; i<c.length; i++) {
            for (j = 0; j < c.length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

//4.11
        System.out.println("\n===========================================================================================");
        System.out.println("4.11 - Dane sa dwie macierze 10x10. Macierz a ma same 1, a macierz b same 2. Napisz program," +
                "ktory mnozy obie macierze i wyswietla na ekranie wynik mnozenia c = a * b. \n");

        //wyzerowanie  macierzy c z poprzedniego zadania
        for (i=0; i<c.length; i++){
            for(j=0; j<c.length; j++){
                c[i][j] = 0;
            }
        }

        // ustawienie a*b w macierzy c
        for (i=0; i<c.length; i++){
            for(j=0; j<c.length; j++){
               for(int k=0; k<c.length; k++){
                   c[i][j] += a[i][k] * b[k][j];
               }
            }
        }
        // wyswietlenie macierzy c
        System.out.println("Macierz c = a*b :");
        for (i=0; i<c.length; i++) {
            for (j = 0; j < c.length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

    }
}
