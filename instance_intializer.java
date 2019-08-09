class  ex1{
    ex1(){System.out.println("inside constructor");}
    {System.out.println("inside intializer block");}
    static
    {System.out.println("inside static block");}
}
public class instance_intializer {
    public static void main(String[] args) {
        ex1 obj = new ex1();
        ex1 obj1 = new ex1();

    }
}
