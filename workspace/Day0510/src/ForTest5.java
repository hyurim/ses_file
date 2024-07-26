
public class ForTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		for(int i = 0; i <= 9; i++) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		int j = 1;
		while(j <= 10) {
			System.out.print(j+" ");
			j++;
		}
		
		System.out.println();
		
		int x = 1;
		do {
			System.out.print(x + " ");
			x = x + 2;
		} while (x <= 10);
		
		System.out.println();
		
		for (int y = 2; y <= 10; y = y+2) {
			System.out.print(y + " ");
		}
		*/
		/*
		for(int i = 0; i <= 100; i = i + 10) {
			System.out.print(i);
		}
		// 5 i--;
		// 10000 / 10
		*/
		int i = 1;
		while(true) {
		    if (i % 5 == 0 && i % 7 == 0) {
		        System.out.print(i);
		        break;
		    }
		    i++;
		}
	
	}

}
