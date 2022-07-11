public class Main {
    public static void main(String[] args){

//4.3
        System.out.println("\n===========================================================================================");
        System.out.println("4.3 - Napisz program, ktory zadeklarowanej tablicy dwuwymiarowej 10x10 o nazwie macierz " +
                "umieszcza na przekątnej liczbe 1, a poza przekatna - 0. Dodatkowo program powinien obliczac sume elementow " +
                "wyroznionych w tablicy tj. tych znajdujacych sie na jej przekatnej. \n");

/*
        int tab[][] = new int[10][10];
        int suma = 0;
        for(int i=0;i< tab.length;i++){
            tab[i][i] = 1;
            suma+=tab[i][i];
        }
        System.out.println(suma);
*/
        int w, k;
        int suma=0;
        int n = 10;

        int tab[][] = new int[n][n];

        for(w=0;w< tab.length;w++){
            for(k=0;k< tab.length;k++){
                if(w==k) {
                    tab[w][k] = 1;
                    suma+=tab[w][k];
                }else{
                    tab[w][k] = 0;
                }
            }
        }

        for(w=0;w< tab.length;w++){
            for(k=0;k< tab.length;k++){
                System.out.print(tab[w][k] + " ");
            }
            System.out.println();
        }
        System.out.println("Suma elementow po przekatnej: " + suma);



//4.4
        System.out.println("\n===========================================================================================");
        System.out.println("4.4 - Napisz program, ktory zadeklarowanej tablicy dwuwymiarowej 10x10 o nazwie macierz " +
                "umieszcza na przekątnej liczby od 0 do 9, a poza przekatna - 0. Dodatkowo program powinien obliczac sume elementow " +
                "wyroznionych w tablicy tj. tych znajdujacych sie na jej przekatnej. \n");
        int i,j;
        suma=0;
        int macierz[][] = new int[n][n];

        for(i=0;i< macierz.length;i++){
            for(j=0;j< macierz.length;j++){
                if(i==j){
                    macierz[i][j] = i;
                    suma+=i;
                    }else{
                    macierz[i][j] = 0;
                }

            }
        }
        for(i=0;i< macierz.length;i++){
            for(j=0;j< macierz.length;j++){
                System.out.print(macierz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Suma liczb na przekatnej wynosi: " + suma);



//4.5
        System.out.println("\n===========================================================================================");
        System.out.println("4.5 - Napisz program, ktory zadeklarowanej tablicy dwuwymiarowej 10x10 o nazwie macierz " +
                "umieszcza liczby 1 i 0 zgodnie z przedstawiona w ksiazce interpretacja graficzna. " +
                "Dodatkowo program powinien obliczac sume elementow " +
                "wyroznionych w tablicy tj. tych znajdujacych sie na jej przekatnej. \n");

        suma=0;
        for(i=0;i< macierz.length;i++) {
            for (j = 0; j < macierz.length; j++) {
                if(i== macierz.length-j-1){
                    macierz[i][j] = 1;
                    suma+=macierz[i][j];
                }else{
                    macierz[i][j] = 0;
                }
            }
        }

        for(i=0;i< macierz.length;i++) {
            for (j = 0; j < macierz.length; j++) {
                System.out.print(macierz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Suma liczb na przekatnej: " + suma);


//4.6
        System.out.println("\n===========================================================================================");
        System.out.println("4.6 - Napisz program, ktory zadeklarowanej tablicy dwuwymiarowej 10x10 o nazwie macierz " +
                "umieszcza liczby od 0 do 9 zgodnie z przedstawiona w ksiazce interpretacja graficzna. " +
                "Dodatkowo program powinien obliczac sume wyroznionych elementow. \n");

        suma = 0;
        for(i=0; i< macierz.length; i++){
            for(j=0; j< macierz.length; j++){
                if(i== macierz.length-j-1) {
                    macierz[i][j] =i;
                    suma+=macierz[i][j];
                }
            }
        }

        for(i=0;i< macierz.length;i++) {
            for (j = 0; j < macierz.length; j++) {
                System.out.print(macierz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Suma liczb na przekatnej: " + suma);



//4.7
        System.out.println("\n===========================================================================================");
        System.out.println("4.7 - Napisz program, ktory zadeklarowanej tablicy dwuwymiarowej 10x10 o nazwie macierz " +
                "umieszcza w pierwszej kolumnie liczby od 0 do 9, w drugiej kwadraty tych liczb, natomiast w pozostałych kolumnach 0." +
                "Zgodnie z przedstawiona w ksiazce interpretacja graficzna. " +
                "Dodatkowo program powinien obliczac sume wyroznionych elementow. \n");
        suma=0;
        int suma2 = 0;
        for(i=0; i< macierz.length; i++){
            for(j=0; j<macierz.length; j++){
               if(j==0){
                   macierz[i][j] =i;
                   suma +=macierz[i][j];
               }else{
                   macierz[i][j] = 0;
               }
               if(j==1){
                   macierz[i][j] = i*i;
                   suma2 += macierz[i][j];
               }
            }
        }

        for(i=0;i< macierz.length;i++) {
            for (j = 0; j < macierz.length; j++) {
                System.out.print(macierz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Suma liczb w pierwszej kolumnie: " + suma);
        System.out.println("Suma liczb w drugiej kolumnie: " + suma2);


//4.8
        System.out.println("\n===========================================================================================");
        System.out.println("4.8 - Dane sa dwie tablice dwuwymiarowe 10x10 o nazwach a i b. Tablica a zawiera elementy przedstawione jak na obrazku w ksiazce." +
                "Tablica b zawiera same zera. Napisz program ktory przepisuje zawartosc tablicy a do tablicy b (intepretacja w ksiazce)," +
                " zamieniajac kolumny na wiersze. \n");

        n=10;
        int a[][] = new int[n][n];
        int b[][] = new int[n][n];

        //tablica a
        for(i=0; i<a.length;i++){
            for(j=0; j<a.length; j++){
                a[i][j] = j;
            }
        }
        //wyswietlanie tablicy a
        System.out.println("Tablica a:");
        for(i=0; i<a.length;i++) {
            for (j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        //tablica b
        for(i=0; i<b.length; i++){
            for(j=0; j<b.length; j++){
                b[i][j] = 0;
            }
        }
        //wyswietlanie tablicy b
        System.out.println("Tablica b:");
        for(i=0; i<a.length; i++){
            for(j=0; j<b.length; j++){
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

        // przepisanie wartosci a do b i zamiana kolumn na wiersze
        for(i=0; i<b.length; i++){
            for(j=0; j< b.length; j++){
                b[i][j] = a[j][i];
            }
        }

        //wyswietlanie tablicy b po zmianie
        System.out.println("Tablica b po zmianie:");
        for(i=0; i<a.length; i++){
            for(j=0; j<b.length; j++){
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
