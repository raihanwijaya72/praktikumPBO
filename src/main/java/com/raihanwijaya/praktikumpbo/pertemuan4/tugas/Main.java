
package com.raihanwijaya.praktikumpbo.pertemuan4.tugas;


public class Main {
    public static void main(String[]args) {
        Manajer mj = new Manajer();
        Kasir kr = new Kasir();
        Pelayan pn = new Pelayan();
        
        mj.jabatan ="Manager";
        mj.nama_karyawan="Raihan Wijaya";
        mj.id_karyawan= 1080802;
        mj.gaji_karyawan=" 20 Juta Rupiah";
        
        kr.jabatan ="Kasir";
        kr.nama_karyawan="Rendi Agung";
        kr.id_karyawan= 1031402;
        kr.gaji_karyawan=" 7 Juta Rupiah";
        
        pn.jabatan ="Pelayan";
        pn.nama_karyawan="Aziz Pebrian";
        pn.id_karyawan= 1022902;
        pn.gaji_karyawan=" 8 Juta Rupiah";
        
        mj.showInfo();
        mj.data(" Manajer adalah memanage staf yang ada");
        mj.jam();
        mj.jam(" sore");
        
        kr.showInfo();
        kr.data(" Kasir adalah melakukan transaksi kepada pelanggan atau pembeli");
        
        pn.showInfo();
        pn.data("Pelayan adalah melayani pelanggan dan juga menyajikan pesanan pembeli");
        
        
      }
    
}
