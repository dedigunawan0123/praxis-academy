/*
Program     : Inventory dengan menggunakan MongoDB dan Gradle
Modul       : Class Barang
Authors     : Dedi Gunawan
Date        : 16 December 2019
Programming : Java
*/

package latihanMongoDB;

import com.mongodb.reactivestreams.client.MongoClients;
import com.mongodb.reactivestreams.client.MongoClient;
import com.mongodb.reactivestreams.client.MongoDatabase;
import com.mongodb.reactivestreams.client.MongoCollection;
import com.mongodb.reactivestreams.client.*;

// import static tour.SubscriberHelpers.PrintDocumentSubscriber;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import org.bson.Document;

import java.util.Set;

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

        // Ini adalah untuk connection
        try{
            // MongoClient mongoClient = MongoClient.create("mongodb://localhost");
            MongoClient mongoClient = MongoClients.create("mongodb://localhost");
            MongoDatabase database = mongoClient.getDatabase("dbInventory");
            // Set<String> colls = database.getCollectionNames("Barang");
            MongoCollection<Document> collection = database.getCollection("Barang");
            subscriber = new PrintDocumentSubscriber();
            collection.find().subscribe(subscriber);
            subscriber.await();

            mongoClient.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }


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