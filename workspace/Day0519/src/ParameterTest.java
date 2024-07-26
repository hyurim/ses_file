
public class ParameterTest {

	public static void main(String[] args) {
		int[] num = {2, 3, 4};
		System.out.println(getDouble(num));

	}

	static int getDouble(int[] value) {
		return value[0] *= 2;
	}
}
