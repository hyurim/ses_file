package thread;

public class Play extends Thread{
	Memory mem;
	Play(Memory amem){
		mem = amem;
	}
	@Override
	public void run() {
		for(;;) {
			for (int off = 0; off < mem.progress; off++) {
				System.out.print(mem.buffer[off] + " ");
			}
			System.out.println();
			if (mem.progress == mem.size) break;
			try { Thread.sleep(500);} catch (InterruptedException e) {;}
		}
	}
}
