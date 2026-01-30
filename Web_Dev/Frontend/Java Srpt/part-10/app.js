let form=document.querySelector("form");
form.addEventListener("submit",function(event)
{
    event.preventDefault();
    let user=document.querySelector("#user");
    let pass=document.querySelector("#pass");
    console.log("Username=",user.value);
    console.log("Password=",pass.value);
})