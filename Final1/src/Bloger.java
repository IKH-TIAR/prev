import java.util.Scanner;

public class Bloger {
    Scanner scanner = new Scanner(System.in);
    String joiningDate="12-12-2022";
    Blog_Info info = new Blog_Info();
    void menu(){
        while (true){
            System.out.println("1.post");
            System.out.println("2.view");
            System.out.println("3.Logout");
            System.out.println("Enter Your choice: ");
            int choice=scanner.nextInt();
            if(choice==1){
                info.post();
            }else if(choice==2){
                info.view();
            } else if (choice==3) {
                return;
            }else System.out.println("Invalid choice");
        }
    }
}
