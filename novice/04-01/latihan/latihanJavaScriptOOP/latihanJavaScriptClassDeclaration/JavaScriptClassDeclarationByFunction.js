// 1. Membuat function constructor
function User(name) {
    this.name = name;
}

// 2. Menambahkan method pada prototype
User.prototype.sayHi = function() {
    console.log(this.name);
}

// penggunaan
let user = new User("John");
user.sayHi();
console.log(User);