class A1{
    A1(){System.out.println("in A1");}
}

class B1 extends A1{
    B1(){System.out.println("in B1");}
    B1(int i){System.out.println(i);}
}
public class inheritance_ex2 {
    public static void main(String[] args){
        B1 obj = new B1(2);
    }
}
