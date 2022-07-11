

public class Main {
    public static void main(String[] args){

//  3.7
        System.out.println("==========================================================================================");
        System.out.println("3.7 - Napisz program, ktory przy uzyciu instrukcji for sumuje liczby od 1 do 100");
        int suma = 0;

        for(int i=1;i<=100;i++){
            suma =  suma + i;   //  suma+=i;
            //System.out.println(suma);
        }
        System.out.println(suma);


//  3.8
        System.out.println("===========================================================================================");
        System.out.println("3.8 - Napisz program, ktory przy uzyciu instrukcji do...while sumuje liczby od 1 do 100");
        int i = 1;
        suma = 0;

        do{
            suma += i;
            i++;
        } while (i<=100);
        System.out.println(suma);


//  3.9
        System.out.println("===========================================================================================");
        System.out.println("3.9 - Napisz program, ktory przy uzyciu instrukcji while sumuje liczby od 1 do 100");
        i=1;
        suma = 0;

        while(i<=100){
            suma += i;
            i++;
        }
        System.out.println(suma);


//  3.10
        System.out.println("===========================================================================================");
        System.out.println("3.10 - Napisz program, ktory za pomoca instrukcji for sumuje liczby parzyste od 1 do 100.");
        suma = 0;

        for(i=1;i<=100;i++) {
            if (i%2 == 0) {
                suma += i;
            }
        }
        System.out.println(suma);


//  3.11
        System.out.println("===========================================================================================");
        System.out.println("3.11 - Napisz program, ktory za pomoca instrukcji do...while sumuje liczby parzyste od 1 do 100.");
        suma = 0;
        i=1;

        do{
            if(i%2==0){
                suma+=i;
            }
            i++;
        } while(i<=100);
        System.out.println(suma);


//  3.12
        System.out.println("===========================================================================================");
        System.out.println("3.12 - Napisz program, ktory za pomoca instrukcji while sumuje liczby parzyste od 1 do 100.");
        i=1;
        suma=0;

        while(i<=100){
            if(i%2==0) suma+=i;
            i++;
        }
        System.out.println("suma = " + suma);


//  3.13
        System.out.println("===========================================================================================");
        System.out.println("3.13 - Napisz program, ktory za pomoca instrukcji for sumuje liczby nieparzyste od 1 do 100.");

        i=1;
        suma=0;

        for(i=1;i<=100;i++){
            if(i%2!=0) suma += i;
        }
        System.out.println("suma = " + suma);



//  3.14
        System.out.println("===========================================================================================");
        System.out.println("3.14 - Napisz program, ktory za pomoca instrukcji do...while sumuje liczby nieparzyste od 1 do 100.");

        i=1;
        suma=0;

        do{
            if(i%2 != 0) suma +=i;
            i++;
        }while(i<=100);
        System.out.println(suma);



//  3.15
        System.out.println("===========================================================================================");
        System.out.println("3.15 - Napisz program, ktory za pomoca instrukcji while sumuje liczby nieparzyste od 1 do 100.");

        i=1;suma=0;while(i<=100){if(i%2!=0)suma+=i;i++;};System.out.println(suma);


    }
}
