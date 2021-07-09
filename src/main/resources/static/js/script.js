let searchBtn = document
  .getElementById("search-btn")
  .addEventListener("click", searchByValue);

function searchByValue() {
  let searchParam = getCurrentActiveTab();
  let searchValue = document.getElementById("search-form").value;
  fetch(`https://swapi.dev/api/${searchParam}/?search=${searchValue}`)
    .then((res) => res.json())
    .then((data) => {
      let output = "";
      if (searchParam == "planets") {
        data.results.forEach(function (planet) {
          output += `
        <div class="col-md-auto">
          <div class="card text-white bg-dark" style="width: 18rem">
          <img src="./images/${planet.name}.jpg" class="card-img-top" alt="Picture Coming Soon..">
            <div class="card-body">
            
              <h5 class="card-title">${planet.name}</h5>
              <p class="card-text">${planet.climate}</p>
              <p class="card-text">${planet.terrain}</p>
              <p class="card-text">${planet.population}</p>
              <a href="#" class="btn btn-secondary">Go To Planet</a>
            </div>
          </div>
        </div>
        `;
          document.getElementById(`${searchParam}-output`).innerHTML = output;
        });
      }
      if (searchParam == "people") {
        data.results.forEach(function (person) {
          output += `
        <div class="col-md-auto">
          <div class="card text-white bg-dark" style="width: 18rem">
          <img src="./images/${
            person.name
          }.jpg" class="card-img-top" alt="Picture Coming Soon..">
            <div class="card-body">
              <h5 class="card-title">${person.name}</h5>
              <p class="card-text">${person.height}</p>
              <p class="card-text">${person.hair_color}</p>
              <p class="card-text" id="homeworld">${fetch(`${person.homeworld}`)
                .then((res) => res.json())
                .then((data) => {
                  let homeworld = data.name;
                  document.getElementById("homeworld").innerHTML = homeworld;
                })}</p>
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

function getCurrentActiveTab() {
  let planetsTab = document
    .getElementById("nav-planets-tab")
    .getAttribute("aria-selected");
  let peopleTab = document
    .getElementById("nav-people-tab")
    .getAttribute("aria-selected");
  let profileTab = document
    .getElementById("nav-profile-tab")
    .getAttribute("aria-selected");

  if (planetsTab == "true") {
    return "planets";
  }
  if (peopleTab == "true") {
    return "people";
  }
  if (profileTab == "true") {
    return "profile";
  }
}
