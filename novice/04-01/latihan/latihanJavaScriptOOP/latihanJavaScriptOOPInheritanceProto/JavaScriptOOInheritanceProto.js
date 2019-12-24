var bird = {
    fly: true,
    color: 'brown',
};

var eagle = {};

// dg. Ini adalah cara melakukan inheritance melalui proto
eagle.__proto__ = bird;

console.log(eagle.fly);
console.log(eagle.color);