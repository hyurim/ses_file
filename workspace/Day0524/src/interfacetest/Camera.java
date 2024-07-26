package interfacetest;

public interface Camera {
	void takePicture();
	
	public default void intro() {
		System.out.println("aasd");
	}
}
