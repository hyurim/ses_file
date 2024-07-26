package thread;

public class ThreadTest1 {

	public static void main(String[] args) {
		PrintRunnble pr = new PrintRunnble();
		Thread th = new Thread(pr);		
		th.start();
		
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

class PrintClass {
	public void printChar() {
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


class PrintRunnble extends PrintClass implements Runnable {
	@Override
	public void run() {
		printChar();
	}
}