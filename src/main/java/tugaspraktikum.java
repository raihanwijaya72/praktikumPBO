import java.util.Scanner;

public class tugaspraktikum {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int i;
        int log = 0;
        i = 1;
        String username, password;
        do{   
        System.out.println("-------------");
        System.out.println("|  Login    |");
        System.out.println("-------------");
        System.out.print("\nUsername ");
        username = input.nextLine ();
        password = input.nextLine();
        System.out.print("Password : ");
        password = input.nextLine();
        
        if(username.equals("Raihanwijaya")&&password.equals("Leo")) {
           System.out.println("\nSelamat Login Anada Berhasil\n");
           i = 4;
           log = 1;
        }else{
            System.out.println("\nMaaf Login Anda Gagal\n");
            i = i + 1;
            
        }
    }while(i<=3);
        if(log !=1){
            System.out.println("Anda Telah 3x Gagal Login");
            System.out.println("Anda Kami Blokir");
            
        }
        
    }
    
}
        
        
        
        
    
   
    

