// dg. Ini adalah class
var Circle = {
    phi: 3.14,
    area: function(radius) {
        return this.phi * Math.pow(this.radius, 2);
    }
}

var Triangle = {
    area: function(base, height) {
        return 0.5 * this.base * this.height;
    }
}

// dg. Ini adalah object
var circle = Object.create(Circle, {
    radius: { value: 5 },
});

var triangle = Object.create(Triangle, {
    base: { value: 4 },
    height: { value: 7 },
});

console.log(circle.area());
console.log(triangle.area());