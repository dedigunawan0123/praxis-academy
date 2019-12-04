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

    // pembuatan constructor
    public void Pengadaan(){
        strKodeBarang = "";
        strKodeSupplier = "";
    }

    public void Pengadaan(String pstrKodeBarang, String pstrKodeSupplier){
        strKodeBarang = pstrKodeBarang;
        strKodeSupplier = pstrKodeSupplier;
    }

    public void addPengadaan(String pstrKodePengadaan, String pstrKodeSupplier, String pstrNamaSupplier, String pstrAlamatSupplier, String pstrPhoneSupplier){
        System.out.println("Ini adalah proses add Supplier.");
        System.out.println("Supplier berhasil ditambahkan... !!");
    }

    public void showOneSupplier(String pstrKodeSupplier){
        System.out.println("Ini adalah proses menampilkan 1 buah Supplier berdasarkan kode Supplier.");
        System.out.println("Supplier terdapat di database .. !!");
    }

    public void showSupplier(){
        System.out.println("Ini adalah proses menampilkan seluruh Supplier.");
        System.out.println("Semua Supplier berhasil ditampilkan");
    }

    public void deleteSupplier(){
        System.out.println("Ini adalah proses delete Supplier.");
        System.out.println("Supplier berhasil di delete di database.. !!");
    }

    public void updateSupplier(String pstrKodeSupplier, String pstrNamaSupplier, String pstrAlamatSupplier, int pstrPhoneSupplier){
       System.out.println("Ini adalah proses update Supplier.");
       System.out.println("Supplier berhasil di delete di database.. !!");
    }

}