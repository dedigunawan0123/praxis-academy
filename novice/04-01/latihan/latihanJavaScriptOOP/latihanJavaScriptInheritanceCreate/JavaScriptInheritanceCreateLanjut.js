var x = {
    a: 1,
    m: function(c) {
        return this.a + this.b + c;
    }
};

// var y = Object.create(x, { b: { value: 2 } });
// var z = Object.create(y);

// console.log(y.m(10));
// console.log(z.m(20));
console.log(x.m(20));