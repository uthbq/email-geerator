import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ���� ���:");
        String firstName = scanner.nextLine();
        System.out.println("������� ���� �������:");
        String lastName = scanner.nextLine();
        Email email = new Email(firstName,lastName);
    }
}
