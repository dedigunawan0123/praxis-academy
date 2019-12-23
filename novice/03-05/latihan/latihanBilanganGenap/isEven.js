function isEven(x) {
    if (x < 0) {
        return null;
    } else if (x == 0) {
        return true;
    } else if (x == 1) {
        return false;
    } else if (x % 2 == 0) {
        return true;
    } else if (x % 2 != 0) {
        return false;
    }
}

// Your code here.

console.log(isEven(50));
// → true
console.log(isEven(75));
// → false
console.log(isEven(-1));
// → ??