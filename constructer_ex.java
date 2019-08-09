public class constructer_ex {
    constructer_ex(){
        System.out.println("inside constructor");
    }
    constructer_ex(int a){   // constructor overloading
        System.out.println(a);
    }
    void msg(){
        System.out.println("HI");
    }
}

class Hi{
    public  static  void main(String[] args)
    {
        constructer_ex obj = new constructer_ex();
        obj.msg();
        constructer_ex obj1 = new constructer_ex();
        obj1.msg();
        constructer_ex obj2 = new constructer_ex(3);



    }
}
