
package Quis1_B_3101;


public class Mahasiswa extends Dosen {
    // Attribute
    int jmlNim_3101;
    int jmlIpk_3101;
    
    // Method
    public double totalNilaiMahasiswa(){
        System.out.println("Total Nilai  : " +((jmlNim_3101 * 3.27) - (jmlIpk_3101 * 3.27)) );
        return 0;
    }
    public void tampilDataMahasiswa(){
        System.out.println("Jumlah Nim " + jmlNim_3101);
        System.out.println("Jumlah Ipk " + jmlIpk_3101);
    }
    
}
