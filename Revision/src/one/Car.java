package one;

public class Car {

	static int x;

	public void test() {
//		int y;
		System.out.println(x = x + 1);
	}

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		c1.test();
		c2.test();
		c3.test();
		c1.test();
		c1.test();
	}
}
