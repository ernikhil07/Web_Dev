const express=require("express");
const app=express();
let port=8080;

app.set("view engine","ejs");

app.get("/ig/:username",(req,res)=>
{
    const followers=["adam","bob","steve","john"];
    let {username}=req.params;
    res.render("instagram.ejs",{username,followers});
})
app.listen(port,()=>
{
    console.log(`listning on port:${port}`);
});
