class matrix
{
    public void czytaj_dane(int rozmiar, double [][]macierz)
    {
        int i, j;

        for(i=0; i< macierz.length; i++)
        {
            for(j=0; j< macierz.length; j++)
            {
                if(i==j)
                {
                    macierz[i][j] =Math.floor(Math.random()*10);
                }else
                {
                    macierz[i][j] = 0;
                }
            }
        }
    }

    public void przetworz_dane(int rozmiar, double [][]macierz)
    {
        int i;
        double suma = 0;

        for(i=0; i<macierz.length; i++)
        {
            suma += macierz[i][i];
        }
        System.out.println("Suma na pezekatnej to: " + (int)suma);
    }

    public void wyswietl_wynik(int rozmiar, double [][]macierz)
    {
        int i, j;

        for(i=0; i< macierz.length; i++)
        {
            for(j=0; j< macierz.length; j++)
            {
                System.out.print((int)macierz[i][j] + " ");
            }
            System.out.println();
        }
    }

}

public class Main {
    public static void main(String[] args)
    {
        int rozmiar = 10;
        double [][]tablica = new double[rozmiar][rozmiar];
        matrix matrix1 = new matrix();

        matrix1.czytaj_dane(rozmiar, tablica);
        matrix1.przetworz_dane(rozmiar, tablica);
        matrix1.wyswietl_wynik(rozmiar, tablica);

    }
}
