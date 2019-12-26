const bar = () => {
    DOMException();
}

const baz = () => console.log('baz')

const foo = () => {
    console.log('foo');
    bar();
    baz();
}

function DOMException() {
    console.log('Ini adalah DOMException');
}

foo();
foo;