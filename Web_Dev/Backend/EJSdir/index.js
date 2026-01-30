const express=require("express");
const app=express();

const port=8080;

app.set("view engine","ejs");

app.get("/",(req,res)=>
{
    res.render("home.ejs");
});
app.get("/rolldice",(req,res)=>
{
    let dicevalue=Math.floor(Math.random()*6 )+1;
    res.render("rolldice.ejs",{dicevalue})
})
app.listen(port,()=>
{
    console.log(`listning on port:${port}`);
});
