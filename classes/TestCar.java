package classes;

public class TestCar {
    public static void main(String[] args) {
        Cars car = new Cars();
        car.name = "Test car";
        Toyota toyota = new Toyota();
        toyota.isReliable = false;
        toyota.startEngine();
    }
}
