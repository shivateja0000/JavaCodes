class rec{
    void msg(){
        System.out.println("hi");
        msg();
    }
}
public class Recursion {
    public  static void  main(String [] args){
        rec obj = new rec();
        obj.msg();

    }
}
