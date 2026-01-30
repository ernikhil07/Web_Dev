let btn=document.querySelector("button");

btn.addEventListener("click",function(){
    let h3=document.querySelector("h3");
    let randomColour=generateColour()   ;
    h3.innerText=randomColour;

    let div=document.querySelector("div");
    div.style.background=randomColour;
})

function generateColour(){
    let red=Math.floor(Math.random() *255);
    let green=Math.floor(Math.random() *255);
    let blue=Math.floor(Math.random() *255);

    let colour=`rgb(${red},${green},${blue})`;
    return colour;
}