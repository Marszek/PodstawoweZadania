import java.util.Scanner;
import java.util.InputMismatchException;
public class Zadanie_1_1 {
    public static void poleProstokata()throws InputMismatchException{

        Scanner scan= new Scanner(System.in);
        double a,b,pole;
        try {
            System.out.print("Podaj a: ");
            a = scan.nextDouble();
            while(a<=0) {
                System.out.println("Podales bledna wartosc boku \n Podaj a:");
                a = scan.nextDouble();
            }
            System.out.print("Podaj b: ");
            b = scan.nextDouble();
            while(b<=0) {
                System.out.println("Podales bledna wartosc boku \n Podaj b:");
                b = scan.nextDouble();
            }
            pole = a * b;
            System.out.println("Pole trojkata wynosi: " + pole);
        }catch(InputMismatchException ime){
            System.out.println("Podałeś niewłaściwe dane. Podaj je jeszcze raz");
            poleProstokata();
        }

    }
}
