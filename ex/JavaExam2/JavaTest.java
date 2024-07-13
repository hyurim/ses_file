# �ڹ� ���� ���� ����
# �ۼ� ���� : 2021�� 12�� 25��

###########################################################    
## 2�� ##

==============================
# FirstConsole
class FirstConsole {
	public static void main(String[] args) {
		System.out.println("Java Example Program");
	}
}

==============================
# FirstEclipse
class FirstEclipse {
	public static void main(String[] args) {
		System.out.println("Java Example Program");
	}
}

==============================
# print
class JavaTest {
	public static void main(String[] args) {
		System.out.println("One");
		System.out.println("Two");
		System.out.print("Three");
		System.out.print("Four");
	}
}

������
One
Two
ThreeFour

==============================
# print2
class JavaTest {
	public static void main(String[] args) {
		int i = 123;
		double d = 3.14;
		String str = "���ڿ�";
		System.out.println("i = " + i + ", d = " + d + ", str = " + str);
	}
}

������
i = 123, d = 3.14, str = ���ڿ�

==============================
# scanner
class JavaTest {
	public static void main(String[] args) {
		java.util.Scanner scaner = new java.util.Scanner(System.in);

		System.out.print("�̸��� �Է��Ͻÿ� : ");
		String name = scaner.nextLine();
		System.out.println("�ȳ��ϼ��� " + name + "��.");
		
		System.out.print("���̸� �Է��Ͻÿ� : ");
		int age = scaner.nextInt();
		System.out.println("����� " + age + "���Դϴ�.");
		
		scaner.close();
	}
}

==============================
# dialog
class JavaTest {
	public static void main(String[] args) {
		String name = javax.swing.JOptionPane.showInputDialog("�̸��� �Է��Ͻÿ�");
		System.out.println("�ȳ��ϼ��� " + name + "��.");
		
		String agestr = javax.swing.JOptionPane.showInputDialog("���̸� �Է��Ͻÿ�");
		int age = Integer.parseInt(agestr);
		System.out.println("����� " + age + "���Դϴ�.");
	}
}

###########################################################    
## 3�� ##

==============================
# int
class JavaTest {
	public static void main(String[] args) {
		int value = 1234;
		System.out.println(value);
	}
}

������
1234

==============================
# assign
class JavaTest {
	public static void main(String[] args) {
		int value = 1234;
		System.out.println(value);
		value = 5678;
		System.out.println(value);
	}
}

������
1234
5678

==============================
# constant
class JavaTest {
	public static void main(String[] args) {
		final double RATE = 3.28;
		System.out.println("������ : " + RATE + "%");
		int deposit = 10000;
		System.out.println("1�� �� ���� : " + 
				deposit * RATE / 100 + "��");
	}
}

������
������ : 3.28%
1�� �� ���� : 328.0��

==============================
# radix
class JavaTest { 
	public static void main(String[] args) {
		int a = 10;
		int b = 0x10;
		int c = 015;
		int d = 0b1001;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}

������
10
16
13
9

==============================
# underbar
class JavaTest { 
	public static void main(String[] args) {
		long price = 12_3456_7890_1234L;
		System.out.println(price);
	}
}

������
12345678901234

==============================
# overflow
class JavaTest {
	public static void main(String[] args) {
		byte value = 127;
		value++;
		System.out.println(value);
	}
}

������
-128

==============================
# overflow2
class JavaTest {
	public static void main(String[] args) {
		int value = 1234567890;
		value = value * 2;
		System.out.println(value);
	}
}

������
-1825831516

==============================
# precision
class JavaTest {
	public static void main(String[] args) {
		float value = 12345.123456789f;
		System.out.println(value);
		double value2 = 12345.123456789;
		System.out.println(value2);
		double pie = 3.14159265358979323843363279502884;
		System.out.println(pie);
	}
}

������
12345.123
12345.123456789
3.141592653589793

==============================
# precision2
class JavaTest {
	public static void main(String[] args) {
		float f = 0f;
		
		for (int i = 0; i < 1000; i++) {
			f = f + 0.1f;
		}
		System.out.println(f);
	}
}

������
99.99905

==============================
# char
class JavaTest {
	public static void main(String[] args) {
		char ch = '��';
		System.out.println(ch);
		int i = ch;
		System.out.println(i);
	}
}

������
��
54620

==============================
# escape
class JavaTest {
	public static void main(String[] args) {
		char yen = '\u00a5';
		System.out.print(yen);
		char omega = '\u03c9';
		System.out.print(omega);
		System.out.print('\n');
		char quot = '\'';
		System.out.println(quot);
	}
}

������
?��
'

==============================
# string
class JavaTest {
	public static void main(String[] args) {
		String str = "���ѹα�";
		System.out.println(str);
	}
}

������
���ѹα�

==============================
# longstring
class JavaTest {
	public static void main(String[] args) {
		String str = "�Ƹ��ٿ� �̶��� �ݼ����꿡 " +
			"�ܱ� �Ҿƹ����� \"��\" �����ð�\n" + 
			"�������� ������ ���� ����� " + 
			"���ռ� �Ǹ��� �ι��� ����.";
		System.out.print(str);
	}
}

������	
�Ƹ��ٿ� �̶��� �ݼ����꿡 �ܱ� �Ҿƹ����� "��" �����ð�
�������� ������ ���� ����� ���ռ� �Ǹ��� �ι��� ����.

==============================
# textblock
public class JavaTest {
	public static void main(String[] args) {
		String str = """		
			�Ƹ��ٿ� �̶��� �ݼ����꿡
			�ܱ� �Ҿƹ����� "��" �����ð� 
			'��������' ������ ���� �����
			���ռ� �Ǹ��� �ι��� ����.
			""";
		System.out.println(str);
	}
}

������	
�Ƹ��ٿ� �̶��� �ݼ����꿡
�ܱ� �Ҿƹ����� "��" �����ð�
'��������' ������ ���� �����
���ռ� �Ǹ��� �ι��� ����.

==============================
# textblockescape
public class JavaTest {
	public static void main(String[] args) {
		String human = """
			�̸� : �����    \s        
			���� : 39        \s                
			���� : ���α׷���\s
			""";
		System.out.println(human);
	}
}

==============================
# textblockliteral
public class JavaTest {
	public static void main(String[] args) {
		String str = "HTML example\n" + """
				<body>
				    <p>����</p>
				</body>
				""";
		System.out.println(str);
	}
}


������	
HTML example
<body>
    <p>����</p>
</body>

==============================
# textblockliteral2
public class JavaTest {
	public static void main(String[] args) {
		String name = "�����";
		String str = """
				�ȳ��ϼ���.
				�� �̸���\s""" + name + """
				�Դϴ�.
				�� ��Ź �帳�ϴ�.
				""";  
		System.out.println(str);
	}
}

������	
�ȳ��ϼ���.
�� �̸��� ������Դϴ�.
�� ��Ź �帳�ϴ�.

==============================
# boolean
class JavaTest {
	public static void main(String[] args) {
		int a = 3;
		boolean b = (a == 3);
		if (b) {
			System.out.println("a�� 3�̴�.");
		}
	}
}

������
a�� 3�̴�.

###########################################################    
## 4�� ##

==============================
# if
class JavaTest {
	public static void main(String[] args) {
		int age = 21;
		
		if (age >= 19)
			System.out.println("�����Դϴ�.");
	}
}

������
�����Դϴ�.

==============================
# ifdialog
class JavaTest {
	public static void main(String[] args) {
		int age = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("�� ����̴�?"));
		
		if (age >= 19)
			System.out.println("�����Դϴ�.");
	}
}


==============================
# ifblock
class JavaTest {
	public static void main(String[] args) {
		int age = 21;
		
		if (age >= 19) {
			System.out.println("�����Դϴ�.");
			System.out.println("���� ����.");
		}
	}
}

������
�����Դϴ�.
���� ����.

==============================
# ifblock2
class JavaTest {
	public static void main(String[] args) {
		int age = 15;
		
		if (age >= 19)
			System.out.println("�����Դϴ�.");
			System.out.println("���� ����.");
	}
}

������
���� ����.

==============================
# ifelse
class JavaTest {
	public static void main(String[] args) {
		int age = 15;
		
		if (age >= 19) {
			System.out.println("�����Դϴ�.");
		} else {
			System.out.println("����Դϴ�.");
		}
	}
}

������
����Դϴ�.

==============================
# ifelseblock
class JavaTest {
	public static void main(String[] args) {
		int age = 15;
		
		if (age >= 19) {
			System.out.println("�����Դϴ�.");
			System.out.println("������ ����.");
		} else {
			System.out.println("����Դϴ�.");
			System.out.println("�ֵ��� ����!");
		}
	}
}

������
����Դϴ�.
�ֵ��� ����!

==============================
# ifelseif
class JavaTest {
	public static void main(String[] args) {
		int age = 16;
		
		if (age >= 19) {
			System.out.println("�����Դϴ�.");
		} else if (age > 12) {
			System.out.println("û�ҳ��Դϴ�.");
		} else {
			System.out.println("����Դϴ�.");
		}
	}
}

������
û�ҳ��Դϴ�.

==============================
# ifif
class JavaTest {
	public static void main(String[] args) {
		int age = 25;
		boolean man = true;
		
		if (age >= 19) {
			if (man) {
				System.out.println("���� ���� : 25000��");
			} else {
				System.out.println("���� ���� : 21000��");
			}
		} else { 
			System.out.println("û�ҳ� : 15000��");
		}
	}
}

������
���� ���� : 25000��

==============================
# switch
class JavaTest {
	public static void main(String[] args) {
		int ranking = 2;
		
		if (ranking == 1) {
			System.out.println("�����մϴ�. �ݸ޴��̿���.");
		} else if (ranking == 2) {
			System.out.println("���޴��� �����մϴ�.");
		} else if (ranking == 3) {
			System.out.println("���޴��Դϴ�.");
		} else {
			System.out.println("�������� �帳�ϴ�.");
		}
	}
}

������
���޴��� �����մϴ�.

==============================
# switch2
class JavaTest {
	public static void main(String[] args) {
		int ranking = 2;
		
		switch (ranking) {
		case 1:
			System.out.println("�����մϴ�. �ݸ޴��̿���.");
			break;
		case 2:
			System.out.println("���޴��� �����մϴ�.");
			break;
		case 3:
			System.out.println("���޴��Դϴ�.");
			break;
		default:
			System.out.println("�������� �帳�ϴ�.");
			break;
		}
	}
}

������
���޴��� �����մϴ�.

==============================
# nobreak
class JavaTest {
	public static void main(String[] args) {
		int ranking = 3;
		
		switch (ranking) {
		case 1:
			System.out.println("����Դϴ�.");
			break;
		case 2:
		case 3:
			System.out.println("������Դϴ�.");
			break;
		case 4:
		case 5:
			System.out.println("������Դϴ�.");
			break;
		}
	}
}

������
������Դϴ�.

==============================
# nobreak2
class JavaTest {
	public static void main(String[] args) {
		int days;
		int month = 5;
		
		switch (month) {
		case 2:
			days = 28;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		default:
			days = 31;
			break;
		}
		
		System.out.println(month + "���� " + days + "�ϱ��� �ֽ��ϴ�.");
	}
}

������	
5���� 31�ϱ��� �ֽ��ϴ�.


==============================
# stringcase
class JavaTest {
	public static void main(String[] args) {
		String country = "China";
		
		switch (country) {
		case "Korea":
			System.out.println("Seoul");
			break;
		case "China":
			System.out.println("Beijing");
			break;
		case "Japan":
			System.out.println("Tokyo");
			break;
		}
	}
}

������
Beijing

==============================
# stringcase2
class JavaTest {
	public static void main(String[] args) {
		String country = "CHINA";
		
		switch (country.toLowerCase()) {
		case "korea":
			System.out.println("Seoul");
			break;
		case "china":
			System.out.println("Beijing");
			break;
		case "japan":
			System.out.println("Tokyo");
			break;
		}
	}
}

������
Beijing

==============================
# rangecase
class JavaTest {
	public static void main(String[] args) {
		int score = 82;
		
		switch (score/10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
			break;
		}
	}
}

������
B

==============================
# rangeif
class JavaTest {
	public static void main(String[] args) {
		double richter = 6.5;
		
		if (richter < 3.5) {
			System.out.println("���� �� ���ų� ���ذ� ���� ����");
		} else if (richter < 4.8) {
			System.out.println("������ ��鸮�ų� ����� ���ظ� ������.");
		} else if (richter < 6.1) {
			System.out.println("���� ������ �ν��� �ǹ����� ���ظ� ������.");
		} else if (richter < 7.5) {
			System.out.println("�ݰ� 160Km ������ �ǹ��� �ı��Ѵ�.");
		} else if (richter < 8.9) {
			System.out.println("���� ������ �ɰ��� ���ظ� ������.");
		} else {
			System.out.println("��õ Km ������ ����ȭ��Ų��.");
		}
	}
}

������	
�ݰ� 160Km ������ �ǹ��� �ı��Ѵ�.

==============================
# switchexp
public class JavaTest {
	public static void main(String[] args) {
		int ranking = 2;
		String medal = 
				switch (ranking) {
				case 1 -> "�ݸ޴�";
				case 2 -> "���޴�";
				case 3 -> "���޴�";
				default -> "������";
				};
		System.out.println(medal + "�� �����մϴ�.");
	}
}

������	
���޴��� �����մϴ�.

==============================
# switchcommand
public class JavaTest {
	public static void main(String[] args) {
		int ranking = 1;
		switch (ranking) {
		case 1 -> System.out.println("�����մϴ�. �ݸ޴��̿���.");
		case 2 -> System.out.println("���޴��� �����մϴ�.");
		case 3 -> System.out.println("���޴��Դϴ�.");
		default -> System.out.println("�������� �帳�ϴ�.");
		};
	}
}

������	
�����մϴ�. �ݸ޴��̿���.

==============================
# yield
public class JavaTest {
	public static void main(String[] args) {
		int ranking = 1;
		String medal = 
				switch (ranking) {
				case 1 -> {
					System.out.println("�����մϴ�. ");
					yield "�ݸ޴�";
				}
				case 2 -> "���޴�";
				case 3 -> "���޴�";
				default -> "������";
				};
		System.out.println(medal + "�� �����մϴ�.");
	}
}

������	
�����մϴ�. 
�ݸ޴��� �����մϴ�.


###########################################################    
## 5�� ##


==============================
# repeat
class JavaTest {
	public static void main(String[] args) {
		System.out.println("1�� �л� ���� ó��");
		System.out.println("2�� �л� ���� ó��");
		System.out.println("3�� �л� ���� ó��");
		System.out.println("4�� �л� ���� ó��");
		System.out.println("5�� �л� ���� ó��");
	}
}

������
1�� �л� ���� ó��
2�� �л� ���� ó��
3�� �л� ���� ó��
4�� �л� ���� ó��
5�� �л� ���� ó��


==============================
# for
class JavaTest {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + "�� �л� ���� ó��");
		}
	}
}


==============================
# sum100
class JavaTest {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++){
			sum = sum + i;
		}
		System.out.println("�հ� = " + sum);
	}
}

������
�հ� = 5050

==============================
# oddsum
class JavaTest {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i = i + 2){
			sum = sum + i;
		}
		System.out.println("�հ� = " + sum);
	}
}

������
�հ� = 2500

==============================
# floatloop
class JavaTest {
	public static void main(String[] args) {
		for (int i = 10; i > 0; i--){
			System.out.print(i + ", ");
		}
		System.out.println();
		for (double d = 0; d < 3.0; d = d + 0.5) {
			System.out.print(d + ", ");
		}
	}
}

������
10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 
0.0, 0.5, 1.0, 1.5, 2.0, 2.5,

==============================
# twocontrol
class JavaTest {
	public static void main(String[] args) {
		for (int i = 0, j = 1; i < 5; i++, j = j + 2){
			System.out.println("i = " + i + ", j = " + j);
		}
	}
}

������
i = 0, j = 1
i = 1, j = 3
i = 2, j = 5
i = 3, j = 7
i = 4, j = 9

==============================
# forblock
class JavaTest {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + "�� �л� ���� ó��");
		}
		for (int i = 1; i <= 3; i++) {
			System.out.println(i + "�� ������ ���� ó��");
		}
	}
}

������
1�� �л� ���� ó��
2�� �л� ���� ó��
3�� �л� ���� ó��
4�� �л� ���� ó��
5�� �л� ���� ó��
1�� ������ ���� ó��
2�� ������ ���� ó��
3�� ������ ���� ó��

==============================
# over100
class JavaTest {
	public static void main(String[] args) {
		int sum = 0;
		int i;
		for (i = 1; i < 100; i++) {
			sum = sum + i;
			if (sum > 100) break;
		}
		
		System.out.println("�հ谡 100�� �Ѵ� ������ " + i + "�Դϴ�.");
	}
}

������	
�հ谡 100�� �Ѵ� ������ 14�Դϴ�.


==============================
# gugu
class JavaTest {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1;j <= 9;j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
			System.out.println("");
		}
	}
}


==============================
# infinite
class JavaTest {
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		int grade;
		for (;;) {
			System.out.print("�� �г��Դϱ�?(1~6) : ");
			grade = scanner.nextInt();
			if (grade >= 1 && grade <= 6) break;
			System.out.println("�ٽ� �Է��Ͻÿ�.");
		}
		System.out.println(grade + "�г��Դϴ�.");
		scanner.close();		
	}
}


==============================
# randnum
class JavaTest {
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		int num = (int)(Math.random() * 10) + 1;
		for (;;) {
			System.out.print("���ڸ� ���� ������(1~10) : ");
			int input = scanner.nextInt();
			if (input == num) {
				System.out.println("�����Դϴ�.");
				break;
			} else if (input > num) {
				System.out.println(input + "���� �� ���� �����Դϴ�.");
			} else {
				System.out.println(input + "���� �� ū �����Դϴ�.");
			}
		}
		scanner.close();		
	}
}


==============================
# triangle
class JavaTest {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			for (int j = 0;j < i;j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}

������
*
**
***
****
*****
******
*******
********
*********
**********

==============================
# triangle2
class JavaTest {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			for (int j = 0;j < 10 - i;j++) {
				System.out.print(' ');
			}
			for (int j = 0;j < i;j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}


==============================
# triangle2_1
class JavaTest {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			for (int j = 1;j <= 10;j++) {
				if (j > 10 - i) {
					System.out.print('*');
				} else {
					System.out.print(' ');
				}
			}
			System.out.println();
		}
	}
}


==============================
# triangle2_2
class JavaTest {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			for (int j = 1;j <= 10;j++) {
				System.out.print(j > 10-i ? '*':' ');
			}
			System.out.println();
		}
	}
}


==============================
# triangle2_3
class JavaTest {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; System.out.println(), i++)
			for (int j = 1;j <= 10;System.out.print(j > 10-i ? '*':' '), j++);
	}
}


==============================
# triangle3
class JavaTest {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			for (int j = 0;j < 10 - i;j++) {
				System.out.print(' ');
			}
			for (int j = 0;j < i * 2 - 1;j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}


==============================
# leibniz1
class JavaTest {
	public static void main(String[] args) {
		double pie = 0;
		boolean plus = true;
		for (int deno = 1;deno < 1000;deno = deno + 2) {
			if (plus) {
				pie = pie + 1.0/deno;
				plus = false;
			} else {
				pie = pie - 1.0/deno;
				plus = true;
			}
		}
		pie *= 4;
		System.out.println("pie = " + pie);
	}
}

������
pie = 3.139592655589785


==============================
# leibniz2
class JavaTest {
	public static void main(String[] args) {
		double pie = 0;
		int sign = 1;
		for (int deno = 1;deno < 1000;deno = deno + 2) {
			pie = pie + (1.0/deno) * sign;
			sign = -sign;
		}
		pie *= 4;
		System.out.println("pie = " + pie);
	}
}


==============================
# leibniz3
class JavaTest {
	public static void main(String[] args) {
		double pie = 0;
		for (int deno = 1;deno < 1000;deno = deno + 4) {
			pie = pie + (1.0/deno) - (1.0/(deno + 2));
		}
		System.out.println("pie = " + pie * 4);
	}
}


==============================
# leibniz4
class JavaTest {
	public static void main(String[] args) {
		for (int end = 10; end <= 10000000; end = end * 10) {
			double pie = 0;
			for (int deno = 1;deno < end;deno = deno + 4) {
				pie = pie + (1.0/deno) - (1.0/(deno + 2));
			}
			System.out.println("pie = " + pie * 4 + 
					"(" + end + "ȸ)");
		}
	}
}

������	
pie = 2.9760461760461765(10ȸ)
pie = 3.121594652591011(100ȸ)
pie = 3.139592655589785(1000ȸ)
pie = 3.141392653591791(10000ȸ)
pie = 3.1415726535897814(100000ȸ)
pie = 3.141590653589692(1000000ȸ)
pie = 3.1415924535897797(10000000ȸ)


==============================
# euler1
class JavaTest {
	public static void main(String[] args) {
		double pie = 0;
		for (int deno = 1;deno < 1000;deno++) {
			pie = pie + (1.0/(deno * deno));
		}
		pie = Math.sqrt(pie * 6);
		System.out.println("pie = " + pie);
	}
}

������
pie = 3.14063710098594

==============================
# euler2
class JavaTest {
	public static void main(String[] args) {
		for (int end = 10; end <= 10000000; end = end * 10) {				
			double pie = 0;
			for (long deno = 1;deno < end;deno++) {
				pie = pie + (1.0/(deno * deno));
			}
			pie = Math.sqrt(pie * 6);
			System.out.println("pie = " + pie + 
					"(" + end + "ȸ)");
		}
	}
}

������	
pie = 3.0395075895610533(10ȸ)
pie = 3.1319807472443624(100ȸ)
pie = 3.14063710098594(1000ȸ)
pie = 3.1414971543976273(10000ȸ)
pie = 3.141583104230963(100000ȸ)
pie = 3.141591698659554(1000000ȸ)
pie = 3.141592558095893(10000000ȸ)

==============================
# while
class JavaTest {
	public static void main(String[] args) {
		int filesize = 720;
		int download = 0;
		
		while (download < filesize) {
			download += 120;
			System.out.println(download + "K �ٿ�ε���....");
		}
		System.out.println("�ٿ�ε� �Ϸ�");
	}
}

������
120K �ٿ�ε���....
240K �ٿ�ε���....
360K �ٿ�ε���....
480K �ٿ�ε���....
600K �ٿ�ε���....
720K �ٿ�ε���....
�ٿ�ε� �Ϸ�

==============================
# while100
class JavaTest {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		while (i <= 100) {
			sum = sum + i;
			i++;
		}
		System.out.println(sum);
	}
}

������
5050

==============================
# fordown
class JavaTest {
	public static void main(String[] args) {
		int filesize = 720;
		
		for (int download = 0;download < filesize;) {
			download += 120;
			System.out.println(download + "K �ٿ�ε���....");
		}
		System.out.println("�ٿ�ε� �Ϸ�");
	}
}

������
120K �ٿ�ε���....
240K �ٿ�ε���....
360K �ٿ�ε���....
480K �ٿ�ε���....
600K �ٿ�ε���....
720K �ٿ�ε���....
�ٿ�ε� �Ϸ�

==============================
# dowhile
class JavaTest {
	public static void main(String[] args) {
		java.util.Scanner scaner = new java.util.Scanner(System.in);
		int num;
		int sum = 0;
		do {
			System.out.print("���ڸ� �Է��ϼ���(���� �� 0) : ");
			num = scaner.nextInt();
			sum = sum + num;
		} while (num != 0);
		System.out.println("�� �հ� = " + sum);
		scaner.close();
	}
}

������	
���ڸ� �Է��ϼ���(���� �� 0) : 3
���ڸ� �Է��ϼ���(���� �� 0) : 5
���ڸ� �Է��ϼ���(���� �� 0) : 4
���ڸ� �Է��ϼ���(���� �� 0) : 0
�� �հ� = 12


==============================
# break
class JavaTest {
	public static void main(String[] args) {
		int[] score = { 88, 94, 72, -8, 23 };
		for (int i = 0; i < 5; i++){
			if (score[i] < 0 || score[i] > 100) break;
			System.out.println((i + 1) + "�� �л��� ���� : " + score[i]);
		}
	}
}

������
1�� �л��� ���� : 88
2�� �л��� ���� : 94
3�� �л��� ���� : 72

==============================
# exitloop
class JavaTest {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1;j <= 9;j++) {
				if (i == 2 && j == 3) break;
				System.out.println(i + " * " + j + " = " + i * j);
			}
			System.out.println("");
		}
	}
}

������
2 * 1 = 2
2 * 2 = 4

3 * 1 = 3
3 * 2 = 6
3 * 3 = 9
3 * 4 = 12
....

==============================
# exitlabel
class JavaTest {
	public static void main(String[] args) {
		dan:
		for (int i = 1; i <= 9; i++) {
			for (int j = 1;j <= 9;j++) {
				if (i == 2 && j == 3) break dan;
				System.out.println(i + " * " + j + " = " + i * j);
			}
			System.out.println("");
		}
	}
}

������
1 * 1 = 1
1 * 2 = 2
1 * 3 = 3
1 * 4 = 4
1 * 5 = 5
1 * 6 = 6
1 * 7 = 7
1 * 8 = 8
1 * 9 = 9

2 * 1 = 2
2 * 2 = 4

==============================
# continue
class JavaTest {
	public static void main(String[] args) {
		int[] score = { 88, 94, -1, 79, 23 };
		for (int i = 0; i < 5; i++){
			if (score[i] == -1) continue;
			System.out.println((i + 1) + "�� �л��� ���� : " + score[i]);
		}
	}
}

������
1�� �л��� ���� : 88
2�� �л��� ���� : 94
4�� �л��� ���� : 79
5�� �л��� ���� : 23

###########################################################    
## 6�� ##

==============================
# arithmetic
class JavaTest {
	public static void main(String[] args) {
		int a = 6, b = 4;
		System.out.println(a + " + " + b + " = " + (a + b));
		System.out.println(a + " - " + b + " = " + (a - b));
		System.out.println(a + " * " + b + " = " + (a * b));
		System.out.println(a + " / " + b + " = " + (a / b));
		System.out.println(a + " / " + b + " = " + ((float)a / b));
	}
}

������
6 + 4 = 10
6 - 4 = 2
6 * 4 = 24
6 / 4 = 1
6 / 4 = 1.500000

==============================
# modular
class JavaTest {
	public static void main(String[] args) {
		System.out.println("6 %% 4 = " + 6 % 4);
		System.out.println("7 %% 3 = " + 7 % 3);
		System.out.println("5.0 %% 2.3 = " + 5.0 % 2.3);
		System.out.println("14 %% 2 = " + 14 % 2);
		System.out.println("15 %% 2 = " + 15 % 2);
	}
}

������
6 %% 4 = 2
7 %% 3 = 1
5.0 %% 2.3 = 0.40000000000000036
14 %% 2 = 0
15 %% 2 = 1

==============================
# plusequal
class JavaTest {
	public static void main(String[] args) {
		int value = 2;
		value += 3;
		System.out.println("value = " + value);
		value *= 2;
		System.out.println("value = " + value);
	}
}

������
value = 5
value = 10

==============================
# increase
class JavaTest {
	public static void main(String[] args) {
		int value = 2;
		int a = ++value;
		System.out.println("value = " + value + ", a = " + a);
		
		value = 2;
		a = value++;
		System.out.println("value = " + value + ", a = " + a);
	}
}

������
value = 3, a = 3
value = 3, a = 2

==============================
# stringcat
class JavaTest {
	public static void main(String[] args) {
		System.out.println(4 + 5);
		System.out.println("������ " + "��ĥ��");
		System.out.println("�����϶� " + 1989);
		System.out.println(1989 + " �����϶�");
		
		double root2 = 1.414;
		System.out.println("2�� ������ : " + root2);
	}
}

������
9
������ ��ĥ��
�����϶� 1989
1989 �����϶�
2�� ������ : 1.414

==============================
# stringcat2
class JavaTest {
	public static void main(String[] args) {
		System.out.println("�����϶� " + 19 + 89);
		System.out.println(19 + 89 + " �����϶�");
		System.out.println("" + 19 + 89 + " �����϶�");
	}
}

������
�����϶� 1989
108 �����϶�
1989 �����϶�

==============================
# sign
class JavaTest {
	public static void main(String[] args) {
		int value = 8;
		System.out.println(value);
		value = -value;
		System.out.println(value);
	}
}

������
8
-8

==============================
# absolute
class JavaTest {
	public static void main(String[] args) {
		int value = -8;
		if (value < 0) {
			value = -value;
		}
		System.out.println(value);
	}
}

������
8

==============================
# and
class JavaTest {
	public static void main(String[] args) {
		int value = 7;
		
		if (value > 5 && value < 10) {
			System.out.println("���� �ȿ� ����");
		} else {
			System.out.println("���� �ȿ� ����");
		}
	}
}

������
���� �ȿ� ����

==============================
# getabs
class JavaTest {
	public static void main(String[] args) {
		int value = -5;

		System.out.println("���밪 = " + (value > 0 ? value:-value));
	}
}

������
���밪 = 5

==============================
# testeven
class JavaTest {
	public static void main(String[] args) {
		int value = 3;

		System.out.println("value�� " + (value % 2 == 0 ? "¦":"Ȧ") + 
			"���Դϴ�.");
	}
}

������
value�� Ȧ���Դϴ�.

==============================
# stringint
class JavaTest {
	public static void main(String[] args) {
		String num = "123";
		int value = Integer.parseInt(num);
		value++;
		System.out.println("���� = " + value);
		
		String str = String.valueOf(value);
		System.out.println("���ڿ� = " + str);
		
	}
}

������
���� = 124
���ڿ� = 124

==============================
# andor
class JavaTest {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		
		if (a == 1 || b == 2 && c == 10 || d == 10) {
			System.out.println("����");
		} else {
			System.out.println("����");
		}
	}
}

������
����

==============================
# contassign
class JavaTest {
	public static void main(String[] args) {
		int a, b, c, d;
		a = b = c = d = 5;
		System.out.println(c);
	}
}

������
5

###########################################################    
## 7�� ##

==============================
# scorearray
class JavaTest {
	public static void main(String[] args) {
		int[] score = new int[5];
		score[0] = 88;
		score[1] = 99;
		score[2] = 70;
		score[3] = 55;
		score[4] = 100;
		
		for (int i = 0; i < score.length; i++) {
			System.out.println((i + 1) + "�� �л��� ���� : " + score[i]);
		}
	}
}

������
1�� �л��� ���� : 88
2�� �л��� ���� : 99
3�� �л��� ���� : 70
4�� �л��� ���� : 55
5�� �л��� ���� : 100

==============================
# initarray
class JavaTest {
	public static void main(String[] args) {
		int[] score = new int[] { 88, 99, 70, 55, 100 };
		
		for (int i = 0; i < score.length; i++) {
			System.out.println((i + 1) + "�� �л��� ���� : " + score[i]);
		}
	}
}

������
1�� �л��� ���� : 88
2�� �л��� ���� : 99
3�� �л��� ���� : 70
4�� �л��� ���� : 55
5�� �л��� ���� : 100

==============================
# newarray
class JavaTest {
	public static void main(String[] args) {
		// ������ �ʱ�ȭ
		int[] score = { 88, 99, 70, 55, 100 };
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + ", ");
		}
		System.out.println();

		// ���ʱ�ȭ
		score = new int[] {1, 2, 3, 4, 5, 6, 7, 8 };
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + ", ");
		}
	}
}

������
88, 99, 70, 55, 100, 
1, 2, 3, 4, 5, 6, 7, 8,

==============================
# sumarray
class JavaTest {
	public static void main(String[] args) {
		int[] score = { 88, 94, 72, 75, 23 };
		int sum = 0;
		for (int i = 0;i < score.length;i++){
			sum += score[i];
		}
		System.out.println("���� : " + sum);
		System.out.println("��� : " + (float)sum / score.length);
	}
}

������
���� : 352
��� : 70.4

==============================
# rectangular
class JavaTest {
	public static void main(String[] args) {
		int[][] score = { 
				{ 77, 56, 70, 82},
				{ 99, 96, 89, 88},
				{ 81, 69, 62, 80}
			};

		for (int student = 0;student < score.length; student++) {
			System.out.print((student + 1) + "�� �л��� ���� : ");
			for (int subject = 0;subject < score[0].length;subject++) {
				System.out.print(score[student][subject] + " ");
			}
			System.out.println("");
		}
	}
}

������	
1�� �л��� ���� : 77 56 70 82 
2�� �л��� ���� : 99 96 89 88 
3�� �л��� ���� : 81 69 62 80


==============================
# sumarray2
class JavaTest {
	public static void main(String[] args) {
		int[][] score = { 
				{ 77, 56, 70, 82},
				{ 99, 96, 89, 88},
				{ 81, 69, 62, 80}
			};

		int classsum = 0;
		for (int student = 0;student < score.length; student++) {
			int sum = 0;
			for (int subject = 0;subject < score[0].length;subject++) {
				sum += score[student][subject];
			}
			System.out.println((student + 1) + "�� => ���� : " + 
					sum + ", " + "��� : " + (float)sum/score[0].length);
			classsum += sum;
		}
		System.out.print("�б� ��ü ��� : " +
				(float)classsum/(score.length * score[0].length));
	}
}

������	
1�� => ���� : 285, ��� : 71.25
2�� => ���� : 372, ��� : 93.0
3�� => ���� : 292, ��� : 73.0
�б� ��ü ��� : 79.083336


==============================
# ragged
class JavaTest {
	public static void main(String[] args) {
		int[][] score = {
				{77, 56, 70, 82, 95, 96, 98, 82},
				{99, 96},
				{81, 69, 62, 80, 77},
		};

		for (int student = 0;student < score.length; student++) {
			System.out.print((student + 1) + "�� �л��� ���� : ");
			for (int subject = 0;subject < score[student].length;subject++) {
				System.out.print(score[student][subject] + " ");
			}
			System.out.println("");
		}
	}
}

������	
1�� �л��� ���� : 77 56 70 82 95 96 98 82 
2�� �л��� ���� : 99 96 
3�� �л��� ���� : 81 69 62 80 77


==============================
# foreach
class JavaTest {
	public static void main(String[] args) {
		int[] score = { 88, 94, 72, 75, 23 };
		int sum = 0;
		for (int s : score) {
			sum += s;
		}
		System.out.println("���� : " + sum);
		System.out.println("��� : " + (float)sum/score.length);
	}
}

������
���� : 352
��� : 70.4

==============================
# foreachassign
class JavaTest {
	public static void main(String[] args) {
		int[] score = { 88, 94, 72, 75, 23 };
		for (int s : score) {
			s++;
		}
		System.out.println("score[0] = " + score[0]);
	}
}

������
score[0] = 88

==============================
# foreach2
class JavaTest {
	public static void main(String[] args) {
		int[][] score = { 
				{ 77, 56, 70, 82},
				{ 99, 96, 89, 88},
				{ 81, 69, 62, 80}
			};
		
		for (int[] student : score) {
			for (int subject : student) {
				System.out.print(subject + ",");
			}
			System.out.println();
		}
	}
}

