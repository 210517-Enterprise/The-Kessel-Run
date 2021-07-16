
// create form on button press
let loginBtn = document.getElementById('login-btn')

loginBtn.addEventListener("click", createForm);

function createForm() {
    let formDiv = document.getElementById('form-div');

    formDiv.innerHTML = `
        <form>
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
            <div class="col-sm-4"></div>
            <button type="submit" class="btn col-sm-3" id="form-submit">Submit</button>
            <button type="button" class="btn col-sm-3" id="register-btn">Register</button>
            </div>
        </form>
    `;

    function redirectRegister(){
        location.replace('register.html');
    }
    
    document.getElementById('register-btn').addEventListener('click', redirectRegister)
}


            
