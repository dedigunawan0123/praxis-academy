/*
Program     : CRC Inventory
Modul       : Class Barang
Authors     : Dedi Gunawan
Date        : 4 December 2019
Programming : Java
*/

package latCRCInventory;

public class Barang{

    // attribute
    String strKodeBarang;
    String strNamaBarang;
    String strKodeSupplier;
    int intStockBarang;

    // pembuatan constructor
    public void Barang(){
        strKodeBarang = "";
        strNamaBarang = "";
        strKodeSupplier = "";
        intStockBarang = 0;
    }

    public void Barang(String pstrKodeBarang, String pstrNamaBarang, String pstrKodeSupplier, int pintStockBarang){
        strKodeBarang = pstrKodeBarang;
        strNamaBarang = pstrNamaBarang;
        strKodeSupplier = pstrKodeSupplier;
        intStockBarang = pintStockBarang;
    }

    public void addBarang(String pstrKodeBarang, String pstrNamaBarang, String pstrKodeSupplier, int pintStockBarang){
        System.out.println("Ini adalah proses add Barang.");
        System.out.println("Barang berhasil ditambahkan... !!");
    }

    public void showOneBarang(String pstrKodeBarang){
        System.out.println("Ini adalah proses menampilkan 1 buah barang berdasarkan kode barang.");
        System.out.println("Barang terdapat di database .. !!");
    }

    public void showBarang(){
        System.out.println("Ini adalah proses menampilkan seluruh barang.");
        System.out.println("Semua Barang berhasil ditampilkan");
    }

    public void deleteBarang(){
        System.out.println("Ini adalah proses delete Barang.");
        System.out.println("Barang berhasil di delete di database.. !!");
    }

    public void updateBarang(String pstrKodeBarang, String pstrNamaBarang, String pstrKodeSupplier, int pintStockBarang){
       System.out.println("Ini adalah proses update Barang.");
       System.out.println("Barang berhasil di delete di database.. !!");
    }





}