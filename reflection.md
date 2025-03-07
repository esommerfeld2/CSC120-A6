Use this file to record your reflection on this assignment.

What are your initial impressions of how `Unit Testing` affects your programming?
What worked, what didn't, what advice would you give someone taking this course in the future?

Unit testing allows me to check my code and implement elements I might have missed the first time I created the code. I often do a similar thing in my main for each class, chekcing to make sure the methods run. But testing gives me a place to do that and allows for more thorough checking. I would advise them to try the first test they think of then come back to that test and see if they can think of another better way to test it. Often I implemented a simple test and then came back and relaized a better more detailed way to test something. Also go to office hours if you are stuck they are super helpful!

Tests impelemented:
`testEngineConstructor()`- tests to make sure the engine is constructed.
`testEngineGo()`- tests to make sure the fuel level goes down by 10 each time.
`testCarAddPassenger()` - tests to make sure the passenger is added to the manifest/car.
`testCarRemovePassenger()` - tests to make sure a passenger is removed from the manifest/car.
`testPassengerBoardCarWithSpace()`- tests to make sure the passenger can board a car with space.
`testPassengerBoardCarFull()`- tests to make sure a passenger can't board a full car.
`testTrainConstructor()`- tess to make sure the train is constructed.
`testTrainPassengerCount()`- tests to make sure the passengers are correctly accounted for and seats are accurately recorded.
`testTrainGetCar()`- tests to make sure you can get a specfic train car.
`testTrainPrintManifest()`- tests to make sure you print a full manifest of everyone on the train.