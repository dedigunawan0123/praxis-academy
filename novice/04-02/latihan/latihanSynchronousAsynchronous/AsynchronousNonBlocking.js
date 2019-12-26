var fs = require('fs');
fs.readFile('file.txt', 'utf8', function(err, data) {
    // dg. Proses didalam tanda kurung {} hanya akan diproses
    // bila proses pembacaan file telah selesai
    // called at a later time when the results are in
    console.log(data)
});
// dg. Proses di bawah ini akan diproses langsung tanpa menunggu
// proses pembacaan file selesai.
// readFile returns immediately and this line is reached right away