import java.util.Scanner;

public class input {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Masukkan nama Anda: ");
    String nama = input.nextLine();

    System.out.println("Masukan usia:" );
    int usia = input.nextInt();
    
    System.out.println("Nama saya: " + nama);
    System.out.println("Usia saya: " + usia + "tahun");
  }
}
    
  
  

 
    