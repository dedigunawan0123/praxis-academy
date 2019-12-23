var mike = { name: 'Mike' };
var odd = [1];
var morning = function() { return "Greetings!"; };
morning.info = 'Morning greeting function';

// re-assign to new variables
var evening = morning;
var john = mike;
var even = odd;

// reassign to new variable and modify value
var kate = mike;
kate = { name: 'Kate' };
console.log(mike);
console.log(john);
// modify properties
evening.info = 'Evening greeting function';
john.name = 'John';
even[0] = 1;
console.log(mike);
console.log(john);
console.log('first ==> ', morning.info, mike, odd);
console.log('second ==> ', evening.info, john, even);