package generic;

public class Box<T> {
	T value;
	
	public Box(T value) {
		this.value = value;
	}
	
	T get() {
		return value;
	}
	
	void set(T value) {
		this.value = value;
	}
}
