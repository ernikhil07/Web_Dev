const express=require("express");
const app=express();
let port=8080;

app.set("view engine","ejs");
app.use(express.static("public/css"));
app.use(express.static("public/java"))
app.get("/ig/:username",(req,res)=>
{
    let {username} =req.params;
    const instadata=require("./data.json");
    const data=instadata[username];
    if(data){
    res.render("instagram.ejs",{data});
    }
    else{
        res.render("error.ejs");
    }
})
app.listen(port,()=>
{
    console.log(`listning on port:${port}`);
});
