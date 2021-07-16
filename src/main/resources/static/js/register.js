let username_field;  

    
let password_field;  


let character_field;  


let race_field;  


let skin_field;  


let hair_field;  


let eye_field;  


let copilot_field;

let planet_field;

let starship_field;




function setUser() {

    
    username_field = document.querySelector('#username').value;



    
    
    password_field = document.querySelector('#password').value;



    character_field = document.querySelector('#character').value;



    race_field = document.querySelector('#race').value;



    skin_field = document.querySelector('#skinColor').value;



    hair_field = document.querySelector('#hairColor').value;



    eye_field = document.querySelector('#eyeColor').value;



    copilot_field = document.querySelector('#copilot').value;

    
    planet_field= document.querySelector('#planet').value;

    starship_field= document.querySelector('#starship').value;
}


window.onload = function() {
    console.log("register.js is loaded")
    // capture the button element and add an event listener
   
    document.getElementById('login-btn').addEventListener("click", setUser);
    document.getElementById('login-btn').addEventListener("click", printUsertoConsole);
    document.getElementById('login-btn').addEventListener("click", registerUser);
}

function printUsertoConsole(){
   
    
    let user = {
        username: username_field,
    
        
             pass: password_field,
    
        
             name: character_field,
    
        
             race: race_field,
    
        
             skinColor: skin_field,
    
        
             hairColor: hair_field,
    
        
             eyeColor: eye_field,
    
        
             copilot: copilot_field,

            starship: starship_field,

            model: "YT-1300 light freighter",

            credits: 0,

            bounty: 0,

            planet: planet_field


    }

    let json_str = JSON.stringify(user)

    console.log(json_str)
}

function registerUser() {

    let user = {
        username: username_field,
    
        
             pass: password_field,
    
        
             name: character_field,
    
        
             race: race_field,
    
        
             skinColor: skin_field,
    
        
             hairColor: hair_field,
    
        
             eyeColor: eye_field,
    
        
             copilot: copilot_field,

             starship: starship_field,
 
             model: "YT-1300 light freighter",
 
             credits: 0,
 
             bounty: 0,
 
             planet: planet_field
    }

   if(!!starship_field){

    let json_str = JSON.stringify(user)
    
    // fetch requires 1 param -> url from which we are retrieving data
    fetch(`http://localhost:8080/users/add`, {
        method: 'POST', // or 'PUT'
        headers: {
            'Content-Type':'application/json',
        },
        body: json_str,}) // fetch returns a PROMISE which is a obj that produces a single value at some point in the furture
    .then((res) =>{
        if(res.ok){
            console.log("Success")
            location.replace('login.html')
        }else{
            console.log('Error')
            alert("Invalid input")
        }
    }) 
    
    }
  
}