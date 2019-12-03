/*
 Program    : Penjumlahan Matriks dengan Inputan dari user
 Authors    : Dedi Gunawan
 Date       : 3 Desember 2019
 Programming: Java 

*/

import java.util.Scanner;

public class MatriksInput{

    public static void main(String [] args){
        // ini adalah program penjumlahan matriks dengan inputan dari user
        
        int intOrdoMatriks1 = 0;
        int intOrdoMatriks2 = 0;
        int intOrdoMatriks3 = 0;

        // ini adalah inputan jumlah ordo

        Scanner reader = new Scanner(System.in);

        System.out.println("Masukan jumlah ordo matriks ke 1 : ");
        intOrdoMatriks1 = reader.nextInt();

        System.out.println("Masukan jumlah ordo matriks ke 2 : ");
        intOrdoMatriks2 = reader.nextInt();
        
        // Pengecekan ordo matriks ke 1 harus sama dengan ordo matriks ke 2
        if (intOrdoMatriks1 != intOrdoMatriks2){
            System.out.println("Ordo matriks ke 2 harus sama dengan ordo matriks ke 1 .. !");
        }
        else {
            
            intOrdoMatriks3 = intOrdoMatriks1;


            int[][] arrMatriks1 = new int[intOrdoMatriks1][intOrdoMatriks1];
            int[][] arrMatriks2 = new int[intOrdoMatriks2][intOrdoMatriks2];
            int[][] arrMatriks3 = new int[intOrdoMatriks3][intOrdoMatriks3];

            // ini adalah inputan untuk matriks 1 dari user

            for (int i=0; i< intOrdoMatriks1; i++){
                for (int j=0; j< intOrdoMatriks1 ; j++){
                    System.out.println("Masukkan nilai Matriks ke 1, baris ke " + (i + 1) + " kolom ke " + (j + 1) + " : ");
                    arrMatriks1[i][j] = reader.nextInt();
                }
            }

            // ini adalah inputan untuk matriks 2 dari user

            for (int i=0; i< intOrdoMatriks2 ; i++){
                for (int j=0; j< intOrdoMatriks2 ; j++){
                    System.out.println("Masukkan nilai Matriks ke 2, baris ke " + (i + 1) + " kolom ke " + (j + 1) + " : ");
                    arrMatriks2[i][j] = reader.nextInt();
                }
            }
            
            // Proses penjumlahan matriks. 

            for (int i=0; i< intOrdoMatriks3 ; i++){
                // ini pemrosesan baris dulu
                for (int j=0; j< intOrdoMatriks3 ; j++){
                    // ini pemrosesan kolom dulu
                    arrMatriks3[i][j] = arrMatriks1[i][j] + arrMatriks2[i][j];
                }
            }

            // Proses penampilan matriks

            String strTempTampilan = "";
            String strSpasi = "     ";
            int intLengthSpasi = 0;
            int intLengthAngka = 0;


            // Proses menampilkan isi matriks ke 1

            for (int i = 0; i < intOrdoMatriks1 ; i++){
                for (int j = 0; j < intOrdoMatriks1 ; j++){

                    intLengthAngka = Integer.toString( arrMatriks1[i][j]).length();
                    // System.out.println( Integer.toString( intLengthAngka ) );
                    if (intLengthAngka < strSpasi.length() ){
                        intLengthSpasi = strSpasi.length() - intLengthAngka;

                    } 

                    strTempTampilan = strTempTampilan + strSpasi + arrMatriks1[i][j];
                }
                System.out.println("| " + strTempTampilan + " |");

                strTempTampilan = "";
            }
            System.out.println(strSpasi);
            System.out.println("   +   ");

            // Proses menampilkan isi matriks ke 2

            for (int i = 0; i < intOrdoMatriks2 ; i++){
                for (int j = 0; j < intOrdoMatriks2 ; j++){

                    intLengthAngka = Integer.toString( arrMatriks2[i][j]).length();
                    // System.out.println( Integer.toString( intLengthAngka ) );
                    if (intLengthAngka < strSpasi.length() ){
                        intLengthSpasi = strSpasi.length() - intLengthAngka;

                    } 

                    strTempTampilan = strTempTampilan + strSpasi + arrMatriks2[i][j];
                }
                System.out.println("| " + strTempTampilan + " |");

                strTempTampilan = "";
            }
            System.out.println(strSpasi);
            System.out.println("   =   ");

            // Proses penampilan isi matriks hasil penjumlahan

            for (int i = 0; i < intOrdoMatriks3 ; i++){
                for (int j = 0; j < intOrdoMatriks3 ; j++){

                    intLengthAngka = Integer.toString( arrMatriks3[i][j]).length();
                    // System.out.println( Integer.toString( intLengthAngka ) );
                    if (intLengthAngka < strSpasi.length() ){
                        intLengthSpasi = strSpasi.length() - intLengthAngka;

                    } 

                    strTempTampilan = strTempTampilan + strSpasi + arrMatriks3[i][j];
                }
                System.out.println("| " + strTempTampilan + " |");

                strTempTampilan = "";
            }
        }

        reader.close();

    }

}