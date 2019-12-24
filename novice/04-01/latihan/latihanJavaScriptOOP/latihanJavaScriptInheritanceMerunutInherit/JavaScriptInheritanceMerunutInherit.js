function Animal(name) {
    this.name = name;
    this.generation = '101';
}

//__proto__ on Animal.prototype
console.log(Animal.prototype);

// constructor of prototype
// Ini harus dilihat pakai browser, kemudian Inspect Element dan liat di Console
console.log(Animal.prototype.constructor === Animal);