package thread;

public class Memory {
	int[] buffer;
	int size;
	int progress;
	Memory(int asize){
		size = asize;
		buffer = new int[asize];
		progress = 0;
	}
}