������
77,56,70,82,
99,96,89,88,
81,69,62,80,

==============================
# copyprim
class JavaTest {
	public static void main(String[] args) {
		int i = 1;
		int i2 = i;
		
		i2 = 1000;
		System.out.println("i = " + i);
		System.out.println("i2 = " + i2);
	}
}

������
i = 1
i2 = 1000

==============================
# copyref
class JavaTest {
	public static void main(String[] args) {
		int[] ar = { 1, 2, 3 };
		int[] ar2 = ar;
		
		ar2[0] = 1000;
		System.out.println("ar[0] = " + ar[0]);
		System.out.println("ar2[0] = " + ar2[0]);
	}
}

������
ar[0] = 1000
ar2[0] = 1000

==============================
# compareref
class JavaTest {
	public static void main(String[] args) {
		int i = 123, i2 = 123;
		int[] ar = { 1, 2, 3 }, ar2 = { 1, 2, 3 };
		int[] ar3 = ar;

		System.out.println("i�� i2 : " + (i == i2 ? "����":"�ٸ���"));
		System.out.println("ar�� ar2 : " + (ar == ar2 ? "����":"�ٸ���"));
		System.out.println("ar�� ar3 : " + (ar == ar3 ? "����":"�ٸ���"));
	}
}

������
i�� i2 : ����
ar�� ar2 : �ٸ���
ar�� ar3 : ����

==============================
# null
class JavaTest {
	public static void main(String[] args) {
		int[] ar = { 1, 2, 3 };
		System.out.println(ar[0]);
		ar = null;
		System.out.println(ar[0]);
	}
}

������	
1
Exception in thread "main" java.lang.NullPointerException
	at JavaTest.main(JavaTest.java:6)


==============================
# alphabet
class JavaTest {
	public static void main(String[] args) {
		String pop = "Yesterday all my troubles seemed so far away" +
				"Now it looks as though they're here to stay" +
				"Oh, I believe in yesterday" +
				"Suddenly I'm not half the man I used to be";
		pop = pop.toLowerCase();
		int[] alpha = new int[26];
		
		for (int i = 0; i < pop.length(); i++) {
			char ch = pop.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				alpha[ch - 'a']++;
			}
		}
		
		for (int i =0; i < alpha.length; i++) {
			char ch = (char)(i + 'a');
			System.out.println(ch + ":" + alpha[i]);
		}
	}
}

������
a:10
b:3
c:0
d:6
e:19
f:2
g:1
h:7
i:6
....

==============================
# lookup
class JavaTest {
	public static void main(String[] args) {
		int[] arDays = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int month = 5;
		
		int days = arDays[month];
		System.out.println(month + "���� " + days + "�ϱ��� �ֽ��ϴ�.");
	}
}

������	
5���� 31�ϱ��� �ֽ��ϴ�.


==============================
# lookup2
class JavaTest {
	public static void main(String[] args) {
		int rank = 2;
		String[] message = {
			"",
			"�ְ��� �����Դϴ�. �����մϴ�. ",	
			"����� �����Դϴ�.",	
			"�����Դϴ�.",	
			"�ټ� �����մϴ�. �� ����ϼ���.",	
			"�� ���?",	
		};
		
		System.out.println(message[rank]);
	}
}


==============================
# ������
����� �����Դϴ�.


==============================
# lookup3
class JavaTest {
	public static void main(String[] args) {
		int score = 5;
		String[] message = {
			"",
			"�ְ��� �����Դϴ�. �����մϴ�. ",	
			"����� �����Դϴ�.",	
			"�����Դϴ�.",	
			"�ټ� �����մϴ�. �� ����ϼ���.",	
			"�� ���?",	
		};
		int[] rank = {5, 4, 4, 3, 3, 3, 2, 2, 2, 1, 1};
		
		System.out.println(message[rank[score]]);
	}
}

������
�����Դϴ�.

==============================
# roottable
class JavaTest {
	public static void main(String[] args) {
		double[] root = new double[100];
		
		for (int i = 0; i < 100; i++) {
			root[i] = Math.sqrt(i);
		}
		
		System.out.println("2�� ������ : " + root[2]);
	}
}

������
2�� ������ : 1.4142135623730951

==============================
# roottable2
class JavaTest {
	static double[] root = new double[100];
	
	public static void main(String[] args) {
		System.out.println("2�� ������ : " + getRoot(2));
		System.out.println("5�� ������ : " + getRoot(5));
		System.out.println("2�� ������ : " + getRoot(2));
	}
	
	static double getRoot(int i) {
		if (root[i] == 0) {
			root[i] = Math.sqrt(i);
		}
		return root[i];
	}
}

������
2�� ������ : 1.4142135623730951

==============================
# args
class JavaTest {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0;i < args.length; i++) {
			sum += Integer.parseInt(args[i]);
		}
		
		System.out.println("���հ� = " + sum);
	}
}

������
C:\JavaStudy>java JavaTest 12 34
���հ� = 46

C:\JavaStudy>java JavaTest 1 2 3 4 5
���հ� = 15

###########################################################    
## 8�� ##

==============================
# samecode
class JavaTest {
	public static void main(String[] args) {
		int sum;
		sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("1 ~ 10 = " + sum);
		
		sum = 0;
		for (int i = 15; i <= 100; i++) {
			sum += i;
		}
		System.out.println("15 ~ 100 = " + sum);
	}
}

������
1 ~ 10 = 55
15 ~ 100 = 4945

==============================
# method
class JavaTest {
	public static void main(String[] args) {
		System.out.println("1 ~ 10 = " + calcSum(1, 10));
		System.out.println("15 ~ 100 = " + calcSum(15, 100));
	}
	
	static int calcSum(int from, int to) {
		int sum = 0;
		for (int i = from; i <= to; i++) {
			sum += i;
		}
		return sum;
	}
}

������
1 ~ 10 = 55
15 ~ 100 = 4945

==============================
# getdays
class JavaTest {
	public static void main(String[] args) {
		int year = 2016;
		int month = 2;
		
		int days = getMonthDays(year, month);
		System.out.println(year + "�� " + month + "���� " + days + "�ϱ��� �ֽ��ϴ�.");
	}
	
	static int getMonthDays(int year, int month) {
		int[] arDays = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		
		if (month == 2) {
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				return 29;
			}
			return 28;
		} else {
			return arDays[month];
		}
	}
}

������	
2016�� 2���� 29�ϱ��� �ֽ��ϴ�.


==============================
# noarg
class JavaTest {
	public static void main(String[] args) {
		System.out.println("������ " + getDate() + "���Դϴ�.");
	}
	
	static int getDate() {
		java.time.LocalDate today = java.time.LocalDate.now();
		int day = today.getDayOfMonth();
		return day;
	}
}

������
������ 4���Դϴ�.

==============================
# errorreturn
class JavaTest {
	public static void main(String[] args) {
		System.out.println("1 ~ 10 = " + calcSum(1, 10));
		System.out.println("15 ~ 100 = " + calcSum(15, -100));
	}
	
	static int calcSum(int from, int to) {
		if (from > to) {
			return 0;
		}
		int sum = 0;
		for (int i = from; i <= to; i++) {
			sum += i;
		}
		return sum;
	}
}

������
1 ~ 10 = 55
15 ~ 100 = 0

==============================
# void
class JavaTest {
	public static void main(String[] args) {
		printSum(1, 10);
		printSum(15, 100);
	}
	
	static void printSum(int from, int to) {
		int sum = 0;
		for (int i = from; i <= to; i++) {
			sum += i;
		}
		System.out.println(from +" ~ " + to + " = " + sum);
	}
}

������
1 ~ 10 = 55
15 ~ 100 = 4945

==============================
# outstar
class JavaTest {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			outStars(i);
			System.out.println();
		}
	}
	
	static void outStars(int num) {
		for (int i = 0;i < num;i++) {
			System.out.print('*');
		}
	}
}

������
*
**
***
****
*****
******
*******
********
*********
**********

==============================
# outchars
class JavaTest {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			outChars(' ', 10 -i);
			outChars('*', i);
			System.out.println();
		}
	}
	
	static void outChars(char ch, int num) {
		for (int i = 0;i < num;i++) {
			System.out.print(ch);
		}
	}	
}

������
         *
        **
       ***
      ****
     *****
    ******
   *******
  ********
 *********
**********

==============================
# outcharsnewline
class JavaTest {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			outChars(' ', 10 -i, false);
			outChars('*', i, true);
		}
	}
	
	static void outChars(char ch, int num, boolean newline) {
		for (int i = 0;i < num;i++) {
			System.out.print(ch);
		}
		if (newline) {
			System.out.println();
		}
	}	
}

������
         *
        **
       ***
      ****
     *****
    ******
   *******
  ********
 *********
**********

==============================
# outcharsln
class JavaTest {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			outChars(' ', 10 -i);
			outCharsln('*', i);
		}
	}
	
	static void outChars(char ch, int num) {
		for (int i = 0;i < num;i++) {
			System.out.print(ch);
		}
	}
	
	static void outCharsln(char ch, int num) {
		outChars(ch, num);
		System.out.println();		
	}	
}

������
         *
        **
       ***
      ****
     *****
    ******
   *******
  ********
 *********
**********

==============================
# boxmessage
class JavaTest {
	public static void main(String[] args) {
		outCharsln('-', 5 + 4);
		System.out.println("| Hello |");
		outCharsln('-', 5 + 4);
		
		outCharsln('-', 14 + 4);
		System.out.println("| Congratulation |");
		outCharsln('-', 14 + 4);
		
	}
	
	static void outChars(char ch, int num) {
		for (int i = 0;i < num;i++) {
			System.out.print(ch);
		}
	}
	
	static void outCharsln(char ch, int num) {
		outChars(ch, num);
		System.out.println();		
	}	
}

������
---------
| Hello |
---------
------------------
| Congratulation |
------------------

==============================
# outbox
class JavaTest {
	public static void main(String[] args) {
		outBox("Hello");
		outBox("Congratulation");
		outBox("Good Morning");
		
	}
	
	static void outBox(String message) {
		outCharsln('-', message.length() + 4);
		System.out.println("| " + message + " |");
		outCharsln('-', message.length() + 4);
	}
	
	static void outChars(char ch, int num) {
		for (int i = 0;i < num;i++) {
			System.out.print(ch);
		}
	}
	
	static void outCharsln(char ch, int num) {
		outChars(ch, num);
		System.out.println();		
	}	
}

������
---------
| Hello |
---------
------------------
| Congratulation |
------------------
----------------
| Good Morning |
----------------

==============================
# valuearg
class JavaTest {
	public static void main(String[] args) {
		int num = 2;
		getDouble(num);
		System.out.println("num = " + num);
	}
	
	static int getDouble(int value) {
		value *= 2;
		return value;
	}
}

������
num = 2

==============================
# refarg
class JavaTest {
	public static void main(String[] args) {
		int[] num = { 2, 8, 6 };
		getDouble(num);
		System.out.println("num[0] = " + num[0]);
	}
	
	static void getDouble(int[] value) {
		value[0] *= 2;
	}
}

������
num[0] = 4

==============================
# varargs
class JavaTest {
	public static void main(String[] args) {
		System.out.println(getSum(1, 2));
		System.out.println(getSum(1, 2, 3, 4));
		System.out.println(getSum(8, 9, 6, 2, 9));
	}
	
	static int getSum(int... a) {
		int sum = 0;
		for (int i : a) {
			sum += i;
		}
		return sum;
	}
}

������
3
10
34

==============================
# getmax
class JavaTest {
	public static void main(String[] args) {
		System.out.println("[3, 5] = " + getMax(3, 5));
	}
	
	static int getMax(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}
}

������
[3, 5] = 5

==============================
# getmax2
class JavaTest {
	public static void main(String[] args) {
		System.out.println("[3, 5] = " + getMax(3, 5));
		System.out.println("[3.4, 5.6] = " + getMax(3.4, 5.6));
	}
	
	static int getMax(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}
	
	static double getMax(double a, double b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}
}

������
[3, 5] = 5
[3.4, 5.6] = 5.6

###########################################################    
## 9�� ##

==============================
# car
class Car {
	String name;
	boolean gasoline;
	
	void run() {
		if (gasoline) {
			System.out.println("�θ� �θ�");
		} else {
			System.out.println("���� ����");
		}
	}
	void stop() {
		System.out.println("������");
	}
}

class JavaTest {
	public static void main(String[] args) {
		Car korando = new Car();
		korando.name = "�ڶ���C";
		korando.gasoline = false;
		
		korando.run();
		korando.stop();
	}
}

������
���� ����
������

==============================
# object
class Car {
	String name;
	boolean gasoline;
	
	void run() {
		if (gasoline) {
			System.out.println("�θ� �θ�");
		} else {
			System.out.println("���� ����");
		}
	}
	void stop() {
		System.out.println("������");
	}
}

class JavaTest {
	public static void main(String[] args) {
		Car korando = new Car();
		korando.name = "�ڶ���C";
		korando.gasoline = false;
		System.out.print(korando.name + " : ");
		korando.run();
		
		Car equus = new Car();
		equus.name = "���ὺ";
		equus.gasoline = true;
		System.out.print(equus.name + " : ");
		equus.run();
	}
}

������
�ڶ���C : ���� ����
���ὺ : �θ� �θ�

==============================
# time
class Time {
	boolean am;
	int hour;
	int minute;
	int second;
	
	void whatTime() {
		System.out.print(am ? "���� ":"���� ");
		System.out.println(hour + "�� " + minute + "�� " + second + "��");
	}
}

class JavaTest {
	public static void main(String[] args) {
		Time now = new Time();
		now.am = true;
		now.hour = 12;
		now.minute = 34;
		now.second = 56;
		
		now.whatTime();
	}
}

������
���� 12�� 34�� 56��

==============================
# human
class Human {
	int age;
	String name;
	
	void intro() {
		System.out.println("�ȳ�, " + age + "�� " + name + "�̶�� ��.");
	}
}

class JavaTest {
	public static void main(String[] args) {
		Human kim = new Human();
		kim.age = 29;
		kim.name = "�����";
		kim.intro();
	}
}

������
�ȳ�, 29�� ������̶�� ��.

==============================
# constructor
class Car {
	String name;
	boolean gasoline;
	
	Car(String aName, boolean aGasoline) {
		name = aName;
		gasoline = aGasoline;
	}
	
	void run() {
		if (gasoline) {
			System.out.println("�θ� �θ�");
		} else {
			System.out.println("���� ����");
		}
	}
	void stop() {
		System.out.println("������");
	}
}

class JavaTest {
	public static void main(String[] args) {
		Car korando = new Car("�ڶ���C", false);
		
		korando.run();
		korando.stop();
	}
}

������
���� ����
������

==============================
# timector
class Time {
	boolean am;
	int hour;
	int minute;
	int second;
	
	Time(boolean am, int hour, int minute, int secound) {
		this.am = am;
		this.hour = hour;
		this.minute = minute;
		this.second = secound;
	}
	
	void whatTime() {
		System.out.print(am ? "���� ":"���� ");
		System.out.println(hour + "�� " + minute + "�� " + second + "��");
	}
}

class JavaTest {
	public static void main(String[] args) {
		Time now = new Time(true, 12, 34, 56);
		now.whatTime();
	}
}

������
���� 12�� 34�� 56��

==============================
# ctorover
class Time {
	boolean am;
	int hour;
	int minute;
	int second;
	
	Time(boolean am, int hour, int minute, int second) {
		this.am = am;
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	Time(boolean am, int hour, int minute) {
		this.am = am;
		this.hour = hour;
		this.minute = minute;
		this.second = 0;
	}
	
	Time(int hour24, int minute) {
		this.am = hour24 < 12;
		this.hour = hour24 % 12;
		this.minute = minute;
		this.second = 0;
	}
	
	void whatTime() {
		System.out.print(am ? "���� ":"���� ");
		System.out.println(hour + "�� " + minute + "�� " + second + "��");
	}
}

class JavaTest {
	public static void main(String[] args) {
		Time now = new Time(true, 12, 34);
		now.whatTime();
		Time today = new Time(18, 30);
		today.whatTime();
	}
}

������
���� 12�� 34�� 0��
���� 6�� 30�� 0��

==============================
# ctorcall
class Time {
	boolean am;
	int hour;
	int minute;
	int second;
	
	Time(boolean am, int hour, int minute, int second) {
		this.am = am;
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	Time(boolean am, int hour, int minute) {
		this(am, hour, minute, 0);
	}
	
	Time(int hour24, int minute) {
		this(hour24 < 12, hour24 % 12, minute);
	}
	
	void whatTime() {
		System.out.print(am ? "���� ":"���� ");
		System.out.println(hour + "�� " + minute + "�� " + second + "��");
	}
}

class JavaTest {
	public static void main(String[] args) {
		Time now = new Time(true, 12, 34);
		now.whatTime();
		Time today = new Time(18, 30);
		today.whatTime();
	}
}

������
���� 12�� 34�� 0��
���� 6�� 30�� 0��


==============================
# defctor
class Car {
	String name;
	boolean gasoline;
	
	Car() {
	}
	
	Car(String name, boolean gasoline) {
		this.name = name;
		this.gasoline = gasoline;
	}
	
	void run() {
		if (gasoline) {
			System.out.println("�θ� �θ�");
		} else {
			System.out.println("���� ����");
		}
	}

	void stop() {
		System.out.println("������");
	}
}

class JavaTest {
	public static void main(String[] args) {
		Car sonata = new Car("�ҳ�Ÿ", true);
		sonata.run();

		Car korando = new Car();
		korando.name = "�ڶ���C";
		korando.gasoline = false;
		korando.run();
	}
}

������
�θ� �θ�
���� ����

==============================
# init
class Car {
	String name;
	boolean gasoline;
	
	Car(String name, boolean gasoline) {
		init(name, gasoline);
	}
	
	void init(String name, boolean gasoline) {
		this.name = name;
		this.gasoline = gasoline;
	}
	
	void run() {
		if (gasoline) {
			System.out.println("�θ� �θ�");
		} else {
			System.out.println("���� ����");
		}
	}
	void stop() {
		System.out.println("������");
	}
}

class JavaTest {
	public static void main(String[] args) {
		Car korando = new Car("�ڶ���C", false);
		korando.run();
		korando.stop();
		
		korando.init("���׽ý�", true);
		korando.run();
		korando.stop();
	}
}

������
���� ����
������
�θ� �θ�
������

==============================
# expinit
class Time {
	boolean am = true;
	int hour = 12;
	int minute = 0;
	int second = 0;
	
	Time() { }
	
	Time(boolean am, int hour, int minute, int secound) {
		this.am = am;
		this.hour = hour;
		this.minute = minute;
		this.second = secound;
	}
	
	void whatTime() {
		System.out.print(am ? "���� ":"���� ");
		System.out.println(hour + "�� " + minute + "�� " + second + "��");
	}
}

class JavaTest {
	public static void main(String[] args) {
		Time midnight = new Time();
		midnight.whatTime();
		
		Time now = new Time(false, 3, 23, 0);
		now.whatTime();
	}
}

������
���� 12�� 0�� 0��
���� 3�� 23�� 0��

==============================
# initblock
class Time {
	boolean am;
	int hour;
	int minute;
	int second;
	
	// �ʱ�ȭ ���
	{
		java.time.LocalTime now = java.time.LocalTime.now();
		hour = now.getHour();
		if (hour >= 12) {
			hour -= 12;
			am = false;
		} else {
			am = true;
		}
		minute = now.getMinute();
		second = now.getSecond();
	}
	
	void whatTime() {
		System.out.print(am ? "���� ":"���� ");
		System.out.println(hour + "�� " + minute + "�� " + second + "��");
	}
}

class JavaTest {
	public static void main(String[] args) {
		Time now = new Time();
		now.whatTime();
	}
}

������
���� 6�� 8�� 48��

==============================
# initorder
class InitTest {
	int field = 1;		// ����� �ʱ�ȭ
	
	{
		field = 2;		// �ʱ�ȭ ���
	}
	
	InitTest() {	
		field = 3;		// ������
	}
}

class JavaTest {
	public static void main(String[] args) {
		InitTest init = new InitTest();
		System.out.print(init.field);
	}
}

������
3

###########################################################    
## 10�� ##

==============================
# accessor
class Time {
	private boolean am;
	private int hour;
	private int minute;
	private int second;
	
	Time(int hour, int minute, int second) {
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}

	public int getHour() {	return hour; }
	public void setHour(int hour) {
		if (hour >=0 && hour <= 23) {
			this.am = hour < 12;
			this.hour = hour % 12;
			if (this.hour == 0) this.hour = 12;
		}
	}
	
	public int getMinute() {	return minute; }
	public void setMinute(int minute) {
		if (minute >=0 && minute <= 59) {
			this.minute = minute;
		}
	}
	
	public int getSecond() {	return second; }
	public void setSecond(int second) {
		if (second >=0 && second <= 59) {
			this.second = second;
		}
	}
	
	void whatTime() {
		System.out.print(am ? "���� ":"���� ");
		System.out.println(hour + "�� " + minute + "�� " + second + "��");
	}
}

class JavaTest {
	public static void main(String[] args) {
		Time now = new Time(12, 34, 56);
		now.whatTime();
		// now.hour = 34;			// ����
		now.setHour(34);;			// �ź�
		now.setSecond(-25);		// �ź�
		now.whatTime();
		now.setHour(10);;			// ����
		now.setMinute(45);		// ����
		now.whatTime();
	}
}

������	
���� 12�� 34�� 56��
���� 12�� 34�� 56��
���� 10�� 45�� 56��


==============================
# sideeffect
class Range {
	private int from;
	private int to;
	
	Range(int from, int to) {
		setFrom(from);
		setTo(to);
	}
	
	public int getFrom() { return from; }
	
	public void setFrom(int from) {
		this.from = from;
		if (to < from) {
			to = from;
		}
	}
	
	public int getTo() { return to; }

	public void setTo(int to) {
		this.to = to;
		if (from > to) {
			from = to;
		}
	}
	
	public void outRange() {
		System.out.println(from + " ~ " + to);
	}
}

class JavaTest {
	public static void main(String[] args) {
		Range range = new Range(2, 6);
		range.outRange();
		range.setFrom(8);
		range.outRange();
	}
}

������	
2 ~ 6
8 ~ 8


==============================
# carnum
class Car {
	String name;
	boolean gasoline;
	int carNum;
	
	Car(String aName, boolean aGasoline) {
		name = aName;
		gasoline = aGasoline;
		carNum++;
	}
}

class JavaTest {
	public static void main(String[] args) {
		Car korando = new Car("�ڶ���C", false);
		System.out.println(korando.name + " : " + korando.carNum);

		Car equus = new Car("���ὺ", true);
		System.out.println(equus.name + " : " + equus.carNum);

		Car pride = new Car("�����̵�", true);
		System.out.println(pride.name + " : " + pride.carNum);
	}
}

������
�ڶ���C : 1
���ὺ : 1
�����̵� : 1

==============================
# static
class Car {
	String name;
	boolean gasoline;
	static int carNum;
	
	Car(String aName, boolean aGasoline) {
		name = aName;
		gasoline = aGasoline;
		carNum++;
	}
}

class JavaTest {
	public static void main(String[] args) {
		System.out.println("������ : " + Car.carNum);
		
		Car korando = new Car("�ڶ���C", false);
		System.out.println(korando.name + " : " + Car.carNum);

		Car equus = new Car("���ὺ", true);
		System.out.println(equus.name + " : " + Car.carNum);

		Car pride = new Car("�����̵�", true);
		System.out.println(pride.name + " : " + Car.carNum);
	}
}

������
������ : 0
�ڶ���C : 1
���ὺ : 2
�����̵� : 3

==============================
# staticinit
class Car {
	String name;
	boolean gasoline;
	static int carNum = 1000;
	
	Car(String aName, boolean aGasoline) {
		name = aName;
		gasoline = aGasoline;
		carNum++;
	}
}

class JavaTest {
	public static void main(String[] args) {
		System.out.println("������ : " + Car.carNum);
		
		Car korando = new Car("�ڶ���C", false);
		System.out.println(korando.name + " : " + Car.carNum);

		Car equus = new Car("���ὺ", true);
		System.out.println(equus.name + " : " + Car.carNum);

		Car pride = new Car("�����̵�", true);
		System.out.println(pride.name + " : " + Car.carNum);
	}
}

������
������ : 1000
�ڶ���C : 1001
���ὺ : 1002
�����̵� : 1003

==============================
# staticinitblock
class Bus {
	static Station[] arInfo;
	
	static {
		arInfo = new Station[7];
		arInfo[0] = new Station("������б�", 0, 0);
		arInfo[1] = new Station("û����", 4, 200);
		arInfo[2] = new Station("���⵿", 7, 100);
		arInfo[3] = new Station("��ʸ�", 12, 200);
		arInfo[4] = new Station("��ȣ��", 16, 200);
		arInfo[5] = new Station("����", 18, 150);
		arInfo[6] = new Station("�б���", 23, 300);
	}
	
	void printFare(int from, int to) {
		int fare = 500;
		for (int i = from;i <= to; i++) {
			fare += arInfo[i].fare;
		}
		System.out.println(arInfo[from].name + " ~ " + 
			arInfo[to].name + "������ ����� " + fare + "���Դϴ�.");
	}
}

// ������ ����
class Station {
	String name;		// ������ �̸�
	int distance;		// ���� �Ÿ�
	int fare;				// ���� ���
	
	Station (String name, int distance, int fare) {
		this.name = name;
		this.distance = distance;
		this.fare = fare;
	}
}

class JavaTest {
	public static void main(String[] args) {
		Bus bus1 = new Bus();
		bus1.printFare(1, 5);
		
		Bus bus2 = new Bus();
		bus2.printFare(2, 4);
	}
}

������	
û���� ~ ���������� ����� 1350���Դϴ�.
���⵿ ~ ��ȣ�������� ����� 1000���Դϴ�.


==============================
# staticmethod
class Car {
	String name;
	boolean gasoline;
	static int carNum;
	
	Car(String aName, boolean aGasoline) {
		name = aName;
		gasoline = aGasoline;
		carNum++;
	}
	
	static void resetNum() {
		carNum = 0;
	}
	
	static void printNum() {
		System.out.println("���� ��� ��� : " + carNum);
	}

	void run() {
		if (gasoline) {
			System.out.println("�θ� �θ�");
		} else {
			System.out.println("���� ����");
		}
	}
}

class JavaTest {
	public static void main(String[] args) {
		Car.printNum();
		Car pride = new Car("�����̵�", true);
		Car korando = new Car("�ڶ���C", false);
		Car.printNum();
		Car.resetNum();
		Car equus = new Car("���ὺ", true);
		Car.printNum();
	}
}

������	
���� ��� ��� : 0
���� ��� ��� : 2
���� ��� ��� : 1


==============================
# utilmethod
class Hello {
	static void morning() {
		System.out.println("���� ��ħ");
	}
	static void lunch() {
		System.out.println("���� �Ծ���?");
	}
	static void evening() {
		System.out.println("�� ���� �");
	}
}

class JavaTest {
	public static void main(String[] args) {
		Hello.morning();
		Hello.lunch();
		Hello.evening();
	}
}

������
���� ��ħ
���� �Ծ���?
�� ���� �

==============================
# staticmain
class Car {
	String name;
	boolean gasoline;
	
	Car(String aName, boolean aGasoline) {
		name = aName;
		gasoline = aGasoline;
	}
	
	void run() {
		if (gasoline) {
			System.out.println("�θ� �θ�");
		} else {
			System.out.println("���� ����");
		}
	}
	void stop() {
		System.out.println("������");
	}
	
	public static void main(String[] args) {
		Car korando = new Car("�ڶ���C", false);
		
		korando.run();
		korando.stop();
	}
}

������
���� ����
������

==============================
# final
class Notebook {
	final String CPU;
	int memory;
	int storage;
	
	Notebook(String CPU, int memory, int storage) {
		this.CPU = CPU;
		this.memory = memory;
		this.storage = storage;
	}
	
	void upgrade(int memory, int storage) {
		this.memory = memory;
		this.storage = storage;
		// this.CPU = "Super Strong 16 Core 8.5GHz";
	}
	
	void printSpec() {
		System.out.print("CPU = " + CPU);
		System.out.print(" ,Memory = " + memory);
		System.out.println(" ,Storage = " + storage);
	}
}

class JavaTest {
	public static void main(String[] args) {
		Notebook Sens = new Notebook("Intel Core i7", 4, 500);
		Notebook XNote = new Notebook("AMD ������", 2, 320);
		Sens.printSpec();
		XNote.printSpec();
		Sens.upgrade(8,750);
		Sens.printSpec();
	}
}

������	
CPU = Intel Core i7 ,Memory = 4 ,Storage = 500
CPU = AMD ������ ,Memory = 2 ,Storage = 320
CPU = Intel Core i7 ,Memory = 8 ,Storage = 750


==============================
# staticfinal
class Notebook {
	final String CPU;
	int memory;
	int storage;
	static final long GIGA = 1073741824L;
	
	Notebook(String CPU, int memory, int storage) {
		this.CPU = CPU;
		this.memory = memory;
		this.storage = storage;
	}
	
	void upgrade(int memory, int storage) {
		this.memory = memory;
		this.storage = storage;
		// this.CPU = "Super Strong 16 Core 8.5GHz";
	}
	
	void printSpec() {
		System.out.print("CPU = " + CPU);
		System.out.print(" ,Memory = " + memory * GIGA + "����Ʈ");
		System.out.println(" ,Storage = " + storage * GIGA + "����Ʈ");
	}
}

class JavaTest {
	public static void main(String[] args) {
		Notebook Sens = new Notebook("Intel Core i7", 4, 500);
		Notebook XNote = new Notebook("AMD ������", 2, 320);
		Sens.printSpec();
		XNote.printSpec();
	}
}

������	
CPU = Intel Core i7 ,Memory = 4294967296����Ʈ ,Storage = 536870912000����Ʈ
CPU = AMD ������ ,Memory = 2147483648����Ʈ ,Storage = 343597383680����Ʈ

###########################################################    
## 11�� ##

==============================
# student
class Human {
	int age;
	String name;
	
	Human(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	void intro() {
		System.out.println("�ȳ�, " + age + "�� " + name + "�̶�� ��.");
	}
}

class Student extends Human {
	int stnum;
	String major;
	
	Student(int age, String name, int stnum, String major) {
		super(age, name);
		this.stnum = stnum;
		this.major = major;
	}
	
	void study() {
		System.out.println("�ϴ�õ ���� ������ ����Ȳ");
	}
}

class JavaTest {
	public static void main(String[] args) {
		Human kim = new Human(29, "�����");
		kim.intro();
		Student lee = new Student(42, "�̽¿�", 9312345, "�濵");
		lee.intro();
		lee.study();
	}
}

������	
�ȳ�, 29�� ������̶�� ��.
�ȳ�, 42�� �̽¿��̶�� ��.
�ϴ�õ ���� ������ ����Ȳ


==============================
# truck
class Car {
	String name;
	boolean gasoline;
	
	Car(String name, boolean gasoline) {
		init(name, gasoline);
	}
	
	void init(String name, boolean gasoline) {
		this.name = name;
		this.gasoline = gasoline;
	}
	
	void run() {
		if (gasoline) {
			System.out.println("�θ� �θ�");
		} else {
			System.out.println("���� ����");
		}
	}
	void stop() {
		System.out.println("������");
	}
}

class Truck extends Car {
	int ton;
	
	Truck(String name,int ton) {
		super(name, false);
		this.ton = ton;
	}
	
	void load() {
		System.out.println("���� �ƴ´�.");
	}
}

class JavaTest {
	public static void main(String[] args) {
		Truck porter = new Truck("����", 1);
		porter.run();
		porter.load();
	}
}

������
���� ����
���� �ƴ´�.

==============================
# graduate
class Human {
	int age;
	String name;
	
	Human(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	void intro() {
		System.out.println("�ȳ�, " + age + "�� " + name + "�̶�� ��.");
	}
}

class Student extends Human {
	int stnum;
	String major;
	
	Student(int age, String name, int stnum, String major) {
		super(age, name);
		this.stnum = stnum;
		this.major = major;
	}
	
	void study() {
		System.out.println("�ϴ�õ ���� ������ ����Ȳ");
	}
}

class Graduate extends Student {
	String thesis;
	
	Graduate(int age, String name, int stnum, String major, String thesis) {
		super(age, name, stnum, major);
		this.thesis = thesis;
	}
	
	void research() {
		System.out.println("�ý÷� �ý÷�. �� �����ؾ� ������ ����?");
	}
}

class JavaTest {
	public static void main(String[] args) {
		Graduate park = new Graduate(35, "�ڴ���", 95001122, "����", "�� ���ȿ� ���� ����");
		park.intro();
		park.study();
		park.research();
	}
}



������	
�ȳ�, 35�� �ڴ����̶�� ��.
�ϴ�õ ���� ������ ����Ȳ
�ý÷� �ý÷�. �� �����ؾ� ������ ����?


==============================
# super
class Human {
	int age;
	String name;

	Human(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	Human(float birth, String name) {
		this(0, name);
		java.time.LocalDate now = java.time.LocalDate.now();
		this.age = now.getYear() - (int)birth + 1;
	}
	
	void intro() {
		System.out.println("�ȳ�, " + age + "�� " + name + "�̶�� ��.");
	}
}

class Student extends Human {
	int stnum;
	String major;
	
	Student(int age, String name, int stnum, String major) {
		super(age, name);
		this.stnum = stnum;
		this.major = major;
	}
	
	Student(float birth, String name, int stnum, String major) {
		super(birth, name);
		this.stnum = stnum;
		this.major = major;
	}

	void study() {
		System.out.println("�ϴ�õ ���� ������ ����Ȳ");
	}
}

class JavaTest {
	public static void main(String[] args) {
		Student kim = new Student(39, "������", 9908123, "����");
		kim.intro();
		Student bae = new Student(1989.10f, "������", 1125034, "��ȣ");
		bae.intro();
	}
}

������	
�ȳ�, 39�� �������̶�� ��.
�ȳ�, 30�� �������̶�� ��.


==============================
# multisub
class Human {
	int age;
	String name;
	
	Human(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	void intro() {
		System.out.println("�ȳ�, " + age + "�� " + name + "�̶�� ��.");
	}
}

class Student extends Human {
	int stnum;
	String major;
	
	Student(int age, String name, int stnum, String major) {
		super(age, name);
		this.stnum = stnum;
		this.major = major;
	}
	
	void study() {
		System.out.println("�ϴ�õ ���� ������ ����Ȳ");
	}
}

class Soldier extends Human {
	int milnum;
	
	Soldier(int age, String name, int milnum) {
		super(age, name);
		this.milnum = milnum;
	}
	
	void fight() {
		System.out.println("���� ����. ������ ����!!");		
	}
}

class Thief extends Human {
	String item;
	int star;
	
