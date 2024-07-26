package inheritance;

public class JavaTest {

	public static void main(String[] args) {
		Human kim = new Human(29, "김상형");
		kim.intro();
		Student lee = new Student(43, "이승우", 9312345, "경영");
		lee.intro();
		lee.study();
		
		Graduate park = new Graduate(35, "박대희", 95001122, "전산", "웹 보안에 대한 연구 ");
		park.intro();
		park.study();
		park.research();
	}

	String str = new String("aaa");
}
