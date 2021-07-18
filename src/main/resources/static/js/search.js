let searchBtn = document.getElementById("search-btn");
searchBtn.addEventListener("click", searchByValue);

let username = sessionStorage.getItem("username");

function searchByValue() {
  // set searchValue to the value of the search-form's value
  let searchValue = getSearchValue();
  // fetch from swapi api with the specified values
  fetch(`https://swapi.dev/api/planets/?search=${searchValue}`)
    .then((res) => res.json())
    .then((data) => {
      let output = "";

      data.results.forEach(function (planet) {
        output += `
            <div class="col-md-auto">
              <div class="card text-white bg-dark" style="width: 18rem">
              <img src="./assets/${planet.name}.png" class="card-img-top" alt="Picture Coming Soon..">
                <div class="card-body">
                  <h5 class="card-title">${planet.name}</h5>
                  <button onclick='goToPlanet("${username}", "${planet.name}")' class="btn btn-secondary">Go To Planet</button> 
                </div>
              </div>
            </div>
        `;

        document.getElementById(`planets-output`).innerHTML = output;
      });
    });

  document.getElementById("search-form").value = "";
}

// get search value function
function getSearchValue() {
  let search = document.getElementById("search-form").value;

  return search;
}

// set the planetName of the sessionStorage to the planetName clicked
// and go to a planet
function goToPlanet(username, planetName) {
  let getUrl = `http://localhost:8080/users/${username}`;
  let postUrl = `http://localhost:8080/users/add`;

  fetch(getUrl)
    .then((res) => res.json())
    .then((data) => {
      console.log(data);
      data.planet = planetName;
      let userObj = JSON.stringify(data);

      fetch(postUrl, {
        method: "POST",
        headers: {
          "Content-Type": "application/json",
        },
        body: userObj,
      }).then((res) => {
        if (res.ok) {
          console.log("Success");
          document.location = "asteroids.html";
        } else {
          console.log("Error");
        }
      });
    });
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
