function Animal(className) {
    this.className = className;
}
class Animal2 {

}
console.log(Animal2);

// add method to Animal prototype
Animal.prototype.getClass = function() {
    return 'Animal class is : ' + this.className;
};

function Dog(name) {
    this.name = name;
}

// save Animal.prototype in Dog.prototype
Dog.prototype = Object.create(Animal.prototype);
console.log(Dog.prototype);


// add constructor reference on Dog prototype
Dog.prototype.constructor = Dog;
console.log(Dog.prototype);
// add method to Dog prototype
Dog.prototype.getName = function() {
    return this.name;
}

// create dog object
var d = new Dog('Tommy');

// console.log(d); // show dog
// console.log(d.__proto__); // show Dog prototype