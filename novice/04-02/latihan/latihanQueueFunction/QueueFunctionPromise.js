const bar = () => {
    console.log('bar');
}

const baz = () => {
    console.log('baz');
}

const foo = () => {
    console.log('foo');
    setTimeout(bar, 0);

    // dg. Promise ini akan dijalankan begitu setTimeout selesai
    // dilakukan, tidak perlu menunggu diakhir stack.
    new Promise((resolve, reject) => {
        resolve('Should be right after baz, before bar')
    }).then(resolve => console.log(resolve))
    baz()
}

foo();