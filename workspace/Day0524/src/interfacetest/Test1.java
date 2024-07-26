package interfacetest;

import net.datasa.vo.A;

public class Test1 {

	public static void main(String[] args) {
		HandPhoneCamera phone = new HandPhoneCamera();
		phone.call();
		phone.receive();
		phone.takePicture();
		
		A a = new A();
	}

}
