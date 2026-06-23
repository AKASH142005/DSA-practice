package Interface;

public class PowerEngine implements Engine{

    @Override
    public void start() {
       System.out.println("I start like a power Engine");
    }

    @Override
    public void stop() {
        System.out.println("I Stop like a Power Engine");
    }

    @Override
    public void acc() {
        System.out.println("I accelerator like Power Engine");
    }
    
}
