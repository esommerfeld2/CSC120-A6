import java.util.ArrayList;

public class Train implements TrainRequirements{

    //Atributes
    public Engine engine;
    public ArrayList<Car> cars;
    private FuelType fuelType;
    private double currentFuelLevel;
    private double fuelCapacity;
    private int nCars;
    private int passengerCapacity;

    /**
     * Constructor
     * @param fuelType
     * @param currentFuelLevel
     * @param fuelCapacity
     * @param nCars
     * @param passengerCapacity
     */
    public Train(FuelType fuelType, double currentFuelLevel, double fuelCapacity, 
    int nCars, int passengerCapacity){
        this.fuelType = fuelType;
        this.currentFuelLevel = currentFuelLevel;
        this.fuelCapacity = fuelCapacity;
        this.nCars = nCars;
        this.passengerCapacity = passengerCapacity;
        engine = new Engine(this.fuelType, this.currentFuelLevel, this.fuelCapacity);
        cars = new ArrayList<>(this.nCars);
        for (int i = 0; i < this.nCars; i++) {
            Car car = new Car( "Car" + i, this.passengerCapacity);
            cars.add(car);
        }
    }

    /**
     * Acessor gets the engine
     */
    public Engine getEngine(){
        return this.engine;
    }
    /**
     * Acessor gets the car at the ith index
     */
    public Car getCar(int i){
       return cars.get(i);
    }

    /**
     * Acessor gets max capacity of the train
     */
    public int getMaxCapacity(){
        return this.nCars * this.passengerCapacity;
    }

    /**
     * Method that adds train car
     */

    public void addCar(Car car0){
        cars.add(car0);
    }

    /**
     * Method returns the total seats left on the train
     * @return total seats remaining
     */
    public int seatsRemaining(){
        int totalSeatsLeft = 0;
        for (Car car : cars) {
            int seatsLeft = car.seatsRemaining();
            totalSeatsLeft += seatsLeft;
        }
        return totalSeatsLeft;
    }
    
    /**
     * Method prints manifest for the whole train
     */
    public void printManifest(){
        for (Car car : cars) {
            if(car.getCapacity() == car.seatsRemaining()){
                continue;
            }
            else{
                car.printManifest();
            }
        }
    } 

    /**
     * Used to format train output
     */
    public String toString(){
        return("The fuel type is " + this.fuelType + ". The current fuel leve is "
        + this.currentFuelLevel + ". The fuel capacity is " + this.fuelCapacity +
        ". The number of cars is " + this.nCars + ". The passenger capacity for each car is " +
        this.passengerCapacity);
    }

    /**
     * Used to check code, runs all functions in the class
     */
    public static void main(String[] args) {
        Train myTrain = new Train(FuelType.STEAM, 100, 100, 4, 2);
        System.out.println(myTrain);
        System.out.println(myTrain.getEngine());
        System.out.println(myTrain.getCar(3));
        System.out.println(myTrain.getMaxCapacity());
        Passenger Jeff = new Passenger("Jeff");
        Passenger Will = new Passenger("Will");
        Will.boardCar(myTrain.getCar(3));
        Jeff.boardCar(myTrain.getCar(3));
        System.out.println(myTrain.seatsRemaining());
        myTrain.printManifest();

    }
}
