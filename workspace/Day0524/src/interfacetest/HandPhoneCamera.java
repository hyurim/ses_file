package interfacetest;

public class HandPhoneCamera extends HandPhone implements Camera, Mp3 {

	@Override
	public void takePicture() {
		System.out.println("사진 찍기");
	}

	@Override
	public void intro() {
		// TODO Auto-generated method stub
		Mp3.super.intro();
	}

	
	
}
