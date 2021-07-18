![](images/intro.gif)

# The Kessel Run
`Traverse a galaxy far, far, away...`

This is a traversable model of the galaxy based on the Star Wars themed API: SWAPI. The user can travel around to and view the many locations featured in the Star Wars galaxy. A picture of and brief details on each location will be displayed. Their current location is persisted so that they can always resume their journey across the stars.

## Team Members
- Thomas Ceci
- Jake Geiser
- Andre Goulbourne
- Richie Marier
- Nathan Opsal

## Users can:
`Current build`
- Register.
- Login/Logout.
- Customize their character’s alien race and features.
- Examine their current planet and travel to new ones via an embedded Asteroids minigame.
- Name a Starship to pilot and view detailed information about it.
- Add a copilot from the SWAPI list of people and examine details about them.
- Earn credits by playing the minigame, solving riddles at various planets, and collecting bounties on other players if they're at the same location.
- Spend credits by posting bounties on other users.

`Future plans`
- Purchase new ship models and customize them further.
- Interact with NPCs from the SWAPI.
- View their location on a galaxy map based on a weighted graph
- Travel along the graph in normal space (as opposed to hyperspace) and consume fuel.
- Submit riddle suggestions to the devs for consideration.

## Usage Instructions
- Clone the respository: `git clone https://github.com/210517-Enterprise/The-Kessel-Run.git`
- Run the application: `mvn spring-boot:run`
- Go to the webpage: `http://localhost:8080`
- Register, login and begin.
 
## Technology Stack:
- Spring Boot (With Spring Data, Spring Web, Hibernate, PostgreSQL, H2, Lombok)
- JUnit, Mockito, and H2 for testing
- JavaScript, HTML, and CSS with Bootstrap for front-end
- Amazon RDS
- [Asteroids minigame](https://github.com/erkie/erkie.github.com)
- [Star Wars API](https://swapi.dev/)
