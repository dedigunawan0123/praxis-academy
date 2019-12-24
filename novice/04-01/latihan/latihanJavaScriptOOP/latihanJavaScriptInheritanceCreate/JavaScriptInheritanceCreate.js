var bird = {
    fly: true,
    color: 'brown',
};

var eagle = Object.create(bird);

console.log(eagle.fly);
console.log(eagle.color);