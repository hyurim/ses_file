# 자바 정복 예제 모음
# 작성 일자 : 2021년 12월 25일

###########################################################    
## 2장 ##

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

실행결과
One
Two
ThreeFour

==============================
# print2
class JavaTest {
	public static void main(String[] args) {
		int i = 123;
		double d = 3.14;
		String str = "문자열";
		System.out.println("i = " + i + ", d = " + d + ", str = " + str);
	}
}

실행결과
i = 123, d = 3.14, str = 문자열

==============================
# scanner
class JavaTest {
	public static void main(String[] args) {
		java.util.Scanner scaner = new java.util.Scanner(System.in);

		System.out.print("이름을 입력하시오 : ");
		String name = scaner.nextLine();
		System.out.println("안녕하세요 " + name + "님.");
		
		System.out.print("나이를 입력하시오 : ");
		int age = scaner.nextInt();
		System.out.println("당신은 " + age + "살입니다.");
		
		scaner.close();
	}
}

==============================
# dialog
class JavaTest {
	public static void main(String[] args) {
		String name = javax.swing.JOptionPane.showInputDialog("이름을 입력하시오");
		System.out.println("안녕하세요 " + name + "님.");
		
		String agestr = javax.swing.JOptionPane.showInputDialog("나이를 입력하시오");
		int age = Integer.parseInt(agestr);
		System.out.println("당신은 " + age + "살입니다.");
	}
}

###########################################################    
## 3장 ##

==============================
# int
class JavaTest {
	public static void main(String[] args) {
		int value = 1234;
		System.out.println(value);
	}
}

실행결과
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

실행결과
1234
5678

==============================
# constant
class JavaTest {
	public static void main(String[] args) {
		final double RATE = 3.28;
		System.out.println("이자율 : " + RATE + "%");
		int deposit = 10000;
		System.out.println("1년 후 이자 : " + 
				deposit * RATE / 100 + "원");
	}
}

실행결과
이자율 : 3.28%
1년 후 이자 : 328.0원

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

실행결과
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

실행결과
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

실행결과
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

실행결과
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

실행결과
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

실행결과
99.99905

==============================
# char
class JavaTest {
	public static void main(String[] args) {
		char ch = '한';
		System.out.println(ch);
		int i = ch;
		System.out.println(i);
	}
}

실행결과
한
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

실행결과
?ω
'

==============================
# string
class JavaTest {
	public static void main(String[] args) {
		String str = "대한민국";
		System.out.println(str);
	}
}

실행결과
대한민국

==============================
# longstring
class JavaTest {
	public static void main(String[] args) {
		String str = "아름다운 이땅에 금수강산에 " +
			"단군 할아버지가 \"터\" 잡으시고\n" + 
			"弘益人間 뜻으로 나라 세우니 " + 
			"대대손손 훌륭한 인물도 많아.";
		System.out.print(str);
	}
}

실행결과	
아름다운 이땅에 금수강산에 단군 할아버지가 "터" 잡으시고
弘益人間 뜻으로 나라 세우니 대대손손 훌륭한 인물도 많아.

==============================
# textblock
public class JavaTest {
	public static void main(String[] args) {
		String str = """		
			아름다운 이땅에 금수강산에
			단군 할아버지가 "터" 잡으시고 
			'弘益人間' 뜻으로 나라 세우니
			대대손손 훌륭한 인물도 많아.
			""";
		System.out.println(str);
	}
}

실행결과	
아름다운 이땅에 금수강산에
단군 할아버지가 "터" 잡으시고
'弘益人間' 뜻으로 나라 세우니
대대손손 훌륭한 인물도 많아.

==============================
# textblockescape
public class JavaTest {
	public static void main(String[] args) {
		String human = """
			이름 : 김상형    \s        
			나이 : 39        \s                
			직업 : 프로그래머\s
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
				    <p>문단</p>
				</body>
				""";
		System.out.println(str);
	}
}


실행결과	
HTML example
<body>
    <p>문단</p>
</body>

==============================
# textblockliteral2
public class JavaTest {
	public static void main(String[] args) {
		String name = "김상형";
		String str = """
				안녕하세요.
				제 이름은\s""" + name + """
				입니다.
				잘 부탁 드립니다.
				""";  
		System.out.println(str);
	}
}

실행결과	
안녕하세요.
제 이름은 김상형입니다.
잘 부탁 드립니다.

==============================
# boolean
class JavaTest {
	public static void main(String[] args) {
		int a = 3;
		boolean b = (a == 3);
		if (b) {
			System.out.println("a가 3이다.");
		}
	}
}

실행결과
a가 3이다.

###########################################################    
## 4장 ##

==============================
# if
class JavaTest {
	public static void main(String[] args) {
		int age = 21;
		
		if (age >= 19)
			System.out.println("성인입니다.");
	}
}

실행결과
성인입니다.

==============================
# ifdialog
class JavaTest {
	public static void main(String[] args) {
		int age = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("너 몇살이니?"));
		
		if (age >= 19)
			System.out.println("성인입니다.");
	}
}


==============================
# ifblock
class JavaTest {
	public static void main(String[] args) {
		int age = 21;
		
		if (age >= 19) {
			System.out.println("성인입니다.");
			System.out.println("술집 입장.");
		}
	}
}

실행결과
성인입니다.
술집 입장.

==============================
# ifblock2
class JavaTest {
	public static void main(String[] args) {
		int age = 15;
		
		if (age >= 19)
			System.out.println("성인입니다.");
			System.out.println("술집 입장.");
	}
}

실행결과
술집 입장.

==============================
# ifelse
class JavaTest {
	public static void main(String[] args) {
		int age = 15;
		
		if (age >= 19) {
			System.out.println("성인입니다.");
		} else {
			System.out.println("어린애입니다.");
		}
	}
}

실행결과
어린애입니다.

==============================
# ifelseblock
class JavaTest {
	public static void main(String[] args) {
		int age = 15;
		
		if (age >= 19) {
			System.out.println("성인입니다.");
			System.out.println("디스코텍 입장.");
		} else {
			System.out.println("어린애입니다.");
			System.out.println("애들은 가라!");
		}
	}
}

실행결과
어린애입니다.
애들은 가라!

==============================
# ifelseif
class JavaTest {
	public static void main(String[] args) {
		int age = 16;
		
		if (age >= 19) {
			System.out.println("성인입니다.");
		} else if (age > 12) {
			System.out.println("청소년입니다.");
		} else {
			System.out.println("어린애입니다.");
		}
	}
}

실행결과
청소년입니다.

==============================
# ifif
class JavaTest {
	public static void main(String[] args) {
		int age = 25;
		boolean man = true;
		
		if (age >= 19) {
			if (man) {
				System.out.println("성인 남성 : 25000원");
			} else {
				System.out.println("성인 여성 : 21000원");
			}
		} else { 
			System.out.println("청소년 : 15000원");
		}
	}
}

실행결과
성인 남성 : 25000원

==============================
# switch
class JavaTest {
	public static void main(String[] args) {
		int ranking = 2;
		
		if (ranking == 1) {
			System.out.println("축하합니다. 금메달이에요.");
		} else if (ranking == 2) {
			System.out.println("은메달을 수여합니다.");
		} else if (ranking == 3) {
			System.out.println("동메달입니다.");
		} else {
			System.out.println("참가상을 드립니다.");
		}
	}
}

실행결과
은메달을 수여합니다.

==============================
# switch2
class JavaTest {
	public static void main(String[] args) {
		int ranking = 2;
		
		switch (ranking) {
		case 1:
			System.out.println("축하합니다. 금메달이에요.");
			break;
		case 2:
			System.out.println("은메달을 수여합니다.");
			break;
		case 3:
			System.out.println("동메달입니다.");
			break;
		default:
			System.out.println("참가상을 드립니다.");
			break;
		}
	}
}

실행결과
은메달을 수여합니다.

==============================
# nobreak
class JavaTest {
	public static void main(String[] args) {
		int ranking = 3;
		
		switch (ranking) {
		case 1:
			System.out.println("대상입니다.");
			break;
		case 2:
		case 3:
			System.out.println("우수상입니다.");
			break;
		case 4:
		case 5:
			System.out.println("장려상입니다.");
			break;
		}
	}
}

실행결과
우수상입니다.

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
		
		System.out.println(month + "월은 " + days + "일까지 있습니다.");
	}
}

실행결과	
5월은 31일까지 있습니다.


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

실행결과
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

실행결과
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

실행결과
B

==============================
# rangeif
class JavaTest {
	public static void main(String[] args) {
		double richter = 6.5;
		
		if (richter < 3.5) {
			System.out.println("느낄 수 없거나 피해가 거의 없음");
		} else if (richter < 4.8) {
			System.out.println("물건이 흔들리거나 경미한 피해를 입힌다.");
		} else if (richter < 6.1) {
			System.out.println("좁은 지역에 부실한 건물에만 피해를 입힌다.");
		} else if (richter < 7.5) {
			System.out.println("반경 160Km 영역의 건물을 파괴한다.");
		} else if (richter < 8.9) {
			System.out.println("넓은 지역에 심각한 피해를 입힌다.");
		} else {
			System.out.println("수천 Km 영역을 초토화시킨다.");
		}
	}
}

실행결과	
반경 160Km 영역의 건물을 파괴한다.

==============================
# switchexp
public class JavaTest {
	public static void main(String[] args) {
		int ranking = 2;
		String medal = 
				switch (ranking) {
				case 1 -> "금메달";
				case 2 -> "은메달";
				case 3 -> "동메달";
				default -> "참가상";
				};
		System.out.println(medal + "을 수여합니다.");
	}
}

실행결과	
은메달을 수여합니다.

==============================
# switchcommand
public class JavaTest {
	public static void main(String[] args) {
		int ranking = 1;
		switch (ranking) {
		case 1 -> System.out.println("축하합니다. 금메달이에요.");
		case 2 -> System.out.println("은메달을 수여합니다.");
		case 3 -> System.out.println("동메달입니다.");
		default -> System.out.println("참가상을 드립니다.");
		};
	}
}

실행결과	
축하합니다. 금메달이에요.

==============================
# yield
public class JavaTest {
	public static void main(String[] args) {
		int ranking = 1;
		String medal = 
				switch (ranking) {
				case 1 -> {
					System.out.println("축하합니다. ");
					yield "금메달";
				}
				case 2 -> "은메달";
				case 3 -> "동메달";
				default -> "참가상";
				};
		System.out.println(medal + "을 수여합니다.");
	}
}

실행결과	
축하합니다. 
금메달을 수여합니다.


###########################################################    
## 5장 ##


==============================
# repeat
class JavaTest {
	public static void main(String[] args) {
		System.out.println("1번 학생 성적 처리");
		System.out.println("2번 학생 성적 처리");
		System.out.println("3번 학생 성적 처리");
		System.out.println("4번 학생 성적 처리");
		System.out.println("5번 학생 성적 처리");
	}
}

실행결과
1번 학생 성적 처리
2번 학생 성적 처리
3번 학생 성적 처리
4번 학생 성적 처리
5번 학생 성적 처리


==============================
# for
class JavaTest {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + "번 학생 성적 처리");
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
		System.out.println("합계 = " + sum);
	}
}

실행결과
합계 = 5050

==============================
# oddsum
class JavaTest {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i = i + 2){
			sum = sum + i;
		}
		System.out.println("합계 = " + sum);
	}
}

실행결과
합계 = 2500

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

실행결과
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

실행결과
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
			System.out.println(i + "번 학생 성적 처리");
		}
		for (int i = 1; i <= 3; i++) {
			System.out.println(i + "번 과목의 성적 처리");
		}
	}
}

실행결과
1번 학생 성적 처리
2번 학생 성적 처리
3번 학생 성적 처리
4번 학생 성적 처리
5번 학생 성적 처리
1번 과목의 성적 처리
2번 과목의 성적 처리
3번 과목의 성적 처리

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
		
		System.out.println("합계가 100이 넘는 시점은 " + i + "입니다.");
	}
}

실행결과	
합계가 100이 넘는 시점은 14입니다.


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
			System.out.print("몇 학년입니까?(1~6) : ");
			grade = scanner.nextInt();
			if (grade >= 1 && grade <= 6) break;
			System.out.println("다시 입력하시오.");
		}
		System.out.println(grade + "학년입니다.");
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
			System.out.print("숫자를 맛춰 보세요(1~10) : ");
			int input = scanner.nextInt();
			if (input == num) {
				System.out.println("정답입니다.");
				break;
			} else if (input > num) {
				System.out.println(input + "보다 더 작은 숫자입니다.");
			} else {
				System.out.println(input + "보다 더 큰 숫자입니다.");
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

실행결과
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

실행결과
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
					"(" + end + "회)");
		}
	}
}

실행결과	
pie = 2.9760461760461765(10회)
pie = 3.121594652591011(100회)
pie = 3.139592655589785(1000회)
pie = 3.141392653591791(10000회)
pie = 3.1415726535897814(100000회)
pie = 3.141590653589692(1000000회)
pie = 3.1415924535897797(10000000회)


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

실행결과
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
					"(" + end + "회)");
		}
	}
}

실행결과	
pie = 3.0395075895610533(10회)
pie = 3.1319807472443624(100회)
pie = 3.14063710098594(1000회)
pie = 3.1414971543976273(10000회)
pie = 3.141583104230963(100000회)
pie = 3.141591698659554(1000000회)
pie = 3.141592558095893(10000000회)

==============================
# while
class JavaTest {
	public static void main(String[] args) {
		int filesize = 720;
		int download = 0;
		
		while (download < filesize) {
			download += 120;
			System.out.println(download + "K 다운로드중....");
		}
		System.out.println("다운로드 완료");
	}
}

실행결과
120K 다운로드중....
240K 다운로드중....
360K 다운로드중....
480K 다운로드중....
600K 다운로드중....
720K 다운로드중....
다운로드 완료

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

실행결과
5050

==============================
# fordown
class JavaTest {
	public static void main(String[] args) {
		int filesize = 720;
		
		for (int download = 0;download < filesize;) {
			download += 120;
			System.out.println(download + "K 다운로드중....");
		}
		System.out.println("다운로드 완료");
	}
}

실행결과
120K 다운로드중....
240K 다운로드중....
360K 다운로드중....
480K 다운로드중....
600K 다운로드중....
720K 다운로드중....
다운로드 완료

