// // Planet Image
let image = document.createElement("img");
// Planet Stats
let uList = document.createElement("ul");
uList.setAttribute("class", "list-group float-start");
// Planet Name
let planetName = document.createElement("li");
planetName.setAttribute("class", "list-group-item list-group-item-dark");
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

function loadUser(username) {
  let url = `http://localhost:8080/users/${username}`;
  fetch(url)
    .then((res) => res.json())
    .then((data) => {
      sessionStorage.setItem("currentUserPlnt", JSON.stringify(data.planet));
    });
  createPlanetList(data.planet);
}

async function loadUsers(username) {
  let url = `http://localhost:8080/users/${username}`;
  // let url = "https://pokeapi.co/api/v2/pokemon/ditto";
  return (await fetch(url)).json();
}
const getUser = async () => {
  let user;
  try {
    user = await loadUsers("ramarier11");
  } catch (e) {
    console.log(e);
  }

  // sessionStorage.setItem("currentUserObj", JSON.stringify(user));
  // obj = JSON.parse(sessionStorage.getItem("currentUserObj"));
  // console.log(obj);

  let title = user.planet;
  document.title = title;

  image.setAttribute("class", "rounded float-end");
  image.setAttribute("src", `./assets/${title}.png`);
  image.setAttribute("width", "300rem");

  createPlanetList(title);
};

uList.appendChild(planetName);
uList.appendChild(planetClimate);
uList.appendChild(planetTerrain);
uList.appendChild(planetPop);
uList.appendChild(planetRotPer);
uList.appendChild(planetOrbPer);

// // create list function for planet stats
function createPlanetList(planetDisplayName) {
  let planetUrl = `https://swapi.dev/api/planets/?search=${planetDisplayName}`;
  fetch(planetUrl)
    .then((res) => res.json())
    .then((data) => {
      data.results.forEach((entry) => {
        planetName.innerHTML = `${entry.name}:`;
        planetClimate.innerHTML = `Climate: ${entry.climate}`;
        planetTerrain.innerHTML = `Terrain: ${entry.terrain}`;
        planetPop.innerHTML = `Population: ${entry.population}`;
        planetRotPer.innerHTML = `Rotational Period: ${entry.rotation_period}`;
        planetOrbPer.innerHTML = `Orbital Period: ${entry.orbital_period}`;
      });
    });

  let title = JSON.parse(sessionStorage.getItem("currentUserPlnt"));
  document.title = title;

  image.setAttribute("class", "rounded float-end");
  image.setAttribute("src", `./assets/${title}.png`);
  image.setAttribute("width", "300rem");

  return uList;
}

window.onload = function () {
  getUser();
  let mainDiv = document.getElementById("content");
  mainDiv.setAttribute("class", "d-flex justify-content-center");
  mainDiv.appendChild(uList);
  mainDiv.appendChild(image);
};
