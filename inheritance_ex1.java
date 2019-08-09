class A{
    A(){System.out.println("in A");}
}

class B extends  A{
    B(){System.out.println("in B");}
}

public class inheritance_ex1 {
    public  static void main(String [] args){
        B obj = new B();
    }
}
