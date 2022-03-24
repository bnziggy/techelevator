function sayHello() {
    console.log('Hello');
}

function sayGoodbye() {
    console.log('Goodbye');
}

function saySomething(sayFunction) {
    sayFunction();
}

saySomething(sayHello);
saySomething(sayGoodbye);

let nums = [1,2,3];
nums.forEach(value => {console.log(value)});
nums.forEach(sayHello);

let people = [
    {
        fName: "Brett",
        lName: "Ziegler"
    },
    {
        fName: "Ding",
        lName: "Dong"
    }
];

let peopleStrs = [];
people.forEach(value => {
    let peoppleStr = `${value.lName}, ${value.fName}`;
    peopleStrs.push(peoppleStr);
});
console.log(peopleStrs);