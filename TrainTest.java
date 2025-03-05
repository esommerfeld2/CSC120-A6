import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TrainTest {

    //Atributes
    Engine eng;

    //Before Methods
    @Before
    public void setup(){
       this.eng = new Engine(FuelType.ELECTRIC, 50, 95);
   }

    // Engine Tests
    @Test
    public void testEngineConstructor() {
        assertEquals(FuelType.ELECTRIC,eng.getFuelType());
        //fuel level when private?
    }

    @Test
    public void testEngineGo() {
        assertTrue(eng.go());
    }

    // Car Tests
    @Test
    public void testCarAddPassenger() {
        fail();
    }

    @Test
    public void testCarRemovePassenger() {
        fail();
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
