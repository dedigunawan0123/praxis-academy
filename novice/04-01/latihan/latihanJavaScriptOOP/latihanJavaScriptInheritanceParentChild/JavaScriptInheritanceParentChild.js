var parent = {
    hair: 'curly',
    eyes: 'blue',
};

var children = Object.create(parent);

console.log('Parent hair: ' + parent.hair + ', Parent eyes: ' + parent.eyes);
console.log('Children hair: ' + children.hair + ', Children eyes: ' + children.eyes + '\n');

// set parent hair to straight and see if children hair property is automatically changed
console.log('Set parent hair to straight \n')
parent.hair = 'straight';

console.log('Parent hair: ' + parent.hair + ', Parent eyes: ' + parent.eyes);
console.log('Children hair: ' + children.hair + ', Children eyes: ' + children.eyes + '\n');

// set children eyes to blue and see if parent hair property is unchanged
console.log('Set children eyes to green \n')
children.eyes = 'green';

console.log('Parent hair: ' + parent.hair + ', Parent eyes: ' + parent.eyes);
console.log('Children hair: ' + children.hair + ', Children eyes: ' + children.eyes);