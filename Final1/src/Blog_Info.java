import java.util.ArrayList;
import java.util.Scanner;

public class Blog_Info {
    Scanner scanner = new Scanner(System.in);
    static String[] tittle=new String[10];
    static String[] description=new String[10];
    static String[] date=new String[10];
    static String[] user_info=new String[10];
    static int i=0;
    static int k=0;

    static ArrayList<Integer> list = new ArrayList<>();
    void post(){
        System.out.println("Enter tittle: ");
        tittle[i]=scanner.nextLine();
        System.out.println("Enter Description: ");
        description[i]= scanner.nextLine();
        System.out.println("Enter date of post: ");
        date[i]=scanner.nextLine();
        System.out.println("Enter userinfo: ");
        user_info[i]=scanner.nextLine();
        i++;
    }
    void hide(String title){
        for(int j=0; j<i; j++){
            if(title.equals(tittle[j])){
                list.add(j);
                break;
            }
        }
    }
    void unHide(String title){
        for(int j=0; j<i; j++){
            if(title.equals(tittle[j])){
                if(list.contains(j)){
                    list.remove(j);
                }
            }
        }
    }
    static void view(){
        int l=0;
        if(i==0){
            System.out.println("No posts");
            return;
        }
        for(int j=0; j<i; j++){
            if(list.contains(j)){
                continue;
            }
            System.out.println("Tittle: "+tittle[j]);
            System.out.println(description[j]);
            System.out.println("Date: "+date[j]);
            System.out.println("Userinfo: "+user_info[j]);
        }
    }

}