	Thief(int age, String name, String item, int star) {
		super(age, name);
		this.item = item;
		this.star = star;
	}
	
	void steal() {
		System.out.println("��� ���~~ �Ĵٴ�~~");		
	}
}

class JavaTest {
	public static void main(String[] args) {
		Student lee = new Student(35, "������", 150629, "������");
		lee.study();
		
		Soldier kang = new Soldier(45, "������", 12345);
		kang.fight();
		
		Thief hong = new Thief(15, "ȫ�浿", "������", 2);
		hong.steal();
	}
}

������	�ϴ�õ ���� ������ ����Ȳ
���� ����. ������ ����!!
��� ���~~ �Ĵٴ�~~

==============================
# override
class Human {
	int age;
	String name;
	
	Human(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	void intro() {
		System.out.println("�ȳ�, " + age + "�� " + name + "�̶�� ��.");
	}
}

class Student extends Human {
	int stnum;
	String major;
	
	Student(int age, String name, int stnum, String major) {
		super(age, name);
		this.stnum = stnum;
		this.major = major;
	}
	
	void intro() {
		System.out.println(major + "�а� " + stnum + "�й� " + name + "�Դϴ�.");
	}
	
	void study() {
		System.out.println("�ϴ�õ ���� ������ ����Ȳ");
	}
}

class JavaTest {
	public static void main(String[] args) {
		Human kim = new Human(29, "�����");
		kim.intro();
		Student lee = new Student(42, "�̽¿�", 9312345, "�濵");
		lee.intro();
	}
}

������	
�ȳ�, 29�� ������̶�� ��.
�濵�а� 9312345�й� �̽¿��Դϴ�.


==============================
# contain
class Notebook {
	final String CPU;
	int memory;
	int storage;
	
	Notebook(String CPU, int memory, int storage) {
		this.CPU = CPU;
		this.memory = memory;
		this.storage = storage;
	}
	
	void printSpec() {
		System.out.print("CPU = " + CPU);
		System.out.print(" ,Memory = " + memory);
		System.out.println(" ,Storage = " + storage);
	}
}

class Human {
	int age;
	String name;
	Notebook book;
	
	Human(int age, String name, String CPU, int memory, int storage) {
		book = new Notebook(CPU, memory, storage);
		this.age = age;
		this.name = name;
	}
	
	void intro() {
		System.out.println("�ȳ�, " + age + "�� " + name + "�̶�� ��.");
		System.out.print("���� ��Ʈ�� : ");
		book.printSpec();
	}
}

class JavaTest {
	public static void main(String[] args) {
		Human kim = new Human(29, "�����", "i7 Core", 8, 2000);
		kim.intro();
	}
}

������	
�ȳ�, 29�� ������̶�� ��.
���� ��Ʈ�� : CPU = i7 Core ,Memory = 8 ,Storage = 2000


==============================
# contain2
class Notebook {
	final String CPU;
	int memory;
	int storage;
	
	Notebook(String CPU, int memory, int storage) {
		this.CPU = CPU;
		this.memory = memory;
		this.storage = storage;
	}
	
	void printSpec() {
		System.out.print("CPU = " + CPU);
		System.out.print(" ,Memory = " + memory);
		System.out.println(" ,Storage = " + storage);
	}
}

class Human extends Notebook {
	int age;
	String name;
	
	Human(int age, String name, String CPU, int memory, int storage) {
		super(CPU, memory, storage);
		this.age = age;
		this.name = name;
	}
	
	void intro() {
		System.out.println("�ȳ�, " + age + "�� " + name + "�̶�� ��.");
		System.out.print("���� ��Ʈ�� : ");
		printSpec();
	}
}

class JavaTest {
	public static void main(String[] args) {
		Human kim = new Human(29, "�����", "i7 Core", 8, 2000);
		kim.intro();
	}
}


==============================
# containhuman
class Human {
	int age;
	String name;
	
	Human(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	void intro() {
		System.out.println("�ȳ�, " + age + "�� " + name + "�̶�� ��.");
	}
}

class Student {
	Human human;
	int stnum;
	String major;
	
	Student(int age, String name, int stnum, String major) {
		human = new Human(age, name);
		this.stnum = stnum;
		this.major = major;
	}
	
	void intro() {
		System.out.println(major + "�а� " + stnum + "�й� " + human.name + "�Դϴ�.");
	}

	void study() {
		System.out.println("�ϴ�õ ���� ������ ����Ȳ");
	}
}

class JavaTest {
	public static void main(String[] args) {
		Student lee = new Student(42, "�̽¿�", 9312345, "�濵");
		lee.intro();
	}
}

������	
�濵�а� 9312345�й� �̽¿��Դϴ�.

###########################################################    
## 12�� ##

==============================
# animal
class Animal {
	void move() { System.out.println("�Դٸ� ���ٸ�"); }
}

class Dog extends Animal {
	void bark() { System.out.println("�۸۸�"); }
}

class Dove extends Animal {
	void fly() { System.out.println("�۵� �۵�"); }
}

class JavaTest {
	public static void main(String[] args) {
		// �¿��� Ÿ���� �´� ���
		Animal animal = new Animal();
		animal.move();
		
		// �θ� Ÿ�Կ� �ڽ� ��ü ����
		Animal dog = new Dog();
		dog.move();
		// dog.bark();
		
		// �ڽ� Ÿ�Կ� �θ� ��ü ����
		// Dove dove = new Animal();
		// dove.fly();
	}
}

������
�Դٸ� ���ٸ�
�Դٸ� ���ٸ�

==============================
# animal2
class Animal {
	void move() { System.out.println("�Դٸ� ���ٸ�"); }
}

class Dog extends Animal {
	void bark() { System.out.println("�۸۸�"); }
}

class Dove extends Animal {
	void fly() { System.out.println("�۵� �۵�"); }
}

class JavaTest {
	public static void main(String[] args) {
		Animal animal = new Animal();
		Dog dog = new Dog();
		
		// �� ĳ����
		Animal up = (Animal)dog;
		up.move();
		//up.bark();
		
		// �ٿ� ĳ����
		Dog down = (Dog)animal;
		down.move();
		down.bark();
	}
}

������	
�Դٸ� ���ٸ�
Exception in thread "main" java.lang.ClassCastException: Animal cannot be cast to Dog
	at JavaTest.main(JavaTest.java:25)


==============================
# instanceof
class Animal {
	void move() { System.out.println("�Դٸ� ���ٸ�"); }
}

class Dog extends Animal {
	void bark() { System.out.println("�۸۸�"); }
}

class Dove extends Animal {
	void fly() { System.out.println("�۵� �۵�"); }
}

class JavaTest {
	public static void main(String[] args) {
		Dog happy = new Dog();
		testAnimal(happy);
	}
	
	static void testAnimal(Animal animal) {
		Dog mydog = (Dog)animal;
		mydog.move();
		mydog.bark();
	}
}

������
�Դٸ� ���ٸ�
�۸۸�

==============================
# instanceof2
class Animal {
	void move() { System.out.println("�Դٸ� ���ٸ�"); }
}

class Dog extends Animal {
	void bark() { System.out.println("�۸۸�"); }
}

class Dove extends Animal {
	void fly() { System.out.println("�۵� �۵�"); }
}

class JavaTest {
	public static void main(String[] args) {
		Dog happy = new Dog();
		testAnimal(happy);

		Dove donald = new Dove();
		testAnimal(donald);
	}
	
	static void testAnimal(Animal animal) {
		animal.move();
		if (animal instanceof Dog) {
			Dog mydog = (Dog)animal;
			mydog.bark();
		}
		if (animal instanceof Dove) {
			Dove mydove = (Dove)animal;
			mydove.fly();
		}
	}
}

������
�Դٸ� ���ٸ�
�۸۸�
�Դٸ� ���ٸ�
�۵� �۵�

==============================
# instanceof3
class Animal {
	void move() { System.out.println("�Դٸ� ���ٸ�"); }
}

class Dog extends Animal {
	void bark() { System.out.println("�۸۸�"); }
}

class Dove extends Animal {
	void fly() { System.out.println("�۵� �۵�"); }
}

class JavaTest {
	public static void main(String[] args) {
		Dog happy = new Dog();
		testAnimal(happy);

		Dove donald = new Dove();
		testAnimal(donald);
	}
	
	static void testAnimal(Animal animal) {
		animal.move();
		if (animal instanceof Dog mydog) {
			mydog.bark();
		}
		if (animal instanceof Dove mydove) {
			mydove.fly();
		}
	}
}

������
�Դٸ� ���ٸ�
�۸۸�
�Դٸ� ���ٸ�
�۵� �۵�

==============================
# dynamic
class Human {
	int age;
	String name;
	
	Human(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	void intro() {
		System.out.println("�ȳ�, " + age + "�� " + name + "�̶�� ��.");
	}
}

class Student extends Human {
	int stnum;
	String major;
	
	Student(int age, String name, int stnum, String major) {
		super(age, name);
		this.stnum = stnum;
		this.major = major;
	}
	
	void intro() {
		System.out.println(major + "�а� " + stnum + "�й� " + name + "�Դϴ�.");
	}
	
	void study() {
		System.out.println("�ϴ�õ ���� ������ ����Ȳ");
	}
}

class JavaTest {
	public static void main(String[] args) {
		Human kim = new Human(29, "�����");
		Student lee = new Student(42, "�̽¿�", 9312345, "�濵");

		introHuman(kim);
		introHuman(lee);
	}
	
	static void introHuman(Human who) {
		who.intro();
	}
}

������	
�ȳ�, 29�� ������̶�� ��.
�濵�а� 9312345�й� �̽¿��Դϴ�.


==============================
# objectgroup
class Human {
	int age;
	String name;
	
	Human(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	void intro() {
		System.out.println("�ȳ�, " + age + "�� " + name + "�̶�� ��.");
	}
}

class Student extends Human {
	int stnum;
	String major;
	
	Student(int age, String name, int stnum, String major) {
		super(age, name);
		this.stnum = stnum;
		this.major = major;
	}
	
	void intro() {
		System.out.println(major + "�а� " + stnum + "�й� " + name + "�Դϴ�.");
	}
	
	void study() {
		System.out.println("�ϴ�õ ���� ������ ����Ȳ");
	}
}

class Soldier extends Human {
	int milnum;
	
	Soldier(int age, String name, int milnum) {
		super(age, name);
		this.milnum = milnum;
	}
	
	void intro() {
		System.out.println("�漺. ���� : " + milnum + "�Դϴ�.");
	}
}

class Thief extends Human {
	String item;
	int star;
	
	Thief(int age, String name, String item, int star) {
		super(age, name);
		this.item = item;
		this.star = star;
	}
	
	void intro() {
		System.out.println(item + " ���� ���̹� ���� " + star + "���Դϴ�.");
	}
}

class JavaTest {
	public static void main(String[] args) {
		Human[] arHuman = {
				new Human(29, "�����"),
				new Student(42, "�̽¿�", 9312345, "�濵"),
				new Soldier(45, "������", 12345),
				new Thief(15, "ȫ�浿", "������", 2),
		};
		
		dumpGroup(arHuman);
	}
	
	static void dumpGroup(Human[] group) {
		for (Human h : group) {
			h.intro();
		}
	}
}

������	
�ȳ�, 29�� ������̶�� ��.
�濵�а� 9312345�й� �̽¿��Դϴ�.
�漺. ���� : 12345�Դϴ�.
������ ���� ���̹� ���� 2���Դϴ�.


==============================
# objectgroup2
class Human {
	int age;
	String name;
	
	Human(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	void intro() {
		System.out.println("�ȳ�, " + age + "�� " + name + "�̶�� ��.");
	}
}

class Student extends Human {
	int stnum;
	String major;
	
	Student(int age, String name, int stnum, String major) {
		super(age, name);
		this.stnum = stnum;
		this.major = major;
	}
	
	void intro() {
		System.out.println(major + "�а� " + stnum + "�й� " + name + "�Դϴ�.");
	}
	
	void study() {
		System.out.println("�ϴ�õ ���� ������ ����Ȳ");
	}
}

class Soldier extends Human {
	int milnum;
	
	Soldier(int age, String name, int milnum) {
		super(age, name);
		this.milnum = milnum;
	}
	
	void intro() {
		System.out.println("�漺. ���� : " + milnum + "�Դϴ�.");
	}
}

class Thief extends Human {
	String item;
	int star;
	
	Thief(int age, String name, String item, int star) {
		super(age, name);
		this.item = item;
		this.star = star;
	}
	
	void intro() {
		System.out.println(item + " ���� ���̹� ���� " + star + "���Դϴ�.");
	}
}

class Graduate extends Student {
	String thesis;
	
	Graduate(int age, String name, int stnum, String major, String thesis) {
		super(age, name, stnum, major);
		this.thesis = thesis;
	}
	
	void intro() {
		System.out.println(thesis + " ���� ���� �ִ� ���п����Դϴ�.");
	}
}

class JavaTest {
	public static void main(String[] args) {
		Human[] arHuman = {
				new Human(29, "�����"),
				new Student(42, "�̽¿�", 9312345, "�濵"),
				new Soldier(45, "������", 12345),
				new Thief(15, "ȫ�浿", "������", 2),
				new Graduate(35, "�ڴ���", 95001122, "����", "�� ���ȿ� ���� ����"),
		};
		
		dumpGroup(arHuman);
	}
	
	static void dumpGroup(Human[] group) {
		for (Human h : group) {
			h.intro();
		}
	}
}

������	
�ȳ�, 29�� ������̶�� ��.
�濵�а� 9312345�й� �̽¿��Դϴ�.
�漺. ���� : 12345�Դϴ�.
������ ���� ���̹� ���� 2���Դϴ�.
�� ���ȿ� ���� ���� ���� ���� �ִ� ���п����Դϴ�.


==============================
# delivery
class Transport {
	void ride() {
		System.out.print("�̵��Ѵ�");
	}
}

class Bike extends Transport {
	void ride() {
		System.out.print("������ ������");
	}
}

class AutoBike extends Transport {
	void ride() {
		System.out.print("����ٶ� �����");
	}
	
	void bikeshow() {
		System.out.println("�� ���� ��� �θ���...");
	}
}

class SkyKongKong extends Transport {
	void ride() {
		System.out.print("��������");
	}
	
	void rotate() {
		System.out.println("���� ȸ�� ����");
	}
}

class DeliveryMan {
	void delivery(Transport tran, String food) {
		tran.ride();
		System.out.println(" Ÿ�� ���� " + food + "�� ����մϴ�.");
	}
}

class JavaTest {
	public static void main(String[] args) {
		DeliveryMan kang = new DeliveryMan();
		kang.delivery(new Bike(), "¥���");
		kang.delivery(new AutoBike(), "����");
		kang.delivery(new SkyKongKong(), "�ܹ���");
	}
}

������	
������ ������ Ÿ�� ���� ¥��鸦 ����մϴ�.
����ٶ� ����� Ÿ�� ���� ���ڸ� ����մϴ�.
�������� Ÿ�� ���� �ܹ��׸� ����մϴ�.

###########################################################    
## 13�� ##

==============================
# star
class Marine {
	void move() { System.out.println("���� ����"); }
	void attack() { System.out.println("�εεεε�"); }
	void bunker() { System.out.println("��~ ��������"); }
}

class Zealot {
	void move() { System.out.println("�ڶ� �ڶ�"); }
	void attack() { System.out.println("�찼 �찼 ìì"); }
}

class Mutal {
	void move() { System.out.println("�۵� �۵�"); }
	void attack() { System.out.println("����â ����"); }
}

class JavaTest {
	public static void main(String[] args) {
		Marine marine = new Marine();
		marine.move();
		marine.attack();
		Zealot zealot = new Zealot();
		zealot.move();
		zealot.attack();
	}
}

������
���� ����
�εεεε�
�ڶ� �ڶ�
�찼 �찼 ìì

==============================
# unit
class Unit {
	void move() { System.out.println("�̵�"); }
	void attack() { System.out.println("����"); }
}

class Marine extends Unit {
	void move() { System.out.println("���� ����"); }
	void attack() { System.out.println("�εεεε�"); }
	void bunker() { System.out.println("��~ ��������"); }
}

class Zealot extends Unit {
	void move() { System.out.println("�ڶ� �ڶ�"); }
	void attack() { System.out.println("�찼 �찼 ìì"); }
}

class Mutal extends Unit {
	void move() { System.out.println("�۵� �۵�"); }
	void attack() { System.out.println("����â ����"); }
}

class JavaTest {
	public static void main(String[] args) {
		Unit[] arUnit = {
				new Marine(),
				new Zealot(),
				new Mutal(),
		};
		
		for (Unit u : arUnit) {
			u.move();
			u.attack();
		}
	}
}

������
���� ����
�εεεε�
�ڶ� �ڶ�
�찼 �찼 ìì
�۵� �۵�
����â ����

==============================
# abstract
abstract class Unit {
	abstract void move();
	abstract void attack();
}

class Marine extends Unit {
	void move() { System.out.println("���� ����"); }
	void attack() { System.out.println("�εεεε�"); }
	void bunker() { System.out.println("��~ ��������"); }
}

class Zealot extends Unit {
	void move() { System.out.println("�ڶ� �ڶ�"); }
	void attack() { System.out.println("�찼 �찼 ìì"); }
}

class Mutal extends Unit {
	void move() { System.out.println("�۵� �۵�"); }
	void attack() { System.out.println("����â ����"); }
}

class JavaTest {
	public static void main(String[] args) {
		Unit[] arUnit = {
				new Marine(),
				new Zealot(),
				new Mutal(),
		};
		
		for (Unit u : arUnit) {
			u.move();
			u.attack();
		}
	}
}

==============================
# sealed
abstract sealed class Language permits Java, Cpp, CSharp { }
final class Java extends Language { }
final class Cpp extends Language { }
final class CSharp extends Language { }
// final class Python extends Language { }

public class JavaTest {
	public static void main(String[] args) {
		Language lang_java = new Java();
		outLanguageName(lang_java);
	}
	
	public static void outLanguageName(Language lang)
	{
		if (lang instanceof Java) {
			System.out.println("�ڹ�");
		} else if (lang instanceof Cpp) {
			System.out.println("C++");
		} else if (lang instanceof CSharp) {
			System.out.println("C#");
		}
	}
}

������
�ڹ�

==============================
# interface
interface Unit {
	void move();
	void attack();
}

class Marine implements Unit {
	public void move() { System.out.println("���� ����"); }
	public void attack() { System.out.println("�εεεε�"); }
	public void bunker() { System.out.println("��~ ��������"); }
}

class Zealot implements Unit {
	public void move() { System.out.println("�ڶ� �ڶ�"); }
	public void attack() { System.out.println("�찼 �찼 ìì"); }
}

class Mutal implements Unit {
	public void move() { System.out.println("�۵� �۵�"); }
	public void attack() { System.out.println("����â ����"); }
}

class JavaTest {
	public static void main(String[] args) {
		Unit[] arUnit = {
				new Marine(),
				new Zealot(),
				new Mutal(),
		};
		
		for (Unit u : arUnit) {
			u.move();
			u.attack();
		}
	}
}


==============================
# superman
interface Unit {
	void move();
	void attack();
}

class Marine implements Unit {
	public void move() { System.out.println("���� ����"); }
	public void attack() { System.out.println("�εεεε�"); }
	public void bunker() { System.out.println("��~ ��������"); }
}

class Zealot implements Unit {
	public void move() { System.out.println("�ڶ� �ڶ�"); }
	public void attack() { System.out.println("�찼 �찼 ìì"); }
}

class Mutal implements Unit {
	public void move() { System.out.println("�۵� �۵�"); }
	public void attack() { System.out.println("����â ����"); }
}

class SuperMan implements Unit {
	public void move() { System.out.println("������~~~"); }
	public void attack() { System.out.println("���� ����"); }
}

class Firebat extends Marine {
	public void attack() { System.out.println("ȭ������~~"); }
}

class JavaTest {
	public static void main(String[] args) {
		Unit[] arUnit = {
				new Marine(),
				new Zealot(),
				new Mutal(),
				new SuperMan(),
				new Firebat(),
		};
		
		for (Unit u : arUnit) {
			u.move();
			u.attack();
		}
	}
}

������
���� ����
�εεεε�
�ڶ� �ڶ�
�찼 �찼 ìì
�۵� �۵�
����â ����
������~~~
���� ����
���� ����
ȭ������~~

==============================
# extendunit
interface Unit {
	void move();
	void attack();
}

interface Hideable extends Unit {
	void hide();
}

interface Healing extends Unit {
	void heal();
}

class DarkTempler implements Hideable {
	public void move() { System.out.println("���� ����"); }
	public void attack() { System.out.println("����, ����"); }
	public void hide() { System.out.println("�Ⱥ�������"); }
}

class Medic implements Healing {
	public void move() { System.out.println("�̷� �̷�"); }
	public void attack() { System.out.println("ġ������"); }
	public void heal() { System.out.println("������ �Ϸ��"); }
}

class JavaTest {
	public static void main(String[] args) {
		DarkTempler dt = new DarkTempler();
		dt.hide();
		
		Medic medic = new Medic();
		medic.heal();
	}
}

������
�Ⱥ�������
������ �Ϸ��

==============================
# multiinherit
class HandPhone {
	void call() { System.out.println("��ȭ�� �Ǵ�."); }
	void receive() { System.out.println("��ȭ�� �޴´�."); }
}

interface Camera {
	void takepicture();
}

class HandPhoneCamera extends HandPhone implements Camera {
	public void takepicture() { System.out.println("��Ĭ. ������ ��´�."); }
}

class JavaTest {
	public static void main(String[] args) {
		HandPhoneCamera myphone = new HandPhoneCamera();
		myphone.call();
		myphone.takepicture();
	}
}

������
��ȭ�� �Ǵ�.
��Ĭ. ������ ��´�.

==============================
# inheritcontain
class HandPhone {
	void call() { System.out.println("��ȭ�� �Ǵ�."); }
	void receive() { System.out.println("��ȭ�� �޴´�."); }
}

class Camera {
	void takepicture() { System.out.println("��Ĭ. ������ ��´�."); }
}

class HandPhoneCamera extends HandPhone {
	Camera camera = new Camera();
}

class JavaTest {
	public static void main(String[] args) {
		HandPhoneCamera myphone = new HandPhoneCamera();
		myphone.call();
		myphone.camera.takepicture();
	}
}


==============================
# smartphone
class HandPhone {
	void call() { System.out.println("��ȭ�� �Ǵ�."); }
	void receive() { System.out.println("��ȭ�� �޴´�."); }
}

interface Camera {
	void takepicture();
}

interface Mp3 {
	void play();
}

class SmartPhone extends HandPhone implements Camera, Mp3 {
	public void takepicture() { System.out.println("��Ĭ. ������ ��´�."); }
	public void play() { System.out.println("�� ��. ���� ���"); }
}

class JavaTest {
	public static void main(String[] args) {
		SmartPhone galaxy = new SmartPhone();
		galaxy.call();
		galaxy.takepicture();
		galaxy.play();
	}
}

������	
��ȭ�� �Ǵ�.
��Ĭ. ������ ��´�.
�� ��. ���� ���


==============================
# defmethod
interface Unit {
	void move();
	void attack();
	default void die() { System.out.println("�в���"); }
}

class Marine implements Unit {
	public void move() { System.out.println("���� ����"); }
	public void attack() { System.out.println("�εεεε�"); }
	public void bunker() { System.out.println("��~ ��������"); }
}

class Zealot implements Unit {
	public void move() { System.out.println("�ڶ� �ڶ�"); }
	public void attack() { System.out.println("�찼 �찼 ìì"); }
	public void die() { System.out.println("���ƾ�"); }
}

class JavaTest {
	public static void main(String[] args) {
		new Marine().die();
		new Zealot().die();
	}
}

������
�в���
���ƾ�

==============================
# staticmethod
interface Unit {
	void move();
	void attack();
	static void moveAttack(Unit u) {
		u.move();
		u.attack();
	}
}

class Marine implements Unit {
	public void move() { System.out.println("���� ����"); }
	public void attack() { System.out.println("�εεεε�"); }
	public void bunker() { System.out.println("��~ ��������"); }
}

class JavaTest {
	public static void main(String[] args) {
		Unit m = new Marine();
		Unit.moveAttack(m);
	}
}

������
���� ����
�εεεε�

==============================
# multiinherit2
interface HandPhone {
	default void call() { System.out.println("��ȭ�� �Ǵ�."); }
	default void receive() { System.out.println("��ȭ�� �޴´�."); }
}

interface Camera {
	default void takepicture() { System.out.println("��Ĭ. ������ ��´�."); };
}

class HandPhoneCamera implements HandPhone, Camera {
}

class JavaTest {
	public static void main(String[] args) {
		HandPhoneCamera myphone = new HandPhoneCamera();
		myphone.call();
		myphone.takepicture();
	}
}

������	
��ȭ�� �Ǵ�.
��Ĭ. ������ ��´�.


==============================
# superinterface
interface A {
	default void print() { System.out.println("�μ��Ѵ�."); }
}

interface B {
	default void print() { System.out.println("����Ѵ�."); }
}

class C implements A, B {
	public void print() {
		A.super.print();
	}
}

class JavaTest {
	public static void main(String[] args) {
		C c = new C();
		c.print();
	}
}

������
�μ��Ѵ�.

###########################################################    
## 14�� ##

==============================
# CarTester
public class CarTester {
	public static void main(String[] args) {
		Car korando = new Car();
		korando.name = "�ڶ���C";
		korando.gasoline = false;
		
		korando.run();
		korando.stop();
	}
}


==============================
# Car
public class Car {
	String name;
	boolean gasoline;
	
	void run() {
		if (gasoline) {
			System.out.println("�θ� �θ�");
		} else {
			System.out.println("���� ����");
		}
	}
	void stop() {
		System.out.println("������");
	}
}

������	
���� ����
������


==============================
# UtilClass
package kr.soen.kim;

public class UtilClass {
	public static void utilMethod() {
		System.out.println("������� ��ƿ��Ƽ");
	}
}

UtilClass
package kr.soen.park;

public class UtilClass {
	public static void utilMethod() {
		System.out.println("�ڴ븮�� ��ƿ��Ƽ");
	}
}

PackageTest
package kr.soen;

public class PackageTest {

	public static void main(String[] args) {
		kr.soen.kim.UtilClass.utilMethod();
		kr.soen.park.UtilClass.utilMethod();
	}
}

������	
������� ��ƿ��Ƽ
�ڴ븮�� ��ƿ��Ƽ


==============================
# PackageCarTester
package kr.soen.choi;

public class Car {
	String name;
	boolean gasoline;

	public Car(String aName, boolean aGasoline) {
		name = aName;
		gasoline = aGasoline;
	}
	
	public void run() {
		if (gasoline) {
			System.out.println("�θ� �θ�");
		} else {
			System.out.println("���� ����");
		}
	}
	
	public void stop() {
		System.out.println("������");
	}
}

PackageCarTester
package kr.soen;

public class PackageCarTester {
	public static void main(String[] args) {
		kr.soen.choi.Car tivoli = new kr.soen.choi.Car("Ƽ����", true);
		tivoli.run();
		tivoli.stop();
	}
}

������	
�θ� �θ�
������


==============================
# AccessTest
package kr.soen;

import kr.soen.library.*;

public class AccessTest {
	// ��Ű�� �ܺο����� public �޼��常 ȣ�� �����ϴ�.
	public static void main(String[] args) {
		Util.mpublic();
		//Util.mprivate();
		//Util.mprotected();
		//Util.mdefault();
	}
}

class SubUtil extends Util {
	// �ٸ� ��Ű���� ��� ���迡 ������ protected �޼���� ȣ���� �� �ִ�.
	void submethod() {
		Util.mpublic();
		//Util.mprivate();
		Util.mprotected();
		//Util.mdefault();
	}
}

package kr.soen.library;

public class Util {
	public static void mpublic() { System.out.println("public method"); }
	private static void mprivate() { System.out.println("private method"); }
	protected static void mprotected() { System.out.println("protected method"); }
	static void mdefault() { System.out.println("default method"); }
	
	// ���� Ŭ���������� ��� �޼��带 ȣ���� �� �ִ�.
	void method() {
		mpublic();
		mprivate();
		mprotected();
		mdefault();
	}
}

class UseUtil {
	// ���� ��Ű�� ���� Ŭ������ private�� ȣ���� �� ����.
	void method() {
		Util.mpublic();
		//Util.mprivate();
		Util.mprotected();
		Util.mdefault();
	}
}

==============================
# defmodule
import java.util.logging.Logger;

class JavaTest {
	public static void main(String[] args) {
		Logger log = Logger.getLogger(JavaTest.class.getName());
		log.info("Program Start");
		log.warning("watch out");
	}
}


###########################################################    
## 15�� ##


==============================
# tostring
class Human {
	int age;
	String name;
	
	Human(int age, String name) {
		this.age = age;
		this.name = name;
	}
}

class JavaTest {
	public static void main(String[] args) {
		int i = 1234;
		System.out.println(i);
		
		Human kim = new Human(29, "�����");
		System.out.println(kim);
	}
}


==============================
# humanstring
class Human {
	int age;
	String name;
	
	Human(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public String toString() {
		return age + "���� " + name;
	}
}

class JavaTest {
	public static void main(String[] args) {
		int i = 1234;
		System.out.println(i);
		
		Human kim = new Human(29, "�����");
		System.out.println(kim);
		
		String str = "���� : " + kim;
		System.out.println(str);
	}
}


==============================
# equals
class Human {
	int age;
	String name;
	
	Human(int age, String name) {
		this.age = age;
		this.name = name;
	}
}

class JavaTest {
	public static void main(String[] args) {
		Human kim = new Human(29, "�����");
		Human lee = new Human(43, "�̽¿�");
		Human kimcopy = kim;
		Human kim2 = new Human(29, "�����");
		
		System.out.println("kim == lee : " + (kim == lee ? "����":"�ٸ���"));
		System.out.println("kim == kimcopy : " + (kim == kimcopy ? "����":"�ٸ���"));
		System.out.println("kim == kim2 : " + (kim == kim2 ? "����":"�ٸ���"));
	}
}


==============================
# humanequals
class Human {
	int age;
	String name;
	
	Human(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Human) {
			Human other = (Human)obj;
			return (age == other.age && name.equals(other.name));
		} else {
			return false;
		}
	}
}

class JavaTest {
	public static void main(String[] args) {
		Human kim = new Human(29, "�����");
		Human lee = new Human(43, "�̽¿�");
		Human kimcopy = kim;
		Human kim2 = new Human(29, "�����");
		
		System.out.println("kim.equals(lee) : " + (kim.equals(lee) ? "����":"�ٸ���"));
		System.out.println("kim.equals(kimcopy) : " + (kim.equals(kimcopy) ? "����":"�ٸ���"));
		System.out.println("kim.equals(kim2) : " + (kim.equals(kim2) ? "����":"�ٸ���"));
	}
}


==============================
# stringdate
class JavaTest {
	public static void main(String[] args) {
		String korea = "���ѹα�";
		String korea2 = new String("���ѹα�");
		
		System.out.println("== �� : " + (korea == korea2 ? "����":"�ٸ���"));
		System.out.println("equals ��: " + (korea.equals(korea2) ? "����":"�ٸ���"));
	}
}


==============================
# getclass
import java.lang.reflect.*;

class Human {
	int age;
	String name;
	
	Human(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	void intro() {
		System.out.println("�ȳ�, " + age + "�� " + name + "�̶�� ��.");
	}
}

class JavaTest {
	public static void main(String[] args) {
		Human kim = new Human(29, "�����");
		
		Class cls = kim.getClass();
		System.out.println("Ŭ���� �̸� = " + cls.getName());
		System.out.println("���� Ŭ���� = " + cls.getSuperclass().getName());

		System.out.print("�ʵ� : ");
		Field[] fields = cls.getDeclaredFields();
		for (Field F : fields) {
			System.out.print(F.getName() + " ");
		}
		
		System.out.println();
		System.out.print("�޼��� : ");
		Method methods[] = cls.getDeclaredMethods();
		for (Method M : methods) {
			System.out.print(M.getName() + " ");
		}
	}
}


==============================
# clone
class JavaTest {
	public static void main(String[] args) {
		int[] ar = { 1, 2, 3, 4, 5 };
		int[] ar2 = ar.clone();
		
		ar2[0] = 1000;
		
		System.out.println("ar[0] : " + ar[0]);
		System.out.println("ar2[0] : " + ar2[0]);
	}
}


==============================
# humanclone
class Human {
	int age;
	String name;
	
	Human(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public Object clone() {
		return new Human(age, name);
	}
}

class JavaTest {
	public static void main(String[] args) {
		Human kim = new Human(29, "�����");
		Human kim2 = (Human)kim.clone();

		kim2.name = "�̼���";
		
		System.out.println("kim.name : " + kim.name);
		System.out.println("kim2.name : " + kim2.name);
	}
}


==============================
# humanclone2
class Human implements Cloneable {
	int age;
	String name;
	
	Human(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public Object clone() {
		try {
			return super.clone();
		}
		catch(CloneNotSupportedException e) {
			return null;
		}
	}
}

class JavaTest {
	public static void main(String[] args) {
		Human kim = new Human(29, "�����");
		Human kim2 = (Human)kim.clone();

		kim2.name = "�̼���";
		
		System.out.println("kim.name : " + kim.name);
		System.out.println("kim2.name : " + kim2.name);
	}
}


==============================
# deepclone
class Human implements Cloneable {
	int age;
	String name;
	int[] score = new int[] { 1, 2, 3};
	
	Human(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public Object clone() {
		try {
			return super.clone();
		}
		catch(CloneNotSupportedException e) {
			return null;
		}
	}
}

class JavaTest {
	public static void main(String[] args) {
		Human kim = new Human(29, "�����");
		Human kim2 = (Human)kim.clone();
		
		kim2.score[0] = 999;
		
		System.out.println("kim.score[0] : " + kim.score[0]);
		System.out.println("kim2.score[0] : " + kim2.score[0]);
	}
}


==============================
# deepclone2
class Human implements Cloneable {
	int age;
	String name;
	int[] score = new int[] { 1, 2, 3};
	
	Human(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public Object clone() {
		try {
			Human other = (Human)super.clone();
			other.score = this.score.clone();
			return other; 
		}
		catch(CloneNotSupportedException e) {
			return null;
		}
	}
}

class JavaTest {
	public static void main(String[] args) {
		Human kim = new Human(29, "�����");
		Human kim2 = (Human)kim.clone();
		
		kim2.score[0] = 999;
		
		System.out.println("kim.score[0] : " + kim.score[0]);
		System.out.println("kim2.score[0] : " + kim2.score[0]);
	}
}

==============================
# finalize
class Network {
	void connect() {
		System.out.println("����Ǿ����ϴ�.");
	}
	
	void disconnect() {
		System.out.println("������ ���������ϴ�.");
	}
}

class JavaTest {
	public static void main(String[] args) {
		communication();
	}
	
