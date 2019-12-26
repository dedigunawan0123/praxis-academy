const bar = () => {
    console.log('bar');
}

const baz = () => {
    console.log('baz');
}

const foo = () => {
    console.log('foo');
    setTimeout(bar, 0);
    // dg. Karena ada proses setTimeout, proses
    // baz, akan diproses langsung, tanpa menunggu,
    // jadi ada kemungkinan pada console.log, tampilan
    // baz, akan lebih dulu dibanding tampilan bar
    baz();
}

foo();