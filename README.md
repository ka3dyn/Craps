Craps Game 
This project implements the core logic of the casino game Craps and provides a simple Java Swing GUI to simulate and test game interactions.

Game Description
Craps is a dice game where players roll two dice. The result of the first roll determines whether the player wins, loses, or establishes a "point." If a point is set, the player continues rolling until they either roll the point again (win) or roll a 7 (lose).

 Project Structure
CrapsGame.java — Contains the logic to process dice rolls and determine game outcomes.

CrapsTest1.java — Provides a simple graphical user interface using Java Swing to test the game logic.

Die.java — Simulates a six-sided die that returns a random value between 1 and 6.

 How to Run
Make sure you have Java installed (Java 8 or higher).

 How It Works
CrapsGame.java
Handles the rules of the Craps game:

On the first roll:

Win with 7 or 11 → returns 1

Lose with 2, 3, or 12 → returns -1

Otherwise → saves the point and returns 0

On subsequent rolls:

Roll the point again → win (returns 1)

Roll a 7 → lose (returns -1)

Anything else → continue (returns 0)

Method summary:

int processRoll(int total): processes a roll and returns the result.

int getPoint(): returns the current point, if set.

 Note: The provided code contains several syntax issues (e.g., semicolons after if/else conditions, undeclared result variable). Be sure to fix these before compiling.

CrapsTest1.java
This is the GUI front-end for testing:

A window prompts the user to enter the result of a dice roll.

Displays the roll result, game outcome, and current point in a text area.

Useful for manually simulating game rolls.

Die.java
Simulates a standard six-sided die:

roll(): randomly selects a number between 1–6.

getNumDots(): returns the result of the last roll.
