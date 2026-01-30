let todo=[];
let req=prompt("plese enter your request.");

while(true){
    if(req=="quit"){
        console.log("quitting app");
        break;
    }

    if(req=="list"){
        console.log("___________");
        for(task of todo){
            console.log(task);

        }
        console.log("___________");
    }
    else if(req=="add"){
        let task=prompt("plese enter the task you want to add");
        todo.push(task);
        console.log("task added");
    }
    else if(req=="delete"){
        let idx= prompt("Enter index of element you want to delete");
        todo.splice(idx,1);
    }
    
    req=prompt("plese enter your request.");

}