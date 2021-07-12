let obj = sessionStorage.getItem("test");
let objObj = JSON.parse(sessionStorage.getItem(obj));

let title = objObj.name;
document.title = title;

// Planet Image
let image = document.createElement("img");
image.setAttribute("class", "float-start");
image.setAttribute("src", `../assets/${title}.png`);

// create list function for planet stats
function createPlanetList() {
  // Planet Stats
  let uList = document.createElement("ul");
  uList.setAttribute("class", "list-group float-start");
  // Planet Name
  let planetName = document.createElement("li");
  planetName.setAttribute("class", "list-group-item list-group-item-dark");
  planetName.innerHTML = `${objObj.name}:`;
  // Planet Climate
  let planetClimate = document.createElement("li");
  planetClimate.setAttribute("class", "list-group-item list-group-item-dark");
  planetClimate.innerHTML = `Climate: ${objObj.climate}`;
  // Planet Terrain
  let planetTerrain = document.createElement("li");
  planetTerrain.setAttribute("class", "list-group-item list-group-item-dark");
  planetTerrain.innerHTML = `Terrain: ${objObj.terrain}`;
  // Planet Population
  let planetPop = document.createElement("li");
  planetPop.setAttribute("class", "list-group-item list-group-item-dark");
  planetPop.innerHTML = `Population: ${objObj.population}`;
  // Planet Rotational Period
  let planetRotPer = document.createElement("li");
  planetRotPer.setAttribute("class", "list-group-item list-group-item-dark");
  planetRotPer.innerHTML = `Rotational Period: ${objObj.rotation_period}`;
  // Planet Orbital Period
  let planetOrbPer = document.createElement("li");
  planetOrbPer.setAttribute("class", "list-group-item list-group-item-dark");
  planetOrbPer.innerHTML = `Orbital Period: ${objObj.orbital_period}`;

  uList.appendChild(planetName);
  uList.appendChild(planetClimate);
  uList.appendChild(planetTerrain);
  uList.appendChild(planetPop);
  uList.appendChild(planetRotPer);
  uList.appendChild(planetOrbPer);

  return uList;
}

window.onload = function () {
  let mainDiv = document.getElementById("content");
  mainDiv.appendChild(image);

  let uList = createPlanetList();
  mainDiv.appendChild(uList);
};
