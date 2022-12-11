import java.util.Scanner;

public class Admin {
    Scanner scanner = new Scanner(System.in);
    Blog_Info info = new Blog_Info();
String atm="authority";
void menu() {
    while (true) {
        System.out.println("1.Post");
        System.out.println("2.Hide");
        System.out.println("3.Unhide");
        System.out.println("4.View");
        System.out.println("5.logout");
        int choice = scanner.nextInt();
        if (choice == 1) {
            info.post();
        } else if (choice == 2) {
            scanner.nextLine();
            System.out.println("Enter the tittle: ");
            String tittle = scanner.nextLine();
            info.hide(tittle);
        } else if (choice == 3) {
            scanner.nextLine();
            System.out.println("Enter the tittle: ");
            String tittle = scanner.nextLine();
            info.unHide(tittle);
        } else if (choice == 4) {
            info.view();
        } else if (choice==5) {
            return;
        } else System.out.println("Invalid Input");
    }
}
}

