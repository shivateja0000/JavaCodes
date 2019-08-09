import javax.print.DocFlavor;
 class Innerclass_ex {
    public  void msg(){System.out.println("hi");}
    class Inner{
        public void inn(){System.out.println("inner class");}
    }
}
class hi{
    public  static  void  main(String [] args)
    {
        Innerclass_ex obj = new Innerclass_ex();
        obj.msg();
        Innerclass_ex.Inner obj1 = obj.new Inner();
        obj1.inn();

    }
}