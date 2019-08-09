
class animal1{
    animal1(){
        System.out.println("inside animal constructor");
    }
    void eat(){
        System.out.println(" animal eats");
    }
}
class dog1 extends animal1{
    dog1(){
        super();// invokes parent constructor
        super.eat();
        eat();
    }
    void eat(){
        System.out.println("Dog eats");
    }

}
public class super_constructor {
    public static void main(String[] args)
    {
        dog1 obj = new dog1();
        obj.eat();
    }
}