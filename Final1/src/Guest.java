import java.util.Scanner;

public class Guest {
    Blog_Info info= new Blog_Info();
    Scanner scanner = new Scanner(System.in);
    void menu(){
        while (true){
            System.out.println("1.View");
            System.out.println("2.Logout");
            System.out.println("Enter Your Choice: ");
            int ch=scanner.nextInt();
            if(ch==1){
                info.view();
            }else if(ch==2){
                return;
            }else System.out.println("Invalid choice");
        }
    }
}
