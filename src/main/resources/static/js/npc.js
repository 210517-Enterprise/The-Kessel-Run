// Document Title
document.title = "Search Star Wars Copilots";

let searchBtn = document.getElementById("search-btn");
searchBtn.addEventListener("click", search);

function search() {
  let searchValue = document.getElementById("search-form").value;
  loadCharacter(searchValue);
}

// function to load the user from the db
function loadCharacter(characterName) {
  let url = `https://swapi.dev/api/people/?search=${characterName}`;

  fetch(url)
    .then((res) => res.json())
    .then((data) => {
      let output = "";
      data.results.forEach((entry) => {
        output += `
        <div class="col-md-auto">
          <div class="card text-white bg-dark" style="width: 18rem">
            <img src="./assets/${
              entry.name
            }.png" class="card-img-top" alt="Picture Coming Soon..">
            <div class="card-body">
              <h5 class="card-title">${entry.name}</h5>
              <h6 class='card-text'>Height: ${entry.height}cm</h6>
              <h6 class='card-text'>Hair Color: ${entry.hair_color}</h6>
              <h6 class='card-text'>Birth Year: ${entry.birth_year}</h6>
              <h6 class='card-text' id="homeworld-${entry.name}">
              ${getCharHomeworld(entry.homeworld, entry.name)}</h6>
              <h6 class='card-text' id="species-${entry.name}">
              ${
                entry.species.length != 0
                  ? getCharSpecies(entry.species, entry.name)
                  : "Species: Human"
              } </h6>
            </div>
          </div>
        </div>
        `;
        document.getElementById("char-output").innerHTML = output;
      });
    });
}

// // get characters homeworld
function getCharHomeworld(url, personName) {
  fetch(url)
    .then((res) => res.json())
    .then((data) => {
      let homeworld = data.name;
      document.getElementById(
        `homeworld-${personName}`
      ).innerHTML = `Homeworld: ${homeworld}`;
    });
}

// get character's species
function getCharSpecies(charSpeciesUrl, personName) {
  fetch(charSpeciesUrl[0])
    .then((res) => res.json())
    .then((data) => {
      document.getElementById(
        `species-${personName}`
      ).innerHTML = `Species: ${data.name}`;
    });
}
