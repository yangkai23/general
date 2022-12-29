package inheritance;

public class Son extends GrandFather{

	public Son(double height) {
		super(height);
	}
	
			@Override
	public String toString() {
		return "Son [hair_clor=" + hair_clor + ", height=" + height + ", property=" + property + "]";
	}

			public static void main(String[] args) {
				Son son=new Son(6.1);
				System.out.println(son);
			}
}
