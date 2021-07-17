function checkLoggin(){
    if(!sessionStorage.getItem('isLoggedIn')){
        location.href='index.html'
    }
}

window.onload = checkLoggin()




