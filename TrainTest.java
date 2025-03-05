import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TrainTest {

    //Atributes
    Engine eng;
    Car carC;
    Passenger ella;
    Train trainA;

    //Before Methods
    @Before
    public void setup(){
       this.eng = new Engine(FuelType.ELECTRIC, 50, 95);
       this.carC = new Car(" C", 2);
       this.ella = new Passenger("Ella");
       this.trainA = new Train(FuelType.STEAM, 100, 100, 4, 2);
   }

    // Engine Tests
    @Test
    public void testEngineConstructor() {
        double expectedFuel = 50;
        assertEquals(FuelType.ELECTRIC,eng.getFuelType());
        //assertEquals(expectedFuel, eng.getCurrentFuel());
    }

    @Test
    public void testEngineGo() {
        assertTrue(eng.go());
    }

    // Car Tests
    @Test
    public void testCarAddPassenger() {
        assertTrue(carC.addPassenger(ella));
    }

    @Test
    public void testCarRemovePassenger() {
        carC.addPassenger(ella);
        assertTrue(carC.removePassenger(ella));
    }

    // Passenger Tests
    @Test
    public void testPassengerBoardCarWithSpace() {
        fail();
    }

    @Test
    public void testPassengerBoardCarFull() {
        fail();
    }

    // Train Tests
    @Test
    public void testTrainConstructor() {
        fail();
    }

    @Test
    public void testTrainPassengerCount() {
        fail();
    }

    @Test
    public void testTrainGetCar() {
        fail();
    }

    @Test
    public void testTrainPrintManifest() {
        fail();
    }
    
}
