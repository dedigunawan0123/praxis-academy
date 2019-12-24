class User {
    name = "Anonymous";

    sayHi() {
        alert(`Hello, ${this.name}!`);
    }
}

new User().sayHi();

alert(User.prototype.sayHi); // placed in User.prototype
alert(User.prototype.name); // undefined, not placed in User.prototype