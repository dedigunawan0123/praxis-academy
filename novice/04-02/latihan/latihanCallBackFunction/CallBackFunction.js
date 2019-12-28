console.log("Getting Data1");
getData('123', function(data1) {
    // dg. karena console log berada di dalam callback function,
    // maka, akan loncat pada kode berikutnya. `Tapi bila selesai
    // callback functionnya, baru console.log ini akan dilakukan.
    console.log("Data is:", data1);
});




console.log("Getting Data2");
getData('456', function(data1) {
    console.log("Data is:", data1);
});

// dg. Proses ini akan diproses langsung tanpa menunggu fungsi 
// getData selesai diproses.
var sum = 1 + 2;
console.log("sum is:", sum);