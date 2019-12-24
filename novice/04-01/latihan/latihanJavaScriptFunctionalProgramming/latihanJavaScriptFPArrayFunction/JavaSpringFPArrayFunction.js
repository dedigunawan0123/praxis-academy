let meetups = [
    { name: 'JS', isActive: true, member: 450 },
    { name: 'Angular', isActive: true, member: 900 },
    { name: 'Node', isActive: false, member: 900 }
]

// dg. Ini adalah pendekatan Imparative - yaitu dengan memfokuskan
// pada, bagaimana program beroperasi

let activeMeetups = [];
for (let i = 0; i < meetups.length; i++) {
    let m = meetups[i];
    if (m.isActive) {
        activeMeetups.push(m);
    }
}

console.log(activeMeetups);
// dg. Outputnya akan berupa 2 buah elemen yg isActive = true

// dg. Ini adalah pendekatan declarative, yaitu memfokuskan
// pada apa yg seharusnya program selesaikan

let activeMeetupsFP = [];
activeMeetupsFP = (meetups.filter((m) => {
    return m.isActive;
}))

console.log(activeMeetupsFP);