==============================
# dowhile
class JavaTest {
	public static void main(String[] args) {
		java.util.Scanner scaner = new java.util.Scanner(System.in);
		int num;
		int sum = 0;
		do {
			System.out.print("숫자를 입력하세요(끝낼 때 0) : ");
			num = scaner.nextInt();
			sum = sum + num;
		} while (num != 0);
		System.out.println("총 합계 = " + sum);
		scaner.close();
	}
}

실행결과	
숫자를 입력하세요(끝낼 때 0) : 3
숫자를 입력하세요(끝낼 때 0) : 5
숫자를 입력하세요(끝낼 때 0) : 4
숫자를 입력하세요(끝낼 때 0) : 0
총 합계 = 12


==============================
# break
class JavaTest {
	public static void main(String[] args) {
		int[] score = { 88, 94, 72, -8, 23 };
		for (int i = 0; i < 5; i++){
			if (score[i] < 0 || score[i] > 100) break;
			System.out.println((i + 1) + "번 학생의 성적 : " + score[i]);
		}
	}
}

실행결과
1번 학생의 성적 : 88
2번 학생의 성적 : 94
3번 학생의 성적 : 72

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

실행결과
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

실행결과
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
			System.out.println((i + 1) + "번 학생의 성적 : " + score[i]);
		}
	}
}

실행결과
1번 학생의 성적 : 88
2번 학생의 성적 : 94
4번 학생의 성적 : 79
5번 학생의 성적 : 23

###########################################################    
## 6장 ##

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

실행결과
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

실행결과
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

실행결과
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

실행결과
value = 3, a = 3
value = 3, a = 2

==============================
# stringcat
class JavaTest {
	public static void main(String[] args) {
		System.out.println(4 + 5);
		System.out.println("영구와 " + "땡칠이");
		System.out.println("응답하라 " + 1989);
		System.out.println(1989 + " 응답하라");
		
		double root2 = 1.414;
		System.out.println("2의 제곱근 : " + root2);
	}
}

실행결과
9
영구와 땡칠이
응답하라 1989
1989 응답하라
2의 제곱근 : 1.414

==============================
# stringcat2
class JavaTest {
	public static void main(String[] args) {
		System.out.println("응답하라 " + 19 + 89);
		System.out.println(19 + 89 + " 응답하라");
		System.out.println("" + 19 + 89 + " 응답하라");
	}
}

실행결과
응답하라 1989
108 응답하라
1989 응답하라

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

실행결과
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

실행결과
8

==============================
# and
class JavaTest {
	public static void main(String[] args) {
		int value = 7;
		
		if (value > 5 && value < 10) {
			System.out.println("범위 안에 있음");
		} else {
			System.out.println("범위 안에 없음");
		}
	}
}

실행결과
범위 안에 있음

==============================
# getabs
class JavaTest {
	public static void main(String[] args) {
		int value = -5;

		System.out.println("절대값 = " + (value > 0 ? value:-value));
	}
}

실행결과
절대값 = 5

==============================
# testeven
class JavaTest {
	public static void main(String[] args) {
		int value = 3;

		System.out.println("value는 " + (value % 2 == 0 ? "짝":"홀") + 
			"수입니다.");
	}
}

실행결과
value는 홀수입니다.

==============================
# stringint
class JavaTest {
	public static void main(String[] args) {
		String num = "123";
		int value = Integer.parseInt(num);
		value++;
		System.out.println("정수 = " + value);
		
		String str = String.valueOf(value);
		System.out.println("문자열 = " + str);
		
	}
}

실행결과
정수 = 124
문자열 = 124

==============================
# andor
class JavaTest {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		
		if (a == 1 || b == 2 && c == 10 || d == 10) {
			System.out.println("진실");
		} else {
			System.out.println("거짓");
		}
	}
}

실행결과
진실

==============================
# contassign
class JavaTest {
	public static void main(String[] args) {
		int a, b, c, d;
		a = b = c = d = 5;
		System.out.println(c);
	}
}

실행결과
5

###########################################################    
## 7장 ##

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
			System.out.println((i + 1) + "번 학생의 성적 : " + score[i]);
		}
	}
}

실행결과
1번 학생의 성적 : 88
2번 학생의 성적 : 99
3번 학생의 성적 : 70
4번 학생의 성적 : 55
5번 학생의 성적 : 100

==============================
# initarray
class JavaTest {
	public static void main(String[] args) {
		int[] score = new int[] { 88, 99, 70, 55, 100 };
		
		for (int i = 0; i < score.length; i++) {
			System.out.println((i + 1) + "번 학생의 성적 : " + score[i]);
		}
	}
}

실행결과
1번 학생의 성적 : 88
2번 학생의 성적 : 99
3번 학생의 성적 : 70
4번 학생의 성적 : 55
5번 학생의 성적 : 100

==============================
# newarray
class JavaTest {
	public static void main(String[] args) {
		// 간편한 초기화
		int[] score = { 88, 99, 70, 55, 100 };
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + ", ");
		}
		System.out.println();

		// 재초기화
		score = new int[] {1, 2, 3, 4, 5, 6, 7, 8 };
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + ", ");
		}
	}
}

실행결과
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
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + (float)sum / score.length);
	}
}

실행결과
총점 : 352
평균 : 70.4

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
			System.out.print((student + 1) + "번 학생의 성적 : ");
			for (int subject = 0;subject < score[0].length;subject++) {
				System.out.print(score[student][subject] + " ");
			}
			System.out.println("");
		}
	}
}

실행결과	
1번 학생의 성적 : 77 56 70 82 
2번 학생의 성적 : 99 96 89 88 
3번 학생의 성적 : 81 69 62 80


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
			System.out.println((student + 1) + "번 => 총점 : " + 
					sum + ", " + "평균 : " + (float)sum/score[0].length);
			classsum += sum;
		}
		System.out.print("학급 전체 평균 : " +
				(float)classsum/(score.length * score[0].length));
	}
}

실행결과	
1번 => 총점 : 285, 평균 : 71.25
2번 => 총점 : 372, 평균 : 93.0
3번 => 총점 : 292, 평균 : 73.0
학급 전체 평균 : 79.083336


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
			System.out.print((student + 1) + "번 학생의 성적 : ");
			for (int subject = 0;subject < score[student].length;subject++) {
				System.out.print(score[student][subject] + " ");
			}
			System.out.println("");
		}
	}
}

실행결과	
1번 학생의 성적 : 77 56 70 82 95 96 98 82 
2번 학생의 성적 : 99 96 
3번 학생의 성적 : 81 69 62 80 77


==============================
# foreach
class JavaTest {
	public static void main(String[] args) {
		int[] score = { 88, 94, 72, 75, 23 };
		int sum = 0;
		for (int s : score) {
			sum += s;
		}
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + (float)sum/score.length);
	}
}

실행결과
총점 : 352
평균 : 70.4

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

실행결과
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

실행결과
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

실행결과
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

실행결과
ar[0] = 1000
ar2[0] = 1000

==============================
# compareref
class JavaTest {
	public static void main(String[] args) {
		int i = 123, i2 = 123;
		int[] ar = { 1, 2, 3 }, ar2 = { 1, 2, 3 };
		int[] ar3 = ar;

		System.out.println("i와 i2 : " + (i == i2 ? "같다":"다르다"));
		System.out.println("ar과 ar2 : " + (ar == ar2 ? "같다":"다르다"));
		System.out.println("ar과 ar3 : " + (ar == ar3 ? "같다":"다르다"));
	}
}

실행결과
i와 i2 : 같다
ar과 ar2 : 다르다
ar과 ar3 : 같다

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

실행결과	
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

실행결과
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
		System.out.println(month + "월은 " + days + "일까지 있습니다.");
	}
}

실행결과	
5월은 31일까지 있습니다.


==============================
# lookup2
class JavaTest {
	public static void main(String[] args) {
		int rank = 2;
		String[] message = {
			"",
			"최고의 성적입니다. 축하합니다. ",	
			"우수한 성적입니다.",	
			"보통입니다.",	
			"다소 부진합니다. 더 노력하세요.",	
			"왜 사니?",	
		};
		
		System.out.println(message[rank]);
	}
}


==============================
# 실행결과
우수한 성적입니다.


==============================
# lookup3
class JavaTest {
	public static void main(String[] args) {
		int score = 5;
		String[] message = {
			"",
			"최고의 성적입니다. 축하합니다. ",	
			"우수한 성적입니다.",	
			"보통입니다.",	
			"다소 부진합니다. 더 노력하세요.",	
			"왜 사니?",	
		};
		int[] rank = {5, 4, 4, 3, 3, 3, 2, 2, 2, 1, 1};
		
		System.out.println(message[rank[score]]);
	}
}

실행결과
보통입니다.

==============================
# roottable
class JavaTest {
	public static void main(String[] args) {
		double[] root = new double[100];
		
		for (int i = 0; i < 100; i++) {
			root[i] = Math.sqrt(i);
		}
		
		System.out.println("2의 제곱근 : " + root[2]);
	}
}

실행결과
2의 제곱근 : 1.4142135623730951

==============================
# roottable2
class JavaTest {
	static double[] root = new double[100];
	
	public static void main(String[] args) {
		System.out.println("2의 제곱근 : " + getRoot(2));
		System.out.println("5의 제곱근 : " + getRoot(5));
		System.out.println("2의 제곱근 : " + getRoot(2));
	}
	
	static double getRoot(int i) {
		if (root[i] == 0) {
			root[i] = Math.sqrt(i);
		}
		return root[i];
	}
}

실행결과
2의 제곱근 : 1.4142135623730951

==============================
# args
class JavaTest {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0;i < args.length; i++) {
			sum += Integer.parseInt(args[i]);
		}
		
		System.out.println("총합계 = " + sum);
	}
}

실행결과
C:\JavaStudy>java JavaTest 12 34
총합계 = 46

C:\JavaStudy>java JavaTest 1 2 3 4 5
총합계 = 15

###########################################################    
## 8장 ##

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

실행결과
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

실행결과
1 ~ 10 = 55
15 ~ 100 = 4945

==============================
# getdays
class JavaTest {
	public static void main(String[] args) {
		int year = 2016;
		int month = 2;
		
		int days = getMonthDays(year, month);
		System.out.println(year + "년 " + month + "월은 " + days + "일까지 있습니다.");
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

실행결과	
2016년 2월은 29일까지 있습니다.


==============================
# noarg
class JavaTest {
	public static void main(String[] args) {
		System.out.println("오늘은 " + getDate() + "일입니다.");
	}
	
	static int getDate() {
		java.time.LocalDate today = java.time.LocalDate.now();
		int day = today.getDayOfMonth();
		return day;
	}
}

실행결과
오늘은 4일입니다.

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

실행결과
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

실행결과
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

실행결과
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

실행결과
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

실행결과
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

실행결과
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

실행결과
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

실행결과
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

실행결과
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

실행결과
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

실행결과
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

실행결과
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

실행결과
[3, 5] = 5
[3.4, 5.6] = 5.6

###########################################################    
## 9장 ##

==============================
# car
class Car {
	String name;
	boolean gasoline;
	
	void run() {
		if (gasoline) {
			System.out.println("부릉 부릉");
		} else {
			System.out.println("덜컹 덜컹");
		}
	}
	void stop() {
		System.out.println("끼이익");
	}
}

class JavaTest {
	public static void main(String[] args) {
		Car korando = new Car();
		korando.name = "코란도C";
		korando.gasoline = false;
		
		korando.run();
		korando.stop();
	}
}

실행결과
덜컹 덜컹
끼이익

==============================
# object
class Car {
	String name;
	boolean gasoline;
	
	void run() {
		if (gasoline) {
			System.out.println("부릉 부릉");
		} else {
			System.out.println("덜컹 덜컹");
		}
	}
	void stop() {
		System.out.println("끼이익");
	}
}

class JavaTest {
	public static void main(String[] args) {
		Car korando = new Car();
		korando.name = "코란도C";
		korando.gasoline = false;
		System.out.print(korando.name + " : ");
		korando.run();
		
		Car equus = new Car();
		equus.name = "에꿍스";
		equus.gasoline = true;
		System.out.print(equus.name + " : ");
		equus.run();
	}
}

실행결과
코란도C : 덜컹 덜컹
에꿍스 : 부릉 부릉

==============================
# time
class Time {
	boolean am;
	int hour;
	int minute;
	int second;
	
	void whatTime() {
		System.out.print(am ? "오전 ":"오후 ");
		System.out.println(hour + "시 " + minute + "분 " + second + "초");
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

실행결과
오전 12시 34분 56초

==============================
# human
class Human {
	int age;
	String name;
	
	void intro() {
		System.out.println("안녕, " + age + "살 " + name + "이라고 해.");
	}
}

class JavaTest {
	public static void main(String[] args) {
		Human kim = new Human();
		kim.age = 29;
		kim.name = "김상형";
		kim.intro();
	}
}

실행결과
안녕, 29살 김상형이라고 해.

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
			System.out.println("부릉 부릉");
		} else {
			System.out.println("덜컹 덜컹");
		}
	}
	void stop() {
		System.out.println("끼이익");
	}
}

class JavaTest {
	public static void main(String[] args) {
		Car korando = new Car("코란도C", false);
		
		korando.run();
		korando.stop();
	}
}

실행결과
덜컹 덜컹
끼이익

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
		System.out.print(am ? "오전 ":"오후 ");
		System.out.println(hour + "시 " + minute + "분 " + second + "초");
	}
}

class JavaTest {
	public static void main(String[] args) {
		Time now = new Time(true, 12, 34, 56);
		now.whatTime();
	}
}

실행결과
오전 12시 34분 56초

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
		System.out.print(am ? "오전 ":"오후 ");
		System.out.println(hour + "시 " + minute + "분 " + second + "초");
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

실행결과
오전 12시 34분 0초
오후 6시 30분 0초

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
		System.out.print(am ? "오전 ":"오후 ");
		System.out.println(hour + "시 " + minute + "분 " + second + "초");
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

실행결과
오전 12시 34분 0초
오후 6시 30분 0초


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
			System.out.println("부릉 부릉");
		} else {
			System.out.println("덜컹 덜컹");
		}
	}

	void stop() {
		System.out.println("끼이익");
	}
}

class JavaTest {
	public static void main(String[] args) {
		Car sonata = new Car("소나타", true);
		sonata.run();

		Car korando = new Car();
		korando.name = "코란도C";
		korando.gasoline = false;
		korando.run();
	}
}

실행결과
부릉 부릉
덜컹 덜컹

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
			System.out.println("부릉 부릉");
		} else {
			System.out.println("덜컹 덜컹");
		}
	}
	void stop() {
		System.out.println("끼이익");
	}
}

