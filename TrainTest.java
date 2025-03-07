import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TrainTest {

    //Atributes
    Engine eng;
    Car carC;
    Car carE;
    Passenger ella;
    Passenger will;
    Passenger jeff;
    Train trainA;

    //Before Methods
    @Before
    public void setup(){
       this.eng = new Engine(FuelType.ELECTRIC, 50, 95);
       this.carC = new Car(" C", 2);
       this.carE = new Car("E", 0);
       this.ella = new Passenger("Ella");
       this.will = new Passenger("Will");
       this.jeff = new Passenger("Jeff");
       this.trainA = new Train(FuelType.STEAM, 100, 100, 4, 2);
   }

    // Engine Tests
    @Test
    public void testEngineConstructor() {
        double expectedFuel = 50;
        assertEquals(FuelType.ELECTRIC,eng.getFuelType());
        assertEquals(expectedFuel, eng.getCurrentFuel(), 0);
    }

    @Test
    public void testEngineGo() {
        eng.go();
        assertEquals(40., eng.getCurrentFuel(), 0);
    }

    // Car Tests
    @Test
    public void testCarAddPassenger() {
    carC.addPassenger(ella);
    assertEquals(1, carC.passengersOnboard.size());
    assertFalse(carE.addPassenger(will));
    assertFalse(carC.addPassenger(ella));
    }

    @Test
    public void testCarRemovePassenger() {
        carC.addPassenger(will);
        carC.removePassenger(will);
        assertEquals(0, carC.passengersOnboard.size());
        assertFalse(carC.removePassenger(jeff));
    }

    // Passenger Tests
    @Test
    public void testPassengerBoardCarWithSpace() {
        ella.boardCar(carC);
        assertEquals(1, carC.seatsRemaining());
    }

    @Test
    public void testPassengerBoardCarFull() {
        ella.boardCar(carC);
        will.boardCar(carC);
        jeff.boardCar(carC);
        assertEquals(0, carC.seatsRemaining());
    }

    // Train Tests
    @Test
    public void testTrainConstructor() {
        assertEquals(4, trainA.cars.size());
    }

    @Test
    public void testTrainPassengerCount() {
        will.boardCar(trainA.getCar(3));
        assertEquals(7, trainA.seatsRemaining());
    }

    @Test
    public void testTrainGetCar() {
        trainA.addCar(carE);
        assertSame(carE, trainA.getCar(4));
    }

    @Test
    public void testTrainPrintManifest() {
        will.boardCar(trainA.getCar(3));
        jeff.boardCar(trainA.getCar(2));
        //Here I am printing the manifest and looking in my terminal to see if Will and Jeff are printed
        //I don't know how I could use an assert statement to look to see if those names were printed
        trainA.printManifest();
    }
    
}
