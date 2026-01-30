//Q1
// let arr=[6,8,3,4,93,4,7,2,4,9,5];

// const comp=function(n)
// {
//     for(let i=0;i<arr.length;i++)
//     {
//         if(n<arr[i])
//         {
//             console.log(arr[i]);
//         }
//     }
// }

// comp(2);

//Q2
// let str="abcdabcdefgggh";
// function getunique(str){
//     let ans=" ";
//     for(let i=0;i<str.length;i++)
//     {
//         let currchar=str[i]
//         if(ans.indexOf(currchar)==-1)
//         {
//             ans+=currchar;
//         }
//     }
//     return ans;
// }
// getunique(str);

//Q3
// let country=["Australia","Germany","United States of America"];
// let greatest=function(arr)
// {
//     let bigStr=country[0];
//     for(let i=1;i<country.length;i++)
//         {
//         let newStr=country[i];
//         if(bigStr.length<newStr.length)
//         {
//             bigStr=newStr;
//         }
//     }
//     return bigStr;
// }

// console.log(greatest(country));

//Q4
// let str="aeroplane";
// let vowelCount=function(str)
// {
//     let count=0;
//     for(let i=0;i<str.length;i++)
//     {
//         if(str[i]=="a"||str[i]=="e"||str[i]=="i"||str[i]=="o"||str[i]=="u")
//         {
//             count=count+1;
//         }
//     }
//     return count;
// }
// console.log(vowelCount(str));