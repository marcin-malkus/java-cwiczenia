class sortowanie
{

    public void czytaj_dane(int [] liczby, int n)
    {
        int i;

        liczby[0] = 574;
        liczby[1] = 303;
        liczby[2] = 34;
        liczby[3] = 125;
        liczby[4] = 8;
        liczby[5] = 23;

        System.out.println("Dane sa liczby: ");
        for(i=0; i<n; i++)
        {
            System.out.print(liczby[i] + ", ");
        }
    }


    public void przetworz_dane(int [] liczby, int n)
    {
        int i, j, x;

        for(i=1; i<=n-1; i++){
            for(j=n-1; j>=i; j--){
                if(liczby[j-1] > liczby[j]){
                    x = liczby[j-1];
                    liczby[j-1] = liczby[j];
                    liczby[j] = x;
                }
            }
        }
    }

    public void wyswietl_wynik(int [] liczby, int n)
    {
        int i;
        System.out.println("\nLiczby posortowane: ");
        for(i=0; i<n; i++)
        {
            System.out.print(liczby[i] + ", ");
        }
    }

}




public class Main {
    public static void main(String[] args)
    {
        int n = 6;
        int [] liczby = new int[n];

        sortowanie sortowanie_1 = new sortowanie();

        sortowanie_1.czytaj_dane(liczby, n);
        sortowanie_1.przetworz_dane(liczby, n);
        sortowanie_1.wyswietl_wynik(liczby, n);
    }
}
