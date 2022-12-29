package inheritance;

public class GrandFather {
	String hair_clor = "black";
	double height;
	double property = 20.5;

	public GrandFather(double height) {
		this.height = height;
	}
	public static void walk() {
		System.out.println(" GrandFather is Walking");
	}
	public void walk(String name) {
		System.out.println(name+" is Walking");
	}
	public static void main(String[] args) {
		GrandFather grandFather=new GrandFather(5.5);
		grandFather.walk("anirudh");
	}
}