class JavaTest {
	public static void main(String[] args) {
		Car korando = new Car("코란도C", false);
		korando.run();
		korando.stop();
		
		korando.init("제네시스", true);
		korando.run();
		korando.stop();
	}
}

실행결과
덜컹 덜컹
끼이익
부릉 부릉
끼이익

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
		System.out.print(am ? "오전 ":"오후 ");
		System.out.println(hour + "시 " + minute + "분 " + second + "초");
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

실행결과
오전 12시 0분 0초
오후 3시 23분 0초

==============================
# initblock
class Time {
	boolean am;
	int hour;
	int minute;
	int second;
	
	// 초기화 블록
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
		System.out.print(am ? "오전 ":"오후 ");
		System.out.println(hour + "시 " + minute + "분 " + second + "초");
	}
}

class JavaTest {
	public static void main(String[] args) {
		Time now = new Time();
		now.whatTime();
	}
}

실행결과
오후 6시 8분 48초

==============================
# initorder
class InitTest {
	int field = 1;		// 명시적 초기화
	
	{
		field = 2;		// 초기화 블록
	}
	
	InitTest() {	
		field = 3;		// 생성자
	}
}

class JavaTest {
	public static void main(String[] args) {
		InitTest init = new InitTest();
		System.out.print(init.field);
	}
}

실행결과
3

###########################################################    
## 10장 ##

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
		System.out.print(am ? "오전 ":"오후 ");
		System.out.println(hour + "시 " + minute + "분 " + second + "초");
	}
}

class JavaTest {
	public static void main(String[] args) {
		Time now = new Time(12, 34, 56);
		now.whatTime();
		// now.hour = 34;			// 에러
		now.setHour(34);;			// 거부
		now.setSecond(-25);		// 거부
		now.whatTime();
		now.setHour(10);;			// 가능
		now.setMinute(45);		// 가능
		now.whatTime();
	}
}

실행결과	
오후 12시 34분 56초
오후 12시 34분 56초
오전 10시 45분 56초


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

실행결과	
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
		Car korando = new Car("코란도C", false);
		System.out.println(korando.name + " : " + korando.carNum);

		Car equus = new Car("에꿍스", true);
		System.out.println(equus.name + " : " + equus.carNum);

		Car pride = new Car("프라이드", true);
		System.out.println(pride.name + " : " + pride.carNum);
	}
}

실행결과
코란도C : 1
에꿍스 : 1
프라이드 : 1

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
		System.out.println("생성전 : " + Car.carNum);
		
		Car korando = new Car("코란도C", false);
		System.out.println(korando.name + " : " + Car.carNum);

		Car equus = new Car("에꿍스", true);
		System.out.println(equus.name + " : " + Car.carNum);

		Car pride = new Car("프라이드", true);
		System.out.println(pride.name + " : " + Car.carNum);
	}
}

실행결과
생성전 : 0
코란도C : 1
에꿍스 : 2
프라이드 : 3

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
		System.out.println("생성전 : " + Car.carNum);
		
		Car korando = new Car("코란도C", false);
		System.out.println(korando.name + " : " + Car.carNum);

		Car equus = new Car("에꿍스", true);
		System.out.println(equus.name + " : " + Car.carNum);

		Car pride = new Car("프라이드", true);
		System.out.println(pride.name + " : " + Car.carNum);
	}
}

실행결과
생성전 : 1000
코란도C : 1001
에꿍스 : 1002
프라이드 : 1003

==============================
# staticinitblock
class Bus {
	static Station[] arInfo;
	
	static {
		arInfo = new Station[7];
		arInfo[0] = new Station("경희대학교", 0, 0);
		arInfo[1] = new Station("청량리", 4, 200);
		arInfo[2] = new Station("제기동", 7, 100);
		arInfo[3] = new Station("답십리", 12, 200);
		arInfo[4] = new Station("금호동", 16, 200);
		arInfo[5] = new Station("옥수", 18, 150);
		arInfo[6] = new Station("압구정", 23, 300);
	}
	
	void printFare(int from, int to) {
		int fare = 500;
		for (int i = from;i <= to; i++) {
			fare += arInfo[i].fare;
		}
		System.out.println(arInfo[from].name + " ~ " + 
			arInfo[to].name + "까지의 요금은 " + fare + "원입니다.");
	}
}

// 정거장 정보
class Station {
	String name;		// 정거장 이름
	int distance;		// 누적 거리
	int fare;				// 구간 요금
	
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

실행결과	
청량리 ~ 옥수까지의 요금은 1350원입니다.
제기동 ~ 금호동까지의 요금은 1000원입니다.


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
		System.out.println("현재 출고 대수 : " + carNum);
	}

	void run() {
		if (gasoline) {
			System.out.println("부릉 부릉");
		} else {
			System.out.println("덜컹 덜컹");
		}
	}
}

class JavaTest {
	public static void main(String[] args) {
		Car.printNum();
		Car pride = new Car("프라이드", true);
		Car korando = new Car("코란도C", false);
		Car.printNum();
		Car.resetNum();
		Car equus = new Car("에꿍스", true);
		Car.printNum();
	}
}

실행결과	
현재 출고 대수 : 0
현재 출고 대수 : 2
현재 출고 대수 : 1


==============================
# utilmethod
class Hello {
	static void morning() {
		System.out.println("좋은 아침");
	}
	static void lunch() {
		System.out.println("점심 먹었어?");
	}
	static void evening() {
		System.out.println("술 한잔 어때");
	}
}

class JavaTest {
	public static void main(String[] args) {
		Hello.morning();
		Hello.lunch();
		Hello.evening();
	}
}

실행결과
좋은 아침
점심 먹었어?
술 한잔 어때

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
			System.out.println("부릉 부릉");
		} else {
			System.out.println("덜컹 덜컹");
		}
	}
	void stop() {
		System.out.println("끼이익");
	}
	
	public static void main(String[] args) {
		Car korando = new Car("코란도C", false);
		
		korando.run();
		korando.stop();
	}
}

실행결과
덜컹 덜컹
끼이익

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
		Notebook XNote = new Notebook("AMD 라이젠", 2, 320);
		Sens.printSpec();
		XNote.printSpec();
		Sens.upgrade(8,750);
		Sens.printSpec();
	}
}

실행결과	
CPU = Intel Core i7 ,Memory = 4 ,Storage = 500
CPU = AMD 라이젠 ,Memory = 2 ,Storage = 320
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
		System.out.print(" ,Memory = " + memory * GIGA + "바이트");
		System.out.println(" ,Storage = " + storage * GIGA + "바이트");
	}
}

class JavaTest {
	public static void main(String[] args) {
		Notebook Sens = new Notebook("Intel Core i7", 4, 500);
		Notebook XNote = new Notebook("AMD 라이젠", 2, 320);
		Sens.printSpec();
		XNote.printSpec();
	}
}

실행결과	
CPU = Intel Core i7 ,Memory = 4294967296바이트 ,Storage = 536870912000바이트
CPU = AMD 라이젠 ,Memory = 2147483648바이트 ,Storage = 343597383680바이트

###########################################################    
## 11장 ##

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
		System.out.println("안녕, " + age + "살 " + name + "이라고 해.");
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
		System.out.println("하늘천 따지 검을현 누를황");
	}
}

class JavaTest {
	public static void main(String[] args) {
		Human kim = new Human(29, "김상형");
		kim.intro();
		Student lee = new Student(42, "이승우", 9312345, "경영");
		lee.intro();
		lee.study();
	}
}

실행결과	
안녕, 29살 김상형이라고 해.
안녕, 42살 이승우이라고 해.
하늘천 따지 검을현 누를황


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
			System.out.println("부릉 부릉");
		} else {
			System.out.println("덜컹 덜컹");
		}
	}
	void stop() {
		System.out.println("끼이익");
	}
}

class Truck extends Car {
	int ton;
	
	Truck(String name,int ton) {
		super(name, false);
		this.ton = ton;
	}
	
	void load() {
		System.out.println("짐을 싣는다.");
	}
}

class JavaTest {
	public static void main(String[] args) {
		Truck porter = new Truck("포터", 1);
		porter.run();
		porter.load();
	}
}

실행결과
덜컹 덜컹
짐을 싣는다.

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
		System.out.println("안녕, " + age + "살 " + name + "이라고 해.");
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
		System.out.println("하늘천 따지 검을현 누를황");
	}
}

class Graduate extends Student {
	String thesis;
	
	Graduate(int age, String name, int stnum, String major, String thesis) {
		super(age, name, stnum, major);
		this.thesis = thesis;
	}
	
	void research() {
		System.out.println("궁시렁 궁시렁. 뭘 연구해야 떼돈을 벌까?");
	}
}

class JavaTest {
	public static void main(String[] args) {
		Graduate park = new Graduate(35, "박대희", 95001122, "전산", "웹 보안에 대한 연구");
		park.intro();
		park.study();
		park.research();
	}
}



실행결과	
안녕, 35살 박대희이라고 해.
하늘천 따지 검을현 누를황
궁시렁 궁시렁. 뭘 연구해야 떼돈을 벌까?


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
		System.out.println("안녕, " + age + "살 " + name + "이라고 해.");
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
		System.out.println("하늘천 따지 검을현 누를황");
	}
}

class JavaTest {
	public static void main(String[] args) {
		Student kim = new Student(39, "노정란", 9908123, "건축");
		kim.intro();
		Student bae = new Student(1989.10f, "백지영", 1125034, "간호");
		bae.intro();
	}
}

실행결과	
안녕, 39살 노정란이라고 해.
안녕, 30살 백지영이라고 해.


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
		System.out.println("안녕, " + age + "살 " + name + "이라고 해.");
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
		System.out.println("하늘천 따지 검을현 누를황");
	}
}

class Soldier extends Human {
	int milnum;
	
	Soldier(int age, String name, int milnum) {
		super(age, name);
		this.milnum = milnum;
	}
	
	void fight() {
		System.out.println("따콩 따콩. 앞으로 전진!!");		
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
		System.out.println("살금 살금~~ 후다닥~~");		
	}
}

class JavaTest {
	public static void main(String[] args) {
		Student lee = new Student(35, "이율곡", 150629, "주자학");
		lee.study();
		
		Soldier kang = new Soldier(45, "강감찬", 12345);
		kang.fight();
		
		Thief hong = new Thief(15, "홍길동", "부자집", 2);
		hong.steal();
	}
}

실행결과	하늘천 따지 검을현 누를황
따콩 따콩. 앞으로 전진!!
살금 살금~~ 후다닥~~

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
		System.out.println("안녕, " + age + "살 " + name + "이라고 해.");
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
		System.out.println(major + "학과 " + stnum + "학번 " + name + "입니다.");
	}
	
	void study() {
		System.out.println("하늘천 따지 검을현 누를황");
	}
}

class JavaTest {
	public static void main(String[] args) {
		Human kim = new Human(29, "김상형");
		kim.intro();
		Student lee = new Student(42, "이승우", 9312345, "경영");
		lee.intro();
	}
}

실행결과	
안녕, 29살 김상형이라고 해.
경영학과 9312345학번 이승우입니다.


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
		System.out.println("안녕, " + age + "살 " + name + "이라고 해.");
		System.out.print("나의 노트북 : ");
		book.printSpec();
	}
}

class JavaTest {
	public static void main(String[] args) {
		Human kim = new Human(29, "김상형", "i7 Core", 8, 2000);
		kim.intro();
	}
}

실행결과	
안녕, 29살 김상형이라고 해.
나의 노트북 : CPU = i7 Core ,Memory = 8 ,Storage = 2000


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
		System.out.println("안녕, " + age + "살 " + name + "이라고 해.");
		System.out.print("나의 노트북 : ");
		printSpec();
	}
}

class JavaTest {
	public static void main(String[] args) {
		Human kim = new Human(29, "김상형", "i7 Core", 8, 2000);
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
		System.out.println("안녕, " + age + "살 " + name + "이라고 해.");
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
		System.out.println(major + "학과 " + stnum + "학번 " + human.name + "입니다.");
	}

	void study() {
		System.out.println("하늘천 따지 검을현 누를황");
	}
}

class JavaTest {
	public static void main(String[] args) {
		Student lee = new Student(42, "이승우", 9312345, "경영");
		lee.intro();
	}
}

실행결과	
경영학과 9312345학번 이승우입니다.

###########################################################    
## 12장 ##

==============================
# animal
class Animal {
	void move() { System.out.println("왔다리 갔다리"); }
}

class Dog extends Animal {
	void bark() { System.out.println("멍멍멍"); }
}

class Dove extends Animal {
	void fly() { System.out.println("퍼득 퍼득"); }
}

class JavaTest {
	public static void main(String[] args) {
		// 좌우의 타입이 맞는 경우
		Animal animal = new Animal();
		animal.move();
		
		// 부모 타입에 자식 객체 대입
		Animal dog = new Dog();
		dog.move();
		// dog.bark();
		
		// 자식 타입에 부모 객체 대입
		// Dove dove = new Animal();
		// dove.fly();
	}
}

실행결과
왔다리 갔다리
왔다리 갔다리

==============================
# animal2
class Animal {
	void move() { System.out.println("왔다리 갔다리"); }
}

class Dog extends Animal {
	void bark() { System.out.println("멍멍멍"); }
}

class Dove extends Animal {
	void fly() { System.out.println("퍼득 퍼득"); }
}

class JavaTest {
	public static void main(String[] args) {
		Animal animal = new Animal();
		Dog dog = new Dog();
		
		// 업 캐스팅
		Animal up = (Animal)dog;
		up.move();
		//up.bark();
		
		// 다운 캐스팅
		Dog down = (Dog)animal;
		down.move();
		down.bark();
	}
}

실행결과	
왔다리 갔다리
Exception in thread "main" java.lang.ClassCastException: Animal cannot be cast to Dog
	at JavaTest.main(JavaTest.java:25)


==============================
# instanceof
class Animal {
	void move() { System.out.println("왔다리 갔다리"); }
}

class Dog extends Animal {
	void bark() { System.out.println("멍멍멍"); }
}

