function countChar(Kata, huruf) {
    var panjangKata = 0,
        kataSama = 0;
    panjangKata = panjangChar(Kata);
    if (panjangKata > 0) {
        for (i = 0; i < panjangKata; i++) {
            var isiKata = String(Kata).charAt(i);
            if (isiKata === huruf) {
                kataSama++;
            }
        }
        return kataSama;

    } else {
        // ini tidak ada kata yg di passing
        return 0;
    }
}

function countBs(Kata) {
    var nJumlahHuruf = 0;
    nJumlahHuruf = countChar(Kata, "B");
    return nJumlahHuruf;
}

function panjangChar(strKata) {
    var jumlahChar = String(strKata).length;
    return jumlahChar;
}

// Your code here.

console.log(countBs("BBC"));
// → 2
console.log(countChar("kakkerlak", "k"));
// → 4