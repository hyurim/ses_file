package thread;

public class ThreadTest5 {

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
//			if(num == 5) pt.suspend();
//			if(num == 25) pt.resume();
		}	
	}
}