class Dove extends Animal {
	void fly() { System.out.println("퍼득 퍼득"); }
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

실행결과
왔다리 갔다리
멍멍멍

==============================
# instanceof2
class Animal {
	void move() { System.out.println("왔다리 갔다리"); }
}

class Dog extends Animal {
	void bark() { System.out.println("멍멍멍"); }
}

class Dove extends Animal {
	void fly() { System.out.println("퍼득 퍼득"); }
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

실행결과
왔다리 갔다리
멍멍멍
왔다리 갔다리
퍼득 퍼득

==============================
# instanceof3
class Animal {
	void move() { System.out.println("왔다리 갔다리"); }
}

class Dog extends Animal {
	void bark() { System.out.println("멍멍멍"); }
}

class Dove extends Animal {
	void fly() { System.out.println("퍼득 퍼득"); }
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

실행결과
왔다리 갔다리
멍멍멍
왔다리 갔다리
퍼득 퍼득

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
		System.out.println("안녕, " + age + "살 " + name + "이라고 해.");
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
		System.out.println(major + "학과 " + stnum + "학번 " + name + "입니다.");
	}
	
	void study() {
		System.out.println("하늘천 따지 검을현 누를황");
	}
}

class JavaTest {
	public static void main(String[] args) {
		Human kim = new Human(29, "김상형");
		Student lee = new Student(42, "이승우", 9312345, "경영");

		introHuman(kim);
		introHuman(lee);
	}
	
	static void introHuman(Human who) {
		who.intro();
	}
}

실행결과	
안녕, 29살 김상형이라고 해.
경영학과 9312345학번 이승우입니다.


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
		System.out.println("안녕, " + age + "살 " + name + "이라고 해.");
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
		System.out.println(major + "학과 " + stnum + "학번 " + name + "입니다.");
	}
	
	void study() {
		System.out.println("하늘천 따지 검을현 누를황");
	}
}

class Soldier extends Human {
	int milnum;
	
	Soldier(int age, String name, int milnum) {
		super(age, name);
		this.milnum = milnum;
	}
	
	void intro() {
		System.out.println("충성. 군번 : " + milnum + "입니다.");
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
		System.out.println(item + " 전문 털이범 전과 " + star + "범입니다.");
	}
}

class JavaTest {
	public static void main(String[] args) {
		Human[] arHuman = {
				new Human(29, "김상형"),
				new Student(42, "이승우", 9312345, "경영"),
				new Soldier(45, "강감찬", 12345),
				new Thief(15, "홍길동", "부자집", 2),
		};
		
		dumpGroup(arHuman);
	}
	
	static void dumpGroup(Human[] group) {
		for (Human h : group) {
			h.intro();
		}
	}
}

실행결과	
안녕, 29살 김상형이라고 해.
경영학과 9312345학번 이승우입니다.
충성. 군번 : 12345입니다.
부자집 전문 털이범 전과 2범입니다.


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
		System.out.println("안녕, " + age + "살 " + name + "이라고 해.");
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
		System.out.println(major + "학과 " + stnum + "학번 " + name + "입니다.");
	}
	
	void study() {
		System.out.println("하늘천 따지 검을현 누를황");
	}
}

class Soldier extends Human {
	int milnum;
	
	Soldier(int age, String name, int milnum) {
		super(age, name);
		this.milnum = milnum;
	}
	
	void intro() {
		System.out.println("충성. 군번 : " + milnum + "입니다.");
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
		System.out.println(item + " 전문 털이범 전과 " + star + "범입니다.");
	}
}

class Graduate extends Student {
	String thesis;
	
	Graduate(int age, String name, int stnum, String major, String thesis) {
		super(age, name, stnum, major);
		this.thesis = thesis;
	}
	
	void intro() {
		System.out.println(thesis + " 논문을 쓰고 있는 대학원생입니다.");
	}
}

class JavaTest {
	public static void main(String[] args) {
		Human[] arHuman = {
				new Human(29, "김상형"),
				new Student(42, "이승우", 9312345, "경영"),
				new Soldier(45, "강감찬", 12345),
				new Thief(15, "홍길동", "부자집", 2),
				new Graduate(35, "박대희", 95001122, "전산", "웹 보안에 대한 연구"),
		};
		
		dumpGroup(arHuman);
	}
	
	static void dumpGroup(Human[] group) {
		for (Human h : group) {
			h.intro();
		}
	}
}

실행결과	
안녕, 29살 김상형이라고 해.
경영학과 9312345학번 이승우입니다.
충성. 군번 : 12345입니다.
부자집 전문 털이범 전과 2범입니다.
웹 보안에 대한 연구 논문을 쓰고 있는 대학원생입니다.


==============================
# delivery
class Transport {
	void ride() {
		System.out.print("이동한다");
	}
}

class Bike extends Transport {
	void ride() {
		System.out.print("따르릉 따르릉");
	}
}

class AutoBike extends Transport {
	void ride() {
		System.out.print("빠라바라 빠라밤");
	}
	
	void bikeshow() {
		System.out.println("앞 바퀴 들고 부르릉...");
	}
}

class SkyKongKong extends Transport {
	void ride() {
		System.out.print("콩콩콩콩");
	}
	
	void rotate() {
		System.out.println("공중 회전 묘기");
	}
}

class DeliveryMan {
	void delivery(Transport tran, String food) {
		tran.ride();
		System.out.println(" 타고 가서 " + food + "를 배달합니다.");
	}
}

class JavaTest {
	public static void main(String[] args) {
		DeliveryMan kang = new DeliveryMan();
		kang.delivery(new Bike(), "짜장면");
		kang.delivery(new AutoBike(), "피자");
		kang.delivery(new SkyKongKong(), "햄버그");
	}
}

실행결과	
따르릉 따르릉 타고 가서 짜장면를 배달합니다.
빠라바라 빠라밤 타고 가서 피자를 배달합니다.
콩콩콩콩 타고 가서 햄버그를 배달합니다.

###########################################################    
## 13장 ##

==============================
# star
class Marine {
	void move() { System.out.println("아장 아장"); }
	void attack() { System.out.println("두두두두두"); }
	void bunker() { System.out.println("쏙~ 숨었지롱"); }
}

class Zealot {
	void move() { System.out.println("뒤뚱 뒤뚱"); }
	void attack() { System.out.println("우갸 우갸 챙챙"); }
}

class Mutal {
	void move() { System.out.println("퍼득 퍼득"); }
	void attack() { System.out.println("삼지창 휙휙"); }
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

실행결과
아장 아장
두두두두두
뒤뚱 뒤뚱
우갸 우갸 챙챙

==============================
# unit
class Unit {
	void move() { System.out.println("이동"); }
	void attack() { System.out.println("공격"); }
}

class Marine extends Unit {
	void move() { System.out.println("아장 아장"); }
	void attack() { System.out.println("두두두두두"); }
	void bunker() { System.out.println("쏙~ 숨었지롱"); }
}

class Zealot extends Unit {
	void move() { System.out.println("뒤뚱 뒤뚱"); }
	void attack() { System.out.println("우갸 우갸 챙챙"); }
}

class Mutal extends Unit {
	void move() { System.out.println("퍼득 퍼득"); }
	void attack() { System.out.println("삼지창 휙휙"); }
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

실행결과
아장 아장
두두두두두
뒤뚱 뒤뚱
우갸 우갸 챙챙
퍼득 퍼득
삼지창 휙휙

==============================
# abstract
abstract class Unit {
	abstract void move();
	abstract void attack();
}

class Marine extends Unit {
	void move() { System.out.println("아장 아장"); }
	void attack() { System.out.println("두두두두두"); }
	void bunker() { System.out.println("쏙~ 숨었지롱"); }
}

class Zealot extends Unit {
	void move() { System.out.println("뒤뚱 뒤뚱"); }
	void attack() { System.out.println("우갸 우갸 챙챙"); }
}

class Mutal extends Unit {
	void move() { System.out.println("퍼득 퍼득"); }
	void attack() { System.out.println("삼지창 휙휙"); }
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
			System.out.println("자바");
		} else if (lang instanceof Cpp) {
			System.out.println("C++");
		} else if (lang instanceof CSharp) {
			System.out.println("C#");
		}
	}
}

실행결과
자바

==============================
# interface
interface Unit {
	void move();
	void attack();
}

class Marine implements Unit {
	public void move() { System.out.println("아장 아장"); }
	public void attack() { System.out.println("두두두두두"); }
	public void bunker() { System.out.println("쏙~ 숨었지롱"); }
}

class Zealot implements Unit {
	public void move() { System.out.println("뒤뚱 뒤뚱"); }
	public void attack() { System.out.println("우갸 우갸 챙챙"); }
}

class Mutal implements Unit {
	public void move() { System.out.println("퍼득 퍼득"); }
	public void attack() { System.out.println("삼지창 휙휙"); }
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
	public void move() { System.out.println("아장 아장"); }
	public void attack() { System.out.println("두두두두두"); }
	public void bunker() { System.out.println("쏙~ 숨었지롱"); }
}

class Zealot implements Unit {
	public void move() { System.out.println("뒤뚱 뒤뚱"); }
	public void attack() { System.out.println("우갸 우갸 챙챙"); }
}

class Mutal implements Unit {
	public void move() { System.out.println("퍼득 퍼득"); }
	public void attack() { System.out.println("삼지창 휙휙"); }
}

class SuperMan implements Unit {
	public void move() { System.out.println("슈우우웅~~~"); }
	public void attack() { System.out.println("빠직 빠직"); }
}

class Firebat extends Marine {
	public void attack() { System.out.println("화르르르~~"); }
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

실행결과
아장 아장
두두두두두
뒤뚱 뒤뚱
우갸 우갸 챙챙
퍼득 퍼득
삼지창 휙휙
슈우우웅~~~
빠직 빠직
아장 아장
화르르르~~

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
	public void move() { System.out.println("스믈 스믈"); }
	public void attack() { System.out.println("슉슉, 낫질"); }
	public void hide() { System.out.println("안보이지롱"); }
}

class Medic implements Healing {
	public void move() { System.out.println("쫄래 쫄래"); }
	public void attack() { System.out.println("치지지직"); }
	public void heal() { System.out.println("마린씨 일루와"); }
}

class JavaTest {
	public static void main(String[] args) {
		DarkTempler dt = new DarkTempler();
		dt.hide();
		
		Medic medic = new Medic();
		medic.heal();
	}
}

실행결과
안보이지롱
마린씨 일루와

==============================
# multiinherit
class HandPhone {
	void call() { System.out.println("전화를 건다."); }
	void receive() { System.out.println("전화를 받는다."); }
}

interface Camera {
	void takepicture();
}

class HandPhoneCamera extends HandPhone implements Camera {
	public void takepicture() { System.out.println("찰칵. 사진을 찍는다."); }
}

class JavaTest {
	public static void main(String[] args) {
		HandPhoneCamera myphone = new HandPhoneCamera();
		myphone.call();
		myphone.takepicture();
	}
}

실행결과
전화를 건다.
찰칵. 사진을 찍는다.

==============================
# inheritcontain
class HandPhone {
	void call() { System.out.println("전화를 건다."); }
	void receive() { System.out.println("전화를 받는다."); }
}

class Camera {
	void takepicture() { System.out.println("찰칵. 사진을 찍는다."); }
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
	void call() { System.out.println("전화를 건다."); }
	void receive() { System.out.println("전화를 받는다."); }
}

interface Camera {
	void takepicture();
}

interface Mp3 {
	void play();
}

class SmartPhone extends HandPhone implements Camera, Mp3 {
	public void takepicture() { System.out.println("찰칵. 사진을 찍는다."); }
	public void play() { System.out.println("띵가 띵가. 음악 재생"); }
}

class JavaTest {
	public static void main(String[] args) {
		SmartPhone galaxy = new SmartPhone();
		galaxy.call();
		galaxy.takepicture();
		galaxy.play();
	}
}

실행결과	
전화를 건다.
찰칵. 사진을 찍는다.
띵가 띵가. 음악 재생


==============================
# defmethod
interface Unit {
	void move();
	void attack();
	default void die() { System.out.println("꽥꼬닥"); }
}

class Marine implements Unit {
	public void move() { System.out.println("아장 아장"); }
	public void attack() { System.out.println("두두두두두"); }
	public void bunker() { System.out.println("쏙~ 숨었지롱"); }
}

class Zealot implements Unit {
	public void move() { System.out.println("뒤뚱 뒤뚱"); }
	public void attack() { System.out.println("우갸 우갸 챙챙"); }
	public void die() { System.out.println("으아악"); }
}

class JavaTest {
	public static void main(String[] args) {
		new Marine().die();
		new Zealot().die();
	}
}

실행결과
꽥꼬닥
으아악

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
	public void move() { System.out.println("아장 아장"); }
	public void attack() { System.out.println("두두두두두"); }
	public void bunker() { System.out.println("쏙~ 숨었지롱"); }
}

class JavaTest {
	public static void main(String[] args) {
		Unit m = new Marine();
		Unit.moveAttack(m);
	}
}

실행결과
아장 아장
두두두두두

==============================
# multiinherit2
interface HandPhone {
	default void call() { System.out.println("전화를 건다."); }
	default void receive() { System.out.println("전화를 받는다."); }
}

interface Camera {
	default void takepicture() { System.out.println("찰칵. 사진을 찍는다."); };
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

실행결과	
전화를 건다.
찰칵. 사진을 찍는다.


==============================
# superinterface
interface A {
	default void print() { System.out.println("인쇄한다."); }
}

interface B {
	default void print() { System.out.println("출력한다."); }
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

실행결과
인쇄한다.

###########################################################    
## 14장 ##

==============================
# CarTester
public class CarTester {
	public static void main(String[] args) {
		Car korando = new Car();
		korando.name = "코란도C";
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
			System.out.println("부릉 부릉");
		} else {
			System.out.println("덜컹 덜컹");
		}
	}
	void stop() {
		System.out.println("끼이익");
	}
}

실행결과	
덜컹 덜컹
끼이익


==============================
# UtilClass
package kr.soen.kim;

public class UtilClass {
	public static void utilMethod() {
		System.out.println("김과장의 유틸리티");
	}
}

UtilClass
package kr.soen.park;

public class UtilClass {
	public static void utilMethod() {
		System.out.println("박대리의 유틸리티");
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

실행결과	
김과장의 유틸리티
박대리의 유틸리티


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
			System.out.println("부릉 부릉");
		} else {
			System.out.println("덜컹 덜컹");
		}
	}
	
	public void stop() {
		System.out.println("끼이익");
	}
}

PackageCarTester
package kr.soen;

public class PackageCarTester {
	public static void main(String[] args) {
		kr.soen.choi.Car tivoli = new kr.soen.choi.Car("티볼리", true);
		tivoli.run();
		tivoli.stop();
	}
}

