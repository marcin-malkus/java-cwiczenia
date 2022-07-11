import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

//4.14
        System.out.println("\n===========================================================================================");
        System.out.println("4.14 - Napisz program ktory sklada dwa lancuchy. \n");

        String a, b;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program składa dwa lancuchy.");
        System.out.print("Podaj pierwszy lancuch: ");
        a = scanner.nextLine();
        System.out.print("Podaj drugi lancuch: ");
        b = scanner.nextLine();

        System.out.println(a + " + " + b + " = " + a.concat(b));
        System.out.println(b + " + " + a + " = " + b.concat(a));

        if(a.equals(b)){
            System.out.println("Skladanie dwoch rownych lancuchow jest przemienne");
        }else{
            System.out.println("Skladanie dwoch roznych lancuchow nie jest przemienne.");
        }


    }
}
