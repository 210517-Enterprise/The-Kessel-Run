// Setting Document Title
document.title = "User Search";

// User Stats userList
let userList = document.createElement("ul");
userList.setAttribute("class", "list-group");

// Username
let userName = document.createElement("h3");
userName.setAttribute("id", "star-wars");

// User's Char Name
let userChar = document.createElement("li");
userChar.setAttribute("class", "list-group-item list-group-item-dark");

// User's Race
let userRace = document.createElement("li");
userRace.setAttribute("class", "list-group-item list-group-item-dark");

// User's Hair Color
let userHair = document.createElement("li");
userHair.setAttribute("class", "list-group-item list-group-item-dark");

// User's Eye Color
let userEye = document.createElement("li");
userEye.setAttribute("class", "list-group-item list-group-item-dark");

// User's Skin Color
let userSkin = document.createElement("li");
userSkin.setAttribute("class", "list-group-item list-group-item-dark");

// User's Copilot
let userCopilot = document.createElement("li");
userCopilot.setAttribute("class", "list-group-item list-group-item-dark");

// User's Starship
let userStarship = document.createElement("li");
userStarship.setAttribute("class", "list-group-item list-group-item-dark");

// User's Model
let userModel = document.createElement("li");
userModel.setAttribute("class", "list-group-item list-group-item-dark");

// User's Credits
let userCredits = document.createElement("li");
userCredits.setAttribute("class", "list-group-item list-group-item-dark");

// User's Bounty
let userBounty = document.createElement("li");
userBounty.setAttribute("class", "list-group-item list-group-item-dark");

// User's Planet
let userPlanet = document.createElement("li");
userPlanet.setAttribute("class", "list-group-item list-group-item-dark");

userList.appendChild(userName);
userList.appendChild(userChar);
userList.appendChild(userRace);
userList.appendChild(userHair);
userList.appendChild(userEye);
userList.appendChild(userCopilot);
userList.appendChild(userStarship);
userList.appendChild(userModel);
userList.appendChild(userCredits);
userList.appendChild(userBounty);
userList.appendChild(userPlanet);

// create list function for User stats
function createUserList(username) {
  let url = `http://localhost:8080/users/${username}`;
  fetch(url)
    .then((res) => res.json())
    .then((data) => {
      userName.innerHTML = `Username: ${data.username}`;
      userChar.innerHTML = `Character's Name: ${data.name}`;
      userRace.innerHTML = `Character's Race: ${data.race}`;
      userHair.innerHTML = `Hair Color: ${data.hairColor}`;
      userEye.innerHTML = `Eye Color: ${data.eyeColor}`;
      userSkin.innerHTML = `Skin Color: ${data.skinColor}`;
      userCopilot.innerHTML = `Copilot: ${data.copilot}`;
      userStarship.innerHTML = `Starship's Name: ${data.starship}`;
      userModel.innerHTML = `Starship's Model: ${data.model}`;
      userCredits.innerHTML = `Current Credits: ${data.credits}`;
      userBounty.innerHTML = `Current Bounty: ${data.bounty}`;
      userPlanet.innerHTML = `Current Location: ${data.planet}`;
    });

  // sets the title to the name of the the user is currently examining

  /**
   * STILL NEEDS USER VARIABLE TO FILL ELEMENTS
   */

  createMainDiv();
}

function createMainDiv() {
  // get the main div to connect everything to in planet.html
  let mainDiv = document.getElementById("content");
  mainDiv.removeChild(tempDiv);
  // mainDiv.setAttribute("class", "d-flex justify-content-center");

  let row1 = document.getElementById("row");
  mainDiv.append(row1);

  let listCol = document.getElementById("list-col");
  listCol.append(userList);

  // append the created elements to the main div
  row1.append(listCol);
  mainDiv.appendChild(row1);
}
/**
 * STILL NEEDS USER VARIABLE TO FILL ELEMENTS
 */
let tempDiv = document.createElement("div");
tempDiv.setAttribute("id", "star-wars");
tempDiv.setAttribute("class", "h5");
tempDiv.innerHTML = "Please enter a user name in the search bar";

window.onload = function () {
  document.getElementById("content").appendChild(tempDiv);
};

// SEARCH FUNCTIONALITY

// search bar button
let userSearchBtn = document.getElementById("search-btn");
userSearchBtn.addEventListener("click", findUser);

function findUser() {
  let searchValue = getSearchValue();

  createUserList(searchValue);
}

// get search value function
function getSearchValue() {
  let search = document.getElementById("search-form").value;

  return search;
}
