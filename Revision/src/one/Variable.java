package one;

public class Variable {
	static int x;// 0
	double a = 2;// 0.0
	float f;// 0.0
	char c;// \u0000
	boolean b; // false

	public static void demo() {
		System.out.println("Demo");
	}

	public static void test() {
		int y;
//		System.out.println(y);
		System.out.println(x);
		demo();
	}

	public static void main(String[] args) {
		Variable variable = new Variable();
		System.out.println(variable.a);
		System.out.println(variable.f);
		System.out.println(variable.c);
		System.out.println(Variable.x);
		System.out.println(variable.x);
		System.out.println(x);
//		variable.test();
	}
}
