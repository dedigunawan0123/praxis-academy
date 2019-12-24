class User {
    constructor(name) {
        this.name = name;
    }

    sayHi() {
        console.log(this.name);
    }
}

// penggunaan
let user = new User("John");
user.sayHi();
console.log(typeof User);
console.log(User === User.prototype.constructor); // true
console.log(User.prototype.sayHi);
console.log(Object.getOwnPropertyNames(User.prototype));
console.log(User.prototype.constructor);
console.log(User);