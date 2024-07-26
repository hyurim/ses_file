
public class MethodTest1 {
	public static void main(String[] args) {
		// 정수 두 개 중에서 큰 수 반환
		System.out.println("[3,5] = " + getIntMax(3,5));
		// 실수 두 개 중에서 큰 수 반환
		System.out.println("[3.23,3.24] = " + getDoubleMax(3.23,3.24));
	}
	
	static int getIntMax(int num1, int num2) {
		return num1 > num2 ? num1 : num2;
	}
	
	static double getDoubleMax(double num1, double num2) {
		return num1 > num2 ? num1 : num2;
	}
}
