package generic;

public class ObjectBox {

	Object value;
	
	public ObjectBox(Object value) {
		this.value = value;
	}
	
	Object get() {
		return value;
	}
	
	void set(Object value) {
		this.value = value;
	}

}
