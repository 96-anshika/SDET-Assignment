package assignment;

import java.util.ArrayList;

public class CallingAnimal {
    public static void main(String[] args) {


        Deer d   = new Deer();
        Monkey m = new Monkey();
        lion l   = new lion();



        ArrayList<Animal>  list = new ArrayList<>();
        list.add(d);
        list.add(m);
        list.add(l);


        for(Animal val:list){
            val.eat();
        }

    }
}
