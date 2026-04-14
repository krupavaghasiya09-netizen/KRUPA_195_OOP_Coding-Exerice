import java.util.*;

class Box<T>{
    ArrayList<T> list=new ArrayList<>();

    void addItem(T item){
        list.add(item);
    }

    void display(){
        System.out.println(list);
    }

    public static void main(String[] args){
        Box<String> b1=new Box<>();
        b1.addItem("A");
        b1.addItem("B");

        Box<Integer> b2=new Box<>();
        b2.addItem(1);
        b2.addItem(2);

        b1.display();
        b2.display();
    }
}
