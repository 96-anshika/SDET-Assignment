package assignment;

public class lion implements Animal{

    public static void main(String[] args) {
        Animal L1 = new lion();
        lion L2 = new lion();
        L1.eat();
        L1.Walk();

        L2.shout();
    }

    public void shout(){

        System.out.println("I am from class LION , and i and SHOUT");
    }

}
