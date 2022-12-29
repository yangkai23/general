package inheritance;

public class Father extends GrandFather {

	@Override
	public String toString() {
		return "Father [hair_clor=" + hair_clor + ", height=" + height + ", property=" + property + "]";
	}
	public Father(double height) {
		super(height);
	}
//		@Override
//		public void walk() {
//			System.out.println("Father is Walking");
//		}
//			Father father=new Father(5.7);
//			System.out.println(father);
			public static void main(String[] args) {
				GrandFather grandFather=new GrandFather(5.5);
				Father father=new Father(5.7);
				grandFather.walk();
			}
	
}
