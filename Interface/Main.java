package Interface;

public class Main {
    public static void main(String[] args) {
      //  Car car = new Car() ;
      //  car.start();
       // car.acc();
       // car.brake();
       // Media player = new Car();
        //player.start(); // engine start and stop solve this problem
        //player.stop();

        NewCar newCar = new NewCar();
        newCar.start();
        newCar.upgrade();
        newCar.start();
        newCar.startMusic();
    }
}
