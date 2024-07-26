package thread;

public class MemoryTest1 {

	public static void main(String[] args) {
		Memory mem = new Memory(16);
		Download down = new Download(mem);
		Play play = new Play(mem);
		
		down.start();
		play.start();
	}

}
