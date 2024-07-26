package thread;

import java.security.PublicKey;

public class ThreadTest2 {

	public static void main(String[] args) {
		PrintThread pt = new PrintThread();
		pt.start();
		for(int num = 0; num < 30; num++) {
			System.out.print("0");
			try {
				Thread.sleep(200);
			}
			catch (InterruptedException e) {
				
			}
		}

	}

}

class PrintThread extends Thread {
	@Override
	public void run() {
		for(int num = 0; num < 30; num++) {
			System.out.print("X");
			try {
				Thread.sleep(100);
			}
			catch (InterruptedException e) {
				
			}
		}
	}
}