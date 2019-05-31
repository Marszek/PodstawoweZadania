import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Zadanie_1_6 {
    public static void resztaZDzielenia()throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            try {
            System.out.println("Podaj dzielnik: ");
            String IWyraz = bufferedReader.readLine();
            int a = Integer.parseInt(IWyraz);

            System.out.println("Podaj dzielną: ");
            String IIWyraz = bufferedReader.readLine();
            int b = Integer.parseInt(IIWyraz);

            int iloraz = b % a;
            System.out.println(iloraz);
            } catch(NumberFormatException nfe){
                System.out.println("Nie podales liczby"); }
        }catch(ArithmeticException ae){
            System.out.println("Nie dziel przez 0!");
        }

    }
}
