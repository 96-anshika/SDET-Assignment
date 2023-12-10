package assignment;

public interface Animal {

    public default void eat(){
        System.out.println("I am from Animal Interface and i can EAT");

    }

    public default void Walk(){
        System.out.println("I am from Animal Interface and i can WALK");

    }
}
