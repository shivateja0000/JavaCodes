class Emp{
    int id;
    int salary;
    static String ceo = " TEJA ";
    static {
        System.out.println("Inside static block runs before psvm");
    }
    void show(){
        System.out.println(id + "   "+salary +"    "+ceo);
    }
}


public class static_ex {
    public static void main(String[] args){
        Emp siva = new Emp();
        siva.id = 101280;
        siva.salary = 20;
        //siva.ceo = "sid";
        siva.show();

        Emp siva1 = new Emp();
        siva1.id = 10128000;
        siva1.salary = 2000;
        //siva1.ceo = "sid";
        siva1.show();
        System.out.println(Emp.ceo); // static variables do not require object to access them

    }
}
