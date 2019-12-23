function pemasukanDataManualMatriks() {
    let Matriks1 = [
        [],
        [],
        []
    ];
    Matriks1[0][0] = 1;
    Matriks1[0][1] = 2;
    Matriks1[0][2] = 3;
    Matriks1[1][0] = 4;
    Matriks1[1][1] = 5;
    Matriks1[1][2] = 6;
    Matriks1[2][0] = 7;
    Matriks1[2][1] = 8;
    Matriks1[2][2] = 9;

    // penampilanDataMatriks(Matriks1, ordoMatriks1);
    for (i = 0; i < 3; i++) {
        for (j = 0; j < 3; j++) {
            console.log(i);
            console.log(j);
            console.log(Matriks1[i][j]);
        }
    }
}

function pemasukanDataMatriks(passMatriks, ordoPassMatriks, angkaAwal) {

    // Menginput isi Matriks1. Isi Matriks1 adalah berurutan dari mulai angka 1 sampai dengan 100
    var k = angkaAwal;
    for (i = 0; i < ordoPassMatriks; i++) {
        for (j = 0; j < ordoPassMatriks; j++) {
            passMatriks[[i][j]] = k;
            // console.log(k);
            // console.log(passMatriks[[i][j]]);
            k++;
        }
    }
    // penampilanDataMatriks(passMatriks, ordoPassMatriks);
}

function penampilanDataMatriks(passMatriks, ordoPassMatriks) {
    var tampilanBaris = "";
    for (i = 0; i < ordoPassMatriks; i++) {
        for (j = 0; j < ordoPassMatriks; j++) {
            console.log(i);
            console.log(j);
            console.log(passMatriks[[i][j]]);
            tampilanBaris = tampilanBaris + "   " + passMatriks[[i][j]];
            // console.log(tampilanBaris);
        }
        // console.log(tampilanBaris);
        tampilanBaris = "";
    }
}

function penambahanMatriks(passMatriks1, passMatriks2, passOrdeMatriksHasil) {
    for (i = 0; i < passOrdeMatriksHasil; i++) {
        for (j = 0; j < passOrdeMatriksHasil; j++) {
            MatriksHasil[[i][j]] = Matriks1[[i][j]] + Matriks2[[i][j]];
        }
    }
}

var ordoMatriks1 = 3,
    ordoMatriks2 = 3;
ordoMatriksHasil = ordoMatriks1;
var Matriks1 = new Array(ordoMatriks1, ordoMatriks1),
    Matriks2 = new Array(ordoMatriks2, ordoMatriks2),
    MatriksHasil = new Array(ordoMatriksHasil, ordoMatriksHasil);
// pemasukan data matriks1
// pemasukanDataMatriks(Matriks1, ordoMatriks1, 1);
pemasukanDataManualMatriks();

// for (i = 0; i < ordoMatriks1; i++) {
//     for (j = 0; j < ordoMatriks1; j++) {
//         console.log(i);
//         console.log(j);
//         console.log(Matriks1[[i][j]]);
// }


// pemasukan data matriks2
pemasukanDataMatriks(Matriks2, ordoMatriks2, 1);
// proses penambahan matriks1 + matriks2
penambahanMatriks(Matriks1, Matriks2, ordoMatriksHasil);
// penampilan Matriks1
// penampilanDataMatriks(Matriks1, ordoMatriks1);
// penampilan Matriks2
// penampilanDataMatriks(Matriks2, ordoMatriks2);
// penampilan Matriks Hasil
// penampilanDataMatriks(MatriksHasil, ordoMatriksHasil);