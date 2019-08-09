

/**
 * @author shiva_teja
 *
 */
public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World"); // prints hello world to console
		int i = 3;
		double k = 36.5;
		System.out.println(k);
		double j = 9;
		System.out.println(j);
		float num = 9f;
		System.out.println(num);
		long ex1 = 10l;
		System.out.println(ex1);
		char ex = 'a';
		System.out.println(ex);
		char hi = 110;
		System.out.println(hi);

		// type casting rotation

		int c = 210;
		byte by = (byte) c;
		System.out.println(by);

		// type casting without rotation

		int c1 = 10; // in range of byte
		byte by1 = (byte) c1;
		System.out.println(by1);

		int m = 4, n = 5;
		System.out.println(m + n);
		System.out.println(m - n);
		System.out.println(m * n);
		System.out.println((double) m / n);
		System.out.println(m % n);
		System.out.println(m++);
		System.out.println(++m);
		int m1 = 0;

		if (m1 % 2 == 0) {
			System.out.println("even number");
		} else if (m1 % 2 != 0) {
			System.out.println("odd number");
		}

		int ter = 1;
		ter = ter > 3 ? 10 : 20; // Ternary operator
		System.out.println(ter);
		ter = 45;

		switch (ter) {
		case 1: {
			System.out.println("one");
			break; // comes out of loop as soon as break is encountered
		}
		case 2: {
			System.out.println("two");
			break;
		}
		case 3: {
			System.out.println("three");
			break;
		}
		default:
			System.out.println("nothing matches");
		}

		n = 5;
		while (n > 0) {
			System.out.println("Inside While Loop");
			n--;
		}

		n = 3;
		do {
			System.out.println("inside do loop");

		} while (n > 5);

		// for loop

		for (int tab = 0; tab < 5; tab++) {
			System.out.println("inside tabfor");
		}
		for (int si = 0; si < 4; si++) {
			for (int star = 0; star < 4; star++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for (int si = 0; si < 4; si++) {
			for (int star = 0; star < 4; star++) {
				System.out.print((star+1)+" ");
			}
			System.out.println();
		}
		
		
		

	}

}
