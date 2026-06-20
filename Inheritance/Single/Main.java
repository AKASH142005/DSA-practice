package Inheritance.Single;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(1,2,3) ;
        System.out.println(box.l);
        BoxWeight box1 = new BoxWeight(1,2,3,4) ;
        System.out.println(box1.weight);
    }
}
