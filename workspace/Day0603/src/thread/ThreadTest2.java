package thread;

public class ThreadTest2 {

	public static void main(String[] args) {
		PrintThread pt1 = new PrintThread();
		pt1.setDaemon(true);
		pt1.start();
		
		for(int i = 0; i < 20; i++) {
			System.out.print(i);
			try { Thread.sleep(500); } catch(InterruptedException e) { }
		}
	}

}

class PrintThread extends Thread {
	@Override
	public void run() {
		while(true) {
			System.out.print("save");
			try { Thread.sleep(2000); } catch(InterruptedException e) { }
		}
	}
}