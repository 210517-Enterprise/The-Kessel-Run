let navbarContent = `
<div class="container-fluid" style="font-family: Century Gothic, CenturyGothic, AppleGothic, sans-serif; margin-bottom: 10px;">
        <button
          class="navbar-toggler"
          type="button"
          data-bs-toggle="collapse"
          data-bs-target="#navbarTogglerDemo03"
          aria-controls="navbarTogglerDemo03"
          aria-expanded="false"
          aria-label="Toggle navigation"
        >
          <i class="fab fa-galactic-republic"></i>
        </button>
        <a class="navbar-brand" href="#"
          ><i class="fab fa-galactic-republic"></i>The Kessel Run</a
        >
        <div class="collapse navbar-collapse" id="navbarTogglerDemo03">
          <ul class="navbar-nav me-auto mb-2 mb-lg-0">
            <li class="nav-item">
              <a class="nav-link active" aria-current="page" href="/user.html">Users</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="/search.html">Travel</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="/npc.html">Copilots</a>
            </li>
            <li class="nav-item">
              <a
                class="nav-link"
                id="logout"
                href="index.html"
                tabindex="-1"
                >Logout</a
              >
            </li>
          </ul>
          <div class="d-flex">
            <input
              class="form-control me-2"
              type="text"
              id="search-form"
              placeholder="Search"
            />
            <button class="btn btn-outline-success starwars" id="search-btn">
              Search
            </button>
          </div>
        </div>
      </div>
`;

{
  /* <nav
class="navbar navbar-expand-lg navbar-light bg-light"
id="navbar"
></nav> 
  ADD THIS TO WHEREVER YOU WANT TO ADD THE NAVBAR TO IN THE HTML PAGE
*/
}

document.getElementById("navbar").innerHTML = navbarContent;

let logoutBtn = document.getElementById("logout");
logoutBtn.addEventListener("click", logout);
function logout() {
  sessionStorage.clear();
}
