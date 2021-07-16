
function saveUser() {
    let username = document.getElementById("uname").nodeValue;
    let password = document.getElementById("pword").nodeValue;
    
    sessionStorage.setItem("username", username);
    sessionStorage.setItem("password", password);
}

var loginBtn = document.getElementById("loginButton");

loginBtn.addEventListener("click", saveUser());

console.log(sessionStorage.getItem("username"));
console.log(sessionStorage.getItem("password"));



