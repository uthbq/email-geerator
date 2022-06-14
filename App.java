import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("¬ведите ¬аше им€:");
        String firstName = scanner.nextLine();
        System.out.println("¬ведите ¬ашу фамилию:");
        String lastName = scanner.nextLine();
        Email email = new Email(firstName,lastName);
    }
}
