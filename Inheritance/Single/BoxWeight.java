package Inheritance.Single;

public class BoxWeight extends Box{
    
int weight ;
    BoxWeight (int weight) {
        super() ;
        this.weight = weight ;
    }

    BoxWeight (int l , int h , int w ,int weight) {
        super(l,h,w) ;
        this.weight = weight ;
    }
}
