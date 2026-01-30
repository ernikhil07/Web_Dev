//Q1
let arr=[10,60,80,70,30,2];

let square= arr.map((el)=>
{
    return el*el;
})
let sum=arr.reduce((no,el)=>(no+el));
let avg=sum/arr.length;

//Q2
let arr2=[1,2,3,4,5];
let summ=arr2.map((el)=>(el+5));