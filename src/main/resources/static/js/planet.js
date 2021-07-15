// // Planet Image
let image = document.createElement("img");
// adding img attributes
image.setAttribute("class", "rounded");

image.setAttribute("width", "300rem");
// Planet Stats planetList
let planetList = document.createElement("ul");
planetList.setAttribute("class", "list-group");
// Planet Name
let planetName = document.createElement("h3");
planetName.setAttribute("id", "star-wars");
// Planet Climate
let planetClimate = document.createElement("li");
planetClimate.setAttribute("class", "list-group-item list-group-item-dark");
// Planet Terrain
let planetTerrain = document.createElement("li");
planetTerrain.setAttribute("class", "list-group-item list-group-item-dark");
// Planet Population
let planetPop = document.createElement("li");
planetPop.setAttribute("class", "list-group-item list-group-item-dark");
// Planet Rotational Period
let planetRotPer = document.createElement("li");
planetRotPer.setAttribute("class", "list-group-item list-group-item-dark");
// Planet Orbital Period
let planetOrbPer = document.createElement("li");
planetOrbPer.setAttribute("class", "list-group-item list-group-item-dark");

// Planet Users
let usersList = document.createElement("ul");
usersList.setAttribute("class", "list-group");
let usersDisplay = document.createElement("h3");
usersDisplay.setAttribute("id", "star-wars");
usersDisplay.innerHTML = "The current users on this planet are";
usersList.appendChild(usersDisplay);

planetList.appendChild(planetName);
planetList.appendChild(planetClimate);
planetList.appendChild(planetTerrain);
planetList.appendChild(planetPop);
planetList.appendChild(planetRotPer);
planetList.appendChild(planetOrbPer);

// function to load the user from the db
function loadUser(username) {
  let url = `http://localhost:8080/users/${username}`;

  fetch(url)
    .then((res) => res.json())
    .then((data) => {
      sessionStorage.setItem("currentUserPlnt", JSON.stringify(data.planet));
      createPlanetList(data.planet);
      loadUsersOnPlanet(data.planet);
    });
}
function loadUsersOnPlanet(planetName) {
  let url = `http://localhost:8080/planets/${planetName}/users`;

  fetch(url)
    .then((res) => res.json())
    .then((data) => {
      data.map((u) => {
        let li = document.createElement("li");
        li.setAttribute("class", "list-group-item list-group-item-dark");
        li.innerHTML = u.username;
        usersList.appendChild(li);
      });
    });
}

// // create list function for planet stats
function createPlanetList(planetDisplayName) {
  let planetUrl = `https://swapi.dev/api/planets/?search=${planetDisplayName}`;
  fetch(planetUrl)
    .then((res) => res.json())
    .then((data) => {
      data.results.forEach((entry) => {
        planetName.innerHTML = `You are currently on ${entry.name}`;
        planetClimate.innerHTML = `Climate: ${entry.climate}`;
        planetTerrain.innerHTML = `Terrain: ${entry.terrain}`;
        planetPop.innerHTML = `Population: ${entry.population}`;
        planetRotPer.innerHTML = `Rotational Period: ${entry.rotation_period}`;
        planetOrbPer.innerHTML = `Orbital Period: ${entry.orbital_period}`;
      });
    });

  // sets the title to the name of the planet the user is currently on
  let title = JSON.parse(sessionStorage.getItem("currentUserPlnt"));
  document.title = title;

  image.setAttribute("src", `./assets/${title}.png`);

  // return uList;
}

function createMainDiv() {
  // get the main div to connect everything to in planet.html
  let mainDiv = document.getElementById("content");
  // mainDiv.setAttribute("class", "d-flex justify-content-center");
  let row1 = document.getElementById("row");
  mainDiv.append(row1);

  let listCol = document.getElementById("list-col");
  listCol.append(planetList);
  let imgCol = document.getElementById("img-col");
  imgCol.append(image);

  // append the created elements to the main div
  row1.append(listCol);
  row1.append(imgCol);
  mainDiv.appendChild(usersList);
}

window.onload = function () {
  createMainDiv();
  loadUser("ramarier11");
};
