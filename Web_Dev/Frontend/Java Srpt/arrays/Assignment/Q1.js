//Q1
let a=[7,9,0,-2];
let n=3;
let print= a.splice(0,n);
console.log(print);
//Q2
let b=[7,9,0,-2];
let m=3;
let prInt= b.slice(b.length-m);
console.log(prInt);
//Q3
let c= prompt("Enter the string");
if(c.length==0){
    console.log("String is empty");
}
else{
    console.log("String is not empty");
}
//Q4
let d=["q","E","g","H","F"];
if(d[1]==d[1].toLowerCase()){
    console.log("Charaacter in given index is in lower case");
}
else{
    console.log("Charaacter in given index is not in lower case");
}
//Q5