실행결과	
부릉 부릉
끼이익


==============================
# AccessTest
package kr.soen;

import kr.soen.library.*;

public class AccessTest {
	// 패키지 외부에서는 public 메서드만 호출 가능하다.
	public static void main(String[] args) {
		Util.mpublic();
		//Util.mprivate();
		//Util.mprotected();
		//Util.mdefault();
	}
}

class SubUtil extends Util {
	// 다른 패키지라도 상속 관계에 있으면 protected 메서드는 호출할 수 있다.
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
	
	// 같은 클래스에서는 모든 메서드를 호출할 수 있다.
	void method() {
		mpublic();
		mprivate();
		mprotected();
		mdefault();
	}
}

class UseUtil {
	// 같은 패키지 내의 클래스라도 private는 호출할 수 없다.
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
## 15장 ##


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
		
		Human kim = new Human(29, "김상형");
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
		return age + "세의 " + name;
	}
}

class JavaTest {
	public static void main(String[] args) {
		int i = 1234;
		System.out.println(i);
		
		Human kim = new Human(29, "김상형");
		System.out.println(kim);
		
		String str = "범인 : " + kim;
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
		Human kim = new Human(29, "김상형");
		Human lee = new Human(43, "이승우");
		Human kimcopy = kim;
		Human kim2 = new Human(29, "김상형");
		
		System.out.println("kim == lee : " + (kim == lee ? "같다":"다르다"));
		System.out.println("kim == kimcopy : " + (kim == kimcopy ? "같다":"다르다"));
		System.out.println("kim == kim2 : " + (kim == kim2 ? "같다":"다르다"));
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
		Human kim = new Human(29, "김상형");
		Human lee = new Human(43, "이승우");
		Human kimcopy = kim;
		Human kim2 = new Human(29, "김상형");
		
		System.out.println("kim.equals(lee) : " + (kim.equals(lee) ? "같다":"다르다"));
		System.out.println("kim.equals(kimcopy) : " + (kim.equals(kimcopy) ? "같다":"다르다"));
		System.out.println("kim.equals(kim2) : " + (kim.equals(kim2) ? "같다":"다르다"));
	}
}


==============================
# stringdate
class JavaTest {
	public static void main(String[] args) {
		String korea = "대한민국";
		String korea2 = new String("대한민국");
		
		System.out.println("== 비교 : " + (korea == korea2 ? "같다":"다르다"));
		System.out.println("equals 비교: " + (korea.equals(korea2) ? "같다":"다르다"));
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
		System.out.println("안녕, " + age + "살 " + name + "이라고 해.");
	}
}

class JavaTest {
	public static void main(String[] args) {
		Human kim = new Human(29, "김상형");
		
		Class cls = kim.getClass();
		System.out.println("클래스 이름 = " + cls.getName());
		System.out.println("슈퍼 클래스 = " + cls.getSuperclass().getName());

		System.out.print("필드 : ");
		Field[] fields = cls.getDeclaredFields();
		for (Field F : fields) {
			System.out.print(F.getName() + " ");
		}
		
		System.out.println();
		System.out.print("메서드 : ");
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
		Human kim = new Human(29, "김상형");
		Human kim2 = (Human)kim.clone();

		kim2.name = "이순신";
		
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
		Human kim = new Human(29, "김상형");
		Human kim2 = (Human)kim.clone();

		kim2.name = "이순신";
		
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
		Human kim = new Human(29, "김상형");
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
		Human kim = new Human(29, "김상형");
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
		System.out.println("연결되었습니다.");
	}
	
	void disconnect() {
		System.out.println("연결이 끊어졌습니다.");
	}
}

class JavaTest {
	public static void main(String[] args) {
		communication();
	}
	
	static void communication() {
		Network net = new Network();
		net.connect();
		// 네트웍 통신
		net.disconnect();
	}
}


==============================
# finalize2
class Network {
	void connect() {
		System.out.println("연결되었습니다.");
	}
	
	void disconnect() {
		System.out.println("연결이 끊어졌습니다.");
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
		System.out.printf("int 타입의 크기 = %d, 최소값 = %d, 최대값 = %d\n", 
				Integer.SIZE, Integer.MIN_VALUE, Integer.MAX_VALUE);
		System.out.printf("short 타입의 크기 = %d, 최소값 = %d, 최대값 = %d\n", 
				Short.SIZE, Short.MIN_VALUE, Short.MAX_VALUE);
		System.out.printf("long 타입의 크기 = %d, 최소값 = %d, 최대값 = %d\n", 
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
		System.out.printf("Float의 크기 = %d, 지수 최소값 = %d, 지수 최대값 = %d\n", 
				Float.SIZE, Float.MIN_EXPONENT, Float.MAX_EXPONENT);
		System.out.printf("Double의 크기 = %d, 지수 최소값 = %d, 지수 최대값 = %d\n", 
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
			System.out.println("숫자가 아님");
		} else {
			System.out.println("숫자가 맞음");
		}
	}
}


==============================
# printf
class JavaTest {
	public static void main(String[] args) {
		int i = 123;
		double d = 3.14;
		String str = "문자열";
		System.out.printf("i = %d, d = %f, str = %s\n", i, d, str);
	}
}


==============================
# printfindex
class JavaTest {
	public static void main(String[] args) {
		int i = 123;
		double d = 3.14;
		String str = "문자열";

		System.out.printf("i = %3$d, d = %2$f, str = %1$s\n", str, d, i);
		System.out.printf("정수 = %1$d, i = %1$d", i);
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
			System.out.println(i + "번째 줄");
		}
		long end = System.currentTimeMillis();
		System.out.println((end-start)/1000.0 + " 초 걸림");
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
				System.out.println(i + "번째 정렬 중");
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
		System.out.println((end-start)/1000.0 + " 초 걸림");
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
## 16장 ##

==============================
# stringctor
class JavaTest {
	public static void main(String[] args) {
		String str = new String("아름다운");
		System.out.println(str);

		String str2 = "우리나라";
		System.out.println(str2);
		
		char[] ar = { 'k', 'o', 'r', 'e', 'a' };
		String str3 = new String(ar);
		System.out.println(str3);
		
		System.out.println("대한민국".length());
	}
}


==============================
# stringlength
class JavaTest {
	public static void main(String[] args) {
		String str = "아름다운 우리나라";
		System.out.println("길이 : " + str.length());
		System.out.println("2번째 문자 : " + str.charAt(2));
	}
}


==============================
# strcompare
class JavaTest {
	public static void main(String[] args) {
		String str1 = "KOREA";
		String str2 = "korea";
		
		System.out.println(str1.equals(str2) ? "같다":"다르다");
		System.out.println(str1.equalsIgnoreCase(str2) ? "같다":"다르다");
		
		String apple = "Apple";
		String orange = "Orange";
		int Result = apple.compareTo(orange);
		if (Result == 0) {
			System.out.println("같다");
		} else if (Result < 0) {
			System.out.println("Apple이 더 앞쪽");
		} else if (Result > 0) {
			System.out.println("Apple이 더 뒤쪽");
		}
	}
}


==============================
# indexof
class JavaTest {
	public static void main(String[] args) {
		String str = "String Search Method of String Class";
		
		System.out.println("앞쪽 t = " + str.indexOf('t'));
		System.out.println("뒤쪽 t = " + str.lastIndexOf('t'));
		System.out.println("앞쪽 z = " + str.indexOf('z'));
		System.out.println("앞쪽 String = " + str.indexOf("String"));
		System.out.println("뒤쪽 String = " + str.lastIndexOf("String"));
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
		
		// 문자열 자체를 변경하는 것은 아니다.
		str.toUpperCase();
		System.out.println(str);
		
		// 문자열을 변경하려면 다시 대입받아야 한다.
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
		String str = "독도는 일본땅이다. 대마도는 일본땅이다.";
		System.out.println(str.replace("일본", "한국"));
		System.out.println(str.replaceFirst("일본", "한국"));
	}
}

==============================
# substring
class JavaTest {
	public static void main(String[] args) {
		String str = "0123456789";
		System.out.println(str.substring(3,7));
		
		String name = "제 이름은 <김한결>입니다.";
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
		String city = "서울,대전,대구,부산";
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
		
		String seoul = "서울", daejun = "대전", daegu = "대구", busan = "부산";
		String city = String.join(",", seoul, daejun, daegu, busan);
		//String city = seoul + "," + daejun + "," + daegu + "," + busan;
		System.out.println(city);
		
		List<String> subway = Arrays.asList("서울역", "남영", "용산", "노량진");
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
		System.out.println((System.currentTimeMillis()-start)/1000.0 + "초");
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
		System.out.println((System.currentTimeMillis()-start)/1000.0 + "초");
	}
}

==============================
# repeat
public class JavaTest {
	public static void main(String[] args) {
		String home = "대한민국 ";
		String hurrah = "만세! ";
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
		System.out.println("왼쪽 = " + Math.floor(1.6));
		System.out.println("왼쪽 = " + Math.floor(-1.6));
		System.out.println("오른쪽 = " + Math.ceil(1.6));
		System.out.println("오른쪽 = " + Math.ceil(-1.6));
		System.out.println("자름 = " + (int)1.6);
		System.out.println("자름 = " + (int)-1.6);

		System.out.println("반올림 = " + Math.round(1.6));
		System.out.println("반올림 = " + Math.round(1.4));
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
		System.out.println("45도 = " + Math.toRadians(45));
		System.out.println("1 라디안 = " + Math.toDegrees(1));
		System.out.println("3.14 라디안 = " + Math.toDegrees(Math.PI));
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
		System.out.println("빗변 = " + c);
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
		System.out.printf("%d년 %d월 %d일 %s %d시 %d분 %d초",
				today.get(Calendar.YEAR), 
				today.get(Calendar.MONTH) + 1, 
				today.get(Calendar.DATE), 
				today.get(Calendar.AM_PM) == Calendar.AM ? "오전":"오후", 
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
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 M월 d일 a hh:mm:ss");
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
		System.out.printf("오늘 날짜 : %d월 %d일\n",
				today.get(Calendar.MONTH) + 1, 
				today.get(Calendar.DATE));
		today.add(Calendar.DATE, 100);
		System.out.printf("100일 후는 %d월 %d일입니다.\n",
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
		System.out.println("오늘은 태어난지 " + days + "일째");
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
		System.out.printf("%d년 %d월 %d일 %d시 %d분 %d초",
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
		System.out.printf("100일 후는 %d월 %d일입니다.",
				after100.getMonthValue(),
				after100.getDayOfMonth());
	}
}

==============================
# pointrecord
class Point
{
	// 좌표를 저장할 변수
	private final int x;
	private final int y;
	
	// 기본 생성자
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// 변수를 읽어줄 액세서
	int x() { return x; }
	int y() { return y; }
	
	// 상등 비교
	public boolean equals(Object other) {
		if (other instanceof Point == false) return false;
		return ((Point)other).x == x && ((Point)other).y == y;
	}

	// 해시 코드
    public int hashCode() {
        return y * 10000 + x;
    }
    
	// 문자열화
	public String toString() {
		return "Point(" + x + "," + y + ")";
	}
}

public class JavaTest {
	public static void main(String[] args) {
		// 생성
		Point pt = new Point(123, 456);
		// 문자열화하여 출력
		System.out.println(pt);
		// 개별 멤버값 읽기
		int x = pt.x();
		int y = pt.y();
		System.out.println("x = " + x + ",y = " + y);
		// 상등 비교
		Point pt2 = new Point(123, 456);
		System.out.println(pt.equals(pt2));
	}
}

==============================
# pointrecord2
record Point(int x, int y) {}

public class JavaTest {
	public static void main(String[] args) {
		// 간단하게 생성
		Point pt = new Point(123, 456);
		// 문자열화하여 출력
		System.out.println(pt);
		// 개별 멤버값 읽기
		int x = pt.x();
		int y = pt.y();
		System.out.println("x = " + x + ",y = " + y);
		// 상등 비교
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
## 17장 ##

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
		arName.add("전두환");
		arName.add("김영삼");
		arName.add("김대중");
		arName.add(1,"노태우");
		for (String s : arName) {
			System.out.println(s);
		}

		System.out.println("==========");
		arName.remove(2);
		arName.set(2,"원더걸스");
		for (String s : arName) {
			System.out.println(s);
		}
		if (arName.indexOf("노태우") != -1) {
			System.out.println("있다");
		} else {
			System.out.println("없다");
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
		
		System.out.print("차집합 => ");
		ArrayList<Integer> arNumRemove = new ArrayList<Integer>(arNum); 
		arNumRemove.removeAll(arNum2);
		for (Integer i : arNumRemove) {
			System.out.print(i + " ");
		}
		
		System.out.print("\n교집합 => ");
		ArrayList<Integer> arNumRetain = new ArrayList<Integer>(arNum); 
		arNumRetain.retainAll(arNum2);
		for (Integer i : arNumRetain) {
			System.out.print(i + " ");
		}
		
		System.out.print("\n부분집합 => ");
		if (arNum.containsAll(arNum2)) {
			System.out.print("부분집합임");
		} else {
			System.out.print("부분집합이 아님");
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
		arName.add("전두환");
		arName.add("김영삼");
		arName.add("김대중");
		arName.add(1,"노태우");

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
		arName.add("전두환");
		arName.add("김영삼");
		arName.add("김대중");
		arName.add(1,"노태우");
		
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
		arName.add("전두환");
		arName.add("김영삼");
		arName.add("김대중");
		arName.add(1,"노태우");
		
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
		arName.add("장보고");
		arName.add("김유신"); 
		arName.add("강감찬"); 
		arName.add("을지문덕"); 
		
		for(String name : arName) {
			System.out.print(name + " ");
		}
		
		System.out.println();
		Collections.sort(arName);
		// 역순정렬
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
		arName.add("장보고");
		arName.add("김유신"); 
		arName.add("강감찬"); 
		arName.add("을지문덕"); 
		
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
		stack.push("호랑이");
		stack.push("사자");
		stack.push("꼬끼리");
		
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
		stack.push("호랑이");
		stack.push("사자");
		stack.push("꼬끼리");
		stack.addLast("기린");
		
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
		queue.offer("호랑이");
		queue.offer("사자");
		queue.offer("꼬끼리");
		
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
		Snack.put("오징어 땅콩", 2500);
		Snack.put("죠리퐁", 1900);
		Snack.put("핫브레이크", 450);
		Snack.put("빼빼로", 900);
		
		String MySnack = "죠리퐁";
		System.out.println(MySnack + "의 가격은 " + Snack.get(MySnack));
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
		donate.put(new Human(42, "김기남"), 10000);
		donate.put(new Human(24, "박수빈"), 20000);
		donate.put(new Human(20, "박수현"), 5000);
		donate.put(new Human(11, "최상미"), 8000);

		Human park = new Human(20, "박수현");
		System.out.println(park.name + "씨의 기부금 = " + donate.get(park));
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
		donate.put(new Human(42, "김기남"), 10000);
		donate.put(new Human(24, "박수빈"), 20000);
		donate.put(new Human(20, "박수현"), 5000);
		donate.put(new Human(11, "최상미"), 8000);

		Human park = new Human(20, "박수현");
		System.out.println(park.name + "씨의 기부금 = " + donate.get(park));
	}
}

==============================
# hashset
import java.util.*;

class JavaTest {
	public static void main(String[] args) {
		HashSet<String> kangwon= new HashSet<String>();
		kangwon.add("춘천시");
		kangwon.add("철원군");
		kangwon.add("정선군");
		kangwon.add("강릉시");
		kangwon.add("화천군");
		kangwon.add("춘천시");
		
		Iterator<String> it = kangwon.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}

###########################################################    
## 18장 ##

==============================
# rawarraylist
import java.util.*;

class JavaTest {
	public static void main(String[] args) {
		ArrayList arNum = new ArrayList();
		arNum.add(1);
		arNum.add("문자열");
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
		//arNum.add("문자열");
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
		JavaTest.<String>print("문자열");
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
		yoil.add("일요일");
		yoil.add("월요일");
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
	void intro() { System.out.println("나 사람"); }
}

class Student extends Human {
	void intro() { System.out.println("나 학생"); }
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
	void intro() { System.out.println("나 사람"); }
}

class Student extends Human {
	void intro() { System.out.println("나 학생"); }
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
## 19장 ##

==============================
# divideex
class JavaTest {
	public static void main(String[] args) {
		int a, b, c;
		a = 2;
		b = 0;
		c= a / b;
		System.out.println("c = " + c);
		System.out.println("프로그램 실행 완료");
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
		System.out.println("프로그램 실행 완료");
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
			System.out.println("0으로 나누기 예외 발생");
		}
		System.out.println("프로그램 실행 완료");
	}
}


==============================
# sleep
class JavaTest {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		try {
			Thread.sleep(3000);
		}
		catch (InterruptedException e) {
			System.out.println("예외 발생");
		}
		System.out.println("프로그램 끝");
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
		System.out.println("프로그램 실행 완료");
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
			System.out.println("0으로 나누기 예외 발생");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("첨자가 배열 범위를 넘어섰습니다.");
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("프로그램 실행 완료");
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
			System.out.println("실행중 예외 발생");
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("프로그램 실행 완료");
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
			System.out.println("0으로 나누기 또는 배열 범위 초과 예외 발생");
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("프로그램 실행 완료");
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
		String name = "빌게이츠";
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
			System.out.println("이름이 무효합니다.");
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
			throw new NullPointerException("이름이 무효합니다.");
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
			throw new Exception("이름이 무효합니다.");
		}
		System.out.println(name.length());
	}
}


==============================
# throws2
class JavaTest {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("프로그램 시작");
		Thread.sleep(3000);
		System.out.println("프로그램 끝");
	}
}


==============================
# userex
class NegativeException extends Exception {
	NegativeException() {
		super("음수는 안되요");
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
		System.out.println("접속");
		try {
			System.out.println("전송");
			System.out.println("해제");
		}
		catch(Exception e) {
			System.out.println("예외 처리");
			System.out.println("해제");
		}
	}
}


==============================
# finally
class JavaTest {
	public static void main(String[] args) {
		System.out.println("접속");
		try {
			System.out.println("전송");
		}
		catch(Exception e) {
			System.out.println("예외 처리");
		}
		finally {
			System.out.println("해제");
		}
	}
}


==============================
# autoclose
class NetAccess {
	public void open() { System.out.println("접속");	 }
	public void send() { System.out.println("전송");	 }
	public void close() { System.out.println("해제"); }
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
	public void open() { System.out.println("접속");	 }
	public void send() { System.out.println("전송");	 }
	public void close() { System.out.println("해제"); }
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
## 20장 ##

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
				 mem.wait();			// 완성될 때까지 대기
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
			mem.notify(); 			// 다운로드 완료. 재생 스레드의 대기를 깨움
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
		System.out.println("다운로드가 완료되었습니다. 전송을 시작합니다.");
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
		System.out.println("다운로드가 완료되었습니다. 전송을 시작합니다.");
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
		System.out.println("\n계산 완료");
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
			System.out.println("\n계산 취소");
			return;
		}
		System.out.println("\n계산 완료");
	}
}

###########################################################    
## 21장 ##

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
		String str = "자바 Stream 입출력";
		FileWriter out = new FileWriter("test.txt");
		out.write(str);
		out.close();
		System.out.println("Write success");

		// 한 문자씩 읽기
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

		// 한꺼번에 읽기
		in = new FileReader("test.txt");
		char[] text = new char[100];
		int num = in.read(text);
		System.out.println("읽은 문자 개수 = " + num);
		System.out.println(text);
		in.close();
	}
}


==============================
# encoding
import java.io.*;

class JavaTest {
	public static void main(String[] args) throws Exception {
		//FileReader in = new FileReader("애국가.txt");
		//FileReader in = new FileReader("애국가-Unicode.txt");
		//FileReader in = new FileReader("애국가-Utf8.txt");
		FileReader in = new FileReader("애국가-Utf8nb.txt");
		char[] text = new char[1000];
		int num = in.read(text);
		System.out.println("읽은 문자 개수 = " + num);
		System.out.println(text);
		in.close();
	}
}


==============================
# charset
import java.io.*;

class JavaTest {
	public static void main(String[] args) throws Exception {
		FileInputStream fi = new FileInputStream("애국가.txt");
		InputStreamReader in = new InputStreamReader(fi, "euc-kr");
		char[] text = new char[1000];
		int num = in.read(text);
		System.out.println("읽은 문자 개수 = " + num);
		System.out.println(text);
		in.close();
	}
}


==============================
# stringcharset
import java.io.*;

class JavaTest {
	public static void main(String[] args) throws Exception {
		FileInputStream in = new FileInputStream("애국가.txt");
		byte[] text = new byte[1000];
		int num = in.read(text);
		String utftext = new String(text, "euc-kr");
		System.out.println("읽은 바이트 수 = " + num);
		System.out.println(utftext);
		in.close();
	}
}


==============================
# ansitext
import java.io.*;

class JavaTest {
	public static void main(String[] args) throws Exception {
		String text = "우리나라 대한민국\n1234abcd\n이것은 ANSI 텍스트입니다.";
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
		BufferedReader in = new BufferedReader(new FileReader("애국가-Utf8nb.txt"));
		char[] text = new char[1000];
		int num = in.read(text);
		System.out.println("읽은 문자 개수 = " + num);
		System.out.println(text);
		in.close();
	}
}


==============================
# readstring
import java.io.*;

class JavaTest {
	public static void main(String[] args) {
		String str = ReadFileToString("애국가-Utf8nb.txt");
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
		System.out.println("복사 시작");
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
		System.out.println("복사 완료");
		System.out.println((System.currentTimeMillis()-start)/1000.0 + " 초 걸림");
	}
}


==============================
# filecopy2
import java.io.*;

class JavaTest {
	public static void main(String[] args) throws Exception {
		long start = System.currentTimeMillis();
		System.out.println("복사 시작");
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
		System.out.println("복사 완료");
		System.out.println((System.currentTimeMillis()-start)/1000.0 + " 초 걸림");
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
		out.writeUTF("String 문자열");
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
		LineNumberReader in = new LineNumberReader(new FileReader("애국가-Utf8nb.txt"));
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
		String str = "문자열";
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
		System.out.println("이름을 입력한 후 Enter를 누르시오(끝낼 때는 Ctrl+Z).");
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
		System.out.println("입력완료");
	}
}


==============================
# conin2
import java.io.*;

class JavaTest {
	public static void main(String[] args) {
		int name;
		System.out.println("이름을 입력한 후 Enter를 누르시오(끝낼 때는 Ctrl+Z).");
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
		System.out.println("입력완료");
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
			System.out.println("입력완료");
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
		System.out.print("정수를 입력하시오 : ");
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(r);
		try {
			String str = b.readLine();
			int i = Integer.parseInt(str);
			System.out.println("입력값의 2배 = " + i*2);
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
		System.out.print("정수를 입력하시오 : ");
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		scan.close();
		System.out.println("입력값의 2배 = " + i*2);
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
		System.out.printf("이름 = %s, 색상 = %s, 연료 = %s\n",
			name, color, gasoline ? "휘발유":"경유");
	}
}

class JavaTest {
	public static void main(String[] args) throws Exception {
		Car pride = new Car("프라이드", "파랑", true);

		// 파일로 출력
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("pride.car"));
		out.writeObject(pride);
		out.close();
		System.out.println("파일로 기록");
		
