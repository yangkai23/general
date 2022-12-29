package constructor_chaining;

public class D  extends A{
	D() {
		this(5);
		System.out.println("no param constructor");
	}
			
	D(int a) {
		super(2);
		System.out.println(a);
	}

	D(String a, double b) {
		this();
		System.out.println(a + "   " + b);
	}

	D(char c) {
		this("ani", 2.5);
		System.out.println(c);
	}

	public static void main(String[] args) {
		D d = new D('n');
	}

}
