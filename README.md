# Non-Recurring Random Number Generator
Initial upload

*this repository includes a demo android app for demonstration. Actual function located in Library file.

*Description*:

This number generator is unique because it not only provides a random integer number from a given array, but it can also verify that the same number will not be re-selected!

NumberGenerator provides two main functions-
 1. non-recurring number- like a Lottery raffle- once a number is selected, it's out of the game
 2. regular recurring number- like a role of dice- any number from the range has an equal chance of being selected
 

*How to Use*:

1. must first create a new NumberGenerator Object. This will setup the initial ArrayList used as the number repository. by default the initial range is between 1 and 10 (including both).
2. optional - set custom number range, i.e. between 1 and 6 (like dice). Range will always begin with 1 (including) up to      whatever value you chose (including).
   * this is the command: setInitialOrganCount(int count)
 
3. number iteration:
 a. Non-recurring: getRandomNonReoccurringNumber() (returns int)
 b. Recurring: getRandomNumber() (returns int)
 *note: both functions can be used simultaneously on same instance
