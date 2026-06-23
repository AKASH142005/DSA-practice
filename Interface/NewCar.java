package Interface;

public class NewCar {
    private Engine engine ;
    private Media player = new CDPlayer();
    public NewCar(){
        this.engine = new PowerEngine();
    }
    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
    public void acc(){
        engine.acc();
    }
    public void upgrade(){
        this.engine = new ElectricEngine();
    }
    public void startMusic(){
        player.start() ;
    }
    public void stopMusic(){
        player.stop();
    }
}
