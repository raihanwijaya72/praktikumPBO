
package Quis1_B_3101;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Dosen ds = new Dosen();
        Penduduk pd = new Penduduk();
        Mahasiswa mh = new Mahasiswa();
        
        ds.nik_3101 = "Jawa Barat";
        ds.nama_3101 = "Raihan";
        ds.umur_3101 = 40;
        ds.alamat_3101 = "Bandung";
        ds.jmlGolongan_3101 = 5000;
        ds.jmlGajiPokok_3101 = 50000;
        
        ds.nik_3101 = "Jawa Barat";
        ds.nama_3101 = "Rakha";
        ds.umur_3101 = 40;
        ds.alamat_3101 = "Bandung";
        ds.jmlGolongan_3101 = 5000;
        ds.jmlGajiPokok_3101 = 60000;
        
        ds.tampilDataPenduduk();
        ds.tampilDataDosen();
        ds.totalPendapatanDosen();
        
        mh.tampilDataPenduduk();
        mh.tampilDataMahasiswa();
        mh.totalNilaiMahasiswa();
    }
}





    
    

