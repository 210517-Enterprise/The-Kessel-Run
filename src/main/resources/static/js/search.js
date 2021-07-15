let searchBtn = document.getElementById("search-btn");
searchBtn.addEventListener("click", searchByValue);
// searchBtn.addEventListener("click", clearStorage);

function searchByValue() {
  // set searchParam to the current active tab
  let searchParam = getCurrentActiveTab();
  // set searchValue to the value of the search-form's value
  let searchValue = getSearchValue();
  // fetch from swapi api with the specified values
  fetch(`https://swapi.dev/api/${searchParam}/?search=${searchValue}`)
    .then((res) => res.json())
    .then((data) => {
      let output = "";
      // if the current active tab is planets, populate the planets tab with planets
      if (searchParam == "planets") {
        data.results.forEach(function (planet) {
          output += `
        <div class="col-md-auto">
          <div class="card text-white bg-dark" style="width: 18rem">
          <img src="./assets/${planet.name}.png" class="card-img-top" alt="Picture Coming Soon..">
            <div class="card-body">
              <h5 class="card-title">${planet.name}</h5>
              <button onclick='goToPlanet("${planet.name}")' class="btn btn-secondary">Go To Planet</button>
            </div>
          </div>
        </div>
        `;
          // sessionStorage.setItem(planet.name, JSON.stringify(planet));
          document.getElementById(`${searchParam}-output`).innerHTML = output;
        });
      }
      // if the current active tab is people, populate the people tab with people divs
      if (searchParam == "people") {
        data.results.forEach(function (person) {
          output += `
        <div class="col-md-auto">
          <div class="card text-white bg-dark" style="width: 18rem">
          <img src="./assets/${person.name}.png" class="card-img-top" alt="Picture Coming Soon..">
            <div class="card-body">
            <h5 class="card-title">${person.name}</h5>
              <a href="#" class="btn btn-secondary">Add to Crew</a>
            </div>
          </div>
        </div>
        `;
          document.getElementById(`${searchParam}-output`).innerHTML = output;
        });
      }
    });

  document.getElementById("search-form").value = "";
}

// get search value function
function getSearchValue() {
  let search = document.getElementById("search-form").value;

  return search;
}

// get the current active tab on the search page i.e: (Planet, People, Profile)
function getCurrentActiveTab() {
  let planetsTab = document
    .getElementById("nav-planets-tab")
    .getAttribute("aria-selected");
  let peopleTab = document
    .getElementById("nav-people-tab")
    .getAttribute("aria-selected");
  // let profileTab = document
  //   .getElementById("nav-profile-tab")
  //   .getAttribute("aria-selected");

  if (planetsTab == "true") {
    return "planets";
  }
  if (peopleTab == "true") {
    return "people";
  }
  // if (profileTab == "true") {
  //   return "profile";
  // }
}

// set the planetName of the sessionStorage to the planetName clicked
// and go to a planet
function goToPlanet(planetName) {
  sessionStorage.setItem("currentUserPlnt", planetName);
  document.location = "planet.html";
}
// function clearStorage() {
//   sessionStorage.clear();
// }
// gets the homeworld of the person name using the url provided by the api
// with person.homeworld
function getHomeWorld(url, personName) {
  fetch(url)
    .then((res) => res.json())
    .then((data) => {
      let homeworld = data.name;
      document.getElementById(`homeworld-${personName}`).innerHTML = homeworld;
    });
}