	static void communication() {
		Network net = new Network();
		net.connect();
		// ��Ʈ�� ���
		net.disconnect();
	}
}


==============================
# finalize2
class Network {
	void connect() {
		System.out.println("����Ǿ����ϴ�.");
	}
	
	void disconnect() {
		System.out.println("������ ���������ϴ�.");
	}
	
	protected void finalize() throws Throwable {
		super.finalize();
		disconnect();
	}
}

class JavaTest {
	public static void main(String[] args) {
		communication();
		System.gc();
		System.runFinalization();
	}
	
	static void communication() {
		Network net = new Network();
		net.connect();
	}
}


==============================
# intbox
class JavaTest {
	public static void main(String[] args) {
		int i = 1234;
		Integer wrapint = new Integer(i);
		String str = wrapint.toString();
		System.out.println(str);
	}
}


==============================
# strliteral
class JavaTest {
	public static void main(String[] args) {
		Integer wrapint = new Integer("629");
		String str = wrapint.toString();
		int i = Integer.parseInt(str);
		System.out.println(i);
	}
}


==============================
# stringint
class JavaTest {
	public static void main(String[] args) {
		String a = "12", b = "34";
		System.out.println(a + b);
		System.out.println(Integer.parseInt(a) + Integer.parseInt(b));
	}
}


==============================
# unbox
class JavaTest {
	public static void main(String[] args) {
		Integer wrapint = new Integer(629);
		int i = wrapint.intValue();
		System.out.println(i);

		Double wrapdouble = new Double("3.14");
		int di = wrapdouble.intValue();
		System.out.println(di);
	}
}


==============================
# autobox
class JavaTest {
	public static void main(String[] args) {
		Integer a = new Integer(3);
		Integer b = new Integer(4);
		int c = a + b;
		System.out.println(c);
		
		Integer d = new Integer(12);
		d++;
		System.out.println(d);
	}
}


==============================
# intinfo
class JavaTest {
	public static void main(String[] args) {
		System.out.printf("int Ÿ���� ũ�� = %d, �ּҰ� = %d, �ִ밪 = %d\n", 
				Integer.SIZE, Integer.MIN_VALUE, Integer.MAX_VALUE);
		System.out.printf("short Ÿ���� ũ�� = %d, �ּҰ� = %d, �ִ밪 = %d\n", 
				Short.SIZE, Short.MIN_VALUE, Short.MAX_VALUE);
		System.out.printf("long Ÿ���� ũ�� = %d, �ּҰ� = %d, �ִ밪 = %d\n", 
				Long.SIZE, Long.MIN_VALUE, Long.MAX_VALUE);
	}
}


==============================
# binarystring
class JavaTest {
	public static void main(String[] args) {
		System.out.println(Integer.toBinaryString(1234));
		System.out.println(Integer.toBinaryString(Float.floatToRawIntBits(0.1f)));
	}
}


==============================
# floatinfo
class JavaTest {
	public static void main(String[] args) {
		System.out.printf("Float�� ũ�� = %d, ���� �ּҰ� = %d, ���� �ִ밪 = %d\n", 
				Float.SIZE, Float.MIN_EXPONENT, Float.MAX_EXPONENT);
		System.out.printf("Double�� ũ�� = %d, ���� �ּҰ� = %d, ���� �ִ밪 = %d\n", 
				Double.SIZE, Double.MIN_EXPONENT, Double.MAX_EXPONENT);
	}
}


==============================
# nan
class JavaTest {
	public static void main(String[] args) {
		System.out.println(3.14/0.0);
		System.out.println(-3.14/0.0);
		System.out.println(Math.sqrt(-2));
	}
}


==============================
# isnan
class JavaTest {
	public static void main(String[] args) {
		double d = Math.sqrt(-2);
		if (Double.isNaN(d)) {
			System.out.println("���ڰ� �ƴ�");
		} else {
			System.out.println("���ڰ� ����");
		}
	}
}


==============================
# printf
class JavaTest {
	public static void main(String[] args) {
		int i = 123;
		double d = 3.14;
		String str = "���ڿ�";
		System.out.printf("i = %d, d = %f, str = %s\n", i, d, str);
	}
}


==============================
# printfindex
class JavaTest {
	public static void main(String[] args) {
		int i = 123;
		double d = 3.14;
		String str = "���ڿ�";

		System.out.printf("i = %3$d, d = %2$f, str = %1$s\n", str, d, i);
		System.out.printf("���� = %1$d, i = %1$d", i);
	}
}


==============================
# printfformat
class JavaTest {
	public static void main(String[] args) {
		int i = 123;
		double d = 3.14159265;
		System.out.printf("__%d__\n", i);
		System.out.printf("__%5d__\n", i);
		System.out.printf("__%-5d__\n", i);
		System.out.printf("__%05d__\n", i);
		System.out.printf("__%6.2f__\n", d);
		System.out.printf("__%8.4f__\n", d);
	}
}


==============================
# checktime
class JavaTest {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			System.out.println(i + "��° ��");
		}
		long end = System.currentTimeMillis();
		System.out.println((end-start)/1000.0 + " �� �ɸ�");
	}
}


==============================
# sorttime
class JavaTest {
	static void InsertionSort(byte ar[], int num) {
		int i, j;
		byte temp;
		for (i = 1; i < num; i++) {
			for (temp = ar[i], j = i; j > 0; j--) {
				if (ar[j - 1] > temp) {
					ar[j] = ar[j - 1];
				} else {
					break;
				}
			}
			ar[j] = temp;
			if (i % 10000 == 0) {
				System.out.println(i + "��° ���� ��");
			}
		}
	}

	public static void main(String args[]) {
		final int num = 300000;
		long start = System.currentTimeMillis();
		byte ar[] = new byte[num];
		for (int i = 0; i < num; i++) {
			ar[i] = (byte) (Math.random() * 255);
		}
		InsertionSort(ar, num);
		long end = System.currentTimeMillis();
		System.out.println((end-start)/1000.0 + " �� �ɸ�");
	}
}


==============================
# arraycopy
class JavaTest {
	public static void main(String[] args) {
		int[] ar = { 1, 2, 3, 4, 5 };
		int[] ar2 = new int[5];
		
		System.arraycopy(ar, 0, ar2, 0, ar.length);
		
		for (int a : ar2) {
			System.out.print(a + " ");
		}
	}
}


==============================
# arraycopy2
class JavaTest {
	public static void main(String[] args) {
		int[] ar = { 1, 2, 3, 4, 5 };
		int[] ar2 = new int[5];
		
		System.arraycopy(ar, 1, ar2, 2, 2);
		
		for (int a : ar2) {
			System.out.print(a + " ");
		}
	}
}


==============================
# arraycopy3
class JavaTest {
	public static void main(String[] args) {
		int[] ar = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		
		System.arraycopy(ar, 2, ar, 4, 3);
		
		for (int a : ar) {
			System.out.print(a + " ");
		}
	}
}


==============================
# copyof
import java.util.*;

class JavaTest {
	public static void main(String[] args) {
		int[] ar = { 1, 2, 3, 4, 5 };
		int[] ar2 = Arrays.copyOf(ar, ar.length);
		for (int a : ar2) {
			System.out.print(a + " ");
		}
		System.out.println();
		
		int[] ar3 = Arrays.copyOfRange(ar, 1, 3);
		for (int a : ar3) {
			System.out.print(a + " ");
		}
	}
}

###########################################################    
## 16�� ##

==============================
# stringctor
class JavaTest {
	public static void main(String[] args) {
		String str = new String("�Ƹ��ٿ�");
		System.out.println(str);

		String str2 = "�츮����";
		System.out.println(str2);
		
		char[] ar = { 'k', 'o', 'r', 'e', 'a' };
		String str3 = new String(ar);
		System.out.println(str3);
		
		System.out.println("���ѹα�".length());
	}
}


==============================
# stringlength
class JavaTest {
	public static void main(String[] args) {
		String str = "�Ƹ��ٿ� �츮����";
		System.out.println("���� : " + str.length());
		System.out.println("2��° ���� : " + str.charAt(2));
	}
}


==============================
# strcompare
class JavaTest {
	public static void main(String[] args) {
		String str1 = "KOREA";
		String str2 = "korea";
		
		System.out.println(str1.equals(str2) ? "����":"�ٸ���");
		System.out.println(str1.equalsIgnoreCase(str2) ? "����":"�ٸ���");
		
		String apple = "Apple";
		String orange = "Orange";
		int Result = apple.compareTo(orange);
		if (Result == 0) {
			System.out.println("����");
		} else if (Result < 0) {
			System.out.println("Apple�� �� ����");
		} else if (Result > 0) {
			System.out.println("Apple�� �� ����");
		}
	}
}


==============================
# indexof
class JavaTest {
	public static void main(String[] args) {
		String str = "String Search Method of String Class";
		
		System.out.println("���� t = " + str.indexOf('t'));
		System.out.println("���� t = " + str.lastIndexOf('t'));
		System.out.println("���� z = " + str.indexOf('z'));
		System.out.println("���� String = " + str.indexOf("String"));
		System.out.println("���� String = " + str.lastIndexOf("String"));
	}
}


==============================
# startswith
class JavaTest {
	public static void main(String[] args) {
		String[] files = {
				"girl.jpg",
				"boy.png",
				"child.avi",
				"school.jpg",
				"book.gif"
		};
		
		for (String s : files) {
			if (s.endsWith(".jpg")) {
				System.out.println(s);
			}
		}
	}
}


==============================
# changecase
class JavaTest {
	public static void main(String[] args) {
		String str = "Kim Sang Hyung";
		
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		
		// ���ڿ� ��ü�� �����ϴ� ���� �ƴϴ�.
		str.toUpperCase();
		System.out.println(str);
		
		// ���ڿ��� �����Ϸ��� �ٽ� ���Թ޾ƾ� �Ѵ�.
		str = str.toUpperCase(); 
		System.out.println(str);
	}
}


==============================
# trim
class JavaTest {
	public static void main(String[] args) {
		String str = "      Kim Sang Hyung    ";
		
		System.out.println(str.trim());
		System.out.println(str.trim().concat(" BABO"));
	}
}


==============================
# replace
class JavaTest {
	public static void main(String[] args) {
		String str = "������ �Ϻ����̴�. �븶���� �Ϻ����̴�.";
		System.out.println(str.replace("�Ϻ�", "�ѱ�"));
		System.out.println(str.replaceFirst("�Ϻ�", "�ѱ�"));
	}
}

==============================
# substring
class JavaTest {
	public static void main(String[] args) {
		String str = "0123456789";
		System.out.println(str.substring(3,7));
		
		String name = "�� �̸��� <���Ѱ�>�Դϴ�.";
		int st, ed;
		st = name.indexOf('<');
		ed = name.indexOf('>');
		System.out.println(name.substring(st+1,ed));
	}
}


==============================
# strassign
class JavaTest {
	public static void main(String[] args) {
		String s = "korea";
		String s2 = s;
		
		s2 += " fighting";
		
		System.out.println("s = " + s);
		System.out.println("s2 = " + s2);
	}
}


==============================
# split
class JavaTest {
	public static void main(String[] args) {
		String city = "����,����,�뱸,�λ�";
		String[] token = city.split(",");

		for (String s : token) {
			System.out.println(s);
		}
	}
}


==============================
# join
import java.util.*;

class JavaTest {
	public static void main(String[] args) {
		String path = String.join("/", "user", "data", "app", "local");
		System.out.println(path);
		
		String seoul = "����", daejun = "����", daegu = "�뱸", busan = "�λ�";
		String city = String.join(",", seoul, daejun, daegu, busan);
		//String city = seoul + "," + daejun + "," + daegu + "," + busan;
		System.out.println(city);
		
		List<String> subway = Arrays.asList("���￪", "����", "���", "�뷮��");
		System.out.println(String.join(" -> ", subway));
	}
}


==============================
# atoz
class JavaTest {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		String str = "";
		for (int i = 0; i < 1000; i++) {
			for (char ch = 'A'; ch <= 'z'; ch ++) {
				str += ch;
			}
			str += '\n';
		}
		System.out.println(str);
		System.out.println((System.currentTimeMillis()-start)/1000.0 + "��");
	}
}


==============================
# atoz2
class JavaTest {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		StringBuffer str = new StringBuffer();
		for (int i = 0; i < 1000; i++) {
			for (char ch = 'A'; ch <= 'z'; ch ++) {
				str.append(ch);
			}
			str.append('\n');
		}
		System.out.println(str);
		System.out.println((System.currentTimeMillis()-start)/1000.0 + "��");
	}
}

==============================
# repeat
public class JavaTest {
	public static void main(String[] args) {
		String home = "���ѹα� ";
		String hurrah = "����! ";
		System.out.println(home + hurrah.repeat(3));
	}
}


==============================
# isBlank
public class JavaTest {
	public static void main(String[] args) {
		String text = "\t  \n";
		System.out.println("isEmpty : " + text.isEmpty());
		System.out.println("isBlank : " + text.isBlank());
	}
}


==============================
# strip
public class JavaTest {
	public static void main(String[] args) {
		String text = "    korea    ";
		System.out.println("#" + text + "#");
		System.out.println("#" + text.strip() + "#");
	}
}


==============================
# lines
import java.util.stream.Stream;

public class JavaTest {
	public static void main(String[] args) {
		String text = "apple\norange\nbanana";
		Stream<String> fruits = text.lines();
		fruits.forEach(System.out::println);
	}
}


==============================
# indent
public class JavaTest {
	public static void main(String[] args) {
		String text = "<body>\n<p>sample</p>\n</body>";
		System.out.println(text);
		System.out.println(text.indent(4));
	}
}


==============================
# transform
public class JavaTest {
	public static void main(String[] args) {
		String text = "korea";
		System.out.println(text.transform(t -> t + " hello"));
		String num = "12";
		System.out.println(num.transform(Integer::parseInt) * 2);
	}
}


==============================
# mathconst
class JavaTest {
	public static void main(String[] args) {
		System.out.println(Math.E);
		System.out.println(Math.PI);
	}
}


==============================
# floor
class JavaTest {
	public static void main(String[] args) {
		System.out.println("���� = " + Math.floor(1.6));
		System.out.println("���� = " + Math.floor(-1.6));
		System.out.println("������ = " + Math.ceil(1.6));
		System.out.println("������ = " + Math.ceil(-1.6));
		System.out.println("�ڸ� = " + (int)1.6);
		System.out.println("�ڸ� = " + (int)-1.6);

		System.out.println("�ݿø� = " + Math.round(1.6));
		System.out.println("�ݿø� = " + Math.round(1.4));
	}
}


==============================
# round
class JavaTest {
	public static void main(String[] args) {
		double value = 123.456789;
		
		double value1000 = value * 1000;
		double valueround = Math.round(value1000);
		double value3 = valueround / 1000.0;
		
		System.out.println(value3);
	}
}


==============================
# radian
class JavaTest {
	public static void main(String[] args) {
		System.out.println("45�� = " + Math.toRadians(45));
		System.out.println("1 ���� = " + Math.toDegrees(1));
		System.out.println("3.14 ���� = " + Math.toDegrees(Math.PI));
	}
}


==============================
# sin
class JavaTest {
	public static void main(String[] args) {
		for (double d = 0 ; d <= 90; d += 15) {
			System.out.println("sin(" + d + ") = " + 
					Math.sin(Math.toRadians(d)));
		}
	}
}


==============================
# roundnth
class JavaTest {
	public static void main(String[] args) {
		System.out.println(roundNtn(123.456789, 0));
		System.out.println(roundNtn(123.456789, 1));
		System.out.println(roundNtn(123.456789, 2));
		System.out.println(roundNtn(123.456789, 3));
		System.out.println(roundNtn(123.456789, 4));
	}
	
	public static double roundNtn(double value, int n) {
		double multi = Math.pow(10, n);
		return Math.round(value * multi)/multi;
	}
}


==============================
# hypot
class JavaTest {
	public static void main(String[] args) {
		int x = 3;
		int y = 4;
		double c = Math.hypot(x, y);
		// double c = Math.sqrt(x * x + y * y);
		System.out.println("���� = " + c);
	}
}


==============================
# random
class JavaTest {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println(Math.random());
		}
	}
}


==============================
# random2
class JavaTest {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println((int)(Math.random() * 12) + 1);
		}
	}
}


==============================
# nextint
import java.util.Random;

class JavaTest {
	public static void main(String[] args) {
		Random R = new Random();
		for (int i = 0; i < 5; i++) {
			System.out.println(R.nextInt(10));
		}
	}
}


==============================
# getrandom
class JavaTest {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println(getRandom(5, 10));
		}
	}
	
	static int getRandom(int a, int b) {
		return (int)(Math.random() * (b - a)) + a;
	}
}


==============================
# calendar
import java.util.*;

class JavaTest {
	public static void main(String[] args) {
		GregorianCalendar today = new GregorianCalendar();
		System.out.printf("%d�� %d�� %d�� %s %d�� %d�� %d��",
				today.get(Calendar.YEAR), 
				today.get(Calendar.MONTH) + 1, 
				today.get(Calendar.DATE), 
				today.get(Calendar.AM_PM) == Calendar.AM ? "����":"����", 
				today.get(Calendar.HOUR), 
				today.get(Calendar.MINUTE), 
				today.get(Calendar.SECOND)); 
	}
}


==============================
# today
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

class JavaTest {
	public static void main(String[] args) {
		GregorianCalendar today = new GregorianCalendar();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� M�� d�� a hh:mm:ss");
		String result = sdf.format(today.getTime());
		System.out.println(result);
	}
}


==============================
# after100
import java.util.*;

class JavaTest {
	public static void main(String[] args) {
		GregorianCalendar today = new GregorianCalendar();
		System.out.printf("���� ��¥ : %d�� %d��\n",
				today.get(Calendar.MONTH) + 1, 
				today.get(Calendar.DATE));
		today.add(Calendar.DATE, 100);
		System.out.printf("100�� �Ĵ� %d�� %d���Դϴ�.\n",
				today.get(Calendar.MONTH) + 1, 
				today.get(Calendar.DATE));
	}
}


==============================
# birth
import java.util.*;

class JavaTest {
	public static void main(String[] args) {
		GregorianCalendar birth = new GregorianCalendar(1970, 8, 1);
		GregorianCalendar today = new GregorianCalendar();
		long diff = today.getTimeInMillis() - birth.getTimeInMillis();
		long days = diff / (24 * 60 * 60 * 1000);
		System.out.println("������ �¾�� " + days + "��°");
	}
}


==============================
# localtime
import java.time.LocalDate;
import java.time.LocalTime;

class JavaTest {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalTime now = LocalTime.now();
		System.out.printf("%d�� %d�� %d�� %d�� %d�� %d��",
				today.getYear(),
				today.getMonthValue(),
				today.getDayOfMonth(),
				now.getHour(),
				now.getMinute(),
				now.getSecond());
	}
}


==============================
# day100
import java.time.LocalDate;

class JavaTest {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate after100 = today.plusDays(100);
		System.out.printf("100�� �Ĵ� %d�� %d���Դϴ�.",
				after100.getMonthValue(),
				after100.getDayOfMonth());
	}
}

==============================
# pointrecord
class Point
{
	// ��ǥ�� ������ ����
	private final int x;
	private final int y;
	
	// �⺻ ������
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// ������ �о��� �׼���
	int x() { return x; }
	int y() { return y; }
	
	// ��� ��
	public boolean equals(Object other) {
		if (other instanceof Point == false) return false;
		return ((Point)other).x == x && ((Point)other).y == y;
	}

	// �ؽ� �ڵ�
    public int hashCode() {
        return y * 10000 + x;
    }
    
	// ���ڿ�ȭ
	public String toString() {
		return "Point(" + x + "," + y + ")";
	}
}

public class JavaTest {
	public static void main(String[] args) {
		// ����
		Point pt = new Point(123, 456);
		// ���ڿ�ȭ�Ͽ� ���
		System.out.println(pt);
		// ���� ����� �б�
		int x = pt.x();
		int y = pt.y();
		System.out.println("x = " + x + ",y = " + y);
		// ��� ��
		Point pt2 = new Point(123, 456);
		System.out.println(pt.equals(pt2));
	}
}

==============================
# pointrecord2
record Point(int x, int y) {}

public class JavaTest {
	public static void main(String[] args) {
		// �����ϰ� ����
		Point pt = new Point(123, 456);
		// ���ڿ�ȭ�Ͽ� ���
		System.out.println(pt);
		// ���� ����� �б�
		int x = pt.x();
		int y = pt.y();
		System.out.println("x = " + x + ",y = " + y);
		// ��� ��
		Point pt2 = new Point(123, 456);
		System.out.println(pt.equals(pt2));
	}
}

==============================
# pointrecord3
record Point(int x, int y) { }

public class JavaTest {
	public static void main(String[] args) {
		Point pt = new Point(100, 150);
		Point pt2 = GetMidPoint(pt);
		System.out.println(pt2);
	}
	
	public static Point GetMidPoint(Point pt) {
		return new Point(pt.x() /2 , pt.y() /2);
	}
}

==============================
# canonical
record Point(int x, int y) { 
	Point {
		if (x < 0) x = 0;
		if (y < 0) y = 0;
	}
}

public class JavaTest {
	public static void main(String[] args) {
		Point pt = new Point(-123, 456);
		System.out.println(pt);
	}
}


###########################################################    
## 17�� ##

==============================
# arraylist
import java.util.*;

class JavaTest {
	public static void main(String[] args) {
		ArrayList<Integer> arNum = new ArrayList<Integer>();
		arNum.add(1);
		arNum.add(2);
		arNum.add(3);
		arNum.add(4);
		arNum.add(5);
		arNum.add(2, 100);
		for (Integer i : arNum) {
			System.out.print(i + " ");
		}
	}
}


==============================
# listsize
import java.util.*;

class JavaTest {
	public static void main(String[] args) {
		ArrayList<Integer> arNum = new ArrayList<Integer>();
		for (int i = 0; i < 30; i++ ) {
			arNum.add((int)(Math.random() * 10));
		}
		for (Integer i : arNum) {
			System.out.print(i + " ");
		}
	}
}


==============================
# listedit
import java.util.*;

class JavaTest {
	public static void main(String[] args) {
		ArrayList<String> arName = new ArrayList<String>();
		arName.add("����ȯ");
		arName.add("�迵��");
		arName.add("�����");
		arName.add(1,"���¿�");
		for (String s : arName) {
			System.out.println(s);
		}

		System.out.println("==========");
		arName.remove(2);
		arName.set(2,"�����ɽ�");
		for (String s : arName) {
			System.out.println(s);
		}
		if (arName.indexOf("���¿�") != -1) {
			System.out.println("�ִ�");
		} else {
			System.out.println("����");
		}
	}
}


==============================
# aslist
import java.util.*;

class JavaTest {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(11, 22, 33, 44, 55);
		for (int i : list) {
			System.out.print(i + " ");
		}
	}
}


==============================
# addall
import java.util.*;

class JavaTest {
	public static void main(String[] args) {
		ArrayList<Integer> arNum =  new ArrayList<Integer>(Arrays.asList(1, 2, 3));
		ArrayList<Integer> arNum2 =  new ArrayList<Integer>(Arrays.asList(4, 5, 2));
		
		arNum.addAll(arNum2);
		for (Integer i : arNum) {
			System.out.print(i + " ");
		}
	}
}


==============================
# removeall
import java.util.*;

class JavaTest {
	public static void main(String[] args) {
		ArrayList<Integer> arNum =  new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
		ArrayList<Integer> arNum2 =  new ArrayList<Integer>(Arrays.asList(2, 3));
		
		System.out.print("������ => ");
		ArrayList<Integer> arNumRemove = new ArrayList<Integer>(arNum); 
		arNumRemove.removeAll(arNum2);
		for (Integer i : arNumRemove) {
			System.out.print(i + " ");
		}
		
		System.out.print("\n������ => ");
		ArrayList<Integer> arNumRetain = new ArrayList<Integer>(arNum); 
		arNumRetain.retainAll(arNum2);
		for (Integer i : arNumRetain) {
			System.out.print(i + " ");
		}
		
		System.out.print("\n�κ����� => ");
		if (arNum.containsAll(arNum2)) {
			System.out.print("�κ�������");
		} else {
			System.out.print("�κ������� �ƴ�");
		}
	}
}


==============================
# toarray
import java.util.*;

class JavaTest {
	public static void main(String[] args) {
		ArrayList<Integer> arNum =  new ArrayList<Integer>(Arrays.asList(12, 34, 56));
		
		Integer[] ar = new Integer[arNum.size()]; 
		arNum.toArray(ar);
		for (int a : ar) {
			System.out.print(a + " ");
		}
	}
}


==============================
# sublist
import java.util.*;

class JavaTest {
	public static void main(String[] args) {
		ArrayList<Integer> arNum =  new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		
		List<Integer> sub = arNum.subList(1, 4);
		for (Integer i : sub) {
			System.out.print(i + " ");
		}
		System.out.println();

		arNum.set(2, 100);
		for (Integer i : sub) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		sub.set(1, 200);
		for (Integer i : arNum) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		sub.clear();
		for (Integer i : arNum) {
			System.out.print(i + " ");
		}
	}
}


==============================
# sublist2
import java.util.*;

class JavaTest {
	public static void main(String[] args) {
		ArrayList<Integer> arNum =  new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		
		List<Integer> sub = arNum.subList(1, 4);
		arNum.remove(2);
		for (Integer i : sub) {
			System.out.print(i + " ");
		}
	}
}

==============================
# linkedlist
import java.util.*;

class JavaTest {
	public static void main(String[] args) {
		LinkedList<String> arName = new LinkedList<String>();
		arName.add("����ȯ");
		arName.add("�迵��");
		arName.add("�����");
		arName.add(1,"���¿�");

		for (String s : arName) {
			System.out.println(s);
		}
	}
}


==============================
# iterator
import java.util.*;

class JavaTest {
	public static void main(String[] args) {
		List<String> arName = new LinkedList<String>();
		arName.add("����ȯ");
		arName.add("�迵��");
		arName.add("�����");
		arName.add(1,"���¿�");
		
		Iterator<String> it = arName.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}


==============================
# reverseit
import java.util.*;

class JavaTest {
	public static void main(String[] args) {
		List<String> arName = new ArrayList<String>();
		arName.add("����ȯ");
		arName.add("�迵��");
		arName.add("�����");
		arName.add(1,"���¿�");
		
		ListIterator<String> it = arName.listIterator(arName.size());
		while (it.hasPrevious()) {
			System.out.println(it.previous());
		}
	}
}


==============================
# sortlist
import java.util.*;

class JavaTest {
	public static void main(String[] args) {
		ArrayList<String> arName = new ArrayList<String>(); 
		arName.add("�庸��");
		arName.add("������"); 
		arName.add("������"); 
		arName.add("��������"); 
		
		for(String name : arName) {
			System.out.print(name + " ");
		}
		
		System.out.println();
		Collections.sort(arName);
		// ��������
		// Collections.reverse(arName);
		
		for(String name : arName) {
			System.out.print(name + " ");
		}
	}
}


==============================
# shuffle
import java.util.*;

class JavaTest {
	public static void main(String[] args) {
		ArrayList<String> arName = new ArrayList<String>(); 
		arName.add("�庸��");
		arName.add("������"); 
		arName.add("������"); 
		arName.add("��������"); 
		
		Collections.shuffle(arName);
		
		for(String name : arName) {
			System.out.print(name + " ");
		}
	}
}


==============================
# stack
import java.util.*;

class JavaTest {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("ȣ����");
		stack.push("����");
		stack.push("������");
		
		while(stack.empty() == false) {
			System.out.println(stack.pop());
		}
	}
}


==============================
# arraydeque
import java.util.*;

class JavaTest {
	public static void main(String[] args) {
		Deque<String> stack = new ArrayDeque<String>();
		stack.push("ȣ����");
		stack.push("����");
		stack.push("������");
		stack.addLast("�⸰");
		
		while(stack.isEmpty() == false) {
			System.out.println(stack.pop());
		}
	}
}


==============================
# queue
import java.util.*;

class JavaTest {
	public static void main(String[] args) {
		LinkedList<String> queue = new LinkedList<String>();
		queue.offer("ȣ����");
		queue.offer("����");
		queue.offer("������");
		
		while(queue.isEmpty() == false) {
			System.out.println(queue.poll());
		}
	}
}


==============================
# hashmap
import java.util.*;

class JavaTest {
	public static void main(String[] args) {
		HashMap<String,Integer> Snack = new HashMap<String,Integer>();
		Snack.put("��¡�� ����", 2500);
		Snack.put("�Ҹ���", 1900);
		Snack.put("�ֺ극��ũ", 450);
		Snack.put("������", 900);
		
		String MySnack = "�Ҹ���";
		System.out.println(MySnack + "�� ������ " + Snack.get(MySnack));
	}
}


==============================
# hashcode
import java.util.*;

class Human {
	int age;
	String name;
	
	Human(int age, String name) {
		this.age = age;
		this.name = name;
	}
}

class JavaTest {
	public static void main(String[] args) {
		HashMap<Human,Integer> donate = new HashMap<Human,Integer>();
		donate.put(new Human(42, "��Ⳳ"), 10000);
		donate.put(new Human(24, "�ڼ���"), 20000);
		donate.put(new Human(20, "�ڼ���"), 5000);
		donate.put(new Human(11, "�ֻ��"), 8000);

		Human park = new Human(20, "�ڼ���");
		System.out.println(park.name + "���� ��α� = " + donate.get(park));
	}
}


==============================
# hashcode2
import java.util.*;

class Human {
	int age;
	String name;
	
	Human(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public int hashCode() {
		return name.length() + age;
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Human) {
			Human other = (Human)obj;
			return (age == other.age && name.equals(other.name));
		} else {
			return false;
		}
	}
}

class JavaTest {
	public static void main(String[] args) {
		HashMap<Human,Integer> donate = new HashMap<Human,Integer>();
		donate.put(new Human(42, "��Ⳳ"), 10000);
		donate.put(new Human(24, "�ڼ���"), 20000);
		donate.put(new Human(20, "�ڼ���"), 5000);
		donate.put(new Human(11, "�ֻ��"), 8000);

		Human park = new Human(20, "�ڼ���");
		System.out.println(park.name + "���� ��α� = " + donate.get(park));
	}
}

==============================
# hashset
import java.util.*;

class JavaTest {
	public static void main(String[] args) {
		HashSet<String> kangwon= new HashSet<String>();
		kangwon.add("��õ��");
		kangwon.add("ö����");
		kangwon.add("������");
		kangwon.add("������");
		kangwon.add("ȭõ��");
		kangwon.add("��õ��");
		
		Iterator<String> it = kangwon.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}

###########################################################    
## 18�� ##

==============================
# rawarraylist
import java.util.*;

class JavaTest {
	public static void main(String[] args) {
		ArrayList arNum = new ArrayList();
		arNum.add(1);
		arNum.add("���ڿ�");
		int value = (int)arNum.get(0);
		// int temp = (int)arNum.get(1);
		System.out.println(value);
	}
}


==============================
# genarraylist
import java.util.*;

class JavaTest {
	public static void main(String[] args) {
		ArrayList<Integer> arNum = new ArrayList<Integer>();
		arNum.add(1);
		//arNum.add("���ڿ�");
		int value = arNum.get(0);
		System.out.println(value);
	}
}


==============================
# intbox
class IntBox {
	int value;
	IntBox(int value) { this.value = value; }
	int get() { return value; }
	void set(int value) { this.value = value; }
}

class DoubleBox {
	double value;
	DoubleBox(double value) { this.value = value; }
	double get() { return value; }
	void set(double value) { this.value = value; }
}

class JavaTest {
	public static void main(String[] args) {
		IntBox bi = new IntBox(1234);
		int biv = bi.get();
		System.out.println(biv);

		DoubleBox bd = new DoubleBox(56.78);
		double bdv = bd.get();
		System.out.println(bdv);
	}
}


==============================
# objectbox
class ObjectBox {
	Object value;
	ObjectBox(Object value) { this.value = value; }
	Object get() { return value; }
	void set(Object value) { this.value = value; }
}

class JavaTest {
	public static void main(String[] args) {
		ObjectBox bi = new ObjectBox(1234);
		int biv = (int)bi.get();
		System.out.println(biv);
		
		ObjectBox bd = new ObjectBox(56.78);
		double bdv = (double)bd.get();
		System.out.println(bdv);
	}
}


==============================
# genbox
class Box<T> {
	T value;
	Box(T value) { this.value = value; }
	T get() { return value; }
	void set(T value) { this.value = value; }
}

class JavaTest {
	public static void main(String[] args) {
		Box<Integer> bi = new Box<Integer>(1234);
		int biv = bi.get();
		System.out.println(biv);
		
		Box<Double> bd = new Box<Double>(56.78);
		double bdv = bd.get();
		System.out.println(bdv);
	}
}


==============================
# gencompile
class Box<T> {
	T value;
	Box(T value) { this.value = value; }
	T get() { return value; }
	void set(T value) { this.value = value; }
}

class JavaTest {
	public static void main(String[] args) {
		Box<Integer> bi = new Box<Integer>(1234);
		Box<Double> bd = new Box<Double>(56.78);
		System.out.println(bi.getClass() == bd.getClass());
	}
}


==============================
# rawtype
class Box<T> {
	T value;
	Box(T value) { this.value = value; }
	T get() { return value; }
	void set(T value) { this.value = value; }
}

class JavaTest {
	public static void main(String[] args) {
		Box rb = new Box(1234);
		int rbv = (int)rb.get();
		System.out.println(rbv);
	}
}


==============================
# rawtype2
class Box<T> {
	T value;
	Box(T value) { this.value = value; }
	T get() { return value; }
	void set(T value) { this.value = value; }
}

class JavaTest {
	public static void main(String[] args) {
		Box raw = new Box(1234);
		Box<Integer> para = new Box<Integer>(5678);
		raw = para;
		int value = (int)raw.get();
		System.out.println(value);
	}
}


==============================
# rawtype3
class Box<T> {
	T value;
	Box(T value) { this.value = value; }
	T get() { return value; }
	void set(T value) { this.value = value; }
}

class JavaTest {
	public static void main(String[] args) {
		Box raw = new Box(1234);
		Box<Integer> para = new Box<Integer>(5678);
		para = raw;
		int value = para.get();
		System.out.println(value);
	}
}


==============================
# genmethod
class JavaTest {
	static <T> void print(T a) {
		System.out.println(a);
	}

	public static void main(String[] args) {
		JavaTest.<Integer>print(1234);
		JavaTest.<String>print("���ڿ�");
	}
}

==============================
# genarg
import java.util.ArrayList;

class JavaTest {
	static <T> void dumpArray(ArrayList<T> ar) {
		for (T a : ar) {
			System.out.println(a);
		}
	}

	public static void main(String[] args) {
		ArrayList<String> yoil = new ArrayList<String>();
		yoil.add("�Ͽ���");
		yoil.add("������");
		JavaTest.<String>dumpArray(yoil);
		
		ArrayList<Integer> score = new ArrayList<Integer>();
		score.add(98);
		score.add(72);
		JavaTest.<Integer>dumpArray(score);
	}
}


==============================
# comparable
class JavaTest {
	static <T extends Comparable<T>> T max(T a, T b) {
		if (a.compareTo(b) > 0) {
			return a;
		} else {
			return b;
		}
	}
	
