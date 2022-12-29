package one;

public class StaticBlocks {
	// for both combination of instance blocks and non-instance blocks
	static {
		{
			System.out.println("inner block");
		}
		System.out.println("this is static block");

	}

	{
		System.out.println("instance block 1");
	}

	public static void main(String[] args) {
		StaticBlocks blocks = new StaticBlocks();
		StaticBlocks blocks2 = new StaticBlocks();
		System.out.println(blocks + " " + blocks2);
	}

	static {
		System.out.println("static block2 ");
	}
	{
		System.out.println("instance block 2");
	}
}