		// 파일로부터 입력
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
		System.out.printf("이름 = %s, 색상 = %s, 연료 = %s\n",
			name, color, gasoline ? "휘발유":"경유");
	}
}

class JavaTest {
	public static void main(String[] args) throws Exception {
		Car pride = new Car("프라이드", "파랑", true);

		// 파일로 출력
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("pride.car"));
		out.writeObject(pride);
		out.close();
		System.out.println("파일로 기록");
		
		// 파일로부터 입력
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

		// 파일로 출력
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("girl.bitmap"));
		out.writeObject(girl);
		out.close();
		
		// 파일로부터 입력
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

		// 파일로 출력
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("girl2.bitmap"));
		out.writeObject(girl);
		out.close();
		
		// 파일로부터 입력
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
				System.out.println("파일입니다.");
				System.out.println("파일경로 : " + f.getParent());
				System.out.println("파일이름 : " + f.getName());
				System.out.println("파일크기 : " + f.length());
				System.out.println("숨김 파일 : " + f.isHidden());
				System.out.println("절대 경로 : " + f.isAbsolute());
			} else if (f.isDirectory()) {
				System.out.println("디렉터리입니다.");
			}
		} else {
			System.out.println("파일이 없습니다.");
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
				out.write("테스트 파일");
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
				System.out.printf("%s %d 바이트\n",arFile[i].getName(), arFile[i].length());
			} else {
				System.out.printf("[%s] <폴더>\n",arFile[i].getName());
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
## 22장 ##

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
		System.out.println("안녕, " + age + "살 " + name.family + name.first + "이라고 해.");
	}
}

class JavaTest {
	public static void main(String[] args) {
		Human kim = new Human(29, "상형", "김");
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
			System.out.println("저는 " + age + "살입니다.");
		}
	}
	
	Human(int age, String first, String family) {
		this.age = age;
		this.name = new Name(first, family);
	}
	
	void intro() {
		System.out.println("안녕, " + age + "살 " + name.family + name.first + "이라고 해.");
	}
}

class JavaTest {
	public static void main(String[] args) {
		Human kim = new Human(29, "상형", "김");
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
			System.out.println("저는 " + age + "살입니다.");
		}
	}
	
	Human(int age, String first, String family) {
		this.age = age;
		this.name = new Name(first, family);
	}
	
	void intro() {
		System.out.println("안녕, " + age + "살 " + name.family + name.first + "이라고 해.");
	}
}

class JavaTest {
	public static void main(String[] args) {
		Human kim = new Human(29, "상형", "김");
		kim.intro();
		
		Human.Name name = kim.new Name("순신", "이");
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
		System.out.println("안녕, " + age + "살 " + name.family + name.first + "이라고 해.");
	}
}

class Util {
	static void outName(Human.Name name) {
		System.out.println(name.family + name.first + "이라고 해.");
	}

	static void outHuman(Human who) {
		who.intro();
	}
}

class JavaTest {
	public static void main(String[] args) {
		Human kim = new Human(29, "상형", "김");
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
		System.out.println("안녕, " + age + "살 " + name.family + name.first + "이라고 해.");
	}
}

class JavaTest {
	public static void main(String[] args) {
		Human kim = new Human(29, "상형", "김");
		kim.intro();
		
		Human.Name name = new Human.Name("순신", "이");
		System.out.println("이름 : " + name.family + name.first);
	}
}


==============================
# staticinner2
class Human {
	int field;
	static int staticField;

	// 내부 클래스는 외부의 모든 멤버를 액세스할 수 있다.
	class Name { 
		void method() {
			field = 0;
			staticField = 0;
		}
	}
	
	// 정적 내부 클래스는 외부의 정적 필드만 액세스할 수 있다.
	static class StaticName { 
		void method() {
			// field = 0;
			staticField = 0;
		}
	}
	
	// 비정적 메서드는 내부, 정적 내부 클래스 모두 액세스할 수 있다.
	void method() {
		Name n = new Name();
		StaticName sn = new StaticName();
	}
	
	// 정적 메서드는 내부 정적 클래스만 액세스할 수 있다.
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
				System.out.println("안녕, " + age + "살 " + name + "이라고 해.");
			}
		}

		Human kim = new Human(29, "김상형");
		kim.intro();
	}
	
	// 메서드 외부에서는 지역 내부 클래스를 참조할 수 없다.
	static void otherMethod() {
		// Human kim = new Human(29, "김상형");
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
		final String nameCaption = "이름";
		final String ageCaption = "나이";
		
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
		Human kim = new Human(29, "김상형");
		kim.intro();
	}
}


==============================
# anonclass
class Human {
	void intro() {
		System.out.println("나는 사람입니다.");
	}
}

class JavaTest {
	public static void main(String[] args) {
		class Student extends Human {
			void intro() {
				System.out.println("나는 학생입니다.");
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
		System.out.println("나는 사람입니다.");
	}
}

class JavaTest {
	public static void main(String[] args) {
		Human lee = new Human() { 
			void intro() {
				System.out.println("나는 학생입니다.");
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
		System.out.println("나는 학생입니다.");
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
				System.out.println("나는 학생입니다.");
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
				System.out.println("나는 학생입니다.");
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
				System.out.println(what + " 작업을 " + time + "시간동안 열심히 하기");
			}
		};
		kim.doWork(kimwork, "보고서 작성", 2);
		
		Staff lee = new Staff();
		Workable leework = new Workable() {
			public void work(String what, int time) {
				System.out.println(time + "시간동안  빈둥대며 " + what);
			}
		};
		kim.doWork(leework, "커피 타기", 3);
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
				System.out.println(what + " 작업을 " + time + "시간동안 열심히 하기");
			}
		}, "보고서 작성", 2);
		
