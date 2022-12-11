public class User_Info {
    String[] name={"Admin","Blogger","Guest"};
    String[] email={"admin","blogger","guest"};
    String[] password={"admin","blogger","guest"};
    void login(String name,String pass){
        int index = 0;
        for(int i=0; i<email.length; i++){
            if(email[i].equals(name)){
                index=i;
                break;
            }
        }
        if(password[index].equals(pass)){
            if(index==0){
                System.out.println("Welcome Admin");
                Admin admin = new Admin();
                admin.menu();
            } else if (index==1) {
                Bloger bloger = new Bloger();
                bloger.menu();
            } else if (index==2) {
                Guest guest = new Guest();
                guest.menu();
            }
        }
    }
}
