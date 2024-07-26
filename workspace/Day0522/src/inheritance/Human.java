package inheritance;

public class Human {
	String name;
	int age;
	NoteBook noteBook;
	
	Human(int age, String name, String cpu) {
		this.age = age;
		this.name = name;
		noteBook = new NoteBook(cpu);
	}
	Human(int age, String name) {
		this.age = age;
		this.name = name;
		
	}
	
	void introNote() {
		intro();
		System.out.print("내 노트북의 ");
		noteBook.printSpec();
	}
	
	void intro() {
		System.out.println(age + "살 " + name + "입니다.");
	}
	
	void study() {
		System.out.println("공부한다.");
	}
}
