package boundtype;

public class Test1 {

	public static void main(String[] args) {
	Human h = new Human();
	
	Box<Human> bh = new Box<>(h);
	h.intro();
	bh.intro();
	printMan(bh);
	
	Student s = new Student();
	Box<Student> bs = new Box<>(s);
	s.intro();
	bs.intro();
	System.out.println(bh.getClass() == bs.getClass());
	}
	
	static void printMan(Box<? extends Human> box) {
		box.intro();
	}

}
