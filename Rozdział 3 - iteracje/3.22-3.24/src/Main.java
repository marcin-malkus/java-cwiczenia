import java.util.Arrays;

public class Main {
    public static void main(String[] args){


//3.22
        System.out.println("\n===========================================================================================");
        System.out.println("3.22 - Napisz program wyswietlajacy duze litery alfabetu od A do Z i od Z do A z wykorzystatiem petli for. \n");

        for(int i=1; i<=150; i++){
            System.out.print(Character.toChars(i));
        }
        System.out.println();


        for(int i=65; i<=90; i++){
            System.out.print(Character.toChars(i));
        }
        System.out.println();


        char znak;
        for(znak = 'A'; znak<='Z'; znak++){
            System.out.print(znak);
        }
        System.out.println();
        for(znak='Z';znak>='A';znak--){
            System.out.print(znak);
        }



//3.23
        System.out.println("\n===========================================================================================");
        System.out.println("3.23 - Napisz program wyswietlajacy duze litery alfabetu od A do Z i od Z do A z wykorzystatiem petli do...while. \n");

        znak = 'A';
        do{
            System.out.print(znak);
            znak++;
        }while(znak<='Z');

        System.out.println();

        znak = 'Z';
        do{

            System.out.print(znak);
            znak--;
        }while(znak>='A');


//3.24
        System.out.println("\n===========================================================================================");
        System.out.println("3.24 - Napisz program wyswietlajacy duze litery alfabetu od A do Z i od Z do A z wykorzystatiem petli while. \n");

        znak = 'A';
        while(znak<='Z'){
            if(znak<'Z'){
                System.out.print(znak +", ");
            }else System.out.print(znak +".");
            znak++;
        }
        System.out.println();

        znak = 'Z';
        while(znak>='A'){
            if(znak>'A'){
                System.out.print(znak + ", ");
            }else{
                System.out.print(znak +".");
            }
            znak--;
        }





    }
}
