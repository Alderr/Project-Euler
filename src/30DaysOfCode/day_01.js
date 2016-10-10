//http://prnt.sc/crwtsy

var n = 11;
var double = 2.3;
var string = "HackerRank";

var inputNum = 0;
var inputDouble = 0.1;
var inputString = 0;

console.log("Lol.");

var readline = require('readline');

var getInt = function (){
  var rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
  });

  rl.question("Enter integer!\n", function (answer) {
    console.log("You wrote... " + answer);
    inputNum = answer;
    rl.close();
    getDouble();
  });


};

var getDouble = function (){
  var rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
  });

  rl.question("Enter double!\n", function (answer) {
    console.log("You wrote... " + answer);
    inputDouble = answer;
    rl.close();
    getString();
  });
};

var getString = function (){
  var rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
  });

  rl.question("Enter string!\n", function (answer) {
    console.log("You wrote... " + answer);
    inputString = answer;
    rl.close();
    printAll();
  });
};

getInt();

var printAll = function(){
  console.log((+inputNum + n));
  console.log((+inputDouble + double));
  console.log(inputString + string);
};
