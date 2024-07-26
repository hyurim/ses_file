package generic;

public class GenericTest2 {

	public static void main(String[] args) {
		IntBox bi = new IntBox(1234);
		int biv = bi.get();
		System.out.println(biv);
		
		DoubleBox bd = new DoubleBox(56.78);
		double bdv = bd.get();
		System.out.println(bdv);
		
		ObjectBox bio = new ObjectBox(1234);
	}

}
