
// create form on button press
let loginBtn = document.getElementById('login-btn')

loginBtn.addEventListener("click", createForm);

function createForm() {
    let formDiv = document.getElementById('form-div');

    formDiv.innerHTML = `
        <form class="boot-form">
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


    function redirectRegister(){

        location.href = 'register.html';

    }

    
}

document.getElementById("form-submit").addEventListener("click", login());

function login() {
  

    let data = {username : document.getElementById("inputUsername").nodeValue, password : doucment.getElementById("inputPassword").nodeValue}
    fetch(`http://localhost:8090/app/users/login`, {
        body: JSON.stringify(data),
        method: 'GET',
        header: {
            'Content-Type': 'application/json',
        }
        
    }).then(res => {
        if (res.ok) {
            console.log("success")
            window.sessionStorage.setItem("username", document.getElementById("inputUsername").nodeValue)
            window.location.href= "planet.html";
        } else { 
            console.log('not successful')
            const para = document.createElement("p");
            const node = document.createTextNode("Username or password was incorrect");
            para.appendChild(node);
            const element = document.getElementsById("logBtn");
            element.appendChild(para);
        }
        
    })

}