		Staff lee = new Staff();
		kim.doWork(new Staff.Workable() {
			public void work(String what, int time) {
				System.out.println(time + "시간동안  빈둥대며 " + what);
			}
		}, "커피 타기", 3);
	}
}

###########################################################    
## 23장 ##

==============================
# countage
class JavaTest {
	static int[] arAge = { 29, 30, 34, 32, 30, 31, 28, 31, 29, 30 };
	public static void main(String[] args) {
		System.out.println("30세 = " + count30());
		System.out.println("31세 = " + count31());
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
		System.out.println("30세 = " + count(30));
		System.out.println("31세 = " + count(31));
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
		
		System.out.println("29세 이상 = " + count(a -> a >= 29));
		System.out.println("30세 아닌 사람 = " + count(a -> a != 30));
		System.out.println("짝수 나이 = " + count(a -> a % 2 == 0));
		System.out.println("28~30 범위 = " + count(a -> a >= 28 && a <= 30));
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
		// 지역 클래스에서의 this
		class PlusOneImpl implements PlusOne {
			public int plus(int i) {
				System.out.println(this);
				return i+1 ;
			}
		}
		PlusOne po = new PlusOneImpl();
		System.out.println("result = " + po.plus(5));

		// 람다식에서의 this
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
		Human kim = new Human(21, "김상형");
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
			new Human(21, "김상형"),
			new Human(14, "김한슬"),
			new Human(21, "문한울"),
			new Human(66, "구홍녀"),
	};
	
	public static void main(String[] args) {
		listHuman("성인", h -> h.age >= 19);
		listHuman("김가", h -> h.name.startsWith("김"));
		listHuman("미성년 김가", h -> h.name.startsWith("김") && h.age < 19);
	}
	
	static void listHuman(String cap, Predicate<Human> pred) {
		System.out.print(cap + "인 사람 목록 : ");
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
			if (n == 1) return "하나";
			return "영";
		};
		
		// 두 개의 람다를 순서대로 호출하기
		String eng = "one";
		int num = engToNum.apply(eng);
		String han = numToHan.apply(num);
		System.out.println(han);
		
		// 연속으로 호출하기
		Function<String, String> engToHan = engToNum.andThen(numToHan);
		System.out.println(engToHan.apply("one"));
		
		// 연속으로 호출하기
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
		
		System.out.println("7은 홀수인가 : " + isOdd.test(7));
		System.out.println("12는 10보다 큰 짝수인가 : " + evenAndOver10.test(12));
		System.out.println("8은 10보다 큰 짝수인가 : " + evenAndOver10.test(8));
		System.out.println("15는 10보다 크거나 짝수인가 : " + evenOrOver10.test(15));
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
		// 인스턴스 메서드
		Function<String, String> upper = String::toUpperCase;
		System.out.println(upper.apply("korea"));