	public static void main(String[] args) {
		int result = JavaTest.max(1, 2);
		System.out.println(result);
	}
}


==============================
# bound
class Human {
	void intro() { System.out.println("�� ���"); }
}

class Student extends Human {
	void intro() { System.out.println("�� �л�"); }
}

class Box<T extends Human> {
	T value;
	Box(T value) { this.value = value; }
	T get() { return value; }
	void set(T value) { this.value = value; }
	void intro() {
		value.intro();
	}
}

class JavaTest {
	public static void main(String[] args) {
		Human h = new Human();
		Box<Human> bh = new Box<Human>(h);
		bh.intro();

		Student s = new Student();
		Box<Human> bs = new Box<Human>(s);
		bs.intro();
	}
}


==============================
# gensubtype
import java.util.ArrayList;

class Human { }
class Student extends Human { }

class JavaTest {
	public static void main(String[] args) {
		ArrayList<Human> ah = new ArrayList<Human>();
		ArrayList<Student> as = new ArrayList<Student>();

		ah.add(new Human());
		as.add(new Student());
		ah.add(new Student());
		
		//ah = as;
		ah.add(new Human());
		Student k = as.get(1);
	}
}


==============================
# wildcard
class Human {
	void intro() { System.out.println("�� ���"); }
}

class Student extends Human {
	void intro() { System.out.println("�� �л�"); }
}

class Box<T> {
	T value;
	Box(T value) { this.value = value; }
	T get() { return value; }
	void set(T value) { this.value = value; }
}

class JavaTest {
	static void printMan(Box<? extends Human> box) {
		box.get().intro();
	}
	public static void main(String[] args) {
		Human h = new Human();
		Box<Human> bh = new Box<Human>(h);
		printMan(bh);

		Student s = new Student();
		Box<Student> bs = new Box<Student>(s);
		printMan(bs);
	}
}

###########################################################    
## 19�� ##

==============================
# divideex
class JavaTest {
	public static void main(String[] args) {
		int a, b, c;
		a = 2;
		b = 0;
		c= a / b;
		System.out.println("c = " + c);
		System.out.println("���α׷� ���� �Ϸ�");
	}
}


==============================
# ifdivide
class JavaTest {
	public static void main(String[] args) {
		int a, b, c;
		a = 2;
		b = 0;
		if (b != 0) {
			c= a / b;
			System.out.println("c = " + c);
		}
		System.out.println("���α׷� ���� �Ϸ�");
	}
}


==============================
# trydivide
class JavaTest {
	public static void main(String[] args) {
		int a, b, c;
		a = 2;
		b = 0;
		try {
			c = a / b;
			System.out.println("c = " + c);
		}
		catch (java.lang.ArithmeticException e) {
			System.out.println("0���� ������ ���� �߻�");
		}
		System.out.println("���α׷� ���� �Ϸ�");
	}
}


==============================
# sleep
class JavaTest {
	public static void main(String[] args) {
		System.out.println("���α׷� ����");
		try {
			Thread.sleep(3000);
		}
		catch (InterruptedException e) {
			System.out.println("���� �߻�");
		}
		System.out.println("���α׷� ��");
	}
}


==============================
# exmessage
class JavaTest {
	public static void main(String[] args) {
		int a, b, c;
		a = 2;
		b = 0;
		try {
			c= a / b;
			System.out.println("c = " + c);
		}
		catch (java.lang.ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("���α׷� ���� �Ϸ�");
	}
}


==============================
# multicatch
class JavaTest {
	public static void main(String[] args) {
		int a, b, c;
		a = 5;
		b = 2;
		int[] ar= {1,2,3,4,5};
		
		try {
			c= a / b;
			System.out.println("c = " + c);
			ar[5] = 100;
		}
		catch (java.lang.ArithmeticException e) {
			System.out.println("0���� ������ ���� �߻�");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("÷�ڰ� �迭 ������ �Ѿ���ϴ�.");
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("���α׷� ���� �Ϸ�");
	}
}


==============================
# polyex
class JavaTest {
	public static void main(String[] args) {
		int a, b, c;
		a = 5;
		b = 2;
		int[] ar= {1,2,3,4,5};
		
		try {
			c= a / b;
			System.out.println("c = " + c);
			ar[5] = 100;
		}
		catch (java.lang.RuntimeException  e) {
			System.out.println("������ ���� �߻�");
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("���α׷� ���� �Ϸ�");
	}
}


==============================
# orex
class JavaTest {
	public static void main(String[] args) {
		int a, b, c;
		a = 5;
		b = 2;
		int[] ar= {1,2,3,4,5};
		
		try {
			c= a / b;
			System.out.println("c = " + c);
			ar[5] = 100;
		}
		catch (java.lang.ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("0���� ������ �Ǵ� �迭 ���� �ʰ� ���� �߻�");
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("���α׷� ���� �Ϸ�");
	}
}


==============================
# stacktrace
class JavaTest {
	public static void main(String[] args) {
		method();
	}

	static void method() {
		submethod();
	}

	static void submethod() {
		int i;
		int a = 3, b = 0;
		try {
			i = a / b;
			System.out.println(i);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}


==============================
# stacktrace2
class JavaTest {
	public static void main(String[] args) {
		method();
	}

	static void method() {
		try {
			submethod();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	static void submethod() {
		int i;
		int a = 3, b = 0;
		i = a / b;
		System.out.println(i);
	}
}


==============================
# throw
class JavaTest {
	public static void main(String[] args) {
		String name = "��������";
		printScore(name);
	}

	static void printScore(String name) {
		System.out.println(name.length());
	}
}


==============================
# throw2
class JavaTest {
	public static void main(String[] args) {
		String name = null;
		printScore(name);
	}

	static void printScore(String name) {
		try {
			System.out.println(name.length());
		}
		catch (NullPointerException e) {
			System.out.println("�̸��� ��ȿ�մϴ�.");
		}
	}
}


==============================
# throw3
class JavaTest {
	public static void main(String[] args) {
		String name = null;
		try {
			printScore(name);
		}
		catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}

	static void printScore(String name) throws NullPointerException {
		if (name == null) {
			throw new NullPointerException("�̸��� ��ȿ�մϴ�.");
		}
		System.out.println(name.length());
	}
}


==============================
# throws
class JavaTest {
	public static void main(String[] args) throws Exception {
		String name = null;
		printScore(name);
	}

	static void printScore(String name) throws Exception {
		if (name == null) {
			throw new Exception("�̸��� ��ȿ�մϴ�.");
		}
		System.out.println(name.length());
	}
}


==============================
# throws2
class JavaTest {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("���α׷� ����");
		Thread.sleep(3000);
		System.out.println("���α׷� ��");
	}
}


==============================
# userex
class NegativeException extends Exception {
	NegativeException() {
		super("������ �ȵǿ�");
	}
}

class JavaTest {
	public static void main(String[] args) {
		int sum = 0;
		
		try {
			sum = calcSum(100);
			System.out.println(sum);
		} catch (NegativeException e) {
			e.printStackTrace();
		}
	}

	static int calcSum(int to) throws NegativeException {
		if (to < 0) {
			throw new NegativeException();
		}
		int sum = 0;
		for (int i = 1; i <= to; i++) {
			sum += i;
		}
		return sum;
	}
}


==============================
# networkclose
class JavaTest {
	public static void main(String[] args) {
		System.out.println("����");
		try {
			System.out.println("����");
			System.out.println("����");
		}
		catch(Exception e) {
			System.out.println("���� ó��");
			System.out.println("����");
		}
	}
}


==============================
# finally
class JavaTest {
	public static void main(String[] args) {
		System.out.println("����");
		try {
			System.out.println("����");
		}
		catch(Exception e) {
			System.out.println("���� ó��");
		}
		finally {
			System.out.println("����");
		}
	}
}


==============================
# autoclose
class NetAccess {
	public void open() { System.out.println("����");	 }
	public void send() { System.out.println("����");	 }
	public void close() { System.out.println("����"); }
}

class JavaTest {
	public static void main(String[] args) {
		NetAccess na = new NetAccess();
		try {
			na.open();
			na.send();
		}
		finally {
			na.close();
		}
	}
}


==============================
# autoclose2
class NetAccess implements AutoCloseable {
	public void open() { System.out.println("����");	 }
	public void send() { System.out.println("����");	 }
	public void close() { System.out.println("����"); }
}

class JavaTest {
	public static void main(String[] args) throws Exception {
		try (NetAccess na = new NetAccess()) {
			na.open();
			na.send();
		}
	}
}


==============================
# autoclose3
import java.io.*;

class JavaTest {
	public static void main(String[] args) {
		byte[] data = { 8, 9, 0, 6, 2, 9, 9 };
		try (FileOutputStream out = new FileOutputStream("test.bin")) {
			out.write(data);
			System.out.println("Write success");
		}
		catch (IOException e) {
			System.out.println("File output error");
		}
	}
}

###########################################################    
## 20�� ##

==============================
# thread
class JavaTest {
	public static void main(String[] args) {
		PrintThread worker = new PrintThread();
		worker.start();
		
		for (int num = 0;num < 30;num++) {
			System.out.print("O");
			try { Thread.sleep(200); } catch (InterruptedException e) { ; }
		}
	}
}

class PrintThread extends Thread {
	public void run() {
		for (int num = 0;num < 30;num++) {
			System.out.print("X");
			try { Thread.sleep(100); } catch (InterruptedException e) { ; }
		}
	}
}


==============================
# singlethread
class JavaTest {
	public static void main(String[] args) {
		for (int num = 0;num < 30;num++) {
			System.out.print("O");
			try { Thread.sleep(200); } catch (InterruptedException e) { ; }
		}
		for (int num = 0;num < 30;num++) {
			System.out.print("X");
			try { Thread.sleep(100); } catch (InterruptedException e) { ; }
		}
	}
}


==============================
# runnable
class JavaTest {
	public static void main(String[] args) {
		PrintRunnable print = new PrintRunnable();
		Thread worker = new Thread(print);
		worker.start();
		
		for (int num = 0;num < 30;num++) {
			System.out.print("O");
			try { Thread.sleep(200); } catch (InterruptedException e) { ; }
		}
	}
}

class PrintRunnable implements Runnable {
	public void run() {
		for (int num = 0;num < 30;num++) {
			System.out.print("X");
			try { Thread.sleep(100); } catch (InterruptedException e) { ; }
		}
	}
}


==============================
# runnable2
class JavaTest {
	public static void main(String[] args) {
		PrintRunnable print = new PrintRunnable();
		Thread worker = new Thread(print);
		worker.start();
		
		for (int num = 0;num < 30;num++) {
			System.out.print("O");
			try { Thread.sleep(200); } catch (InterruptedException e) { ; }
		}
	}
}

class PrintClass {
	public void printChar() {
		for (int num = 0;num < 30;num++) {
			System.out.print("X");
			try { Thread.sleep(100); } catch (InterruptedException e) { ; }
		}
	}
}

class PrintRunnable extends PrintClass implements Runnable {
	public void run() {
		printChar();
	}
}


==============================
# runnable3
class JavaTest {
	public static void main(String[] args) {
		Thread worker = new Thread(mRunnable);
		worker.start();
		
		for (int num = 0;num < 30;num++) {
			System.out.print("O");
			try { Thread.sleep(200); } catch (InterruptedException e) { ; }
		}
	}
	
	static Runnable mRunnable = new Runnable() {
		public void run() {
			for (int num = 0;num < 30;num++) {
				System.out.print("X");
				try { Thread.sleep(100); } catch (InterruptedException e) { ; }
			}
		}
	};
}


==============================
# runnable4
class JavaTest {
	public static void main(String[] args) {
		Thread worker = new Thread(new Runnable() {
			public void run() {
				for (int num = 0;num < 30;num++) {
					System.out.print("X");
					try { Thread.sleep(100); } catch (InterruptedException e) { ; }
				}
			}
		});
		worker.start();
		
		for (int num = 0;num < 30;num++) {
			System.out.print("O");
			try { Thread.sleep(200); } catch (InterruptedException e) { ; }
		}
	}
}


==============================
# multithread
import java.awt.Toolkit;

class JavaTest {
	public static void main(String[] args) {
		PrintThread worker1 = new PrintThread('X');
		worker1.start();
		PrintThread worker2 = new PrintThread('.');
		worker2.start();
		BeepThread beep = new BeepThread(5, 1000);
		beep.start();
		
		for (int num = 0;num < 30;num++) {
			System.out.print("O");
			try { Thread.sleep(200); } catch (InterruptedException e) { ; }
		}
	}
}

class PrintThread extends Thread {
	char ch;
	PrintThread(char ch) {
		super();
		this.ch = ch;
	}
	public void run() {
		for (int num = 0;num < 30;num++) {
			System.out.print(ch);
			try { Thread.sleep(100); } catch (InterruptedException e) { ; }
		}
	}
}

class BeepThread extends Thread {
	int count;
	int gap;
	Toolkit tool = Toolkit.getDefaultToolkit();
	BeepThread(int count, int gap) {
		this.count = count;
		this.gap = gap;
	}
	public void run() {
		for (int num = 0;num < count;num++) {
			tool.beep();
			try { Thread.sleep(gap); } catch (InterruptedException e) { ; }
		}
	}
}


==============================
# suspend
class JavaTest {
	public static void main(String[] args) {
		PrintThread worker = new PrintThread();
		worker.start();
		
		for (int num = 0;num < 30;num++) {
			System.out.print("O");
			try { Thread.sleep(200); } catch (InterruptedException e) { ; }
			if (num == 5) worker.suspend();
			if (num == 25) worker.resume();
		}
	}
}

class PrintThread extends Thread {
	public void run() {
		for (int num = 0;num < 30;num++) {
			System.out.print("X");
			try { Thread.sleep(100); } catch (InterruptedException e) { ; }
		}
	}
}


==============================
# priority
class JavaTest {
	public static void main(String[] args) {
		PrintThread1 worker1 = new PrintThread1();
		PrintThread2 worker2 = new PrintThread2();
		worker1.start();
		worker2.setPriority(Thread.MAX_PRIORITY);
		worker2.start();
	}
}

class PrintThread1 extends Thread {
	public void run() {
		double sum = 0;
		for (int i = 0;i < 10000000;i++) {
			sum += Math.cos(i);
		}
		System.out.println("cos = " + sum);
	}
}

class PrintThread2 extends Thread {
	public void run() {
		double sum = 0;
		for (int i = 0;i < 10000000;i++) {
			sum += Math.sin(i);
		}
		System.out.println("sin = " + sum);
	}
}


==============================
# daemon
class JavaTest {
	public static void main(String[] args) {
		PrintThread worker = new PrintThread();
		worker.setDaemon(true);
		worker.start();
		
		for (int i = 0;i < 20;i++) {
			System.out.print(i);
			try { Thread.sleep(500); } catch (InterruptedException e) { ; }
		}
	}
}

class PrintThread extends Thread {
	public void run() {
		while(true) {
			System.out.print("save");
			try { Thread.sleep(2000); } catch (InterruptedException e) { ; }
		}
	}
}


==============================
# sync
class JavaTest {
	public static void main(String[] args) {
		Memory mem = new Memory(16);
		DownLoad down = new DownLoad(mem);
		Play play = new Play(mem);
		
		down.start();
		play.start();
	}
}

class Memory {
	int[] buffer;
	int size;
	int progress;
	Memory(int asize) {
		size = asize;
		buffer = new int[asize];
		progress = 0;
	}
}

class DownLoad extends Thread {
	Memory mem;
	DownLoad(Memory amem) {
		mem = amem;
	}
	public void run() {
		for (int off = 0;off < mem.size;off++) {
			mem.buffer[off] = off;
			mem.progress = off + 1;
			try { Thread.sleep(200); } catch (InterruptedException e) { ; }
		}
	}
}

class Play extends Thread {
	Memory mem;
	Play(Memory amem) {
		mem = amem;
	}
	public void run() {
		for (;;) {
			for (int off = 0;off < mem.progress;off++) {
				System.out.print(mem.buffer[off] + " ");
			}
			System.out.println();
			if (mem.progress == mem.size) break;
			try { Thread.sleep(500); } catch (InterruptedException e) { ; }
		}
	}
}


==============================
# sync2
class JavaTest {
	public static void main(String[] args) {
		Memory mem = new Memory(16);
		DownLoad down = new DownLoad(mem);
		Play play = new Play(mem);
		
		down.start();
		play.start();
	}
}

class Memory {
	int[] buffer;
	int size;
	int progress;
	Memory(int asize) {
		size = asize;
		buffer = new int[asize];
		progress = 0;
	}
}

class DownLoad extends Thread {
	Memory mem;
	DownLoad(Memory amem) {
		mem = amem;
	}
	public void run() {
		for (int off = 0;off < mem.size;off += 2) {
			for (int chunk = 0;chunk < 2;chunk++) {
				mem.buffer[off+chunk] = off+chunk;
				mem.progress = off+chunk+1;
				try { Thread.sleep(200); } catch (InterruptedException e) { ; }
			}
		}
	}
}

class Play extends Thread {
	Memory mem;
	Play(Memory amem) {
		mem = amem;
	}
	public void run() {
		for (;;) {
			for (int off = 0;off < mem.progress;off++) {
				System.out.print(mem.buffer[off] + " ");
			}
			System.out.println();
			if (mem.progress == mem.size) break;
			try { Thread.sleep(500); } catch (InterruptedException e) { ; }
		}
	}
}


==============================
# critical
class JavaTest {
	public static void main(String[] args) {
		Memory mem = new Memory(16);
		DownLoad down = new DownLoad(mem);
		Play play = new Play(mem);
		
		down.start();
		play.start();
	}
}

class Memory {
	int[] buffer;
	int size;
	int progress;
	Memory(int asize) {
		size = asize;
		buffer = new int[asize];
		progress = 0;
	}
}

class DownLoad extends Thread {
	Memory mem;
	DownLoad(Memory amem) {
		mem = amem;
	}
	public void run() {
		for (int off = 0;off < mem.size;off += 2) {
			synchronized(mem) {
				for (int chunk = 0;chunk < 2;chunk++) {
					mem.buffer[off+chunk] = off+chunk;
					mem.progress = off+chunk+1;
					try { Thread.sleep(200); } catch (InterruptedException e) { ; }
				}
			}
		}
	}
}

class Play extends Thread {
	Memory mem;
	Play(Memory amem) {
		mem = amem;
	}
	public void run() {
		for (;;) {
			synchronized(mem) {
				for (int off = 0;off < mem.progress;off++) {
					System.out.print(mem.buffer[off] + " ");
				}
				System.out.println();
			}
			if (mem.progress == mem.size) break;
			try { Thread.sleep(500); } catch (InterruptedException e) { ; }
		}
	}
}



==============================
# syncmethod
class JavaTest {
	public static void main(String[] args) {
		Memory mem = new Memory(16);
		DownLoad down = new DownLoad(mem);
		Play play = new Play(mem);
		
		down.start();
		play.start();
	}
}

class Memory {
	int[] buffer;
	int size;
	int progress;
	Memory(int asize) {
		size = asize;
		buffer = new int[asize];
		progress = 0;
	}

	void DownChunk(int off) {
		for (int chunk = 0;chunk < 2;chunk++) {
			buffer[off+chunk] = off+chunk;
			progress = off+chunk+1;
			try { Thread.sleep(200); } catch (InterruptedException e) { ; }
		}
	}
	
	void PlayDowned() {
		for (int off = 0;off < progress;off++) {
			System.out.print(buffer[off] + " ");
		}
		System.out.println();
	}
}

class DownLoad extends Thread {
	Memory mem;
	DownLoad(Memory amem) {
		mem = amem;
	}
	public void run() {
		for (int off = 0;off < mem.size;off += 2) {
			mem.DownChunk(off);
		}
	}
}

class Play extends Thread {
	Memory mem;
	Play(Memory amem) {
		mem = amem;
	}
	public void run() {
		for (;;) {
			mem.PlayDowned();
			if (mem.progress == mem.size) break;
			try { Thread.sleep(500); } catch (InterruptedException e) { ; }
		}
	}
}


==============================
# synchronized
class JavaTest {
	public static void main(String[] args) {
		Memory mem = new Memory(16);
		DownLoad down = new DownLoad(mem);
		Play play = new Play(mem);
		
		down.start();
		play.start();
	}
}

class Memory {
	int[] buffer;
	int size;
	int progress;
	Memory(int asize) {
		size = asize;
		buffer = new int[asize];
		progress = 0;
	}

	synchronized void DownChunk(int off) {
		for (int chunk = 0;chunk < 2;chunk++) {
			buffer[off+chunk] = off+chunk;
			progress = off+chunk+1;
			try { Thread.sleep(200); } catch (InterruptedException e) { ; }
		}
	}
	
	synchronized void PlayDowned() {
		for (int off = 0;off < progress;off++) {
			System.out.print(buffer[off] + " ");
		}
		System.out.println();
	}
}

class DownLoad extends Thread {
	Memory mem;
	DownLoad(Memory amem) {
		mem = amem;
	}
	public void run() {
		for (int off = 0;off < mem.size;off += 2) {
			mem.DownChunk(off);
		}
	}
}

class Play extends Thread {
	Memory mem;
	Play(Memory amem) {
		mem = amem;
	}
	public void run() {
		for (;;) {
			mem.PlayDowned();
			if (mem.progress == mem.size) break;
			try { Thread.sleep(500); } catch (InterruptedException e) { ; }
		}
	}
}


==============================
# wait
class JavaTest {
	public static void main(String[] args) {
		Memory mem = new Memory(16);
		DownLoad down = new DownLoad(mem);
		Play play = new Play(mem);
		
		down.start();
		play.start();
	}
}

class Memory {
	int[] buffer;
	int size;
	int progress;
	Memory(int asize) {
		size = asize;
		buffer = new int[asize];
		progress = 0;
	}

	synchronized void DownChunk(int off) {
		for (int chunk = 0;chunk < 2;chunk++) {
			buffer[off+chunk] = off+chunk;
			progress = off+chunk+1;
			try { Thread.sleep(200); } catch (InterruptedException e) { ; }
		}
	}
	
	synchronized void PlayDowned() {
		for (int off = 0;off < progress;off++) {
			System.out.print(buffer[off] + " ");
		}
		System.out.println();
	}
}

class Play extends Thread {
	Memory mem;
	Play(Memory amem) {
		mem = amem;
	}
	public void run() {
		synchronized(mem) {
			try { 
				 mem.wait();			// �ϼ��� ������ ���
			} catch(InterruptedException e) { }
		}

		for (int off = 0;off < mem.progress;off++) {
			System.out.print(mem.buffer[off] + " ");
		}
		System.out.println();
	}
}

class DownLoad extends Thread {
	Memory mem;
	DownLoad(Memory amem) {
		mem = amem;
	}
	public void run() {
		for (int off = 0;off < mem.size;off++) {
			mem.buffer[off] = off;
			mem.progress = off + 1;
			try { Thread.sleep(200); } catch (InterruptedException e) { ; }
		}
		synchronized(mem) { 
			mem.notify(); 			// �ٿ�ε� �Ϸ�. ��� �������� ��⸦ ����
		}
	}
}


==============================
# join
class Memory {
	int[] buffer;
	int size;
	int progress;
	Memory(int asize) {
		size = asize;
		buffer = new int[asize];
		progress = 0;
	}
}

class DownLoad extends Thread {
	Memory mem;
	DownLoad(Memory amem) {
		mem = amem;
	}
	public void run() {
		for (int off = 0;off < mem.size;off += 2) {
			for (int chunk = 0;chunk < 2;chunk++) {
				mem.buffer[off+chunk] = off+chunk;
				mem.progress = off+chunk+1;
				try { Thread.sleep(200); } catch (InterruptedException e) { ; }
			}
		}
	}
}

class Play extends Thread {
	Memory mem;
	Play(Memory amem) {
		mem = amem;
	}
	public void run() {
		for (;;) {
			for (int off = 0;off < mem.progress;off++) {
				System.out.print(mem.buffer[off] + " ");
			}
			System.out.println();
			if (mem.progress == mem.size) break;
			try { Thread.sleep(500); } catch (InterruptedException e) { ; }
		}
	}
}

class JavaTest {
	public static void main(String[] args) {
		Memory mem = new Memory(16);
		DownLoad down = new DownLoad(mem);
		Play play = new Play(mem);
		
		down.start();
		play.start();
		System.out.println("�ٿ�ε尡 �Ϸ�Ǿ����ϴ�. ������ �����մϴ�.");
	}
}



==============================
# join2
class Memory {
	int[] buffer;
	int size;
	int progress;
	Memory(int asize) {
		size = asize;
		buffer = new int[asize];
		progress = 0;
	}
}

class DownLoad extends Thread {
	Memory mem;
	DownLoad(Memory amem) {
		mem = amem;
	}
	public void run() {
		for (int off = 0;off < mem.size;off += 2) {
			for (int chunk = 0;chunk < 2;chunk++) {
				mem.buffer[off+chunk] = off+chunk;
				mem.progress = off+chunk+1;
				try { Thread.sleep(200); } catch (InterruptedException e) { ; }
			}
		}
	}
}

class Play extends Thread {
	Memory mem;
	Play(Memory amem) {
		mem = amem;
	}
	public void run() {
		for (;;) {
			for (int off = 0;off < mem.progress;off++) {
				System.out.print(mem.buffer[off] + " ");
			}
			System.out.println();
			if (mem.progress == mem.size) break;
			try { Thread.sleep(500); } catch (InterruptedException e) { ; }
		}
	}
}

class JavaTest {
	public static void main(String[] args) {
		Memory mem = new Memory(16);
		DownLoad down = new DownLoad(mem);
		Play play = new Play(mem);
		
		down.start();
		play.start();
		
		try {
			down.join();
			play.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("�ٿ�ε尡 �Ϸ�Ǿ����ϴ�. ������ �����մϴ�.");
	}
}




==============================
# interrupt
class JavaTest {
	public static void main(String[] args) {
		CalcThread worker = new CalcThread();
		worker.start();
	}
}

class CalcThread extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.print(".");
			try { Thread.sleep(1000); } catch (InterruptedException e) { ; }
		}
		System.out.println("\n��� �Ϸ�");
	}
}

==============================
# interrupt2
class JavaTest {
	public static void main(String[] args) {
		CalcThread worker = new CalcThread();
		worker.start();

		try { Thread.sleep(3000); } catch (InterruptedException e) { ; }
		worker.interrupt();
	}
}

class CalcThread extends Thread {
	public void run() {
		try { 
			for (int i = 0; i < 10; i++) {
				System.out.print(".");
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) { 
			System.out.println("\n��� ���");
			return;
		}
		System.out.println("\n��� �Ϸ�");
	}
}

###########################################################    
## 21�� ##

==============================
# filewrite
import java.io.*;

class JavaTest {
	public static void main(String[] args) {
		byte[] data = { 8, 9, 0, 6, 2, 9, 9 };
		FileOutputStream out = null;
		try {
			out = new FileOutputStream("test.bin");
			out.write(data);
			System.out.println("Write success");
		}
		catch (IOException e) {
			System.out.println("File output error");
		}
		finally {
			try {
				out.close();
			}
			catch (Exception e) {;}
		}
	}
}


==============================
# fileread
import java.io.*;

class JavaTest {
	public static void main(String[] args) throws Exception {
		FileInputStream in = new FileInputStream("test.bin");
		int avail = in.available();
		byte[] data = new byte[avail];
		in.read(data);
		in.close();
		for (byte b : data) {
			System.out.print(b);
		}
	}
} 


==============================
# blockread
import java.io.*;

class JavaTest {
	public static void main(String[] args) throws Exception {
		FileInputStream in = new FileInputStream("test.bin");
		int data;
		for (;;) {
			data = in.read();
			if (data == -1) break;
			System.out.print(data);
		}
		in.close();
	}
}


==============================
# blockread2
import java.io.*;

class JavaTest {
	public static void main(String[] args) throws Exception {
		FileInputStream in = new FileInputStream("test.bin");
		byte[] data = new byte[2];
		int len;
		for (;;) {
			len = in.read(data);
			if (len == -1) break;
			for (byte b : data) {
				System.out.print(b);
			}
		}
		in.close();
	}
}


==============================
# textwrite
import java.io.*;

class JavaTest {
	public static void main(String[] args) throws Exception {
		String str = "�ڹ� Stream �����";
		FileWriter out = new FileWriter("test.txt");
		out.write(str);
		out.close();
		System.out.println("Write success");

		// �� ���ھ� �б�
		FileReader in = new FileReader("test.txt");
		int ch;
		for (;;) {
			ch = in.read();
			if (ch == -1)
				break;
			System.out.print((char) ch);
		}
		in.close();
		System.out.println();

		// �Ѳ����� �б�
		in = new FileReader("test.txt");
		char[] text = new char[100];
		int num = in.read(text);
		System.out.println("���� ���� ���� = " + num);
		System.out.println(text);
		in.close();
	}
}


==============================
# encoding
import java.io.*;

class JavaTest {
	public static void main(String[] args) throws Exception {
		//FileReader in = new FileReader("�ֱ���.txt");
		//FileReader in = new FileReader("�ֱ���-Unicode.txt");
		//FileReader in = new FileReader("�ֱ���-Utf8.txt");
		FileReader in = new FileReader("�ֱ���-Utf8nb.txt");
		char[] text = new char[1000];
		int num = in.read(text);
		System.out.println("���� ���� ���� = " + num);
		System.out.println(text);
		in.close();
	}
}


==============================
# charset
import java.io.*;

class JavaTest {
	public static void main(String[] args) throws Exception {
		FileInputStream fi = new FileInputStream("�ֱ���.txt");
		InputStreamReader in = new InputStreamReader(fi, "euc-kr");
		char[] text = new char[1000];
		int num = in.read(text);
		System.out.println("���� ���� ���� = " + num);
		System.out.println(text);
		in.close();
	}
}


==============================
# stringcharset
import java.io.*;

class JavaTest {
	public static void main(String[] args) throws Exception {
		FileInputStream in = new FileInputStream("�ֱ���.txt");
		byte[] text = new byte[1000];
		int num = in.read(text);
		String utftext = new String(text, "euc-kr");
		System.out.println("���� ����Ʈ �� = " + num);
		System.out.println(utftext);
		in.close();
	}
}


==============================
# ansitext
import java.io.*;

class JavaTest {
	public static void main(String[] args) throws Exception {
		String text = "�츮���� ���ѹα�\n1234abcd\n�̰��� ANSI �ؽ�Ʈ�Դϴ�.";
		byte[] ansi = text.getBytes("euc-kr");
		FileOutputStream out = new FileOutputStream("ansi.txt");
		out.write(ansi);
		out.close();
		System.out.println("Write success");
	}
}


==============================
# bufferbinary
import java.io.*;

class JavaTest {
	public static void main(String[] args) throws Exception {
		byte[] data = { 3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 8, 9, 7, 9 };
		FileOutputStream fout = new FileOutputStream("test.buf");
		BufferedOutputStream out = new BufferedOutputStream(fout);
		//BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("test.buf"));
		out.write(data);
		out.close();
		System.out.println("Write success");
		
		BufferedInputStream in = new BufferedInputStream(new FileInputStream("test.buf"));
		byte[] indata = new byte[15];
		in.read(indata,0,15);
		in.close();
		for (byte b : indata) {
			System.out.print(b);
		}
	}
}


==============================
# buffertext
import java.io.*;

class JavaTest {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new FileReader("�ֱ���-Utf8nb.txt"));
		char[] text = new char[1000];
		int num = in.read(text);
		System.out.println("���� ���� ���� = " + num);
		System.out.println(text);
		in.close();
	}
}


==============================
# readstring
import java.io.*;

class JavaTest {
	public static void main(String[] args) {
		String str = ReadFileToString("�ֱ���-Utf8nb.txt");
		System.out.println(str);
	}

	static String ReadFileToString(String Path) {
		StringBuffer Result = new StringBuffer();
		int ch;
		try {
			BufferedReader in = new BufferedReader(new FileReader(Path));
			for (;;) {
				ch = in.read();
				if (ch == -1) break;
				Result.append((char)ch);
			}
		}
		catch (Exception e) {;}
		return Result.toString();
	}
}


==============================
# filecopy
import java.io.*;

class JavaTest {
	public static void main(String[] args) throws Exception {
		long start = System.currentTimeMillis();
		System.out.println("���� ����");
		FileInputStream src = new FileInputStream("src.dat"); 
		FileOutputStream dest = new FileOutputStream("dest.dat");
		int data;
		for(;;) {
			data = src.read();
			if (data == -1) break;
			dest.write(data);
		}
		src.close();
		dest.close();
		System.out.println("���� �Ϸ�");
		System.out.println((System.currentTimeMillis()-start)/1000.0 + " �� �ɸ�");
	}
}


==============================
# filecopy2
import java.io.*;

class JavaTest {
	public static void main(String[] args) throws Exception {
		long start = System.currentTimeMillis();
		System.out.println("���� ����");
		BufferedInputStream src = new BufferedInputStream(new FileInputStream("src.dat")); 
		BufferedOutputStream dest = new BufferedOutputStream (new FileOutputStream("dest.dat"));
		int data;
		for(;;) {
			data = src.read();
			if (data == -1) break;
			dest.write(data);
		}
		src.close();
		dest.close();
		System.out.println("���� �Ϸ�");
		System.out.println((System.currentTimeMillis()-start)/1000.0 + " �� �ɸ�");
	}
}


==============================
# dataio
import java.io.*;

class JavaTest {
	public static void main(String[] args) throws Exception {
		DataOutputStream out = new DataOutputStream(new FileOutputStream("test.dat"));
		out.writeInt(1234);
		out.writeDouble(3.14159265);
		out.writeUTF("String ���ڿ�");
		out.close();
		System.out.println("Write success");

		DataInputStream in = new DataInputStream(new FileInputStream("test.dat"));
		int i = in.readInt();
		double d = in.readDouble();
		String str = in.readUTF();
		System.out.printf("i = %d, d = %f, str = %s", i, d, str);
	}
}


==============================
# readline
import java.io.*;

class JavaTest {
	public static void main(String[] args) throws Exception {
		LineNumberReader in = new LineNumberReader(new FileReader("�ֱ���-Utf8nb.txt"));
		for (;;) {
			String Line = in.readLine();
			if (Line == null) break;
			int Num = in.getLineNumber();
			System.out.printf("%4d : %s\n", Num, Line);
		}
		in.close();
	}
}


==============================
# printwriter
import java.io.*;

class JavaTest {
	public static void main(String[] args) throws Exception {
		PrintWriter out = new PrintWriter("format.txt");
		int i = 1234;
		double d = 56.789;
		String str = "���ڿ�";
		out.printf("%6d, %10.2f, %s", i, d, str);
		out.close();
	}
}


==============================
# conin
import java.io.*;

class JavaTest {
	public static void main(String[] args) {
		int name;
		System.out.println("�̸��� �Է��� �� Enter�� �����ÿ�(���� ���� Ctrl+Z).");
		for (;;) {
			try {
				name = System.in.read();
				if (name == -1) break;
				System.out.print((char)name);
			}
			catch (IOException e) {
				System.out.println("input error");
			}
		}
		System.out.println("�Է¿Ϸ�");
	}
}


==============================
# conin2
import java.io.*;

class JavaTest {
	public static void main(String[] args) {
		int name;
		System.out.println("�̸��� �Է��� �� Enter�� �����ÿ�(���� ���� Ctrl+Z).");
		InputStreamReader r = new InputStreamReader(System.in);
		for (;;) {
			try {
				name = r.read();
				if (name == -1) break;
				System.out.print((char)name);
			}
			catch (java.io.IOException e) {
				System.out.println("input error");
			}
		}
		System.out.println("�Է¿Ϸ�");
	}
}


==============================
# conin3
import java.io.*;

class JavaTest {
	public static void main(String[] args) {
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(r);
		try {
			String str = b.readLine();
			System.out.println(str);
			System.out.println("�Է¿Ϸ�");
		}
		catch (IOException e) {
			System.out.println("input error");
		}
	}
}


==============================
# conin4
import java.io.*;

class JavaTest {
	public static void main(String[] args) {
		System.out.print("������ �Է��Ͻÿ� : ");
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(r);
		try {
			String str = b.readLine();
			int i = Integer.parseInt(str);
			System.out.println("�Է°��� 2�� = " + i*2);
		}
		catch (IOException e) {
			System.out.println("input error");
		}
	}
}


==============================
# scanner
import java.util.*;

class JavaTest {
	public static void main(String[] args) {
		System.out.print("������ �Է��Ͻÿ� : ");
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		scan.close();
		System.out.println("�Է°��� 2�� = " + i*2);
	}
}


==============================
# serial
import java.io.*;

class Car implements Serializable {
	String name;
	String color;
	boolean gasoline;
	
