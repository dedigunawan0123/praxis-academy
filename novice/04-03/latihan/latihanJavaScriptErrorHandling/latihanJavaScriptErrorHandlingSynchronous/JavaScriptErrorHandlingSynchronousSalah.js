// dg. Ini salah dan tidak boleh dilakukan karena setTimeout akan membutuhkan
// waktu dan masih akan terus masih membutuhkan waktu untuk berjalan, sedangkan
// proses try catch nya sudah selesai.

try {
    setTimeout(function() {
        noSuchVariable; // script will die here
    }, 1000);
} catch (e) {
    console.log("won't work");
}