		// 객체의 인스턴스 메서드
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
		Human kim = creator.apply(21, "김상형");
		System.out.println(kim.age + "세 " + kim.name);
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
		addAnimal(Dog::new, "멍멍이");
		addAnimal(Cow::new, "음메에");
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
		Thread worker = new Thread(() -> System.out.print("스레드가 출력한 문장"));
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
## 24장 ##

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
			new Country("한국", Cont.ASIA, 49, true), 
			new Country("미국", Cont.AMERICA, 318, true), 
			new Country("중국", Cont.ASIA, 1355, false), 
			new Country("프랑스", Cont.EUROPE, 66, true), 
			new Country("나이지리아", Cont.AFRICA, 177, false), 
			new Country("독일", Cont.EUROPE, 80, true), 
			new Country("헝가리", Cont.EUROPE, 9, true), 
			new Country("베트남", Cont.ASIA, 93, false), 
			new Country("칠레", Cont.AMERICA, 17, true), 
			new Country("캐나다", Cont.AMERICA, 34, true) 
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
		System.out.println("OECD 상위 3개국의 인구수 = " + total);
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
			new Country("한국", Cont.ASIA, 49, true), 
			new Country("미국", Cont.AMERICA, 318, true), 
			new Country("중국", Cont.ASIA, 1355, false), 
			new Country("프랑스", Cont.EUROPE, 66, true), 
			new Country("나이지리아", Cont.AFRICA, 177, false), 
			new Country("독일", Cont.EUROPE, 80, true), 
			new Country("헝가리", Cont.EUROPE, 9, true), 
			new Country("베트남", Cont.ASIA, 93, false), 
			new Country("칠레", Cont.AMERICA, 17, true), 
			new Country("캐나다", Cont.AMERICA, 34, true) 
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
		System.out.println("OECD 상위 3개국의 인구수 = " + total);
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
		String[] ar = { "한국", "중국", "일본" };
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
		Stream<String> lines = Files.lines(Paths.get("애국가-Utf8nb.txt"));
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
			new Country("한국", Cont.ASIA, 49, true), 
			new Country("미국", Cont.AMERICA, 318, true), 
			new Country("중국", Cont.ASIA, 1355, false), 
			new Country("프랑스", Cont.EUROPE, 66, true), 
			new Country("나이지리아", Cont.AFRICA, 177, false), 
			new Country("독일", Cont.EUROPE, 80, true), 
			new Country("헝가리", Cont.EUROPE, 9, true), 
			new Country("베트남", Cont.ASIA, 93, false), 
			new Country("칠레", Cont.AMERICA, 17, true), 
			new Country("캐나다", Cont.AMERICA, 34, true) 
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
			new Country("한국", Cont.ASIA, 49, true), 
			new Country("미국", Cont.AMERICA, 318, true), 
			new Country("중국", Cont.ASIA, 1355, false), 
			new Country("프랑스", Cont.EUROPE, 66, true), 
			new Country("나이지리아", Cont.AFRICA, 177, false), 
			new Country("독일", Cont.EUROPE, 80, true), 
			new Country("헝가리", Cont.EUROPE, 9, true), 
			new Country("베트남", Cont.ASIA, 93, false), 
			new Country("칠레", Cont.AMERICA, 17, true), 
			new Country("캐나다", Cont.AMERICA, 34, true) 
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
			new Country("한국", Cont.ASIA, 49, true), 
			new Country("미국", Cont.AMERICA, 318, true), 
			new Country("중국", Cont.ASIA, 1355, false), 
			new Country("프랑스", Cont.EUROPE, 66, true), 
			new Country("나이지리아", Cont.AFRICA, 177, false), 
			new Country("독일", Cont.EUROPE, 80, true), 
			new Country("헝가리", Cont.EUROPE, 9, true), 
			new Country("베트남", Cont.ASIA, 93, false), 
			new Country("칠레", Cont.AMERICA, 17, true), 
			new Country("캐나다", Cont.AMERICA, 34, true) 
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
			new Country("한국", Cont.ASIA, 49, true), 
			new Country("미국", Cont.AMERICA, 318, true), 
			new Country("중국", Cont.ASIA, 1355, false), 
			new Country("프랑스", Cont.EUROPE, 66, true), 
			new Country("나이지리아", Cont.AFRICA, 177, false), 
			new Country("독일", Cont.EUROPE, 80, true), 
			new Country("헝가리", Cont.EUROPE, 9, true), 
			new Country("베트남", Cont.ASIA, 93, false), 
			new Country("칠레", Cont.AMERICA, 17, true), 
			new Country("캐나다", Cont.AMERICA, 34, true) 
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
			new Country("한국", Cont.ASIA, 49, true), 
			new Country("미국", Cont.AMERICA, 318, true), 
			new Country("중국", Cont.ASIA, 1355, false), 
			new Country("프랑스", Cont.EUROPE, 66, true), 
			new Country("나이지리아", Cont.AFRICA, 177, false), 
			new Country("독일", Cont.EUROPE, 80, true), 
			new Country("헝가리", Cont.EUROPE, 9, true), 
			new Country("베트남", Cont.ASIA, 93, false), 
			new Country("칠레", Cont.AMERICA, 17, true), 
			new Country("캐나다", Cont.AMERICA, 34, true) 
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
			new Country("한국", Cont.ASIA, 49, true), 
			new Country("미국", Cont.AMERICA, 318, true), 
			new Country("중국", Cont.ASIA, 1355, false), 
			new Country("프랑스", Cont.EUROPE, 66, true), 
			new Country("나이지리아", Cont.AFRICA, 177, false), 
			new Country("독일", Cont.EUROPE, 80, true), 
			new Country("헝가리", Cont.EUROPE, 9, true), 
			new Country("베트남", Cont.ASIA, 93, false), 
			new Country("칠레", Cont.AMERICA, 17, true), 
			new Country("캐나다", Cont.AMERICA, 34, true) 
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
			new Country("한국", Cont.ASIA, 49, true), 
			new Country("미국", Cont.AMERICA, 318, true), 
			new Country("중국", Cont.ASIA, 1355, false), 
			new Country("프랑스", Cont.EUROPE, 66, true), 
			new Country("나이지리아", Cont.AFRICA, 177, false), 
			new Country("독일", Cont.EUROPE, 80, true), 
			new Country("헝가리", Cont.EUROPE, 9, true), 
			new Country("베트남", Cont.ASIA, 93, false), 
			new Country("칠레", Cont.AMERICA, 17, true), 
			new Country("캐나다", Cont.AMERICA, 34, true) 
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
			new Country("한국", Cont.ASIA, 49, true), 
			new Country("미국", Cont.AMERICA, 318, true), 
			new Country("중국", Cont.ASIA, 1355, false), 
			new Country("프랑스", Cont.EUROPE, 66, true), 
			new Country("나이지리아", Cont.AFRICA, 177, false), 
			new Country("독일", Cont.EUROPE, 80, true), 
			new Country("헝가리", Cont.EUROPE, 9, true), 
			new Country("베트남", Cont.ASIA, 93, false), 
			new Country("칠레", Cont.AMERICA, 17, true), 
			new Country("캐나다", Cont.AMERICA, 34, true) 
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
			new Country("한국", Cont.ASIA, 49, true), 
			new Country("미국", Cont.AMERICA, 318, true), 
			new Country("중국", Cont.ASIA, 1355, false), 
			new Country("프랑스", Cont.EUROPE, 66, true), 
			new Country("나이지리아", Cont.AFRICA, 177, false), 
			new Country("독일", Cont.EUROPE, 80, true), 
			new Country("헝가리", Cont.EUROPE, 9, true), 
			new Country("베트남", Cont.ASIA, 93, false), 
			new Country("칠레", Cont.AMERICA, 17, true), 
			new Country("캐나다", Cont.AMERICA, 34, true) 
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
			new Country("한국", Cont.ASIA, 49, true), 
			new Country("미국", Cont.AMERICA, 318, true), 
			new Country("중국", Cont.ASIA, 1355, false), 
			new Country("프랑스", Cont.EUROPE, 66, true), 
			new Country("나이지리아", Cont.AFRICA, 177, false), 
			new Country("독일", Cont.EUROPE, 80, true), 
			new Country("헝가리", Cont.EUROPE, 9, true), 
			new Country("베트남", Cont.ASIA, 93, false), 
			new Country("칠레", Cont.AMERICA, 17, true), 
			new Country("캐나다", Cont.AMERICA, 34, true) 
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
			new Country("한국", Cont.ASIA, 49, true), 
			new Country("미국", Cont.AMERICA, 318, true), 
			new Country("중국", Cont.ASIA, 1355, false), 
			new Country("프랑스", Cont.EUROPE, 66, true), 
			new Country("나이지리아", Cont.AFRICA, 177, false), 
			new Country("독일", Cont.EUROPE, 80, true), 
			new Country("헝가리", Cont.EUROPE, 9, true), 
			new Country("베트남", Cont.ASIA, 93, false), 
			new Country("칠레", Cont.AMERICA, 17, true), 
			new Country("캐나다", Cont.AMERICA, 34, true) 
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
			new Country("한국", Cont.ASIA, 49, true), 
			new Country("미국", Cont.AMERICA, 318, true), 
			new Country("중국", Cont.ASIA, 1355, false), 
			new Country("프랑스", Cont.EUROPE, 66, true), 
			new Country("나이지리아", Cont.AFRICA, 177, false), 
			new Country("독일", Cont.EUROPE, 80, true), 
			new Country("헝가리", Cont.EUROPE, 9, true), 
			new Country("베트남", Cont.ASIA, 93, false), 
			new Country("칠레", Cont.AMERICA, 17, true), 
			new Country("캐나다", Cont.AMERICA, 34, true) 
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
		Human kim = new Human(29, "김상형", "센스");
		useBook(kim);
	}
	
	static void useBook(Human human) {
		System.out.println("내 노트북 : " + human.book.model);
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
		Human kim = new Human(29, "김상형", "레노보");
		useBook(kim);
		Human lee = new Human(44, "이승우", null);
		useBook(lee);
	}
	
	static void useBook(Human human) {
		if (human.book.isPresent()) {
			String model = human.book.get().model;
			System.out.println("내 노트북 : " + model);
		} else {
			System.out.println("노트북이 없다.");
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
		Human kim = new Human(29, "김상형", "레노보");
		useBook(kim);
		Human lee = new Human(44, "이승우", null);
		useBook(lee);
	}
	
	static void useBook(Human human) {
		human.book.ifPresent(b -> System.out.println("내 노트북 : " + b.model));
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
		Human kim = new Human(29, "김상형", "레노보");
		useBook(kim);
		Human lee = new Human(44, "이승우", null);
		useBook(lee);
	}
	
	static void useBook(Human human) {
		Notebook book = human.book.orElse(new Notebook("싸구려"));
		System.out.println("내 노트북 : "  + book.model);
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
		Human kim = new Human(29, "김상형", "삼성 아티브");
		useBook(kim);
	}
	
	static void useBook(Human human) {
		human.book.filter(b -> b.model.indexOf("삼성") != -1)
		.ifPresent(b -> System.out.println("삼성 노트북"));
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
		Human kim = new Human(29, "김상형", "");
		useBook(kim);
	}
	
	static void useBook(Human human) {
		String model = human.book.map(b -> b.model).orElse("이름없음");
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
			new Country("한국", Cont.ASIA, 49, true), 
			new Country("미국", Cont.AMERICA, 318, true), 
			new Country("중국", Cont.ASIA, 1355, false), 
			new Country("프랑스", Cont.EUROPE, 66, true), 
			new Country("나이지리아", Cont.AFRICA, 177, false), 
			new Country("독일", Cont.EUROPE, 80, true), 
			new Country("헝가리", Cont.EUROPE, 9, true), 
			new Country("베트남", Cont.ASIA, 93, false), 
			new Country("칠레", Cont.AMERICA, 17, true), 
			new Country("캐나다", Cont.AMERICA, 34, true) 
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
			new Country("한국", Cont.ASIA, 49, true), 
			new Country("미국", Cont.AMERICA, 318, true), 
			new Country("중국", Cont.ASIA, 1355, false), 
			new Country("프랑스", Cont.EUROPE, 66, true), 
			new Country("나이지리아", Cont.AFRICA, 177, false), 
			new Country("독일", Cont.EUROPE, 80, true), 
			new Country("헝가리", Cont.EUROPE, 9, true), 
			new Country("베트남", Cont.ASIA, 93, false), 
			new Country("칠레", Cont.AMERICA, 17, true), 
			new Country("캐나다", Cont.AMERICA, 34, true) 
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
			new Country("한국", Cont.ASIA, 49, true), 
			new Country("미국", Cont.AMERICA, 318, true), 
			new Country("중국", Cont.ASIA, 1355, false), 
			new Country("프랑스", Cont.EUROPE, 66, true), 
			new Country("나이지리아", Cont.AFRICA, 177, false), 
			new Country("독일", Cont.EUROPE, 80, true), 
			new Country("헝가리", Cont.EUROPE, 9, true), 
			new Country("베트남", Cont.ASIA, 93, false), 
			new Country("칠레", Cont.AMERICA, 17, true), 
			new Country("캐나다", Cont.AMERICA, 34, true) 
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
			new Country("한국", Cont.ASIA, 49, true), 
			new Country("미국", Cont.AMERICA, 318, true), 
			new Country("중국", Cont.ASIA, 1355, false), 
			new Country("프랑스", Cont.EUROPE, 66, true), 
			new Country("나이지리아", Cont.AFRICA, 177, false), 
			new Country("독일", Cont.EUROPE, 80, true), 
			new Country("헝가리", Cont.EUROPE, 9, true), 
			new Country("베트남", Cont.ASIA, 93, false), 
			new Country("칠레", Cont.AMERICA, 17, true), 
			new Country("캐나다", Cont.AMERICA, 34, true) 
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
			new Country("한국", Cont.ASIA, 49, true), 
			new Country("미국", Cont.AMERICA, 318, true), 
			new Country("중국", Cont.ASIA, 1355, false), 
			new Country("프랑스", Cont.EUROPE, 66, true), 
			new Country("나이지리아", Cont.AFRICA, 177, false), 
			new Country("독일", Cont.EUROPE, 80, true), 
			new Country("헝가리", Cont.EUROPE, 9, true), 
			new Country("베트남", Cont.ASIA, 93, false), 
			new Country("칠레", Cont.AMERICA, 17, true), 
			new Country("캐나다", Cont.AMERICA, 34, true) 
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
			new Country("한국", Cont.ASIA, 49, true), 
			new Country("미국", Cont.AMERICA, 318, true), 
			new Country("중국", Cont.ASIA, 1355, false), 
			new Country("프랑스", Cont.EUROPE, 66, true), 
			new Country("나이지리아", Cont.AFRICA, 177, false), 
			new Country("독일", Cont.EUROPE, 80, true), 
			new Country("헝가리", Cont.EUROPE, 9, true), 
			new Country("베트남", Cont.ASIA, 93, false), 
			new Country("칠레", Cont.AMERICA, 17, true), 
			new Country("캐나다", Cont.AMERICA, 34, true) 
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
			new Country("한국", Cont.ASIA, 49, true), 
			new Country("미국", Cont.AMERICA, 318, true), 
			new Country("중국", Cont.ASIA, 1355, false), 
			new Country("프랑스", Cont.EUROPE, 66, true), 
			new Country("나이지리아", Cont.AFRICA, 177, false), 
			new Country("독일", Cont.EUROPE, 80, true), 
			new Country("헝가리", Cont.EUROPE, 9, true), 
			new Country("베트남", Cont.ASIA, 93, false), 
			new Country("칠레", Cont.AMERICA, 17, true), 
			new Country("캐나다", Cont.AMERICA, 34, true) 
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
			new Country("한국", Cont.ASIA, 49, true), 
			new Country("미국", Cont.AMERICA, 318, true), 
			new Country("중국", Cont.ASIA, 1355, false), 
			new Country("프랑스", Cont.EUROPE, 66, true), 
			new Country("나이지리아", Cont.AFRICA, 177, false), 
			new Country("독일", Cont.EUROPE, 80, true), 
			new Country("헝가리", Cont.EUROPE, 9, true), 
			new Country("베트남", Cont.ASIA, 93, false), 
			new Country("칠레", Cont.AMERICA, 17, true), 
			new Country("캐나다", Cont.AMERICA, 34, true) 
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
			new Country("한국", Cont.ASIA, 49, true), 
			new Country("미국", Cont.AMERICA, 318, true), 
			new Country("중국", Cont.ASIA, 1355, false), 
			new Country("프랑스", Cont.EUROPE, 66, true), 
			new Country("나이지리아", Cont.AFRICA, 177, false), 
			new Country("독일", Cont.EUROPE, 80, true), 
			new Country("헝가리", Cont.EUROPE, 9, true), 
			new Country("베트남", Cont.ASIA, 93, false), 
			new Country("칠레", Cont.AMERICA, 17, true), 
			new Country("캐나다", Cont.AMERICA, 34, true) 
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
			new Country("한국", Cont.ASIA, 49, true), 
			new Country("미국", Cont.AMERICA, 318, true), 
			new Country("중국", Cont.ASIA, 1355, false), 
			new Country("프랑스", Cont.EUROPE, 66, true), 
			new Country("나이지리아", Cont.AFRICA, 177, false), 
			new Country("독일", Cont.EUROPE, 80, true), 
			new Country("헝가리", Cont.EUROPE, 9, true), 
			new Country("베트남", Cont.ASIA, 93, false), 
			new Country("칠레", Cont.AMERICA, 17, true), 
			new Country("캐나다", Cont.AMERICA, 34, true) 
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
			new Country("한국", Cont.ASIA, 49, true), 
			new Country("미국", Cont.AMERICA, 318, true), 
			new Country("중국", Cont.ASIA, 1355, false), 
			new Country("프랑스", Cont.EUROPE, 66, true), 
			new Country("나이지리아", Cont.AFRICA, 177, false), 
			new Country("독일", Cont.EUROPE, 80, true), 
			new Country("헝가리", Cont.EUROPE, 9, true), 
			new Country("베트남", Cont.ASIA, 93, false), 
			new Country("칠레", Cont.AMERICA, 17, true), 
			new Country("캐나다", Cont.AMERICA, 34, true) 
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
			new Country("한국", Cont.ASIA, 49, true), 
			new Country("미국", Cont.AMERICA, 318, true), 
			new Country("중국", Cont.ASIA, 1355, false), 
			new Country("프랑스", Cont.EUROPE, 66, true), 
			new Country("나이지리아", Cont.AFRICA, 177, false), 
			new Country("독일", Cont.EUROPE, 80, true), 
			new Country("헝가리", Cont.EUROPE, 9, true), 
			new Country("베트남", Cont.ASIA, 93, false), 
			new Country("칠레", Cont.AMERICA, 17, true), 
			new Country("캐나다", Cont.AMERICA, 34, true) 
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
## 25장 ##

==============================
# const
class JavaTest {
	public static void main(String[] args) {
		final int EAST = 1;
		final int WEST = 2;
		final int SOUTH = 3;
		final int NORTH = 4;
		
		int origin = EAST;				// 동쪽으로 초기화
		origin = SOUTH;				// 남쪽으로 대입
		if (origin == WEST) { } 		// 서쪽이면
		if (origin != NORTH) { }			// 북쪽이 아니면
	}
}


==============================
# enum
enum Direction { EAST, WEST, SOUTH, NORTH };

class JavaTest {
	public static void main(String[] args) {
		
		Direction origin = Direction.EAST;		// 동쪽으로 초기화
		origin = Direction.SOUTH;				// 남쪽으로 대입
		if (origin == Direction.WEST) { } 		// 서쪽이면
		if (origin != Direction.NORTH) { }		// 북쪽이 아니면
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
		// origin = 9;						// 에러
		// if (origin == Yoil.SUN) { }			// 에러
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
		System.out.print("중 하나를 선택하십시오.");
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
	EAST("동"), WEST("서"), SOUTH("남"), NORTH("북");
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
		System.out.println(origin.getHanDir() + "쪽으로 갑니다.");
	}
}


==============================
# enumvalue2
enum JavaType {
	SHORT("짧은 정수형",2), INT("정수형",4),DOUBLE("실수형",8);
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
		
		System.out.println("타입 : " + Type + ", 이름 : " + 
			Type.getName() + ", 길이 : " + Type.getLength());
	}
}


==============================
# deprecate
class Car {
	String name;
	boolean gasoline;
	
	void run() {
		if (gasoline) {
			System.out.println("부릉 부릉");
		} else {
			System.out.println("덜컹 덜컹");
		}
	}
	
	@Deprecated
	void stop() {
		System.out.println("끼이익");
	}
}

class JavaTest {
	public static void main(String[] args) {
		Car korando = new Car();
		korando.name = "코란도C";
		korando.gasoline = false;
		
		korando.run();
		korando.stop();
	}
}


==============================
# override
class Human {
	void move(int x, int y) {
		System.out.println("사람 : 뚜벅 뚜벅");
	}
	int think(String what) { 
		return 0;
	}
}

class Student extends Human {
	void mobe(int x, int y) { 
		System.out.println("학생 : 아장 아장");
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
## 26장 ##

==============================
# dumpcity
import java.sql.*;

class JavaTest {
	public static void main(String[] args) {
		try {
			// 드라이버 로드
			Class.forName("org.mariadb.jdbc.Driver");
			// 연결
			Connection conn = DriverManager.getConnection(
				"jdbc:mariadb://localhost:3306/Study", "root", "asdf");
			// 명령 실행
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM City");
			// 결과셋 읽음
			while (rs.next()) {
				String name = rs.getString("name");
				int popu = rs.getInt("popu");
				int area = rs.getInt("area");
				System.out.printf("%s :%4d만명, %4dkm\n", name, popu, area);
			}
			// 정리
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

			// 테이블 재초기화
			stmt.executeUpdate("DROP TABLE IF EXISTS Staff;"); 
			stmt.executeUpdate("CREATE TABLE Staff (" + 
					"name NVARCHAR (30) NOT NULL PRIMARY KEY," + 
					"depart NVARCHAR (10) NOT NULL," + 
					"salary INT NOT NULL," + 
					"achieve INT NULL," + 
					"workMonth INT NULL);");
			// 샘플 레코드 삽입
			stmt.executeUpdate("INSERT INTO Staff VALUES ('김유신','관리부',180,88,12);");
			stmt.executeUpdate("INSERT INTO Staff VALUES ('유관순','지원부',190,NULL,28);");
			stmt.executeUpdate("INSERT INTO Staff VALUES ('안중근','영업부',185,76,19);");
			stmt.executeUpdate("INSERT INTO Staff VALUES ('윤봉길','생산부',200,71,38);");
			stmt.executeUpdate("INSERT INTO Staff VALUES ('강감찬','영업부',150,28,3);");
			stmt.executeUpdate("INSERT INTO Staff VALUES ('정몽주','관리부',170,88,12);");

			// 결과셋 읽음
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
			
			stmt.executeUpdate("UPDATE Staff SET salary=250 WHERE name='김유신';");
			stmt.executeUpdate("DELETE FROM Staff WHERE depart='영업부';");
			
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.getMessage();
		}
	}
}

###########################################################    
## 27장 ##

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

		// 전체 레이아웃은 수직 박스
		Container cp = frame.getContentPane();
		BoxLayout layout = new BoxLayout(cp, BoxLayout.Y_AXIS);
		cp.setLayout(layout);

		// 위에 레이블 배치
		JLabel label = new JLabel("label");
		cp.add(label);
		
		// 패널에 플로우 레이아웃 설정
		JPanel panel = new JPanel();
		FlowLayout flow = new FlowLayout();
		panel.setLayout(flow);

		// 두 개의 버튼 추가
		JButton btn1 = new JButton("btn1");
		JButton btn2 = new JButton("btn2");
		panel.add(btn1);
		panel.add(btn2);
		
		// 패널을 전체 레이아웃에 추가
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
		// ② 리스너 객체 생성
		ActionListenerImpl listener = new ActionListenerImpl();
		// ③ 리스너 지정
		button.addActionListener(listener);
		
		Container cp = frame.getContentPane();
		cp.add(button);
		frame.pack();
		frame.setVisible(true);
	}
}

// ① 리스너 클래스 정의
class ActionListenerImpl implements ActionListener {
	public void actionPerformed(ActionEvent event) {
		JOptionPane.showMessageDialog(null, "버튼을 클릭하였습니다.");
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
				JOptionPane.showMessageDialog(null, "버튼을 클릭하였습니다.");
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
				JOptionPane.showMessageDialog(null, "버튼을 클릭하였습니다.");
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
## 팁모음 ##

==============================
# shortcircuit
class JavaTest {
	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		
		if (a == 5 && ++b == 5) {
			System.out.println("빙고");
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
		System.out.println("5 팩토리얼 = " + factorial(5));
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
		System.out.println("오늘은 " + md[0] + 
				"월 " + md[1] + "일입니다.");
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
		System.out.println("오늘은 " + md.month + 
				"월 " + md.day + "일입니다.");
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
		name = "이름없음";
	}

	Human(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	void intro() {
		System.out.println("안녕, " + age + "살 " + name + "이라고 해.");
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
		System.out.println("하늘천 따지 검을현 누를황");
	}
}

class JavaTest {
	public static void main(String[] args) {
		Student kim = new Student(8906299, "경제");
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
		System.out.println("주민 등록 번호 : " + number);
	}
}

class Student extends Human {
	int number;
	
	Student(int junum, int stnum) {
		super(junum);
		this.number = stnum;
	}
	
	void intro() {
		System.out.println("주민 등록 번호 : " + super.number + ", 학번 : " + number);
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
		String city = "서울,대전,대구,부산";
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
			System.out.println("산술 연산 예외 발생");
		}
	}
}

