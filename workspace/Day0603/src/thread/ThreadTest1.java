package thread;

public class ThreadTest1 {

	public static void main(String[] args) {
		PrintThread1 pt1 = new PrintThread1();
		PrintThread2 pt2 = new PrintThread2();
		pt1.start();
		pt2.setPriority(Thread.MAX_PRIORITY);
		pt2.start();
	}

}

class PrintThread1 extends Thread {
	@Override
	public void run() {
		double sum = 0;
		for (int i = 0; i < 10000000; i++) {
			sum += Math.cos(i);
		}
		System.out.println("cos = " + sum);
	}
}

class PrintThread2 extends Thread {
	@Override
	public void run() {
		double sum = 0;
		for (int i = 0; i< 10000000; i++) {
			sum += Math.sin(i);
		}
		System.out.println("sin = " + sum);
	}
}