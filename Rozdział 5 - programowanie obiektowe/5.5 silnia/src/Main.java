// rekurencja
class silnia
{

    public long oblicz (int n)
    {
        long wynik = 1;
       if(n>=2)
        {
           wynik = n * oblicz(n-1);
        }
       return wynik;
    }

}


public class Main {
    public static void main(String[]args)
    {

        int n = 11;

        silnia silnia_1 = new silnia();
        silnia_1.oblicz(n);

        for(int i=0; i<=n; i++)
        {
            System.out.print(i+"! = " + silnia_1.oblicz(i));
            System.out.println();
        }



    }
}
