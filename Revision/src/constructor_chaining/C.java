package constructor_chaining;

public class C extends B{
int c;
	public C(int a,int b) {
		super(a,b);
		System.out.println(a+"  in class C");
//		this.c=a;
	}
public static void main(String[] args) {
	C c=new C(2,3);
}
}
