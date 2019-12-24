class User {
    constructor(name) {
        this.name = 'Anonymous';
    }


    sayHi() {
        console.log('Hello, ' + this.name);
    }
}

// penggunaan
new User().sayHi();

console.log(User.prototype.sayHi);
console.log(User.prototype.name);