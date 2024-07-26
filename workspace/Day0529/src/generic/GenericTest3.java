package generic;

import java.util.ArrayList;
import java.util.List;

public class GenericTest3 {

	public static void main(String[] args) {
		Box<Integer> bi = new Box<>(1234);
		System.out.println(bi.get());
		
		Box<Double> bd = new Box<>(3.14);
		System.out.println(bd.get());
		
		System.out.println(bi.getClass());
		System.out.println(bd.getClass());
		/*
		IntBox bi = new IntBox(1234);
		int biv = bi.get();
		System.out.println(biv);
		
		DoubleBox bd = new DoubleBox(56.78);
		double bdv = bd.get();
		System.out.println(bdv);
		
		ObjectBox bio = new ObjectBox(1234);
		*/
	}

}
