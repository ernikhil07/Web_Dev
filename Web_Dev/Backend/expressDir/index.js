const express=require("express");
const app=express();

let port=3000;

app.listen(port,()=>
{
    console.log("App is listning on port:",port);
});

// app.use((req,res)=>
// {
//     console.log("Request recived");
//     res.send("This is the basic response");
// });

app.get("/",(req,res)=>{
    res.send("welcome to root path");
});
// app.get("/apple",(req,res)=>
// {
//     res.send("you connected to apple path");
// });
// app.get("/orange",(req,res)=>
// {
//     res.send("You connected to orange path");
// });
// app.get("*",(req,res)=>
// {
//     res.send("path not found");
// });
// app.post("/",(req,res)=>
// {
//     res.send("You sent a post req to root");
// });

//PATH PARAMATERS
// app.get("/:username/:id",(req,res)=>
// {
//     let {username,id}=req.params;
//     res.send(`welcome @${username}`);
// })

//QUERY STRING
app.get("/search",(req,res)=>
{
    let{q}=req.query;
    res.send(`search result is:${q}`);
    if(!q)
    {
        res.send("nothing searches")
    }
});