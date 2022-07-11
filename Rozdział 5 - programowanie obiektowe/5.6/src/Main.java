import java.util.Scanner;

class trojkatne
{
    public long oblicz(int n)
    {
        if(n==1)
        {
            return 1;
        }
        else {
            return n + oblicz(n - 1);
        }
    }

}




public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n, i;
        trojkatne liczby = new trojkatne();

        System.out.print("Program znajduje n pierwszych liczb trojkatnyc. Podaj n: ");
        n = scanner.nextInt();
        System.out.println("Liczba trojkatna: #" + n + " = " + liczby.oblicz(n));
        for(i=1; i<=n; i++)
        {
            System.out.println(i +"#" +  " = " + liczby.oblicz(i));
        }



    }
}
