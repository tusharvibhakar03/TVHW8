package methodoverriding24;

public class Test2 {
    public static void main(String[] args) {
        SBI s=new SBI();
        Icici i=new Icici();
        Axis a= new Axis();
        System.out.println("SBI Rate of Interst"+s.getRateOfInterest());
        System.out.println("Icici Rate of Interest"+i.getRateOfInterest());
        System.out.println("Axis Rate of Interest"+a.getRateOfInterest());

    }
}
// Test class to create objects and call the methods.


