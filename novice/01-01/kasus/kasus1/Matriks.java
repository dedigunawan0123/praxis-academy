public class Matriks{

    public static void main(String [] args){
        // ini adalah program penjumlahan matriks 3X3 dengan 3X3
        
        int intOrdoMatriks1 = 3;
        int intOrdoMatriks2 = 3;
        int intOrdoMatriks3 = 3;

        int[][] arrMatriks1 = new int[intOrdoMatriks1][intOrdoMatriks1];
        int[][] arrMatriks2 = new int[intOrdoMatriks2][intOrdoMatriks2];
        int[][] arrMatriks3 = new int[intOrdoMatriks3][intOrdoMatriks3];

        // ini adalah inputan untuk matriks 1
        arrMatriks1[0][0] = 1;
        arrMatriks1[0][1] = 2;
        arrMatriks1[0][2] = 3;

        arrMatriks1[1][0] = 4;
        arrMatriks1[1][1] = 5;
        arrMatriks1[1][2] = 6;

        arrMatriks1[2][0] = 7;
        arrMatriks1[2][1] = 8;
        arrMatriks1[2][2] = 9;

        // ini adalah inputan untuk matriks 2
        arrMatriks2[0][0] = 1;
        arrMatriks2[0][1] = 2;
        arrMatriks2[0][2] = 3;

        arrMatriks2[1][0] = 4;
        arrMatriks2[1][1] = 5;
        arrMatriks2[1][2] = 6;

        arrMatriks2[2][0] = 7;
        arrMatriks2[2][1] = 8;
        arrMatriks2[2][2] = 9;

        // Proses penjumlahan matriks. 

        for (int i=0; i<3; i++){
            // ini pemrosesan baris dulu
            for (int j=0; j<3; j++){
                // ini pemrosesan kolom dulu
                arrMatriks3[i][j] = arrMatriks1[i][j] + arrMatriks2[i][j];
            }
        }

        // Proses penampilan isi matriks hasil penjumlahan

        String strTempTampilan = "";
        String strSpasi = "     ";
        int intLengthSpasi = 0;
        int intLengthAngka = 0;

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){

                intLengthAngka = Integer.toString( arrMatriks3[i][j]).length();
                // System.out.println( Integer.toString( intLengthAngka ) );
                if (intLengthAngka < strSpasi.length() ){
                    intLengthSpasi = strSpasi.length() - intLengthAngka;
                    
                    while (intLengthSpasi > 0){
                        strSpasi = strSpasi + " ";
                        intLengthSpasi = intLengthSpasi - 1 ;
                    }
                } 

                strTempTampilan = strTempTampilan + strSpasi + arrMatriks3[i][j];
            }
            System.out.println(strTempTampilan);

            strTempTampilan = "";
        }

    }

}