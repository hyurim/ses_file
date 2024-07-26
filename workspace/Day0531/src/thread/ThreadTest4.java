package thread;

import java.awt.Toolkit;

public class ThreadTest4 {

	public static void main(String[] args) {
		PrintThreadChar pt1 = new PrintThreadChar('T');
		pt1.start();
		PrintThreadChar pt2 = new PrintThreadChar('.');
		pt2.start();
		BeepThread bp = new BeepThread(5, 1000);
		bp.start();

		
		for(int num = 0; num < 30; num++) {
			System.out.print("O");
			try {
				Thread.sleep(200);
			}
			catch (InterruptedException e) {
				
			}
		}

	}

}

class PrintThreadChar extends Thread {
	char ch;
	
	public PrintThreadChar(char ch) {
		this.ch = ch;
	}

	@Override
	public void run() {
		for(int num = 0; num < 30; num++) {
			System.out.print(ch);
			try {
				Thread.sleep(100);
			}
			catch (InterruptedException e) {
			}
		}
	}
}

class BeepThread extends Thread {
	int count;
	int gap;
	Toolkit tool = Toolkit.getDefaultToolkit();
	public BeepThread(int count, int gap) {
		this.count = count;
		this.gap = gap;
	}
	public void run() {
		for (int num = 0; num < count; num++) {
			tool.beep();
			try {
				Thread.sleep(gap);
			} catch (InterruptedException e) {
			}
		}
	}
	
}