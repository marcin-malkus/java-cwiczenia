public class Main {
    public static void main(String[] args){

//4.12
        System.out.println("\n===========================================================================================");
        System.out.println("4.12 - Posortuj roznaco  liczby uzywajac sortowania babelkowego. \n");

        int[] liczby = new int[6];

        int x, i, j;

        liczby[0] = 574;
        liczby[1] = 303;
        liczby[2] = 34;
        liczby[3] = 125;
        liczby[4] = 8;
        liczby[5] = 23;

        System.out.println("Dane sa liczby: ");
        for(i=0;i<=5; i++){
            System.out.print(liczby[i] + ", " );
        }

        for(i=1; i<=5; i++){
            for(j=5; j>=i; j--){
                if(liczby[j-1] > liczby[j]){
                    x = liczby[j-1];
                    liczby[j-1] = liczby[j];
                    liczby[j] = x;
                }
            }
        }

        System.out.println("\nLiczby po sortowaniu: ");
        for(i=0; i<=5; i++){
            System.out.print(liczby[i] + ", ");
        }

    }
}
