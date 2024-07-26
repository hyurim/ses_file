package thread;

public class ThreadTest3 {

	public static void main(String[] args) {
		Thread th = new Thread(m);		
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
	static Runnable m = new Runnable() {
		
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
	};
}



//
//
//class PrintRunnble extends PrintClass implements Runnable {
//	@Override
//	public void run() {
//		printChar();
//	}
//}