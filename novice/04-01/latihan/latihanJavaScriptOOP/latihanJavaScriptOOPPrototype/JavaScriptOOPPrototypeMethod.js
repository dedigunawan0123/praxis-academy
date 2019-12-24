function Animal(name) {
    this.name = name;
}

// add `getName` function to the prototype
Animal.prototype.getName = function() {
    return 'Animal name is => ' + this.name;
}

// add simple property on prototype
Animal.prototype.generation = '100';

var a = new Animal('Dog');


console.log('Animal.prototype ==> ', Animal.prototype); // log prototype
console.log('a.__proto__ ==> ', a.__proto__); // log prototype
console.log('Animal.prototype === a.__proto__ : ', Animal.prototype === a.__proto__); // check
console.log('a ==> ', a); // log object a
console.log('a.getName() ==> ', a.getName());
console.log('a.generation ==> ', a.generation);