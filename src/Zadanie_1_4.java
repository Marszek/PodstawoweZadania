import java.util.InputMismatchException;
import java.util.Scanner;
public class Zadanie_1_4 {
    public static void objetoscKuli()throws InputMismatchException {
        Scanner scanner= new Scanner(System.in);
        double r=0;
        System.out.println("Podaj promien: ");
        try{
        r=scanner.nextDouble();
        if(r<=0) {
            System.out.println("Promien musi byc dodatni.");
        }
        else{
            double objetosc= (4/3)*(Math.PI)*(Math.pow(r,3));
            System.out.printf("Objetosc kuli to: "+"%4.2f",objetosc);
        }
        }catch(InputMismatchException ime){
            System.out.println("Nie podałeś liczby");
            objetoscKuli();
        }

    }
}
