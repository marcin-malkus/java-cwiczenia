public class Main {
    public static void main(String[] args){

//4.1
        System.out.println("\n===========================================================================================");
        System.out.println("4.1 - Napisz program, ktory w 10-elementowej tablicy jednowymiarowej o nazwie dane " +
                "umieszcza liczby od 0 do 9. \n");

        int n = 10;
        int[] dane = new int[n];

        for(int i=0;i<dane.length;i++){
            dane[i] = i;
            System.out.println("dane[" + i + "]= " + dane[i]);
        }


//4.2
        System.out.println("\n===========================================================================================");
        System.out.println("4.2 - Napisz program, ktory w 10-elementowej tablicy jednowymiarowej o nazwie dane " +
                "umieszcza liczby od 9 do 0. \n");

        for(int i=0; i< dane.length;i++){
            dane[i] = n-1-i;
            System.out.println("dane[" + i + "] = " + dane[i]);
        }

    }
}
