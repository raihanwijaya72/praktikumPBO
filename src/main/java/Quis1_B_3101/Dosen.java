
package Quis1_B_3101;


public class Dosen extends Penduduk {

    // Attribute
    int jmlGolongan_3101;
    int jmlGajiPokok_3101;
    
    // Method
    public double totalPendapatanDosen(){
        System.out.println("Total Pendapatan  : " +((jmlGolongan_3101 * 5000) - (jmlGajiPokok_3101 * 500000)) );
        return 0;
    }
    public void tampilDataDosen(){
        System.out.println("Jumlah Golongan " + jmlGolongan_3101);
        System.out.println("Jumlah Gaji Pokok " + jmlGajiPokok_3101);
    }
}
   


    
