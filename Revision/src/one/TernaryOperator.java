package one;

public class TernaryOperator {
	public TernaryOperator() {
		{
			System.out.println("block inside constructor");
		}
	}

	// Blocks
	{
		System.out.println("I'm non static block");
	}

	public static void main(String[] args) {
		System.out.println("start");
		TernaryOperator operator = new TernaryOperator();
		System.out.println(operator);
		System.out.println("end");
	}

	{
		{
			System.out.println("Second inner block");
		}
		System.out.println("second instance block");
	}
}
