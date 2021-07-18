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

// List of users on the planet
let usersDisplay = document.createElement("h3");
usersDisplay.setAttribute("id", "star-wars");
usersDisplay.innerHTML = "The current users on this planet are";
usersList.appendChild(usersDisplay);

// Riddles
let riddlesList = document.createElement("ul");
riddlesList.setAttribute("class", "list-group");

// Riddle Display
let riddleDisplay = document.createElement("h6");
riddleDisplay.setAttribute("id", "star-wars");
riddleDisplay.innerHTML = "Answer this riddle";
riddlesList.appendChild(riddleDisplay);

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
      // sessionStorage.setItem("currentUserPlnt", JSON.stringify(data.planet));
      createPlanetList(data.planet);
      loadUsersOnPlanet(data.planet);
      getRiddle(data.planet);
    });
}

// function to lead the users on the planet
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

        document.title = entry.name;

        image.setAttribute("src", `./assets/${entry.name}.png`);
      });
    });
}

function getRiddle(planetName) {
  let riddleUrl = `http://localhost:8080/planets/${planetName}`;
  fetch(riddleUrl)
    .then((res) => res.json())
    .then((data) => {
      data.map((r) => {
        let riddleQuestion = document.createElement("li");
        riddleQuestion.setAttribute("class", "h5");
        riddleQuestion.setAttribute("id", "star-wars");
        riddleQuestion.innerHTML = `${r.riddle}`;
        sessionStorage.setItem("riddleAnswer", r.answer);
        riddlesList.appendChild(riddleQuestion);
      });
    });
}

function createMainDiv() {
  // get the main div to connect everything to in planet.html
  let mainDiv = document.getElementById("content");

  // create first row in main div
  let row1 = document.getElementById("row-one");
  mainDiv.append(row1);

  let listCol = document.getElementById("list-col");
  listCol.append(planetList);
  let imgCol = document.getElementById("img-col");
  imgCol.append(image);

  // append the created elements to the row1 div
  row1.append(listCol);
  row1.append(imgCol);

  // create second row in main div
  let row2 = document.getElementById("row-two");
  mainDiv.append(row2);

  // create user column and append userslist to the column
  let userCol = document.getElementById("user-col");
  userCol.append(usersList);
  // create riddle column and append riddle to the column
  let riddleCol = document.getElementById("riddle-col");
  riddleCol.append(riddlesList);

  // input field div
  let inputDiv = document.createElement("div");
  inputDiv.setAttribute("class", "input-group mb-3");
  inputDiv.setAttribute("id", "input-div");
  // answer input field
  let answerInput = document.createElement("input");
  answerInput.setAttribute("type", "text");
  answerInput.setAttribute("class", "form-control");
  answerInput.setAttribute("id", "answer-input");
  answerInput.setAttribute("placeholder", "Answer");

  // answer submit button
  let answerSubmit = document.createElement("button");
  answerSubmit.setAttribute("class", "btn btn-outline-secondary");
  answerSubmit.setAttribute("id", "submitBtn");
  answerSubmit.setAttribute("type", "button");
  answerSubmit.addEventListener("click", getAnswer);
  answerSubmit.innerHTML = "Submit";
  inputDiv.append(answerSubmit);
  inputDiv.append(answerInput);
  riddleCol.append(inputDiv);
  // append the created columns to the row2 div
  row2.append(riddleCol);
  row2.append(userCol);
}

async function getAnswer() {
  let answerValue = sessionStorage.getItem("riddleAnswer");
  let submittedAnswer = document.getElementById("answer-input").value;
  let inputDiv = document.getElementById("riddle-col");
  let submitButton = document.getElementById("submitBtn");

  let answeredDiv = document.createElement("div");
  let answeredDivBtn = document.createElement("button");
  answeredDivBtn.setAttribute("type", "button");
  answeredDivBtn.setAttribute("class", "btn-close");
  answeredDivBtn.setAttribute("data-bs-dismiss", "alert");
  answeredDivBtn.setAttribute("aria-label", "Close");

  if (submittedAnswer.toLowerCase().includes(answerValue)) {

    let username = sessionStorage.getItem("username");
    const userRes = await fetch(`http://localhost:8080/users/${username}`);
    var userObj = await userRes.json();
    userObj.credits += 5000;
    userObj = JSON.stringify(userObj);

    fetch(`http://localhost:8080/users/add`, {
      method: "POST",
      headers: {
        'Content-Type' : 'application/json'
      },
      body: userObj
    }).then(res => {
      if (res.ok) {
        console.log("add credits SUCCESS")
      } else {
        console.log("ERROR add credits NOT SUCCESSFUL")
      }
    })

    submitButton.setAttribute("disabled", true);
    answeredDiv.setAttribute(
      "class",
      "alert alert-info alert-dismissible fade show"
    );
    answeredDiv.setAttribute("role", "alert");
    answeredDiv.innerHTML = "With you, the Force is. (Correct)";
    answeredDiv.append(answeredDivBtn);
    inputDiv.appendChild(answeredDiv);
    sessionStorage.removeItem("riddleAnswer");
  } else {
    answeredDiv.setAttribute(
      "class",
      "alert alert-danger alert-dismissible fade show"
    );
    answeredDiv.setAttribute("role", "alert");
    answeredDiv.innerHTML =
      "Patience you must have, my young Padawan. (Try Again)";
    answeredDiv.append(answeredDivBtn);
    inputDiv.appendChild(answeredDiv);
  }
}
let username = sessionStorage.getItem("username");
window.onload = function () {
  createMainDiv();
  loadUser(username);
};
