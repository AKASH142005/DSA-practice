package Generics;
import java.util.Arrays;

public class CustomArrayList <T> {

    private Object [] data;
    private int default_size = 10;
    private int size = 0;

    public CustomArrayList(){
        this.data = new Object[default_size] ;
    }
    public void add(T value){
        if(isFull()){
            resize();
        }
            data[size++] = value ;
    }
    private void resize() {

       Object [] temp = new Object[size * 2];
       for(int i = 0 ; i < data.length ; i++){
            temp[i] = data[i]; 
       }
       data = temp ;
    }
    private boolean isFull() {
      return this.size == data.length ;
    }

    public T remove(){
        T element = (T) (data[--size]);
        return element ;
    }

    public T get(int index){
        return (T) data[index];
    }

    public int size(){
        return size ;
    }

    public void set(int index ,T value){
        data[index] = value ;
    } 
    @Override
    public String toString(){
        return Arrays.toString(data);

    }
    public static void main(String[] args) {
        CustomArrayList<Integer> list =new CustomArrayList<>();
        list.add(30);
        list.add(40);
        list.add(60);
        list.add(70);
        //System.out.print(list.remove());

        //ArrayList<Integer> list1 = new ArrayList<>();
        System.out.println(list);
    }
}
