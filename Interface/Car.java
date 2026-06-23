package Interface;

public class Car implements Brake, Engine,Media{

    @Override
    public void start() {
       System.out.println("Engine Start");;
    }

    @Override
    public void stop() {
        System.out.println("Engine Stop");
    }

    @Override
    public void acc() {
       System.out.println("Engine Accelerator");
    }

    @Override
    public void brake() {
        System.out.println("Brake");
    }
    
}
