package thread;

public class Download  extends Thread{
	Memory mem;
	public Download(Memory mem) {
		this.mem = mem;
	}
	
	@Override
	public void run() {
		for(int off = 0; off < mem.size; off++) {
			mem.buffer[off] = off;
			mem.progress = off +1;
			try { Thread.sleep(200); } catch (InterruptedException e ) {	
			}
		}
	}
}
