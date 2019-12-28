// dg. Ini betul karena try ada didalam block fungsi setTimeout

setTimeout(function() {
    try {
        noSuchVariable; // try..catch handles the error!
    } catch {
        console.log("error is caught here!");
    }
}, 1000);