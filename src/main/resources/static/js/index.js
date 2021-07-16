
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
                    <input type="text" class="form-control" id="inputUsername" placeholder="Username">
                </div>
            </div>
            <div class="form-group row">
                <label for="inputPassword" class="col-sm-3 col-form-label">Password</label>
                <div class="col-sm-9">
                    <input type="password" class="form-control" id="inputPassword" placeholder="Password">
                </div>
            </div>
            <div class="row">
            <div class="col-sm-4" id="logBtn"></div>
            <button type="submit" class="btn col-sm-3" id="form-submit">Submit</button>
            <button type="button" class="btn col-sm-3" id="register-btn">Register</button>
            </div>
        </form>
    `;

    document.getElementById("register-btn").addEventListener("click",redirectRegister)

    function redirectRegister(){

        location.href = 'register.html';

    }

    document.getElementById("form-submit").addEventListener("click", login)
    function login() {

    let psd;    

    let data = {username : document.getElementById("inputUsername").value, pass : document.getElementById("inputPassword").value}
    console.log("username"+data.username)
    console.log("password"+data.password)
    fetch(`http://localhost:8080/users/${data.username}`)
        .then(res => {
            res.json()
        })
        .then(data1 =>{
            psd=data1.password;
            console.log(data1)
            
        })

        console.log("psd"+psd)

        if(psd===data.password){
            sessionStorage.setItem("username", document.getElementById("inputUsername").value)
            location.href= "planet.html";
        } else {
            console.log("Invalid")
        }     
            
}

    
}



