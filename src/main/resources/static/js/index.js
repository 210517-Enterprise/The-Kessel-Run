
// create form on button press
let loginBtn = document.getElementById('login-btn')

loginBtn.addEventListener("click", createForm);

function createForm() {
    let formDiv = document.getElementById('form-div');

    formDiv.innerHTML = `
        <form method="dialog" class="boot-form">
            <div class="form-group row">
                <label for="inputUsername" class="col-sm-3 col-form-label">Username</label>
                <div class="col-sm-9">
                    <input required type="text" class="form-control" id="inputUsername" placeholder="Username">
                </div>
            </div>
            <div class="form-group row">
                <label for="inputPassword" class="col-sm-3 col-form-label">Password</label>
                <div class="col-sm-9">
                    <input required type="password" class="form-control" id="inputPassword" style="font-family: Century Gothic, CenturyGothic, AppleGothic, sans-serif" placeholder="Password">
                </div>
            </div>
            <div class="row">
            <div class="col-sm-4" id="logBtn"></div>
            <button type="submit" class="btn col-sm-3" id="form-submit">Submit</button>
            <button type="button" class="btn col-sm-3" style="font-family: Century Gothic, CenturyGothic, AppleGothic, sans-serif" id="register-btn">Register</button>
            </div>
        </form>
    `;

    document.getElementById("register-btn").addEventListener("click",redirectRegister)

    function redirectRegister(){

        location.href = 'register.html';

    }

    document.getElementById("form-submit").addEventListener("click", login)
    function login() {

    var psd;    

    let data1 = {username : document.getElementById("inputUsername").value, pass : document.getElementById("inputPassword").value}
    console.log("username"+data1.username)
    console.log("password"+data1.pass)
    fetch(`http://localhost:8080/users/${data1.username}`)
        .then(resp => resp.json())
        .then(data =>{
            psd=data.pass;
            if(psd===data1.pass&&psd!=undefined){
                console.log("Logging in.")
                sessionStorage.setItem("isLoggedIn", true)
                sessionStorage.setItem("username", document.getElementById("inputUsername").value)
                location.href= "planet.html";
            } else {
                console.error("Invalid Login Credentials.")
                alert("Invalid Credentials")
            } 
        })           
            
    }

    
}



