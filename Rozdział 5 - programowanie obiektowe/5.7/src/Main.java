import java.util.Scanner;

class fib
{
    public int oblicz(int n)
    {
        switch(n){
            case 0: return 0;
            case 1: return 1;
            default: return oblicz(n - 1) + oblicz(n - 2);
        }
    }
}






public class Main {
    public static void main(String[] args){


        int n, i;

        fib liczby = new fib();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Program oblicza n pierwszych liczb Fibonacciego, podaj n: ");
        n = scanner.nextInt();

        for(i=0; i<n; i++){

            System.out.println(liczby.oblicz(i));

        }



    }
}
