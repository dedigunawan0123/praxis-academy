/*
Program     : CRC Inventory
Modul       : Class Pengadaan
Authors     : Dedi Gunawan
Date        : 4 December 2019
Programming : Java
*/

package latCRCInventory;

import java.util.Date;

public class Pengadaan{

    // attribute
    String strKodePengadaan;
    Date dateTanggalPengadaan;
    String strKodeBarang;
    String strKodeSupplier;
    int intJumlahPengadaan;

    Date dateSekarang = new Date();

    // pembuatan constructor
    public void Pengadaan(){
        dateSekarang = new Date();
        strKodePengadaan = "";
        dateTanggalPengadaan = dateSekarang;
        strKodeBarang = "";
        strKodeSupplier = "";
        intJumlahPengadaan = 0;
    }

    public void Pengadaan(String pstrKodePengadaan, Date pdateTanggalPengadaan, String pstrKodeBarang, String pstrKodeSupplier, int pintJumlahPengadaan ){
        strKodePengadaan = pstrKodePengadaan;
        dateTanggalPengadaan = pdateTanggalPengadaan;
        strKodeBarang = pstrKodeBarang;
        strKodeSupplier = pstrKodeSupplier;
        intJumlahPengadaan = pintJumlahPengadaan;
    }

    public void addPengadaan(String pstrKodePengadaan, Date pdateTanggalPengadaan, String pstrKodeBarang, String pstrKodeSupplier, int pintJumlahPengadaan){
        System.out.println("Ini adalah proses add Pengadaan.");
        System.out.println("Pengadaan berhasil ditambahkan... !!");
    }

    public void showOnePengadaan(String pstrKodePengadaan){
        System.out.println("Ini adalah proses menampilkan 1 buah Pengadaan berdasarkan kode Pengadaan.");
        System.out.println("Pengadaan terdapat di database .. !!");
    }

    public void showPengadaan(){
        System.out.println("Ini adalah proses menampilkan seluruh Pengadaan.");
        System.out.println("Semua Pengadaan berhasil ditampilkan");
    }

    public void deletePengadaan(){
        System.out.println("Ini adalah proses delete Pengadaan.");
        System.out.println("Pengadaan berhasil di delete di database.. !!");
    }

    public void updatePengadaan(String pstrKodePengadaan, Date pdateTanggalPengadaan, String pstrKodeBarang, String pstrKodeSupplier, int pintJumlahPengadaan){
       System.out.println("Ini adalah proses update Pengadaan.");
       System.out.println("Pengadaan berhasil di delete di database.. !!");
    }

}