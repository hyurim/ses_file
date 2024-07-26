package net.datasa.school.vo;

public class Student {
	//멤버변수(필드)
	private int stdNum;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	public static int num = 100;
	//사용자 정의 생성자
	public Student(String name, int kor, int eng, int math) {
		stdNum = ++num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		calcAvg();
	}
	//3과목의 평균 계산
	public void calcAvg() {
		total = kor + eng + math;
		double doubleTotal = total;
		avg = doubleTotal / 3;
	}
	
	//엑세서(accessor) Getter, Setter
	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getStdNum() {
		return stdNum;
	}

	public int getTotal() {
		return total;
	}

	public double getAvg() {
		return avg;
	}

	//toString() 재정의
	
	@Override
	public String toString() {
		return String.format("학번 : %d 이름: %s 국어: %d 영어: %d 수학: %d 총점: %d 평균: %.2f ", stdNum, name, kor, eng, math, total, avg);
	}
}


















