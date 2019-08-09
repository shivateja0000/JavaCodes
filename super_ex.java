class Animal{
    String color = " Blue";
}
class Dog extends Animal{
    String color = " Green";
}

class BabyDog extends Dog{
    String color = " Red";
    void msg(){
        System.out.println(color);
        System.out.println(super.color);  // comes from parent class
        System.out.println(this.color);



    }
}


public class super_ex {
    public static void main(String [] args){
        BabyDog obj =new BabyDog();
        obj.msg();
     }

}
