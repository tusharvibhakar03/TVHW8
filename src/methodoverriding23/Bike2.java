package methodoverriding23;

public class Bike2 extends Vehicle{
    // defining the same method as in the parent class

    public static void main(String[] args) {
        Bike2 obj=new Bike2();// creating object
        obj.run();
    }
    public void run (){
        System.out.println("Bike is running safely");

           }
}
