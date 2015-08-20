# Non-Reacurring Random Number Generator
initial upload

*this repusitpry includes a demo android app for demonstration. actual function located in Library file.

*Description*
this number generator is unique because it not only provides a random integer number from a given array, but it can also verify that the same number won't be re-selected!

number generator provides two main functions-
 1) non-reacurring number- like a Lottery raffle- once a number is selected, it's out of the game
 2) regular reacurring number- like a role of dice- any number from the range has an equal chance of being selected
 

*How to Use*
1) must first create a new NumberGenerator Object. this will setup the initial ArrayList used as the number repositpry. 
 * by default the initial range is between 1 and 10 (including both).
2) optional - set custom number range, i.e. between 1 and 6 (like dice). range will always begin with 1 (including) up to whatever value you chose (including).
 * this is the command: setInitialOrganCount(int count)
 
3) number itteration:
 a) non reaccuring: getRandomNonReoccurringNumber() (retuns int)
 b) reaccuring: getRandomNumber() (returns int)
 *note: both functions can be used simultaniusly on same instance 
