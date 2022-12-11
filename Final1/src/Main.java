import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User_Info user_info = new User_Info();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter username: ");
            String name = scanner.nextLine();
            if(name.equals("exit"))return;
            System.out.println("Enter Password: ");
            String pass = scanner.nextLine();
            user_info.login(name, pass);
        }
    }
}