	Car(String name, String color, boolean gasoline) {
		this.name = name;
		this.color = color;
		this.gasoline = gasoline;
	}

	void outInfo() {
		System.out.printf("�̸� = %s, ���� = %s, ���� = %s\n",
			name, color, gasoline ? "�ֹ���":"����");
	}
}

class JavaTest {
	public static void main(String[] args) throws Exception {
		Car pride = new Car("�����̵�", "�Ķ�", true);

		// ���Ϸ� ���
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("pride.car"));
		out.writeObject(pride);
		out.close();
		System.out.println("���Ϸ� ���");
		
		// ���Ϸκ��� �Է�
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("pride.car"));
		Car pride2 = (Car)in.readObject();
		in.close();
		pride2.outInfo();
	}
}


==============================
# transient
import java.io.*;

class Car implements Serializable {
	String name;
	String color;
	transient boolean gasoline;
	static int count = 0;
	
	Car(String name, String color, boolean gasoline) {
		this.name = name;
		this.color = color;
		this.gasoline = gasoline;
		count++;
	}

	void outInfo() {
		System.out.printf("�̸� = %s, ���� = %s, ���� = %s\n",
			name, color, gasoline ? "�ֹ���":"����");
	}
}

class JavaTest {
	public static void main(String[] args) throws Exception {
		Car pride = new Car("�����̵�", "�Ķ�", true);

		// ���Ϸ� ���
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("pride.car"));
		out.writeObject(pride);
		out.close();
		System.out.println("���Ϸ� ���");
		
		// ���Ϸκ��� �Է�
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("pride.car"));
		Car pride2 = (Car)in.readObject();
		in.close();
		pride2.outInfo();
	}
}


==============================
# custserial
import java.io.*;

class Bitmap implements Serializable {
	byte[] raster;
	public Bitmap(int width) {
		raster = new byte[width];
		int i;
		for (i=0;i<100;i++) raster[i] = 1;
		for (i=100;i<width/2;i++) raster[i] = 8;
		for (i=width/2;i<width;i++) raster[i] = 7;
	}
}

class JavaTest {
	public static void main(String[] args) throws Exception {
		Bitmap girl = new Bitmap(32000);

		// ���Ϸ� ���
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("girl.bitmap"));
		out.writeObject(girl);
		out.close();
		
		// ���Ϸκ��� �Է�
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("girl.bitmap"));
		Bitmap girl2 = (Bitmap)in.readObject();
		in.close();
	}
}


==============================
# custserial2
import java.io.*;

class Bitmap implements Serializable {
	byte[] raster;
	public Bitmap(int width) {
		raster = new byte[width];
		int i;
		for (i=0;i<100;i++) raster[i] = 1;
		for (i=100;i<width/2;i++) raster[i] = 8;
		for (i=width/2;i<width;i++) raster[i] = 7;
	}
	
	private void writeObject(ObjectOutputStream out) throws IOException {
		out.writeInt(raster.length);
		int num = 1;
		byte value = raster[0];
		for (int i = 1; i < raster.length; i++) {
			if (value == raster[i]) {
				num++;
			} else {
				out.writeByte(value);
				out.writeInt(num);
				num = 1;
				value = raster[i];
			}
		}
		if (num != 1) {
			out.writeByte(value);
			out.writeInt(num);
		}
	}
	
	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
		int length = in.readInt();
		raster = new byte[length];
		int num;
		byte value;
		int offset;
		for (offset = 0;offset < length;) {
			value = in.readByte();
			num = in.readInt();
			for (int i = 0; i < num ; i++) {
				raster[offset] = value;
				offset++;
			}
		}
		
	}
}

class JavaTest {
	public static void main(String[] args) throws Exception {
		Bitmap girl = new Bitmap(32000);

		// ���Ϸ� ���
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("girl2.bitmap"));
		out.writeObject(girl);
		out.close();
		
		// ���Ϸκ��� �Է�
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("girl2.bitmap"));
		Bitmap girl2 = (Bitmap)in.readObject();
		in.close();
	}
}


==============================
# fileinfo
import java.io.*;

class JavaTest {
	public static void main(String[] args) {
		File f = new File("c:\\Temp\\test.txt");
		if (f.exists()) {
			if (f.isFile()) {
				System.out.println("�����Դϴ�.");
				System.out.println("���ϰ�� : " + f.getParent());
				System.out.println("�����̸� : " + f.getName());
				System.out.println("����ũ�� : " + f.length());
				System.out.println("���� ���� : " + f.isHidden());
				System.out.println("���� ��� : " + f.isAbsolute());
			} else if (f.isDirectory()) {
				System.out.println("���͸��Դϴ�.");
			}
		} else {
			System.out.println("������ �����ϴ�.");
		}
	}
}


==============================
# makedir
import java.io.*;

class JavaTest {
	public static void main(String[] args) throws Exception  {
		File folder = new File("c:\\TestFolder");
		if (folder.mkdir()) {
			File file = new File("c:\\TestFolder\\MyFile.txt");
			if (file.createNewFile()) {
				FileWriter out = new FileWriter(file);
				out.write("�׽�Ʈ ����");
				out.close();
			}
		}
	}
}


==============================
# listfile
import java.io.*;

class JavaTest {
	public static void main(String[] args) {
		File f = new File("c:\\");
		File[] arFile = f.listFiles();
		for (int i = 0; i < arFile.length; i++) {
			if (arFile[i].isFile()) {
				System.out.printf("%s %d ����Ʈ\n",arFile[i].getName(), arFile[i].length());
			} else {
				System.out.printf("[%s] <����>\n",arFile[i].getName());
			}
		}
	}
}


==============================
# randomaccess
import java.io.*;

class JavaTest {
	public static void main(String[] args) throws Exception {
		byte[] data = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		RandomAccessFile file = new RandomAccessFile("random.dat", "rw");
		file.write(data);
		System.out.println("Write success");
		
		file.seek(0);
		for (;;) {
			int value = file.read();
			if (value == -1) break;
			System.out.print(value);
		}
		
		file.close();
	}
}


==============================
# randomaccess2
import java.io.*;

class JavaTest {
	public static void main(String[] args) throws Exception {
		RandomAccessFile file = new RandomAccessFile("random.dat", "r");
		
		file.seek(4);
		byte value = file.readByte(); 
		System.out.print(value);
		file.close();
	}
}

###########################################################    
## 22�� ##

==============================
# innerclass
class Name {
	String first;
	String family;
	
	Name(String first, String family) {
		this.first = first;
		this.family = family;
	}
}

class Human {
	int age;
	Name name;
	
	Human(int age, String first, String family) {
		this.age = age;
		this.name = new Name(first, family);
	}
	
	void intro() {
		System.out.println("�ȳ�, " + age + "�� " + name.family + name.first + "�̶�� ��.");
	}
}

class JavaTest {
	public static void main(String[] args) {
		Human kim = new Human(29, "����", "��");
		kim.intro();
	}
}


==============================
# innerclass2
class Human {
	int age;
	Name name;
	
	class Name {
		String first;
		String family;
		
		Name(String first, String family) {
			this.first = first;
			this.family = family;
		}
		
		void outAge() {
			System.out.println("���� " + age + "���Դϴ�.");
		}
	}
	
	Human(int age, String first, String family) {
		this.age = age;
		this.name = new Name(first, family);
	}
	
	void intro() {
		System.out.println("�ȳ�, " + age + "�� " + name.family + name.first + "�̶�� ��.");
	}
}

class JavaTest {
	public static void main(String[] args) {
		Human kim = new Human(29, "����", "��");
		kim.intro();
		kim.name.outAge();
	}
}


==============================
# newinner
class Human {
	int age;
	Name name;
	
	class Name {
		String first;
		String family;
		
		Name(String first, String family) {
			this.first = first;
			this.family = family;
		}
		
		void outAge() {
			System.out.println("���� " + age + "���Դϴ�.");
		}
	}
	
	Human(int age, String first, String family) {
		this.age = age;
		this.name = new Name(first, family);
	}
	
	void intro() {
		System.out.println("�ȳ�, " + age + "�� " + name.family + name.first + "�̶�� ��.");
	}
}

class JavaTest {
	public static void main(String[] args) {
		Human kim = new Human(29, "����", "��");
		kim.intro();
		
		Human.Name name = kim.new Name("����", "��");
		System.out.print(name.family + name.first + ":");
		name.outAge();
	}
}


==============================
# innerthis
class Human {
	int age;
	Name name;
	
	class Name {
		String first;
		String family;
		
		Name(String first, String family) {
			this.first = first;
			this.family = family;
		}
		
		void outName() {
			Util.outName(this);
		}
		
		void outWho() {
			Util.outHuman(Human.this);
		}
	}
	
	Human(int age, String first, String family) {
		this.age = age;
		this.name = new Name(first, family);
	}
	
	void intro() {
		System.out.println("�ȳ�, " + age + "�� " + name.family + name.first + "�̶�� ��.");
	}
}

class Util {
	static void outName(Human.Name name) {
		System.out.println(name.family + name.first + "�̶�� ��.");
	}

	static void outHuman(Human who) {
		who.intro();
	}
}

class JavaTest {
	public static void main(String[] args) {
		Human kim = new Human(29, "����", "��");
		kim.name.outName();
		kim.name.outWho();
	}
}


==============================
# innerthis2
class Human {
	int age = 30;
	Name name = new Name();
	class Name {
		int age = 50;
		void intro() {
			System.out.println(age);
			System.out.println(this.age);
			System.out.println(Human.this.age);
		}
	}
}

class JavaTest {
	public static void main(String[] args) {
		Human park = new Human();
		park.name.intro();
	}
}


==============================
# staticinner
class Human {
	int age;
	Name name;
	
	static class Name {
		String first;
		String family;
		
		Name(String first, String family) {
			this.first = first;
			this.family = family;
		}
	}
	
	Human(int age, String first, String family) {
		this.age = age;
		this.name = new Name(first, family);
	}
	
	void intro() {
		System.out.println("�ȳ�, " + age + "�� " + name.family + name.first + "�̶�� ��.");
	}
}

class JavaTest {
	public static void main(String[] args) {
		Human kim = new Human(29, "����", "��");
		kim.intro();
		
		Human.Name name = new Human.Name("����", "��");
		System.out.println("�̸� : " + name.family + name.first);
	}
}


==============================
# staticinner2
class Human {
	int field;
	static int staticField;

	// ���� Ŭ������ �ܺ��� ��� ����� �׼����� �� �ִ�.
	class Name { 
		void method() {
			field = 0;
			staticField = 0;
		}
	}
	
	// ���� ���� Ŭ������ �ܺ��� ���� �ʵ常 �׼����� �� �ִ�.
	static class StaticName { 
		void method() {
			// field = 0;
			staticField = 0;
		}
	}
	
	// ������ �޼���� ����, ���� ���� Ŭ���� ��� �׼����� �� �ִ�.
	void method() {
		Name n = new Name();
		StaticName sn = new StaticName();
	}
	
	// ���� �޼���� ���� ���� Ŭ������ �׼����� �� �ִ�.
	static void staticmethod() {
		// Name n = new Name();
		StaticName sn = new StaticName();
	}
}

class JavaTest {
	public static void main(String[] args) {
	}
}


==============================
# localclass
class JavaTest {
	public static void main(String[] args) {
		class Human {
			int age;
			String name;
			
			Human(int age, String name) {
				this.age = age;
				this.name = name;
			}
			
			void intro() {
				System.out.println("�ȳ�, " + age + "�� " + name + "�̶�� ��.");
			}
		}

		Human kim = new Human(29, "�����");
		kim.intro();
	}
	
	// �޼��� �ܺο����� ���� ���� Ŭ������ ������ �� ����.
	static void otherMethod() {
		// Human kim = new Human(29, "�����");
	}
}


==============================
# localclass2
class Human {
	int age;
	String name;
	
	Human(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	void intro() {
		final String nameCaption = "�̸�";
		final String ageCaption = "����";
		
		class Formatter {
			void outInfo() {
				System.out.println(nameCaption + " : " + name);
				System.out.println(ageCaption + " : " + age);
			}
		}
		
		Formatter format = new Formatter();
		format.outInfo();
	}
}

class JavaTest {
	public static void main(String[] args) {
		Human kim = new Human(29, "�����");
		kim.intro();
	}
}


==============================
# anonclass
class Human {
	void intro() {
		System.out.println("���� ����Դϴ�.");
	}
}

class JavaTest {
	public static void main(String[] args) {
		class Student extends Human {
			void intro() {
				System.out.println("���� �л��Դϴ�.");
			}
		}

		Student lee = new Student();
		lee.intro();
	}
}


==============================
# anonclass2
class Human {
	void intro() {
		System.out.println("���� ����Դϴ�.");
	}
}

class JavaTest {
	public static void main(String[] args) {
		Human lee = new Human() { 
			void intro() {
				System.out.println("���� �л��Դϴ�.");
			}
		};
		lee.intro();
	}
}


==============================
# anoninterface
interface Human {
	void intro();
}

class Anonymous implements Human {
	public void intro() {
		System.out.println("���� �л��Դϴ�.");
	}
}

class JavaTest {
	public static void main(String[] args) {
		Anonymous lee = new Anonymous();
		lee.intro();
	}
}


==============================
# anoninterface2
interface Human {
	void intro();
}

class JavaTest {
	public static void main(String[] args) {
		class Anonymous implements Human {
			public void intro() {
				System.out.println("���� �л��Դϴ�.");
			}
		}

		Anonymous lee = new Anonymous();
		lee.intro();
	}
}


==============================
# anoninterface3
interface Human {
	void intro();
}

class JavaTest {
	public static void main(String[] args) {
		Human lee = new Human() { 
			public void intro() {
				System.out.println("���� �л��Դϴ�.");
			}
		};
		lee.intro();
	}
}


==============================
# innerinterface
interface Workable {
	void work(String what, int time);
}

class Staff {
	void doWork(Workable w, String what, int time) {
		w.work(what, time);
	}
}

class JavaTest {
	public static void main(String[] args) {
		Staff kim = new Staff();
		Workable kimwork = new Workable() {
			public void work(String what, int time) {
				System.out.println(what + " �۾��� " + time + "�ð����� ������ �ϱ�");
			}
		};
		kim.doWork(kimwork, "���� �ۼ�", 2);
		
		Staff lee = new Staff();
		Workable leework = new Workable() {
			public void work(String what, int time) {
				System.out.println(time + "�ð�����  ��մ�� " + what);
			}
		};
		kim.doWork(leework, "Ŀ�� Ÿ��", 3);
	}
}


==============================
# innerinterface2
class Staff {
	interface Workable {
		void work(String what, int time);
	}
	void doWork(Workable w, String what, int time) {
		w.work(what, time);
	}
}

class JavaTest {
	public static void main(String[] args) {
		Staff kim = new Staff();
		kim.doWork(new Staff.Workable() {
			public void work(String what, int time) {
				System.out.println(what + " �۾��� " + time + "�ð����� ������ �ϱ�");
			}
		}, "���� �ۼ�", 2);
		
		Staff lee = new Staff();
		kim.doWork(new Staff.Workable() {
			public void work(String what, int time) {
				System.out.println(time + "�ð�����  ��մ�� " + what);
			}
		}, "Ŀ�� Ÿ��", 3);
	}
}

###########################################################    
## 23�� ##

==============================
# countage
class JavaTest {
	static int[] arAge = { 29, 30, 34, 32, 30, 31, 28, 31, 29, 30 };
	public static void main(String[] args) {
		System.out.println("30�� = " + count30());
		System.out.println("31�� = " + count31());
	}
	
	static int count30() {
		int num = 0;
		for (int i = 0; i < arAge.length; i++) {
			if (arAge[i] == 30) num++;
		}
		return num;
	}

	static int count31() {
		int num = 0;
		for (int i = 0; i < arAge.length; i++) {
			if (arAge[i] == 31) num++;
		}
		return num;
	}
}


==============================
# countage2
class JavaTest {
	static int[] arAge = { 29, 30, 34, 32, 30, 31, 28, 31, 29, 30 };
	public static void main(String[] args) {
		System.out.println("30�� = " + count(30));
		System.out.println("31�� = " + count(31));
	}
	
	static int count(int age) {
		int num = 0;
		for (int i = 0; i < arAge.length; i++) {
			if (arAge[i] == age) num++;
		}
		return num;
	}
}


==============================
# overunder
class JavaTest {
	static int[] arAge = { 29, 30, 34, 32, 30, 31, 28, 31, 29, 30 };
	public static void main(String[] args) {
		System.out.println("over = " + countover());
		System.out.println("under = " + countunder());
	}
	
	static int countover() {
		int num = 0;
		for (int i = 0; i < arAge.length; i++) {
			if (arAge[i] > 30) num++;
		}
		return num;
	}
	
	static int countunder() {
		int num = 0;
		for (int i = 0; i < arAge.length; i++) {
			if (arAge[i] < 30) num++;
		}
		return num;
	}
}


==============================
# oparg
class JavaTest {
	static int[] arAge = { 29, 30, 34, 32, 30, 31, 28, 31, 29, 30 };
	public static void main(String[] args) {
		System.out.println("over = " + count(1));
		System.out.println("under = " + count(2));
	}
	
	static int count(int op) {
		int num = 0;
		for (int i = 0; i < arAge.length; i++) {
			switch (op) {
			case 0:
				if (arAge[i] == 30) num++;
				break;
			case 1:
				if (arAge[i] > 30) num++;
				break;
			case 2:
				if (arAge[i] < 30) num++;
				break;
			}
		}
		return num;
	}
}


==============================
# opobject
class JavaTest {
	static int[] arAge = { 29, 30, 34, 32, 30, 31, 28, 31, 29, 30 };
	public static void main(String[] args) {
		System.out.println("over = " + count(new AgeOver()));
		System.out.println("under = " + count(new AgeUnder()));
	}
	
	static int count(AgeFilter op) {
		int num = 0;
		for (int i = 0; i < arAge.length; i++) {
			if (op.isAgeOk(arAge[i])) num++;
		}
		return num;
	}
}

interface AgeFilter {
	boolean isAgeOk(int age);
}

class AgeOver implements AgeFilter {
	public boolean isAgeOk(int age) {
		return (age > 30); 
	}
}

class AgeUnder implements AgeFilter {
	public boolean isAgeOk(int age) {
		return (age < 30); 
	}
}


==============================
# opobject2
class JavaTest {
	static int[] arAge = { 29, 30, 34, 32, 30, 31, 28, 31, 29, 30 };
	public static void main(String[] args) {
		System.out.println("over = " + count(new AgeFilter() {
			public boolean isAgeOk(int age) {
				return (age > 30); 
			}
		}));
		System.out.println("under = " + count(new AgeFilter() {
			public boolean isAgeOk(int age) {
				return (age < 30); 
			}
		}));
	}
	
	static int count(AgeFilter op) {
		int num = 0;
		for (int i = 0; i < arAge.length; i++) {
			if (op.isAgeOk(arAge[i])) num++;
		}
		return num;
	}
}

interface AgeFilter {
	boolean isAgeOk(int age);
}


==============================
# lambda
class JavaTest {
	static int[] arAge = { 29, 30, 34, 32, 30, 31, 28, 31, 29, 30 };
	public static void main(String[] args) {
		System.out.println("over = " + count(a -> a > 30));
		System.out.println("under = " + count(a -> a < 30));
	}
	
	static int count(AgeFilter op) {
		int num = 0;
		for (int i = 0; i < arAge.length; i++) {
			if (op.isAgeOk(arAge[i])) num++;
		}
		return num;
	}
}

interface AgeFilter {
	boolean isAgeOk(int age);
}


==============================
# libinterface
import java.util.function.*;

class JavaTest {
	static int[] arAge = { 29, 30, 34, 32, 30, 31, 28, 31, 29, 30 };
	public static void main(String[] args) {
		System.out.println("over = " + count(a -> a > 30));
		System.out.println("under = " + count(a -> a < 30));
		
		System.out.println("29�� �̻� = " + count(a -> a >= 29));
		System.out.println("30�� �ƴ� ��� = " + count(a -> a != 30));
		System.out.println("¦�� ���� = " + count(a -> a % 2 == 0));
		System.out.println("28~30 ���� = " + count(a -> a >= 28 && a <= 30));
	}
	
	static int count(Predicate<Integer> op) {
		int num = 0;
		for (int i = 0; i < arAge.length; i++) {
			if (op.test(arAge[i])) num++;
		}
		return num;
	}
}


==============================
# funcinterface
class JavaTest {
	public static void main(String[] args) {
		PlusOne po = i -> i+1 ;
		System.out.println("result = " + po.plus(5));
	}
}

interface PlusOne {
	int plus(int i);
}


==============================
# funcinterface2
class JavaTest {
	public static void main(String[] args) {
		print(5, i -> i+1);
		print(5, i -> i-1);
		print(5, i -> i*2);
	}
	
	static void print(int i, PlusOne po) {
		System.out.println("result = " + po.plus(i));
	}
}

interface PlusOne {
	int plus(int i);
}


==============================
# funcinterface3
class JavaTest {
	public static void main(String[] args) {
		FindMax fm = (a, b) -> a > b ? a:b;
		System.out.println("result = " + fm.max(3, 7));
		GetTime gt = () -> System.currentTimeMillis();
		System.out.println("result = " + gt.systemtime());
	}
}

interface FindMax {
	int max(int a, int b);
}

interface GetTime {
	long systemtime();
}


==============================
# readlocal
class JavaTest {
	public static void main(String[] args) {
		int value = 123;
		PlusOne po = i -> { System.out.println(value); return i+1; };
		System.out.println("result = " + po.plus(5));
	}
}

interface PlusOne {
	int plus(int i);
}


==============================
# lambdathis
class JavaTest {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.method();
	}
}

class Outer {
	void method() {
		// ���� Ŭ���������� this
		class PlusOneImpl implements PlusOne {
			public int plus(int i) {
				System.out.println(this);
				return i+1 ;
			}
		}
		PlusOne po = new PlusOneImpl();
		System.out.println("result = " + po.plus(5));

		// ���ٽĿ����� this
		PlusOne po2 = i -> {
			System.out.println(this);
			return i+1;
		};
		System.out.println("result = " + po2.plus(5));
	}
}

interface PlusOne {
	int plus(int i);
}


==============================
# findmax
class JavaTest {
	public static void main(String[] args) {
		FindMax add = (a, b) -> a+b;
		System.out.println("result = " + add.max(3, 7));
		FindMax getsum = (a, b) -> { 
			int sum = 0;
			for (int i = a; i <= b; i++) sum += i;
			return sum;
		};
		System.out.println("result = " + getsum.max(3, 7));
	}
}

interface FindMax {
	int max(int a, int b);
}


==============================
# predicate
import java.util.function.*;

class Human {
	int age;
	String name;
	Human(int age, String name) { this.age = age; this.name = name; }
}

class JavaTest {
	public static void main(String[] args) {
		Human kim = new Human(21, "�����");
		Predicate<Human> isAdult = h -> h.age >= 19;
		System.out.println(isAdult.test(kim));
	}
}


==============================
# predicate2
import java.util.function.*;

class Human {
	int age;
	String name;
	Human(int age, String name) { this.age = age; this.name = name; }
}

class JavaTest {
	static Human[] members = { 
			new Human(21, "�����"),
			new Human(14, "���ѽ�"),
			new Human(21, "���ѿ�"),
			new Human(66, "��ȫ��"),
	};
	
	public static void main(String[] args) {
		listHuman("����", h -> h.age >= 19);
		listHuman("�谡", h -> h.name.startsWith("��"));
		listHuman("�̼��� �谡", h -> h.name.startsWith("��") && h.age < 19);
	}
	
	static void listHuman(String cap, Predicate<Human> pred) {
		System.out.print(cap + "�� ��� ��� : ");
		for (Human h : members) {
			if (pred.test(h)) {
				System.out.print(h.name + " ");
			}
		}
		System.out.println();
	}
}


==============================
# predicate3
import java.util.function.*;

class JavaTest {
	static int[] arAge = { 29, 30, 34, 32, 30, 31, 28, 31, 29, 30 };
	public static void main(String[] args) {
		System.out.println("over = " + count(a -> a>30));
		System.out.println("under = " + count(a -> a<30));
	}
	
	static int count(Predicate<Integer> pred) {
		int num = 0;
		for (int a : arAge) {
			if (pred.test(a)) num++;
		}
		return num;
	}
}


==============================
# binaryoperator
import java.util.function.*;

class JavaTest {
	public static void main(String[] args) {
		BinaryOperator<Integer> add = (a, b) -> a+b;
		System.out.println("result = " + add.apply(3, 7));
	}
}


==============================
# compose
import java.util.function.Function;

class JavaTest {
	public static void main(String[] args) {
		Function<String, Integer> engToNum = e -> {
			if (e.equals("one")) return 1;
			return 0;
		};
		
		Function<Integer, String> numToHan = n -> {
			if (n == 1) return "�ϳ�";
			return "��";
		};
		
		// �� ���� ���ٸ� ������� ȣ���ϱ�
		String eng = "one";
		int num = engToNum.apply(eng);
		String han = numToHan.apply(num);
		System.out.println(han);
		
		// �������� ȣ���ϱ�
		Function<String, String> engToHan = engToNum.andThen(numToHan);
		System.out.println(engToHan.apply("one"));
		
		// �������� ȣ���ϱ�
		Function<String, String> engToHan2 = numToHan.compose(engToNum);
		System.out.println(engToHan2.apply("one"));
	}
}


==============================
# negate
import java.util.function.IntPredicate;

class JavaTest {
	public static void main(String[] args) {
		IntPredicate isEven = n -> n%2 == 0;
		IntPredicate over10 = n -> n > 10;
		
		IntPredicate isOdd = isEven.negate();
		IntPredicate evenAndOver10 = isEven.and(over10);
		IntPredicate evenOrOver10 = isEven.or(over10);
		
		System.out.println("7�� Ȧ���ΰ� : " + isOdd.test(7));
		System.out.println("12�� 10���� ū ¦���ΰ� : " + evenAndOver10.test(12));
		System.out.println("8�� 10���� ū ¦���ΰ� : " + evenAndOver10.test(8));
		System.out.println("15�� 10���� ũ�ų� ¦���ΰ� : " + evenOrOver10.test(15));
	}
}


==============================
# methodref
import java.util.function.*;

class JavaTest {
	static int[] arAge = { 29, 30, 34, 32, 30, 31, 28, 31, 29, 30 };
	public static void main(String[] args) {
		System.out.println("over = " + count(JavaTest::isAgeOver));
		System.out.println("under = " + count(JavaTest::isAgeUnder));
	}
	
	static boolean isAgeOver(int age) {
		return (age > 30); 
	}
	
	static boolean isAgeUnder(int age) {
		return (age < 30); 
	}

	static int count(Predicate<Integer> op) {
		int num = 0;
		for (int i = 0; i < arAge.length; i++) {
			if (op.test(arAge[i])) num++;
		}
		return num;
	}
}


==============================
# methodref2
import java.util.function.*;

class JavaTest {
	public static void main(String[] args) {
		// �ν��Ͻ� �޼���
		Function<String, String> upper = String::toUpperCase;
		System.out.println(upper.apply("korea"));

		// ��ü�� �ν��Ͻ� �޼���
		Consumer<String> print = System.out::println;
		print.accept("korea");
	}
}


==============================
# newref
import java.util.function.*;

class Human {
	int age;
	String name;
	Human(int age, String name) { this.age = age; this.name = name; }
}

class JavaTest {
	public static void main(String[] args) {
		BiFunction<Integer, String, Human> creator = Human::new;
		Human kim = creator.apply(21, "�����");
		System.out.println(kim.age + "�� " + kim.name);
	}
}


==============================
# newref2
import java.util.function.*;

class Animal {
	String name;
	Animal(String name) { this.name = name; }
}

class Dog extends Animal {
	Dog(String name) { super(name); }
}

class Cow extends Animal {
	Cow(String name) { super(name); }
}

class JavaTest {
	public static void main(String[] args) {
		addAnimal(Dog::new, "�۸���");
		addAnimal(Cow::new, "���޿�");
	}
	
	static void addAnimal(Function<String, Animal> creator, String s) {
		Animal anim = creator.apply(s);
		System.out.println(anim.name);
	}
}


==============================
# lambdathread
class JavaTest {
	public static void main(String[] args) {
		Thread worker = new Thread(() -> System.out.print("�����尡 ����� ����"));
		worker.start();
	}
}


==============================
# guievent
import java.awt.*;
import javax.swing.*;

class JavaTest {
	public static void main(String[] args) {
		JFrame frame = new JFrame("First Swing Application");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(300,200));
		frame.setLocation(500, 500);

		Container cp = frame.getContentPane();
		BoxLayout layout = new BoxLayout(cp, BoxLayout.Y_AXIS);
		cp.setLayout(layout);

		JLabel fruit = new JLabel("Fruit");
		cp.add(fruit);
		
		JPanel panel = new JPanel();
		FlowLayout flow = new FlowLayout();
		panel.setLayout(flow);

		JButton btnApple = new JButton("Apple");
		btnApple.addActionListener(event -> fruit.setText("Apple"));
		panel.add(btnApple);

		JButton btnOrange = new JButton("Orange");
		btnOrange.addActionListener(event -> fruit.setText("btnOrange"));
		panel.add(btnOrange);
		
		cp.add(panel);
		frame.pack();
		frame.setVisible(true);
	}
}

###########################################################    
## 24�� ##

==============================
# country
import java.util.*;

enum Cont { ASIA, AFRICA, AMERICA, EUROPE }

class Country {
	String name;
	Cont cont;
	int popu;
	boolean oecd;

	Country(String name, Cont cont, int popu, boolean oecd) {
		this.name = name;
		this.cont = cont;
		this.popu = popu;
		this.oecd = oecd;
	}
	
	String getName() { return name; }
	Cont getCont() { return cont; }
	int getPopu() { return popu; }
	boolean isOecd() { return oecd; }
	public String toString() { 
		return name + " in " + cont + " : " + popu + (oecd ? "(O)":""); 
	}
}

class Data {
	static List<Country> nara = Arrays.asList(
			new Country("�ѱ�", Cont.ASIA, 49, true), 
			new Country("�̱�", Cont.AMERICA, 318, true), 
			new Country("�߱�", Cont.ASIA, 1355, false), 
			new Country("������", Cont.EUROPE, 66, true), 
			new Country("����������", Cont.AFRICA, 177, false), 
			new Country("����", Cont.EUROPE, 80, true), 
			new Country("�밡��", Cont.EUROPE, 9, true), 
			new Country("��Ʈ��", Cont.ASIA, 93, false), 
			new Country("ĥ��", Cont.AMERICA, 17, true), 
			new Country("ĳ����", Cont.AMERICA, 34, true) 
		);
}

class JavaTest {
	public static void main(String[] args) {
		List<Country> oecd = new ArrayList<>(); 
		for (Country c:Data.nara) {
			if (c.oecd) {
				oecd.add(c);
			}
		}
		
		Collections.sort(oecd, new Comparator<Country>() {
			public int compare(Country o1, Country o2) {
				return o2.popu - o1.popu;
			}
		});
		

		int total = 0;
		for (int i = 0; i < 3; i++) {
			total += oecd.get(i).popu;
		}
		System.out.println("OECD ���� 3������ �α��� = " + total);
	}
}


==============================
# countrystream
import java.util.*;

enum Cont { ASIA, AFRICA, AMERICA, EUROPE }

class Country {
	String name;
	Cont cont;
	int popu;
	boolean oecd;

	Country(String name, Cont cont, int popu, boolean oecd) {
		this.name = name;
		this.cont = cont;
		this.popu = popu;
		this.oecd = oecd;
	}
	
	String getName() { return name; }
	Cont getCont() { return cont; }
	int getPopu() { return popu; }
	boolean isOecd() { return oecd; }
	public String toString() { 
		return name + " in " + cont + " : " + popu + (oecd ? "(O)":""); 
	}
}

class Data {
	static List<Country> nara = Arrays.asList(
			new Country("�ѱ�", Cont.ASIA, 49, true), 
			new Country("�̱�", Cont.AMERICA, 318, true), 
			new Country("�߱�", Cont.ASIA, 1355, false), 
			new Country("������", Cont.EUROPE, 66, true), 
			new Country("����������", Cont.AFRICA, 177, false), 
			new Country("����", Cont.EUROPE, 80, true), 
			new Country("�밡��", Cont.EUROPE, 9, true), 
			new Country("��Ʈ��", Cont.ASIA, 93, false), 
			new Country("ĥ��", Cont.AMERICA, 17, true), 
			new Country("ĳ����", Cont.AMERICA, 34, true) 
		);
}

class JavaTest {
	public static void main(String[] args) {
		int total = Data.nara.stream()
				.filter(c -> c.oecd)
				.sorted(Comparator.comparing(Country::getPopu).reversed())
				.limit(3)
				.map(Country::getPopu)
				.reduce(0, Integer::sum);
		System.out.println("OECD ���� 3������ �α��� = " + total);
	}
}

==============================
# intstream
import java.util.stream.Stream;

