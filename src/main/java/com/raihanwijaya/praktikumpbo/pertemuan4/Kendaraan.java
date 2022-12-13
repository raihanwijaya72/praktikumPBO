
package com.raihanwijaya.praktikumpbo.pertemuan4;


public class Kendaraan {
    //atribute (Variable)     
    String nama;     
    int jmlRoda; 
     
    //Method
     
    public void nyalakanMesin(){ 
        System.out.println("Nama :" + nama+ "telah dinyalkan");     
    }      
    public void showInfo(){ 
        System.out.println(" nama   : "+ nama); 
        System.out.println(" jml roda : " + jmlRoda);         
        extraInfo(); 
    }      
    public void extraInfo() {} 
} 

    

