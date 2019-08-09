class oper {
	float num1, num2;
	public void add() {
		System.out.println("sum = "+(num1+num2));
	}

}

public class Calc{
	public static void main(String args[]) {
	oper obj = new oper();
	obj.num1=10;
	obj.num2 = 20;
	obj.add();
	
}
}