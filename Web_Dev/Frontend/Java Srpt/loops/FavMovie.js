const favMovie="Avengers";
let guess=prompt("Guess my Fav. Movie");
while((guess!=favMovie)&&(guess!="quit"))
{
    guess=prompt("Wrong guess! Try again");
}
if(guess==favMovie){
    console.log("CONGRATULATIONS!!!  You guessed the right movie.");
}