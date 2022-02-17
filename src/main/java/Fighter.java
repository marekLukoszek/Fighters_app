import java.util.Scanner;

public class Fighter {
    String surname;
    String firstName;
    String style;
    String nationality;

    @Override
    public String toString() {
        return "Fighter{" +
                "surname='" + surname + '\'' +
                ", firstName='" + firstName + '\'' +
                ", style='" + style + '\'' +
                ", nationality='" + nationality + '\'' +
                '}';
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Fighter(String surname, String firstName, String style, String nationality) {
        this.surname = surname;
        this.firstName = firstName;
        this.style = style;
        this.nationality = nationality;
    }

    public Fighter() {
    }

    public Fighter getFighterName(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj nazwisko fightera");
        String newName = scan.nextLine();
        System.out.println("Podaj imię fightera");
        String newFirstName = scan.nextLine();
        System.out.println("Podaj styl bazowy fightera");
        String stringStyle = scan.nextLine();
        System.out.println("Podaj kraj pochodzenia fightera");
        String stringCountry = scan.nextLine();
        return new Fighter(newName, newFirstName, stringStyle, stringCountry);
    }
}
