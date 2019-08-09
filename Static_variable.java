public class Static_variable {
    static {
        System.out.println("static block executes first");
    }
    static int count; //auto initialized to zero
    void msg(){
        System.out.println(count);
        count++;

    }
    Static_variable(){
        System.out.println("inside constructor");
    }
}
 class ex{
    public static void main(String[] args){
        Static_variable obj = new Static_variable();
        Static_variable obj1 = new Static_variable();
        Static_variable obj2 = new Static_variable();
        obj.msg();
        obj1.msg();
        obj2.msg();


    }

}
