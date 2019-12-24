function Foo() {
    this.a = 1;
    this.b = 2;
    this.c = function() {
        return this.a + this.b;
    }
}

var foo = new Foo();
console.log(foo.c());
console.log(foo);

function Bar() {
    this.a = 1;
    this.b = 2;
}

// dg. Kelebihan menggunakan prototype adalah lebih menghemat memory, karena pada contoh
// ini hanya 2 object, jadi cuman dibutuhkan 2 slot memory, sedangkan bila tidak
// menggunakan prototype, maka akan ada 3 object pada object Foo, sehingga membutuhkan
// 3 slot memory.
Bar.prototype.c = function() {
    return this.a + this.b;
}

var bar = new Bar();
console.log(bar.c());
console.log(bar);