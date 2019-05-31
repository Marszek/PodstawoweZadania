import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws InputMismatchException, IOException {
        Scanner scanner = new Scanner(System.in);
        Menu.mainMenu();
        int wybor = scanner.nextInt();
        switch (wybor) {
            case 1:
                Zadanie_1_1.poleProstokata();
                break;
            case 2:
                Zadanie_1_2.wyswietlPi();
                break;
            case 3:
                Zadanie_1_3.pierwiastekZPI();
                break;
            case 4:
                Zadanie_1_4.objetoscKuli();
                break;
            case 5:
                Zadanie_1_5.wynikDzieleniaBezReszty();
                break;
            case 6:
                Zadanie_1_6.resztaZDzielenia();
                break;
            default:
                System.out.println("Nie ma takiej wartosci do wyboru");
                break;

        }
    }
}

