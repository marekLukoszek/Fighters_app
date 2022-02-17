
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) throws SQLException {
        String answer = "4";
        DaoFighter daoFighter = new DaoFighter();
        while (!answer.equals("0")) {
            System.out.println("");
            System.out.println("Podaj co chcesz zrobić: ");
            System.out.println("1: Wylistuj bazę fighterów ");
            System.out.println("2: Dodaj fightera do bazy ");
            System.out.println("3: Usuń fightera z bazy ");
            System.out.println("0: Wyjście z programu ");
            Scanner scan = new Scanner(System.in);
            answer = scan.nextLine();
            if (answer.equals("1")) {
                daoFighter.getFighters();
            } else if (answer.equals("2")) {
                daoFighter.setFighter();
            } else if (answer.equals("3")) {
                daoFighter.deleteFighter();
            } else if (answer.equals("0")) {
                System.out.println("Do zobaczenia");
            } else {
                System.out.println("Niewłaściwy wybór...");
            }
        }
        daoFighter.close();
    }
}
