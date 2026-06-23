package Interface;

public class ElectricEngine implements Engine{

    @Override
    public void start() {
       System.out.println("I start like a Electric Engine");
    }

    @Override
    public void stop() {
        System.out.println("I Stop like a  Electric Engine");
    }

    @Override
    public void acc() {
        System.out.println("I accelerator like Electric Engine");
    }
    
} 