class JavaTest {
	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(3, 1, 4, 1, 5);
		stream.forEach(System.out::print);
	}
}


==============================
# arraystream
import java.util.*;
import java.util.stream.*;

class JavaTest {
	public static void main(String[] args) {
		String[] ar = { "�ѱ�", "�߱�", "�Ϻ�" };
		Stream<String> stream = Arrays.stream(ar);
		stream.forEach(System.out::print);
	}
}


==============================
# generate
import java.util.stream.Stream;

class JavaTest {
	public static void main(String[] args) {
		Stream.generate(Math::random)
			.limit(5)
			.forEach(System.out::println);
	}
}



==============================
# iterate
import java.util.stream.Stream;

class JavaTest {
	public static void main(String[] args) {
		Stream.iterate(1, a -> a+1)
			.limit(5)
			.forEach(System.out::print);
	}
}


==============================
# filestream
import java.io.*;
import java.nio.file.*;
import java.util.stream.*;

class JavaTest {
	public static void main(String[] args)  throws IOException {
		Stream<String> lines = Files.lines(Paths.get("�ֱ���-Utf8nb.txt"));
		lines.forEach(System.out::println);
		lines.close();

		Stream<Path> list = Files.list(Paths.get("c:/"));
		list.forEach(p -> System.out.println(p.getFileName()));
		list.close();
	}
}


==============================
# filter
import java.util.*;

enum Cont { ASIA, AFRICA, AMERICA, EUROPE }

class Country {
	String name;
	Cont cont;
	int popu;
	boolean oecd;

	Country(String name, Cont cont, int popu, boolean oecd) {
		this.name = name;
		this.cont = cont;
		this.popu = popu;
		this.oecd = oecd;
	}
	
	String getName() { return name; }
	Cont getCont() { return cont; }
	int getPopu() { return popu; }
	boolean isOecd() { return oecd; }
	public String toString() { 
		return name + " in " + cont + " : " + popu + (oecd ? "(O)":""); 
	}
}

class Data {
	static List<Country> nara = Arrays.asList(
			new Country("�ѱ�", Cont.ASIA, 49, true), 
			new Country("�̱�", Cont.AMERICA, 318, true), 
			new Country("�߱�", Cont.ASIA, 1355, false), 
			new Country("������", Cont.EUROPE, 66, true), 
			new Country("����������", Cont.AFRICA, 177, false), 
			new Country("����", Cont.EUROPE, 80, true), 
			new Country("�밡��", Cont.EUROPE, 9, true), 
			new Country("��Ʈ��", Cont.ASIA, 93, false), 
			new Country("ĥ��", Cont.AMERICA, 17, true), 
			new Country("ĳ����", Cont.AMERICA, 34, true) 
		);
}

class JavaTest {
	public static void main(String[] args) {
		Data.nara.stream()
			.filter(c -> c.oecd)
			.forEach(System.out::println);
	}
}

==============================
# map
import java.util.*;

enum Cont { ASIA, AFRICA, AMERICA, EUROPE }

class Country {
	String name;
	Cont cont;
	int popu;
	boolean oecd;

	Country(String name, Cont cont, int popu, boolean oecd) {
		this.name = name;
		this.cont = cont;
		this.popu = popu;
		this.oecd = oecd;
	}
	
	String getName() { return name; }
	Cont getCont() { return cont; }
	int getPopu() { return popu; }
	boolean isOecd() { return oecd; }
	public String toString() { 
		return name + " in " + cont + " : " + popu + (oecd ? "(O)":""); 
	}
}

class Data {
	static List<Country> nara = Arrays.asList(
			new Country("�ѱ�", Cont.ASIA, 49, true), 
			new Country("�̱�", Cont.AMERICA, 318, true), 
			new Country("�߱�", Cont.ASIA, 1355, false), 
			new Country("������", Cont.EUROPE, 66, true), 
			new Country("����������", Cont.AFRICA, 177, false), 
			new Country("����", Cont.EUROPE, 80, true), 
			new Country("�밡��", Cont.EUROPE, 9, true), 
			new Country("��Ʈ��", Cont.ASIA, 93, false), 
			new Country("ĥ��", Cont.AMERICA, 17, true), 
			new Country("ĳ����", Cont.AMERICA, 34, true) 
		);
}

class JavaTest {
	public static void main(String[] args) {
		Data.nara.stream()
			.map(c -> c.name)
			.forEach(c -> System.out.print(c + " "));
	}
}

==============================
# distinct
import java.util.*;

enum Cont { ASIA, AFRICA, AMERICA, EUROPE }

class Country {
	String name;
	Cont cont;
	int popu;
	boolean oecd;

	Country(String name, Cont cont, int popu, boolean oecd) {
		this.name = name;
		this.cont = cont;
		this.popu = popu;
		this.oecd = oecd;
	}
	
	String getName() { return name; }
	Cont getCont() { return cont; }
	int getPopu() { return popu; }
	boolean isOecd() { return oecd; }
	public String toString() { 
		return name + " in " + cont + " : " + popu + (oecd ? "(O)":""); 
	}
}

class Data {
	static List<Country> nara = Arrays.asList(
			new Country("�ѱ�", Cont.ASIA, 49, true), 
			new Country("�̱�", Cont.AMERICA, 318, true), 
			new Country("�߱�", Cont.ASIA, 1355, false), 
			new Country("������", Cont.EUROPE, 66, true), 
			new Country("����������", Cont.AFRICA, 177, false), 
			new Country("����", Cont.EUROPE, 80, true), 
			new Country("�밡��", Cont.EUROPE, 9, true), 
			new Country("��Ʈ��", Cont.ASIA, 93, false), 
			new Country("ĥ��", Cont.AMERICA, 17, true), 
			new Country("ĳ����", Cont.AMERICA, 34, true) 
		);
}

class JavaTest {
	public static void main(String[] args) {
		Data.nara.stream()
			.map(c -> c.cont)
			.distinct()
			.forEach(System.out::println);
	}
}

==============================
# limit
import java.util.*;

enum Cont { ASIA, AFRICA, AMERICA, EUROPE }

class Country {
	String name;
	Cont cont;
	int popu;
	boolean oecd;

	Country(String name, Cont cont, int popu, boolean oecd) {
		this.name = name;
		this.cont = cont;
		this.popu = popu;
		this.oecd = oecd;
	}
	
	String getName() { return name; }
	Cont getCont() { return cont; }
	int getPopu() { return popu; }
	boolean isOecd() { return oecd; }
	public String toString() { 
		return name + " in " + cont + " : " + popu + (oecd ? "(O)":""); 
	}
}

class Data {
	static List<Country> nara = Arrays.asList(
			new Country("�ѱ�", Cont.ASIA, 49, true), 
			new Country("�̱�", Cont.AMERICA, 318, true), 
			new Country("�߱�", Cont.ASIA, 1355, false), 
			new Country("������", Cont.EUROPE, 66, true), 
			new Country("����������", Cont.AFRICA, 177, false), 
			new Country("����", Cont.EUROPE, 80, true), 
			new Country("�밡��", Cont.EUROPE, 9, true), 
			new Country("��Ʈ��", Cont.ASIA, 93, false), 
			new Country("ĥ��", Cont.AMERICA, 17, true), 
			new Country("ĳ����", Cont.AMERICA, 34, true) 
		);
}

class JavaTest {
	public static void main(String[] args) {
		Data.nara.stream()
			.limit(4)
			.forEach(System.out::println);
	}
}

==============================
# skip
import java.util.*;

enum Cont { ASIA, AFRICA, AMERICA, EUROPE }

class Country {
	String name;
	Cont cont;
	int popu;
	boolean oecd;

	Country(String name, Cont cont, int popu, boolean oecd) {
		this.name = name;
		this.cont = cont;
		this.popu = popu;
		this.oecd = oecd;
	}
	
	String getName() { return name; }
	Cont getCont() { return cont; }
	int getPopu() { return popu; }
	boolean isOecd() { return oecd; }
	public String toString() { 
		return name + " in " + cont + " : " + popu + (oecd ? "(O)":""); 
	}
}

class Data {
	static List<Country> nara = Arrays.asList(
			new Country("�ѱ�", Cont.ASIA, 49, true), 
			new Country("�̱�", Cont.AMERICA, 318, true), 
			new Country("�߱�", Cont.ASIA, 1355, false), 
			new Country("������", Cont.EUROPE, 66, true), 
			new Country("����������", Cont.AFRICA, 177, false), 
			new Country("����", Cont.EUROPE, 80, true), 
			new Country("�밡��", Cont.EUROPE, 9, true), 
			new Country("��Ʈ��", Cont.ASIA, 93, false), 
			new Country("ĥ��", Cont.AMERICA, 17, true), 
			new Country("ĳ����", Cont.AMERICA, 34, true) 
		);
}

class JavaTest {
	public static void main(String[] args) {
		Data.nara.stream()
			.skip(7)
			.forEach(System.out::println);
	}
}

==============================
# limitskip
import java.util.*;

enum Cont { ASIA, AFRICA, AMERICA, EUROPE }

class Country {
	String name;
	Cont cont;
	int popu;
	boolean oecd;

	Country(String name, Cont cont, int popu, boolean oecd) {
		this.name = name;
		this.cont = cont;
		this.popu = popu;
		this.oecd = oecd;
	}
	
	String getName() { return name; }
	Cont getCont() { return cont; }
	int getPopu() { return popu; }
	boolean isOecd() { return oecd; }
	public String toString() { 
		return name + " in " + cont + " : " + popu + (oecd ? "(O)":""); 
	}
}

class Data {
	static List<Country> nara = Arrays.asList(
			new Country("�ѱ�", Cont.ASIA, 49, true), 
			new Country("�̱�", Cont.AMERICA, 318, true), 
			new Country("�߱�", Cont.ASIA, 1355, false), 
			new Country("������", Cont.EUROPE, 66, true), 
			new Country("����������", Cont.AFRICA, 177, false), 
			new Country("����", Cont.EUROPE, 80, true), 
			new Country("�밡��", Cont.EUROPE, 9, true), 
			new Country("��Ʈ��", Cont.ASIA, 93, false), 
			new Country("ĥ��", Cont.AMERICA, 17, true), 
			new Country("ĳ����", Cont.AMERICA, 34, true) 
		);
}

class JavaTest {
	public static void main(String[] args) {
		Data.nara.stream()
			.skip(2)
			.limit(5)
			.forEach(System.out::println);
		System.out.println("==============");
		Data.nara.stream()
			.limit(5)
			.skip(2)
			.forEach(System.out::println);
	}
}

==============================
# twopower
import java.util.stream.Stream;

class JavaTest {
	public static void main(String[] args) {
		Stream.iterate(2, a -> a*2)
			.limit(10)
			.forEach(n -> System.out.print(n + " "));
	}
}


==============================
# sorted
import java.util.*;

enum Cont { ASIA, AFRICA, AMERICA, EUROPE }

class Country {
	String name;
	Cont cont;
	int popu;
	boolean oecd;

	Country(String name, Cont cont, int popu, boolean oecd) {
		this.name = name;
		this.cont = cont;
		this.popu = popu;
		this.oecd = oecd;
	}
	
	String getName() { return name; }
	Cont getCont() { return cont; }
	int getPopu() { return popu; }
	boolean isOecd() { return oecd; }
	public String toString() { 
		return name + " in " + cont + " : " + popu + (oecd ? "(O)":""); 
	}
}

class Data {
	static List<Country> nara = Arrays.asList(
			new Country("�ѱ�", Cont.ASIA, 49, true), 
			new Country("�̱�", Cont.AMERICA, 318, true), 
			new Country("�߱�", Cont.ASIA, 1355, false), 
			new Country("������", Cont.EUROPE, 66, true), 
			new Country("����������", Cont.AFRICA, 177, false), 
			new Country("����", Cont.EUROPE, 80, true), 
			new Country("�밡��", Cont.EUROPE, 9, true), 
			new Country("��Ʈ��", Cont.ASIA, 93, false), 
			new Country("ĥ��", Cont.AMERICA, 17, true), 
			new Country("ĳ����", Cont.AMERICA, 34, true) 
		);
}

class JavaTest {
	public static void main(String[] args) {
		Data.nara.stream()
			.map(Country::getName)
			.sorted()
			.forEach(n -> System.out.print(n + " "));
	}
}



==============================
# comparable
import java.util.*;

enum Cont { ASIA, AFRICA, AMERICA, EUROPE }

class Country implements Comparable<Country> {
	String name;
	Cont cont;
	int popu;
	boolean oecd;

	Country(String name, Cont cont, int popu, boolean oecd) {
		this.name = name;
		this.cont = cont;
		this.popu = popu;
		this.oecd = oecd;
	}
	
	String getName() { return name; }
	Cont getCont() { return cont; }
	int getPopu() { return popu; }
	boolean isOecd() { return oecd; }
	public String toString() { 
		return name + " in " + cont + " : " + popu + (oecd ? "(O)":""); 
	}

	public int compareTo(Country o) {
		return popu - o.popu;
	}
}

class Data {
	static List<Country> nara = Arrays.asList(
			new Country("�ѱ�", Cont.ASIA, 49, true), 
			new Country("�̱�", Cont.AMERICA, 318, true), 
			new Country("�߱�", Cont.ASIA, 1355, false), 
			new Country("������", Cont.EUROPE, 66, true), 
			new Country("����������", Cont.AFRICA, 177, false), 
			new Country("����", Cont.EUROPE, 80, true), 
			new Country("�밡��", Cont.EUROPE, 9, true), 
			new Country("��Ʈ��", Cont.ASIA, 93, false), 
			new Country("ĥ��", Cont.AMERICA, 17, true), 
			new Country("ĳ����", Cont.AMERICA, 34, true) 
		);
}

class JavaTest {
	public static void main(String[] args) {
		Data.nara.stream()
			.sorted()
			.forEach(System.out::println);
	}
}

==============================
# comparing
import java.util.*;

enum Cont { ASIA, AFRICA, AMERICA, EUROPE }

class Country {
	String name;
	Cont cont;
	int popu;
	boolean oecd;

	Country(String name, Cont cont, int popu, boolean oecd) {
		this.name = name;
		this.cont = cont;
		this.popu = popu;
		this.oecd = oecd;
	}
	
	String getName() { return name; }
	Cont getCont() { return cont; }
	int getPopu() { return popu; }
	boolean isOecd() { return oecd; }
	public String toString() { 
		return name + " in " + cont + " : " + popu + (oecd ? "(O)":""); 
	}
}

class Data {
	static List<Country> nara = Arrays.asList(
			new Country("�ѱ�", Cont.ASIA, 49, true), 
			new Country("�̱�", Cont.AMERICA, 318, true), 
			new Country("�߱�", Cont.ASIA, 1355, false), 
			new Country("������", Cont.EUROPE, 66, true), 
			new Country("����������", Cont.AFRICA, 177, false), 
			new Country("����", Cont.EUROPE, 80, true), 
			new Country("�밡��", Cont.EUROPE, 9, true), 
			new Country("��Ʈ��", Cont.ASIA, 93, false), 
			new Country("ĥ��", Cont.AMERICA, 17, true), 
			new Country("ĳ����", Cont.AMERICA, 34, true) 
		);
}

class JavaTest {
	public static void main(String[] args) {
		Data.nara.stream()
			.sorted(Comparator.comparing(Country::getPopu))
			.forEach(System.out::println);
	}
}

==============================
# count
import java.util.*;

enum Cont { ASIA, AFRICA, AMERICA, EUROPE }

class Country {
	String name;
	Cont cont;
	int popu;
	boolean oecd;

	Country(String name, Cont cont, int popu, boolean oecd) {
		this.name = name;
		this.cont = cont;
		this.popu = popu;
		this.oecd = oecd;
	}
	
	String getName() { return name; }
	Cont getCont() { return cont; }
	int getPopu() { return popu; }
	boolean isOecd() { return oecd; }
	public String toString() { 
		return name + " in " + cont + " : " + popu + (oecd ? "(O)":""); 
	}
}

class Data {
	static List<Country> nara = Arrays.asList(
			new Country("�ѱ�", Cont.ASIA, 49, true), 
			new Country("�̱�", Cont.AMERICA, 318, true), 
			new Country("�߱�", Cont.ASIA, 1355, false), 
			new Country("������", Cont.EUROPE, 66, true), 
			new Country("����������", Cont.AFRICA, 177, false), 
			new Country("����", Cont.EUROPE, 80, true), 
			new Country("�밡��", Cont.EUROPE, 9, true), 
			new Country("��Ʈ��", Cont.ASIA, 93, false), 
			new Country("ĥ��", Cont.AMERICA, 17, true), 
			new Country("ĳ����", Cont.AMERICA, 34, true) 
		);
}

class JavaTest {
	public static void main(String[] args) {
		System.out.println(Data.nara.stream().count());
	}
}

==============================
# allmatch
import java.util.*;

enum Cont { ASIA, AFRICA, AMERICA, EUROPE }

class Country {
	String name;
	Cont cont;
	int popu;
	boolean oecd;

	Country(String name, Cont cont, int popu, boolean oecd) {
		this.name = name;
		this.cont = cont;
		this.popu = popu;
		this.oecd = oecd;
	}
	
	String getName() { return name; }
	Cont getCont() { return cont; }
	int getPopu() { return popu; }
	boolean isOecd() { return oecd; }
	public String toString() { 
		return name + " in " + cont + " : " + popu + (oecd ? "(O)":""); 
	}
}

class Data {
	static List<Country> nara = Arrays.asList(
			new Country("�ѱ�", Cont.ASIA, 49, true), 
			new Country("�̱�", Cont.AMERICA, 318, true), 
			new Country("�߱�", Cont.ASIA, 1355, false), 
			new Country("������", Cont.EUROPE, 66, true), 
			new Country("����������", Cont.AFRICA, 177, false), 
			new Country("����", Cont.EUROPE, 80, true), 
			new Country("�밡��", Cont.EUROPE, 9, true), 
			new Country("��Ʈ��", Cont.ASIA, 93, false), 
			new Country("ĥ��", Cont.AMERICA, 17, true), 
			new Country("ĳ����", Cont.AMERICA, 34, true) 
		);
}

class JavaTest {
	public static void main(String[] args) {
		System.out.println(Data.nara.stream().anyMatch(c -> c.cont == Cont.AFRICA));
		System.out.println(Data.nara.stream().allMatch(c -> c.popu > 10));
		System.out.println(Data.nara.stream().noneMatch(c -> c.popu < 8));
	}
}

==============================
# minmax
import java.util.*;

enum Cont { ASIA, AFRICA, AMERICA, EUROPE }

class Country {
	String name;
	Cont cont;
	int popu;
	boolean oecd;

	Country(String name, Cont cont, int popu, boolean oecd) {
		this.name = name;
		this.cont = cont;
		this.popu = popu;
		this.oecd = oecd;
	}
	
	String getName() { return name; }
	Cont getCont() { return cont; }
	int getPopu() { return popu; }
	boolean isOecd() { return oecd; }
	public String toString() { 
		return name + " in " + cont + " : " + popu + (oecd ? "(O)":""); 
	}
}

class Data {
	static List<Country> nara = Arrays.asList(
			new Country("�ѱ�", Cont.ASIA, 49, true), 
			new Country("�̱�", Cont.AMERICA, 318, true), 
			new Country("�߱�", Cont.ASIA, 1355, false), 
			new Country("������", Cont.EUROPE, 66, true), 
			new Country("����������", Cont.AFRICA, 177, false), 
			new Country("����", Cont.EUROPE, 80, true), 
			new Country("�밡��", Cont.EUROPE, 9, true), 
			new Country("��Ʈ��", Cont.ASIA, 93, false), 
			new Country("ĥ��", Cont.AMERICA, 17, true), 
			new Country("ĳ����", Cont.AMERICA, 34, true) 
		);
}

class JavaTest {
	public static void main(String[] args) {
		Optional<Integer> max = Data.nara.stream().
				map(Country::getPopu).
				max((a, b) -> a-b);
		System.out.println(max.get());
		Optional<Integer> min = Data.nara.stream().
				map(Country::getPopu).
				min((a, b) -> a-b);
		System.out.println(min.get());
	}
}

==============================
# nullable
class Notebook {
	String model;
	Notebook(String model) { this.model = model; }
}

class Human {
	int age;
	String name;
	Notebook book;
	
	Human(int age, String name, String model) {
		book = new Notebook(model);
		this.age = age;
		this.name = name;
	}
}

class JavaTest {
	public static void main(String[] args) {
		Human kim = new Human(29, "�����", "����");
		useBook(kim);
	}
	
	static void useBook(Human human) {
		System.out.println("�� ��Ʈ�� : " + human.book.model);
	}
}


==============================
# optional
import java.util.*;

class Notebook {
	String model;
	Notebook(String model) { this.model = model; }
}

class Human {
	int age;
	String name;
	Optional<Notebook> book;
	
	Human(int age, String name, String model) {
		if (model == null || model.length() == 0) {
			book = Optional.empty();
		} else {
			book = Optional.of(new Notebook(model));
		}
		this.age = age;
		this.name = name;
	}
}

class JavaTest {
	public static void main(String[] args) {
		Human kim = new Human(29, "�����", "���뺸");
		useBook(kim);
		Human lee = new Human(44, "�̽¿�", null);
		useBook(lee);
	}
	
	static void useBook(Human human) {
		if (human.book.isPresent()) {
			String model = human.book.get().model;
			System.out.println("�� ��Ʈ�� : " + model);
		} else {
			System.out.println("��Ʈ���� ����.");
		}
	}
}


==============================
# ifpresent
import java.util.*;

class Notebook {
	String model;
	Notebook(String model) { this.model = model; }
}

class Human {
	int age;
	String name;
	Optional<Notebook> book;
	
	Human(int age, String name, String model) {
		if (model == null || model.length() == 0) {
			book = Optional.empty();
		} else {
			book = Optional.of(new Notebook(model));
		}
		this.age = age;
		this.name = name;
	}
}

class JavaTest {
	public static void main(String[] args) {
		Human kim = new Human(29, "�����", "���뺸");
		useBook(kim);
		Human lee = new Human(44, "�̽¿�", null);
		useBook(lee);
	}
	
	static void useBook(Human human) {
		human.book.ifPresent(b -> System.out.println("�� ��Ʈ�� : " + b.model));
	}
}

==============================
# orelse
import java.util.*;

class Notebook {
	String model;
	Notebook(String model) { this.model = model; }
}

class Human {
	int age;
	String name;
	Optional<Notebook> book;
	
	Human(int age, String name, String model) {
		if (model == null || model.length() == 0) {
			book = Optional.empty();
		} else {
			book = Optional.of(new Notebook(model));
		}
		this.age = age;
		this.name = name;
	}
}

class JavaTest {
	public static void main(String[] args) {
		Human kim = new Human(29, "�����", "���뺸");
		useBook(kim);
		Human lee = new Human(44, "�̽¿�", null);
		useBook(lee);
	}
	
	static void useBook(Human human) {
		Notebook book = human.book.orElse(new Notebook("�α���"));
		System.out.println("�� ��Ʈ�� : "  + book.model);
	}
}

==============================
# optionfilter
import java.util.*;

class Notebook {
	String model;
	Notebook(String model) { this.model = model; }
}

class Human {
	int age;
	String name;
	Optional<Notebook> book;
	
	Human(int age, String name, String model) {
		if (model == null || model.length() == 0) {
			book = Optional.empty();
		} else {
			book = Optional.of(new Notebook(model));
		}
		this.age = age;
		this.name = name;
	}
}

class JavaTest {
	public static void main(String[] args) {
		Human kim = new Human(29, "�����", "�Ｚ ��Ƽ��");
		useBook(kim);
	}
	
	static void useBook(Human human) {
		human.book.filter(b -> b.model.indexOf("�Ｚ") != -1)
		.ifPresent(b -> System.out.println("�Ｚ ��Ʈ��"));
	}
}

==============================
# optionmap
import java.util.*;

class Notebook {
	String model;
	Notebook(String model) { this.model = model; }
}

class Human {
	int age;
	String name;
	Optional<Notebook> book;
	
	Human(int age, String name, String model) {
		if (model == null || model.length() == 0) {
			book = Optional.empty();
		} else {
			book = Optional.of(new Notebook(model));
		}
		this.age = age;
		this.name = name;
	}
}

class JavaTest {
	public static void main(String[] args) {
		Human kim = new Human(29, "�����", "");
		useBook(kim);
	}
	
	static void useBook(Human human) {
		String model = human.book.map(b -> b.model).orElse("�̸�����");
		System.out.println(model);
	}
}

==============================
# reduce
import java.util.*;

enum Cont { ASIA, AFRICA, AMERICA, EUROPE }

class Country {
	String name;
	Cont cont;
	int popu;
	boolean oecd;

	Country(String name, Cont cont, int popu, boolean oecd) {
		this.name = name;
		this.cont = cont;
		this.popu = popu;
		this.oecd = oecd;
	}
	
	String getName() { return name; }
	Cont getCont() { return cont; }
	int getPopu() { return popu; }
	boolean isOecd() { return oecd; }
	public String toString() { 
		return name + " in " + cont + " : " + popu + (oecd ? "(O)":""); 
	}
}

class Data {
	static List<Country> nara = Arrays.asList(
			new Country("�ѱ�", Cont.ASIA, 49, true), 
			new Country("�̱�", Cont.AMERICA, 318, true), 
			new Country("�߱�", Cont.ASIA, 1355, false), 
			new Country("������", Cont.EUROPE, 66, true), 
			new Country("����������", Cont.AFRICA, 177, false), 
			new Country("����", Cont.EUROPE, 80, true), 
			new Country("�밡��", Cont.EUROPE, 9, true), 
			new Country("��Ʈ��", Cont.ASIA, 93, false), 
			new Country("ĥ��", Cont.AMERICA, 17, true), 
			new Country("ĳ����", Cont.AMERICA, 34, true) 
		);
}

class JavaTest {
	public static void main(String[] args) {
		int total = Data.nara.stream()
				.map(Country::getPopu)
				.reduce(0, (i,j) -> i+j);
		System.out.println(total);
	}
}

==============================
# reduce2
import java.util.*;

enum Cont { ASIA, AFRICA, AMERICA, EUROPE }

class Country {
	String name;
	Cont cont;
	int popu;
	boolean oecd;

	Country(String name, Cont cont, int popu, boolean oecd) {
		this.name = name;
		this.cont = cont;
		this.popu = popu;
		this.oecd = oecd;
	}
	
	String getName() { return name; }
	Cont getCont() { return cont; }
	int getPopu() { return popu; }
	boolean isOecd() { return oecd; }
	public String toString() { 
		return name + " in " + cont + " : " + popu + (oecd ? "(O)":""); 
	}
}

class Data {
	static List<Country> nara = Arrays.asList(
			new Country("�ѱ�", Cont.ASIA, 49, true), 
			new Country("�̱�", Cont.AMERICA, 318, true), 
			new Country("�߱�", Cont.ASIA, 1355, false), 
			new Country("������", Cont.EUROPE, 66, true), 
			new Country("����������", Cont.AFRICA, 177, false), 
			new Country("����", Cont.EUROPE, 80, true), 
			new Country("�밡��", Cont.EUROPE, 9, true), 
			new Country("��Ʈ��", Cont.ASIA, 93, false), 
			new Country("ĥ��", Cont.AMERICA, 17, true), 
			new Country("ĳ����", Cont.AMERICA, 34, true) 
		);
}

class JavaTest {
	public static void main(String[] args) {
		Optional<Integer> total = Data.nara.stream()
				.map(Country::getPopu)
				.reduce(Integer::sum);
		System.out.println(total.get());
	}
}


==============================
# reduceminmax
import java.util.*;

enum Cont { ASIA, AFRICA, AMERICA, EUROPE }

class Country {
	String name;
	Cont cont;
	int popu;
	boolean oecd;

	Country(String name, Cont cont, int popu, boolean oecd) {
		this.name = name;
		this.cont = cont;
		this.popu = popu;
		this.oecd = oecd;
	}
	
	String getName() { return name; }
	Cont getCont() { return cont; }
	int getPopu() { return popu; }
	boolean isOecd() { return oecd; }
	public String toString() { 
		return name + " in " + cont + " : " + popu + (oecd ? "(O)":""); 
	}
}

class Data {
	static List<Country> nara = Arrays.asList(
			new Country("�ѱ�", Cont.ASIA, 49, true), 
			new Country("�̱�", Cont.AMERICA, 318, true), 
			new Country("�߱�", Cont.ASIA, 1355, false), 
			new Country("������", Cont.EUROPE, 66, true), 
			new Country("����������", Cont.AFRICA, 177, false), 
			new Country("����", Cont.EUROPE, 80, true), 
			new Country("�밡��", Cont.EUROPE, 9, true), 
			new Country("��Ʈ��", Cont.ASIA, 93, false), 
			new Country("ĥ��", Cont.AMERICA, 17, true), 
			new Country("ĳ����", Cont.AMERICA, 34, true) 
		);
}

class JavaTest {
	public static void main(String[] args) {
		Optional<Integer> min = Data.nara.stream()
			.map(Country::getPopu)
			.reduce(Integer::min);
		System.out.println(min.get());
		Optional<Integer> max = Data.nara.stream()
			.map(Country::getPopu)
			.reduce(Integer::max);
		System.out.println(max.get());
	}
}
==============================
# maptoint
import java.util.*;

enum Cont { ASIA, AFRICA, AMERICA, EUROPE }

class Country {
	String name;
	Cont cont;
	int popu;
	boolean oecd;

	Country(String name, Cont cont, int popu, boolean oecd) {
		this.name = name;
		this.cont = cont;
		this.popu = popu;
		this.oecd = oecd;
	}
	
	String getName() { return name; }
	Cont getCont() { return cont; }
	int getPopu() { return popu; }
	boolean isOecd() { return oecd; }
	public String toString() { 
		return name + " in " + cont + " : " + popu + (oecd ? "(O)":""); 
	}
}

class Data {
	static List<Country> nara = Arrays.asList(
			new Country("�ѱ�", Cont.ASIA, 49, true), 
			new Country("�̱�", Cont.AMERICA, 318, true), 
			new Country("�߱�", Cont.ASIA, 1355, false), 
			new Country("������", Cont.EUROPE, 66, true), 
			new Country("����������", Cont.AFRICA, 177, false), 
			new Country("����", Cont.EUROPE, 80, true), 
			new Country("�밡��", Cont.EUROPE, 9, true), 
			new Country("��Ʈ��", Cont.ASIA, 93, false), 
			new Country("ĥ��", Cont.AMERICA, 17, true), 
			new Country("ĳ����", Cont.AMERICA, 34, true) 
		);
}

class JavaTest {
	public static void main(String[] args) {
		int total = Data.nara.stream()
			.mapToInt(Country::getPopu)
			.sum();
		System.out.println(total);
	}
}

==============================
# rangeclosed
import java.util.stream.IntStream;

class JavaTest {
	public static void main(String[] args) {
		int total = IntStream.rangeClosed(1, 100).sum();
		System.out.println(total);
	}
}


==============================
# collect
import java.util.*;
import java.util.stream.*;

enum Cont { ASIA, AFRICA, AMERICA, EUROPE }

class Country {
	String name;
	Cont cont;
	int popu;
	boolean oecd;

	Country(String name, Cont cont, int popu, boolean oecd) {
		this.name = name;
		this.cont = cont;
		this.popu = popu;
		this.oecd = oecd;
	}
	
	String getName() { return name; }
	Cont getCont() { return cont; }
	int getPopu() { return popu; }
	boolean isOecd() { return oecd; }
	public String toString() { 
		return name + " in " + cont + " : " + popu + (oecd ? "(O)":""); 
	}
}

class Data {
	static List<Country> nara = Arrays.asList(
			new Country("�ѱ�", Cont.ASIA, 49, true), 
			new Country("�̱�", Cont.AMERICA, 318, true), 
			new Country("�߱�", Cont.ASIA, 1355, false), 
			new Country("������", Cont.EUROPE, 66, true), 
			new Country("����������", Cont.AFRICA, 177, false), 
			new Country("����", Cont.EUROPE, 80, true), 
			new Country("�밡��", Cont.EUROPE, 9, true), 
			new Country("��Ʈ��", Cont.ASIA, 93, false), 
			new Country("ĥ��", Cont.AMERICA, 17, true), 
			new Country("ĳ����", Cont.AMERICA, 34, true) 
		);
}

class JavaTest {
	public	static void main(String[] args) {
		List<String> names = Data.nara.stream()
			.map(Country::getName)
			.collect(Collectors.toList());
		for (String n : names) {
			System.out.print(n + " ");
		}
	}
}

==============================
# collector
import java.util.*;
import java.util.stream.*;

enum Cont { ASIA, AFRICA, AMERICA, EUROPE }

class Country {
	String name;
	Cont cont;
	int popu;
	boolean oecd;

	Country(String name, Cont cont, int popu, boolean oecd) {
		this.name = name;
		this.cont = cont;
		this.popu = popu;
		this.oecd = oecd;
	}
	
	String getName() { return name; }
	Cont getCont() { return cont; }
	int getPopu() { return popu; }
	boolean isOecd() { return oecd; }
	public String toString() { 
		return name + " in " + cont + " : " + popu + (oecd ? "(O)":""); 
	}
}

class Data {
	static List<Country> nara = Arrays.asList(
			new Country("�ѱ�", Cont.ASIA, 49, true), 
			new Country("�̱�", Cont.AMERICA, 318, true), 
			new Country("�߱�", Cont.ASIA, 1355, false), 
			new Country("������", Cont.EUROPE, 66, true), 
			new Country("����������", Cont.AFRICA, 177, false), 
			new Country("����", Cont.EUROPE, 80, true), 
			new Country("�밡��", Cont.EUROPE, 9, true), 
			new Country("��Ʈ��", Cont.ASIA, 93, false), 
			new Country("ĥ��", Cont.AMERICA, 17, true), 
			new Country("ĳ����", Cont.AMERICA, 34, true) 
		);
}

class JavaTest {
	public	static void main(String[] args) {
		String names = Data.nara.stream()
			.map(Country::getName)
			.collect(Collectors.joining(", "));
		System.out.println(names);
	}
}

==============================
# collectminmax
import java.util.*;
import java.util.stream.*;

enum Cont { ASIA, AFRICA, AMERICA, EUROPE }

class Country {
	String name;
	Cont cont;
	int popu;
	boolean oecd;

	Country(String name, Cont cont, int popu, boolean oecd) {
		this.name = name;
		this.cont = cont;
		this.popu = popu;
		this.oecd = oecd;
	}
	
	String getName() { return name; }
	Cont getCont() { return cont; }
	int getPopu() { return popu; }
	boolean isOecd() { return oecd; }
	public String toString() { 
		return name + " in " + cont + " : " + popu + (oecd ? "(O)":""); 
	}
}

