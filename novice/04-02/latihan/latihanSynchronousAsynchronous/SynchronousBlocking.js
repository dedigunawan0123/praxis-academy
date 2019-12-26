// dg. Ini adalah contoh metode synchonize, dimana proses
// berikutnya akan menunggu proses sebelumnya selesai.
var fs = require('fs');

var contents = fs.readFileSync('file.txt', 'utf8');
// dg. Baris di bawah hanya akan diproses, bila proses diatas selesai
// this line is not reached until the read results are in
console.log(contents);