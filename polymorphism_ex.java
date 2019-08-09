class vehicle{
    void run(){
        System.out.println("running vehicle");
    }
}
class Bike extends vehicle{
    @Override
    void run(){
        System.out.println("running bike");
    }
}
public class polymorphism_ex {
     public static void main(String [] args)
     {
         vehicle obj = new Bike();
         obj.run();
         vehicle obj1 = new vehicle();
         obj1.run();
         Bike obj2 = new Bike();
         obj2.run();

     }
}