class Data {
	static List<Country> nara = Arrays.asList(
			new Country("�ѱ�", Cont.ASIA, 49, true), 
			new Country("�̱�", Cont.AMERICA, 318, true), 
			new Country("�߱�", Cont.ASIA, 1355, false), 
			new Country("������", Cont.EUROPE, 66, true), 
			new Country("����������", Cont.AFRICA, 177, false), 
			new Country("����", Cont.EUROPE, 80, true), 
			new Country("�밡��", Cont.EUROPE, 9, true), 
			new Country("��Ʈ��", Cont.ASIA, 93, false), 
			new Country("ĥ��", Cont.AMERICA, 17, true), 
			new Country("ĳ����", Cont.AMERICA, 34, true) 
		);
}

class JavaTest {
	public	static void main(String[] args) {
		long num = Data.nara.stream()
			.collect(Collectors.counting());
		System.out.println(num);
		Optional<Integer> max = Data.nara.stream()
				.map(Country::getPopu)
				.collect(Collectors.maxBy(Integer::compare));
		System.out.println(max.get());
		Optional<Integer> min = Data.nara.stream()
				.map(Country::getPopu)
				.collect(Collectors.minBy(Integer::compare));
		System.out.println(min.get());
	}
}

==============================
# collectaverage
import java.util.*;
import java.util.stream.*;

enum Cont { ASIA, AFRICA, AMERICA, EUROPE }

class Country {
	String name;
	Cont cont;
	int popu;
	boolean oecd;

	Country(String name, Cont cont, int popu, boolean oecd) {
		this.name = name;
		this.cont = cont;
		this.popu = popu;
		this.oecd = oecd;
	}
	
	String getName() { return name; }
	Cont getCont() { return cont; }
	int getPopu() { return popu; }
	boolean isOecd() { return oecd; }
	public String toString() { 
		return name + " in " + cont + " : " + popu + (oecd ? "(O)":""); 
	}
}

class Data {
	static List<Country> nara = Arrays.asList(
			new Country("�ѱ�", Cont.ASIA, 49, true), 
			new Country("�̱�", Cont.AMERICA, 318, true), 
			new Country("�߱�", Cont.ASIA, 1355, false), 
			new Country("������", Cont.EUROPE, 66, true), 
			new Country("����������", Cont.AFRICA, 177, false), 
			new Country("����", Cont.EUROPE, 80, true), 
			new Country("�밡��", Cont.EUROPE, 9, true), 
			new Country("��Ʈ��", Cont.ASIA, 93, false), 
			new Country("ĥ��", Cont.AMERICA, 17, true), 
			new Country("ĳ����", Cont.AMERICA, 34, true) 
		);
}

class JavaTest {
	public	static void main(String[] args) {
		int sum = Data.nara.stream()
			.collect(Collectors.summingInt(Country::getPopu));
		System.out.println(sum);
		double avg = Data.nara.stream()
			.collect(Collectors.averagingInt(Country::getPopu));
		System.out.println(avg);
	}
}

==============================
# summing
import java.util.*;
import java.util.stream.*;

enum Cont { ASIA, AFRICA, AMERICA, EUROPE }

class Country {
	String name;
	Cont cont;
	int popu;
	boolean oecd;

	Country(String name, Cont cont, int popu, boolean oecd) {
		this.name = name;
		this.cont = cont;
		this.popu = popu;
		this.oecd = oecd;
	}
	
	String getName() { return name; }
	Cont getCont() { return cont; }
	int getPopu() { return popu; }
	boolean isOecd() { return oecd; }
	public String toString() { 
		return name + " in " + cont + " : " + popu + (oecd ? "(O)":""); 
	}
}

class Data {
	static List<Country> nara = Arrays.asList(
			new Country("�ѱ�", Cont.ASIA, 49, true), 
			new Country("�̱�", Cont.AMERICA, 318, true), 
			new Country("�߱�", Cont.ASIA, 1355, false), 
			new Country("������", Cont.EUROPE, 66, true), 
			new Country("����������", Cont.AFRICA, 177, false), 
			new Country("����", Cont.EUROPE, 80, true), 
			new Country("�밡��", Cont.EUROPE, 9, true), 
			new Country("��Ʈ��", Cont.ASIA, 93, false), 
			new Country("ĥ��", Cont.AMERICA, 17, true), 
			new Country("ĳ����", Cont.AMERICA, 34, true) 
		);
}

class JavaTest {
	public	static void main(String[] args) {
		IntSummaryStatistics summary = Data.nara.stream()
			.collect(Collectors.summarizingInt(Country::getPopu));
		System.out.println(summary);
	}
}

==============================
# reducesum
import java.util.*;
import java.util.stream.*;

enum Cont { ASIA, AFRICA, AMERICA, EUROPE }

class Country {
	String name;
	Cont cont;
	int popu;
	boolean oecd;

	Country(String name, Cont cont, int popu, boolean oecd) {
		this.name = name;
		this.cont = cont;
		this.popu = popu;
		this.oecd = oecd;
	}
	
	String getName() { return name; }
	Cont getCont() { return cont; }
	int getPopu() { return popu; }
	boolean isOecd() { return oecd; }
	public String toString() { 
		return name + " in " + cont + " : " + popu + (oecd ? "(O)":""); 
	}
}

class Data {
	static List<Country> nara = Arrays.asList(
			new Country("�ѱ�", Cont.ASIA, 49, true), 
			new Country("�̱�", Cont.AMERICA, 318, true), 
			new Country("�߱�", Cont.ASIA, 1355, false), 
			new Country("������", Cont.EUROPE, 66, true), 
			new Country("����������", Cont.AFRICA, 177, false), 
			new Country("����", Cont.EUROPE, 80, true), 
			new Country("�밡��", Cont.EUROPE, 9, true), 
			new Country("��Ʈ��", Cont.ASIA, 93, false), 
			new Country("ĥ��", Cont.AMERICA, 17, true), 
			new Country("ĳ����", Cont.AMERICA, 34, true) 
		);
}

class JavaTest {
	public	static void main(String[] args) {
		int sum = Data.nara.stream()
			.collect(Collectors.reducing(0, Country::getPopu, Integer::sum));
		System.out.println(sum);
	}
}

==============================
# grouping
import java.util.*;
import java.util.stream.*;

enum Cont { ASIA, AFRICA, AMERICA, EUROPE }

class Country {
	String name;
	Cont cont;
	int popu;
	boolean oecd;

	Country(String name, Cont cont, int popu, boolean oecd) {
		this.name = name;
		this.cont = cont;
		this.popu = popu;
		this.oecd = oecd;
	}
	
	String getName() { return name; }
	Cont getCont() { return cont; }
	int getPopu() { return popu; }
	boolean isOecd() { return oecd; }
	public String toString() { 
		return name + " in " + cont + " : " + popu + (oecd ? "(O)":""); 
	}
}

class Data {
	static List<Country> nara = Arrays.asList(
			new Country("�ѱ�", Cont.ASIA, 49, true), 
			new Country("�̱�", Cont.AMERICA, 318, true), 
			new Country("�߱�", Cont.ASIA, 1355, false), 
			new Country("������", Cont.EUROPE, 66, true), 
			new Country("����������", Cont.AFRICA, 177, false), 
			new Country("����", Cont.EUROPE, 80, true), 
			new Country("�밡��", Cont.EUROPE, 9, true), 
			new Country("��Ʈ��", Cont.ASIA, 93, false), 
			new Country("ĥ��", Cont.AMERICA, 17, true), 
			new Country("ĳ����", Cont.AMERICA, 34, true) 
		);
}

class JavaTest {
	public static void main(String[] args) {
		Map<Cont, List<Country>> map = Data.nara.stream()
			.collect(Collectors.groupingBy(Country::getCont));

		Set<Cont> keys = map.keySet();
		Iterator<Cont> key = keys.iterator();
		while (key.hasNext()) {
			Cont cont = key.next();
			System.out.print(cont + " : ");
			List<Country> n = map.get(cont);
			for (Country c : n) {
				System.out.print(c.name + " ");
			}
			System.out.println();
		}
	}
}

==============================
# oecdgroup
import java.util.*;
import java.util.stream.*;

enum Cont { ASIA, AFRICA, AMERICA, EUROPE }

class Country {
	String name;
	Cont cont;
	int popu;
	boolean oecd;

	Country(String name, Cont cont, int popu, boolean oecd) {
		this.name = name;
		this.cont = cont;
		this.popu = popu;
		this.oecd = oecd;
	}
	
	String getName() { return name; }
	Cont getCont() { return cont; }
	int getPopu() { return popu; }
	boolean isOecd() { return oecd; }
	public String toString() { 
		return name + " in " + cont + " : " + popu + (oecd ? "(O)":""); 
	}
}

class Data {
	static List<Country> nara = Arrays.asList(
			new Country("�ѱ�", Cont.ASIA, 49, true), 
			new Country("�̱�", Cont.AMERICA, 318, true), 
			new Country("�߱�", Cont.ASIA, 1355, false), 
			new Country("������", Cont.EUROPE, 66, true), 
			new Country("����������", Cont.AFRICA, 177, false), 
			new Country("����", Cont.EUROPE, 80, true), 
			new Country("�밡��", Cont.EUROPE, 9, true), 
			new Country("��Ʈ��", Cont.ASIA, 93, false), 
			new Country("ĥ��", Cont.AMERICA, 17, true), 
			new Country("ĳ����", Cont.AMERICA, 34, true) 
		);
}

class JavaTest {
	public static void main(String[] args) {
		Map<Boolean, List<Country>> map = Data.nara.stream()
			.collect(Collectors.groupingBy(Country::isOecd));

		Set<Boolean> keys = map.keySet();
		Iterator<Boolean> key = keys.iterator();
		while (key.hasNext()) {
			Boolean oecd = key.next();
			System.out.print(oecd + " : ");
			List<Country> n = map.get(oecd);
			for (Country c : n) {
				System.out.print(c.name + " ");
			}
			System.out.println();
		}
	}
}

###########################################################    
## 25�� ##

==============================
# const
class JavaTest {
	public static void main(String[] args) {
		final int EAST = 1;
		final int WEST = 2;
		final int SOUTH = 3;
		final int NORTH = 4;
		
		int origin = EAST;				// �������� �ʱ�ȭ
		origin = SOUTH;				// �������� ����
		if (origin == WEST) { } 		// �����̸�
		if (origin != NORTH) { }			// ������ �ƴϸ�
	}
}


==============================
# enum
enum Direction { EAST, WEST, SOUTH, NORTH };

class JavaTest {
	public static void main(String[] args) {
		
		Direction origin = Direction.EAST;		// �������� �ʱ�ȭ
		origin = Direction.SOUTH;				// �������� ����
		if (origin == Direction.WEST) { } 		// �����̸�
		if (origin != Direction.NORTH) { }		// ������ �ƴϸ�
	}
}


==============================
# enum2
enum Direction { EAST, WEST, SOUTH, NORTH };
enum Yoil { SUN, MON, TUE, WED, THR, FRI, SAT };

class JavaTest {
	public static void main(String[] args) {
		Direction origin = Direction.EAST;
		
		System.out.println(origin);
		// origin = 9;						// ����
		// if (origin == Yoil.SUN) { }			// ����
	}
}


==============================
# values
enum Direction { EAST, WEST, SOUTH, NORTH };

class JavaTest {
	public static void main(String[] args) {
		Direction[] ways = Direction.values();
		for (Direction way:ways) {
			System.out.print(way + ", ");
		}
		System.out.print("�� �ϳ��� �����Ͻʽÿ�.");
	}
}


==============================
# valueof
enum Direction { EAST, WEST, SOUTH, NORTH };

class JavaTest {
	public static void main(String[] args) {
		Direction origin = Direction.valueOf("EAST");
		System.out.println(origin);
	}
}


==============================
# enumvalue
enum Direction { 
	EAST("��"), WEST("��"), SOUTH("��"), NORTH("��");
	final private String hanDir;
	Direction(String han) {
		hanDir = han;
	}
	String getHanDir() {
		return hanDir;
	}
};

class JavaTest {
	public static void main(String[] args) {
		Direction origin = Direction.EAST;
		System.out.println(origin.getHanDir() + "������ ���ϴ�.");
	}
}


==============================
# enumvalue2
enum JavaType {
	SHORT("ª�� ������",2), INT("������",4),DOUBLE("�Ǽ���",8);
	final private String typeName;
	final private int length;
	JavaType(String name, int bytenum) {
		typeName = name;
		length = bytenum;
	}
	String getName() { return typeName; }
	int getLength() { return length; }
}

class JavaTest {
	public static void main(String[] args) {
		JavaType Type;
		Type = JavaType.INT;
		
		System.out.println("Ÿ�� : " + Type + ", �̸� : " + 
			Type.getName() + ", ���� : " + Type.getLength());
	}
}


==============================
# deprecate
class Car {
	String name;
	boolean gasoline;
	
	void run() {
		if (gasoline) {
			System.out.println("�θ� �θ�");
		} else {
			System.out.println("���� ����");
		}
	}
	
	@Deprecated
	void stop() {
		System.out.println("������");
	}
}

class JavaTest {
	public static void main(String[] args) {
		Car korando = new Car();
		korando.name = "�ڶ���C";
		korando.gasoline = false;
		
		korando.run();
		korando.stop();
	}
}


==============================
# override
class Human {
	void move(int x, int y) {
		System.out.println("��� : �ѹ� �ѹ�");
	}
	int think(String what) { 
		return 0;
	}
}

class Student extends Human {
	void mobe(int x, int y) { 
		System.out.println("�л� : ���� ����");
	}
	
	int think(float what) { 
		return 0;
	}
}

class JavaTest {
	public static void main(String[] args) {
		Student kim = new Student();
		kim.move(0, 0);
	}
}

###########################################################    
## 26�� ##

==============================
# dumpcity
import java.sql.*;

class JavaTest {
	public static void main(String[] args) {
		try {
			// ����̹� �ε�
			Class.forName("org.mariadb.jdbc.Driver");
			// ����
			Connection conn = DriverManager.getConnection(
				"jdbc:mariadb://localhost:3306/Study", "root", "asdf");
			// ��� ����
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM City");
			// ����� ����
			while (rs.next()) {
				String name = rs.getString("name");
				int popu = rs.getInt("popu");
				int area = rs.getInt("area");
				System.out.printf("%s :%4d����, %4dkm\n", name, popu, area);
			}
			// ����
			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.getMessage();
		}
	}
}


==============================
# maketable
import java.sql.*;

class JavaTest {
	public static void main(String[] args) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection conn = DriverManager.getConnection(
				"jdbc:mariadb://localhost:3306/Study", "root", "asdf");
			Statement stmt = conn.createStatement();

			// ���̺� ���ʱ�ȭ
			stmt.executeUpdate("DROP TABLE IF EXISTS Staff;"); 
			stmt.executeUpdate("CREATE TABLE Staff (" + 
					"name NVARCHAR (30) NOT NULL PRIMARY KEY," + 
					"depart NVARCHAR (10) NOT NULL," + 
					"salary INT NOT NULL," + 
					"achieve INT NULL," + 
					"workMonth INT NULL);");
			// ���� ���ڵ� ����
			stmt.executeUpdate("INSERT INTO Staff VALUES ('������','������',180,88,12);");
			stmt.executeUpdate("INSERT INTO Staff VALUES ('������','������',190,NULL,28);");
			stmt.executeUpdate("INSERT INTO Staff VALUES ('���߱�','������',185,76,19);");
			stmt.executeUpdate("INSERT INTO Staff VALUES ('������','�����',200,71,38);");
			stmt.executeUpdate("INSERT INTO Staff VALUES ('������','������',150,28,3);");
			stmt.executeUpdate("INSERT INTO Staff VALUES ('������','������',170,88,12);");

			// ����� ����
			ResultSet rs = stmt.executeQuery("SELECT * FROM Staff");
			while (rs.next()) {
				System.out.println(rs.getString("name"));
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.getMessage();
		}
	}
}


==============================
# updatetable
import java.sql.*;

class JavaTest {
	public static void main(String[] args) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection conn = DriverManager.getConnection(
				"jdbc:mariadb://localhost:3306/Study", "root", "asdf");
			Statement stmt = conn.createStatement();
			
			stmt.executeUpdate("UPDATE Staff SET salary=250 WHERE name='������';");
			stmt.executeUpdate("DELETE FROM Staff WHERE depart='������';");
			
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.getMessage();
		}
	}
}

###########################################################    
## 27�� ##

==============================
# awt
import java.awt.*;

class JavaTest {
	public static void main(String[] args) {
		Frame f = new Frame("AWT Application");
		f.setSize(300,200);
		f.setVisible(true);
	}
}


==============================
# awtclose
import java.awt.*;
import java.awt.event.*;

class JavaTest {
	public static void main(String[] args) {
		Frame f = new Frame("AWT Application");
		f.setSize(300,200);
		f.setVisible(true);
		f.addWindowListener(new WinEventListener());
	}
}

class WinEventListener implements WindowListener {
	public void windowClosing(WindowEvent e) {
		e.getWindow().setVisible(false);
		e.getWindow().dispose();
		System.exit(0);
	}
	public void windowActivated(WindowEvent e) {}
	public void windowClosed(WindowEvent e) {}
	public void windowDeactivated(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
	public void windowOpened(WindowEvent e) {}
}


==============================
# swing
import java.awt.*;
import javax.swing.*;

class JavaTest {
	public static void main(String[] args) {
		JFrame frame = new JFrame("First Swing Application");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(300,200));
		frame.setLocation(500, 500);
		frame.pack();
		frame.setVisible(true);
	}
}


==============================
# label
import java.awt.*;
import javax.swing.*;

class JavaTest {
	public static void main(String[] args) {
		JFrame frame = new JFrame("First Swing Application");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(300,200));
		frame.setLocation(500, 500);

		JLabel label = new JLabel("Swing", SwingConstants.CENTER);
		Container cp = frame.getContentPane();
		cp.add(label);

		frame.pack();
		frame.setVisible(true);
	}
}


==============================
# border
import java.awt.*;
import javax.swing.*;

class JavaTest {
	public static void main(String[] args) {
		JFrame frame = new JFrame("First Swing Application");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(400,300));
		frame.setLocation(500, 500);

		JButton btn1 = new JButton("one");
		JButton btn2 = new JButton("two");
		JButton btn3 = new JButton("three");
		JButton btn4 = new JButton("four");
		JButton btn5 = new JButton("five");
		
		Container cp = frame.getContentPane();
		cp.add(btn1, BorderLayout.CENTER);
		cp.add(btn2, BorderLayout.EAST);
		cp.add(btn3, BorderLayout.WEST);
		cp.add(btn4, BorderLayout.SOUTH);
		cp.add(btn5, BorderLayout.NORTH);

		frame.pack();
		frame.setVisible(true);
	}
}


==============================
# flow
import java.awt.*;
import javax.swing.*;

class JavaTest {
	public static void main(String[] args) {
		JFrame frame = new JFrame("First Swing Application");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(400,300));
		frame.setLocation(500, 500);

		JButton btn1 = new JButton("one");
		JButton btn2 = new JButton("two");
		JButton btn3 = new JButton("three");
		JButton btn4 = new JButton("four");
		JButton btn5 = new JButton("five");
		
		Container cp = frame.getContentPane();
		FlowLayout layout= new FlowLayout();
		cp.setLayout(layout);
		
		cp.add(btn1);
		cp.add(btn2);
		cp.add(btn3);
		cp.add(btn4);
		cp.add(btn5);

		frame.pack();
		frame.setVisible(true);
	}
}


==============================
# grid
import java.awt.*;
import javax.swing.*;

class JavaTest {
	public static void main(String[] args) {
		JFrame frame = new JFrame("First Swing Application");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(400,300));
		frame.setLocation(500, 500);

		JButton btn1 = new JButton("one");
		JButton btn2 = new JButton("two");
		JButton btn3 = new JButton("three");
		JButton btn4 = new JButton("four");
		JButton btn5 = new JButton("five");
		
		Container cp = frame.getContentPane();
		GridLayout layout = new GridLayout(3,2);
		cp.setLayout(layout);
		
		cp.add(btn1);
		cp.add(btn2);
		cp.add(btn3);
		cp.add(btn4);
		cp.add(btn5);

		frame.pack();
		frame.setVisible(true);
	}
}


==============================
# card
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JavaTest {
	public static void main(String[] args) {
		JFrame frame = new JFrame("First Swing Application");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(400,300));
		frame.setLocation(500, 500);

		JButton btn1 = new JButton("one");
		JButton btn2 = new JButton("two");
		JButton btn3 = new JButton("three");
		
		Container cp = frame.getContentPane();
		CardLayout layout = new CardLayout();
		cp.setLayout(layout);
		
		cp.add(btn1, "first");
		cp.add(btn2, "second");
		cp.add(btn3, "third");

		ActionListener listener = new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				layout.next(cp);
			}
		};
		btn1.addActionListener(listener);
		btn2.addActionListener(listener);
		btn3.addActionListener(listener);
		
		frame.pack();
		frame.setVisible(true);
	}
}


==============================
# box
import java.awt.*;
import javax.swing.*;

class JavaTest {
	public static void main(String[] args) {
		JFrame frame = new JFrame("First Swing Application");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(400,300));
		frame.setLocation(500, 500);

		JButton btn1 = new JButton("one");
		JButton btn2 = new JButton("two");
		JButton btn3 = new JButton("three");
		JButton btn4 = new JButton("four");
		JButton btn5 = new JButton("five");
		
		Container cp = frame.getContentPane();
		BoxLayout layout = new BoxLayout(cp, BoxLayout.X_AXIS);
		cp.setLayout(layout);
		
		cp.add(btn1);
		cp.add(btn2);
		cp.add(btn3);
		cp.add(btn4);
		cp.add(btn5);

		frame.pack();
		frame.setVisible(true);
	}
}


==============================
# nulllayout
import java.awt.*;
import javax.swing.*;

class JavaTest {
	public static void main(String[] args) {
		JFrame frame = new JFrame("First Swing Application");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(400,300));
		frame.setLocation(500, 500);

		JButton btn1 = new JButton("one");
		JButton btn2 = new JButton("two");
		
		frame.setLayout(null);
		
		frame.add(btn1);
		frame.add(btn2);
		
		btn1.setLocation(10, 10);
		btn1.setSize(100, 50);
		btn2.setLocation(200, 100);
		btn2.setSize(150, 80);

		frame.pack();
		frame.setVisible(true);
	}
}


==============================
# nestlayout
import java.awt.*;
import javax.swing.*;

class JavaTest {
	public static void main(String[] args) {
		JFrame frame = new JFrame("First Swing Application");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(400,300));
		frame.setLocation(500, 500);

		// ��ü ���̾ƿ��� ���� �ڽ�
		Container cp = frame.getContentPane();
		BoxLayout layout = new BoxLayout(cp, BoxLayout.Y_AXIS);
		cp.setLayout(layout);

		// ���� ���̺� ��ġ
		JLabel label = new JLabel("label");
		cp.add(label);
		
		// �гο� �÷ο� ���̾ƿ� ����
		JPanel panel = new JPanel();
		FlowLayout flow = new FlowLayout();
		panel.setLayout(flow);

		// �� ���� ��ư �߰�
		JButton btn1 = new JButton("btn1");
		JButton btn2 = new JButton("btn2");
		panel.add(btn1);
		panel.add(btn2);
		
		// �г��� ��ü ���̾ƿ��� �߰�
		cp.add(panel);

		frame.pack();
		frame.setVisible(true);
	}
}

==============================
# click
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JavaTest {
	public static void main(String[] args) {
		JFrame frame = new JFrame("First Swing Application");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(300,200));
		frame.setLocation(500, 500);

		JButton button = new JButton("Click");
		// �� ������ ��ü ����
		ActionListenerImpl listener = new ActionListenerImpl();
		// �� ������ ����
		button.addActionListener(listener);
		
		Container cp = frame.getContentPane();
		cp.add(button);
		frame.pack();
		frame.setVisible(true);
	}
}

// �� ������ Ŭ���� ����
class ActionListenerImpl implements ActionListener {
	public void actionPerformed(ActionEvent event) {
		JOptionPane.showMessageDialog(null, "��ư�� Ŭ���Ͽ����ϴ�.");
	}
}


==============================
# click2
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JavaTest {
	public static void main(String[] args) {
		JFrame frame = new JFrame("First Swing Application");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(300,200));
		frame.setLocation(500, 500);

		JButton button = new JButton("Click");
		ActionListener listener = new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				JOptionPane.showMessageDialog(null, "��ư�� Ŭ���Ͽ����ϴ�.");
			}
		};
		button.addActionListener(listener);
		
		Container cp = frame.getContentPane();
		cp.add(button);
		frame.pack();
		frame.setVisible(true);
	}
}


==============================
# click3
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JavaTest {
	public static void main(String[] args) {
		JFrame frame = new JFrame("First Swing Application");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(300,200));
		frame.setLocation(500, 500);

		JButton button = new JButton("Click");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				JOptionPane.showMessageDialog(null, "��ư�� Ŭ���Ͽ����ϴ�.");
			}
		});
		
		Container cp = frame.getContentPane();
		cp.add(button);
		frame.pack();
		frame.setVisible(true);
	}
}


==============================
# appleorange
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JavaTest {
	public static void main(String[] args) {
		JFrame frame = new JFrame("First Swing Application");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(300,200));
		frame.setLocation(500, 500);

		Container cp = frame.getContentPane();
		BoxLayout layout = new BoxLayout(cp, BoxLayout.Y_AXIS);
		cp.setLayout(layout);

		JLabel fruit = new JLabel("Fruit");
		cp.add(fruit);
		
		JPanel panel = new JPanel();
		FlowLayout flow = new FlowLayout();
		panel.setLayout(flow);

		JButton btnApple = new JButton("Apple");
		btnApple.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				fruit.setText("Apple");
			}
		});
		panel.add(btnApple);

		JButton btnOrange = new JButton("Orange");
		btnOrange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				fruit.setText("Orange");
			}
		});
		panel.add(btnOrange);
		
		cp.add(panel);
		frame.pack();
		frame.setVisible(true);
	}
}


==============================
# mouse
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JavaTest {
	public static void main(String[] args) {
		JFrame frame = new JFrame("First Swing Application");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(300,200));
		frame.setLocation(500, 500);

		JLabel label = new JLabel("Position", SwingConstants.CENTER);
		Container cp = frame.getContentPane();
		cp.add(label);
		
		label.addMouseMotionListener(new MouseMotionListener() {
			public void mouseDragged(MouseEvent event) { }
			public void mouseMoved(MouseEvent event) {
				label.setText("X : " + event.getX() + " ,Y : " + event.getY());
				
			}
		});

		frame.pack();
		frame.setVisible(true);
	}
}


==============================
# drawgraphic
import java.awt.*;
import javax.swing.*;

class JavaTest {
	public static void main(String[] args) {
		JFrame frame = new JFrame("First Swing Application");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(400,300));
		frame.setLocation(500, 500);

		Container cp = frame.getContentPane();
		DrawPanel surface = new DrawPanel();
		cp.add(surface);
		frame.pack();
		frame.setVisible(true);
	}
}

class DrawPanel extends JPanel {
	public void paint(Graphics g) {
		g.drawLine(10, 10, 100, 100);
		g.drawOval(100, 10, 100, 100);
		g.drawRect(10, 120, 200, 50);
		g.setColor(Color.blue);
		g.fillOval(250, 10, 100, 100);
		g.setColor(Color.red);
		g.fillRect(250, 120, 100, 50);
	}
}


==============================
# freeline
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

class JavaTest {
	static ArrayList<Vertex> arPt = new ArrayList<Vertex>();
	static boolean down = false;
	public static void main(String[] args) {
		JFrame frame = new JFrame("First Swing Application");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(400,300));
		frame.setLocation(500, 500);

		Container cp = frame.getContentPane();
		DrawPanel surface = new DrawPanel(arPt);
		cp.add(surface);
		
		surface.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent event) {
				if (event.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK) {
					arPt.add(new Vertex(event.getX(), event.getY(), false));
					System.out.println(event.getX() + "," + event.getY() + " : no draw");
				}
			}
		});
		
		surface.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent event) {
				if (event.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK) {
					arPt.add(new Vertex(event.getX(), event.getY(), true));
					System.out.println(event.getX() + "," + event.getY() + " : draw");
				}
				surface.repaint();
			}
		});
		
		frame.pack();
		frame.setVisible(true);
	}
}

class Vertex {
	int x;
	int y;
	boolean draw;
	
	Vertex(int x, int y, boolean draw) {
		this.x = x;
		this.y = y;
		this.draw = draw;
	}
}

class DrawPanel extends JPanel {
	ArrayList<Vertex> arPt;
	DrawPanel(ArrayList<Vertex> arPt) {
		this.arPt = arPt;
	}
	public void paint(Graphics g) {
		g.setColor(Color.blue);
		for (int i = 0 ; i < arPt.size() - 1; i++) {
			if (arPt.get(i + 1).draw) {
				g.drawLine(arPt.get(i).x, arPt.get(i).y, arPt.get(i + 1).x, arPt.get(i + 1).y);
			}
		}
	}
}


###########################################################    
## ������ ##

==============================
# shortcircuit
class JavaTest {
	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		
		if (a == 5 && ++b == 5) {
			System.out.println("����");
		}
		System.out.println("b = " + b);
	}
}


==============================
# bitop
class JavaTest {
	public static void main(String[] args) {
		int a = 0x34;
		int b = 0x96;
		int c = a & b;
		int d = a | b;
		System.out.printf("c = %x\n", c);
		System.out.printf("d = %x\n", d);
	}
}


==============================
# bitshift
class JavaTest {
	public static void main(String[] args) {
		int c = 0x887944;
		System.out.printf("R = %x\n", (c & 0xff0000) >> 16);
		System.out.printf("G = %x\n", (c & 0x00ff00) >> 8);
		System.out.printf("B = %x\n", c & 0x0000ff);
	}
}


==============================
# refvalue
class JavaTest {
	public static void main(String[] args) {
		int[] num = { 1, 2 };
		test(num);
		System.out.println("num[0] = " + num[0]);
	}
	
	static void test(int[] ar) {
		ar[0] = 100;
		ar = new int[] { 3, 4 };
	}
}


==============================
# recursive
class JavaTest {
	public static void main(String[] args) {
		System.out.println("5 ���丮�� = " + factorial(5));
	}
	
	static int factorial(int n) {
		if (n <= 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}
}


==============================
# arrayarg
class JavaTest {
	public static void main(String[] args) {
		int[] md = new int[2];
		getMonthDate(md);
		System.out.println("������ " + md[0] + 
				"�� " + md[1] + "���Դϴ�.");
	}
	
	static void getMonthDate(int[] md) {
		java.time.LocalDate today = java.time.LocalDate.now();
		md[0] = today.getMonthValue();
		md[1] = today.getDayOfMonth();
	}
}


==============================
# objectarg
class JavaTest {
	public static void main(String[] args) {
		MonthDay md = new MonthDay();
		getMonthDate(md);
		System.out.println("������ " + md.month + 
				"�� " + md.day + "���Դϴ�.");
	}
	
	static void getMonthDate(MonthDay md) {
		java.time.LocalDate today = java.time.LocalDate.now();
		md.month = today.getMonthValue();
		md.day = today.getDayOfMonth();
	}
}

class MonthDay {
	int month;
	int day;
}


==============================
# defsuper
class Human {
	int age;
	String name;
	
	Human() {
		age = 19;
		name = "�̸�����";
	}

	Human(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	void intro() {
		System.out.println("�ȳ�, " + age + "�� " + name + "�̶�� ��.");
	}
}

class Student extends Human {
	int stnum;
	String major;
	
	Student(int stnum, String major) {
		this.stnum = stnum;
		this.major = major;
	}
	
	void study() {
		System.out.println("�ϴ�õ ���� ������ ����Ȳ");
	}
}

class JavaTest {
	public static void main(String[] args) {
		Student kim = new Student(8906299, "����");
		kim.intro();
	}
}


==============================
# overridefield
class Human {
	int number;
	
	Human(int number) {
		this.number = number;
	}
	
	void intro() {
		System.out.println("�ֹ� ��� ��ȣ : " + number);
	}
}

class Student extends Human {
	int number;
	
	Student(int junum, int stnum) {
		super(junum);
		this.number = stnum;
	}
	
	void intro() {
		System.out.println("�ֹ� ��� ��ȣ : " + super.number + ", �й� : " + number);
	}
}

class JavaTest {
	public static void main(String[] args) {
		Human kim = new Human(890102);
		kim.intro();
		Student lee = new Student(901231, 1206299);
		lee.intro();
	}
}


==============================
# unsigned
class JavaTest {
	public static void main(String[] args) {
		int i = Integer.parseUnsignedInt("4000000000");
		int j = Integer.parseUnsignedInt("4000000000");
		int k = i + j;
		System.out.println(k);
		System.out.println(Integer.toUnsignedString(k));
	}
}


==============================
# unsignedop
class JavaTest {
	public static void main(String[] args) {
		int i = Integer.parseUnsignedInt("3000000000");
		int j = Integer.parseUnsignedInt("3200000000");
		int k = Integer.remainderUnsigned(j, i);
		System.out.println(Integer.toUnsignedString(k));
	}
}


==============================
# environ
class JavaTest {
	public static void main(String[] args) {
		String os = System.getenv("os");
		System.out.println(os);
		String path = System.getenv("path");
		System.out.println(path);
	}
}


==============================
# property
import java.util.Properties;

class JavaTest {
	public static void main(String[] args) {
		Properties prop = System.getProperties();
		prop.list(System.out);
	}
}


==============================
# tokenizer
import java.util.*;

class JavaTest {
	public static void main(String[] args) {
		String city = "����,����,�뱸,�λ�";
		StringTokenizer token = new StringTokenizer(city, ",");
		
		while(token.hasMoreTokens()) {
			System.out.println(token.nextToken());
		}
	}
}


==============================
# biginteger
import java.math.*;

class JavaTest {
	public static void main(String[] args) {
		BigInteger a = new BigInteger("123456789098765432101234567890");
		System.out.println(a);
		
		BigInteger b = new BigInteger("111111111111111111111111111111");
		BigInteger c = a.add(b);
		System.out.println(c);
	}
}


==============================
# bigdecimal
class JavaTest {
	public static void main(String[] args) {
		double a = 0.3;
		double b = 0.6;
		
		double c = a + b;
		System.out.println(c);
	}
}


==============================
# bigdecimal2
import java.math.*;

class JavaTest {
	public static void main(String[] args) {
		BigDecimal a = new BigDecimal("0.3");
		BigDecimal b = new BigDecimal("0.6");
		
		BigDecimal c = a.add(b);
		System.out.println(c);
	}
}


==============================
# overflow
class JavaTest {
	public static void main(String[] args) {
		int i = 1500000000;
		int j = 1500000000;
		int k = i + j;
		System.out.println(k);
	}
}


==============================
# arexception
class JavaTest {
	public static void main(String[] args) {
		int i = 1500000000;
		int j = 1500000000;
		try {
			int k = Math.addExact(i, j);
			System.out.println(k);
		}
		catch (ArithmeticException e) {
			System.out.println("��� ���� ���� �߻�");
		}
	}
}

