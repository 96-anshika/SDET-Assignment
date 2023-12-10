package assignment;

public class Monkey implements Animal {

    public static void main(String[] args) {
        Animal M1 = new Monkey();
        M1.eat();
        M1.Walk();
    }

   public void jump(){
       System.out.println(" I am from class MONKEY and i an JUMP");
   }
}
