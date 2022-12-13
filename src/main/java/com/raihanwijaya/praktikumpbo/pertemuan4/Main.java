
package com.raihanwijaya.praktikumpbo.pertemuan4;


public class Main {
     
    public static void main(String[] args) { 
        // Class object = new class 
        Mobil mb = new Mobil (); 
         
        mb.nama = "Nissan";         
        mb.jmlRoda= 4; 
         
        // Uji coba pemanggilan method 
        mb.showInfo(); 
        mb.belok("kanan");
        mb.belok();
                 
    }      
} 

    

