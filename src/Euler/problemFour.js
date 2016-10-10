// A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
// Find the largest palindrome made from the product of two 3-digit numbers.

//https://projecteuler.net/problem=4

//100 to 999 are all the 3 digit numbers
var start = 100;
var end = 999;
console.time();

var caughtFishes = [];

for (var i = start; i <= end; i++)
{
  if (i%10 !== 0)
  {
    for (var n = start; n <= end; n++)
    {
        if (isPalindrome(i*n)){
          caughtFishes.push(i*n);
        }
    }
  }


}
console.timeEnd();
console.log("Done!");

function isPalindrome(num){

  if (num == reverse(num)){

    return true;
  }
  else
  {
    return false;

  }
}

function reverse(num)
{
  var newString = "";
  var reversedString = "";

  newString = toString(num);


  for (var i = 0; i < newString.length; i++)
  {
    reversedString = newString.substring(i,i+1) + reversedString;
  }
  return reversedString;
}

function toString(num)
{
  var stringVer = "";
  stringVer = num.toString();

  return stringVer;
}

function printArray(){
  
}
// if (33 == "33")
// {
//   console.log("Boo.");
// }
