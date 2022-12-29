package Thread;

public class Thread1 extends Thread {
	private int numberToPrint;

	public Thread1(int NumberToPrint) {
		this.numberToPrint = NumberToPrint;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Number is  " + this.numberToPrint + "  printed by " + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
//		for (int i = 1; i <= 100; i++) {
//			Thread1 t1 = new Thread1(i);
//			t1.start();
//		}
	}
}
