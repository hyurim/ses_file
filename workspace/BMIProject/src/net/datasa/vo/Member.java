package net.datasa.vo;

public class Member {
	private int myCode; 		// 회원 코드
	private String name; 		// 이름
	private double height; 		// 키
	private double weight;		// 몸무게
	private double bmi;			// bmi 지수
	private String bmiResult; 	// bmi 결과
	private static int code = 1000;	// 코드 발생 (static 변수)
	
	public int getMyCode() {
		return myCode;
	}

	public void setMyCode(int myCode) {
		this.myCode = myCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getBmi() {
		return bmi;
	}

	public String getBmiResult() {
		return bmiResult;
	}

	public Member(String name, double height, double weight) {
		myCode = ++code;
		
		this.name = name;
		this.height = height;
		this.weight = weight;
		calcBMI();
	}
	@Override
    public String toString() {
        return String.format("회원 코드: %d, 이름: %s, 키: %.2f cm, 몸무게: %.2f kg, BMI: %.2f, 결과: %s",
                myCode, name, height, weight, bmi, bmiResult);
    }

	private void calcBMI() {
		double heightToM = height/100;
		bmi = weight / Math.pow(heightToM, 2); // 제곱
		
		if (bmi < 18.5) {
			bmiResult  = "저체중";
		} else if (bmi <= 23) {
			bmiResult = "정상";
		} else if (bmi <= 28) {
			bmiResult = "과체중";
		} else {
			bmiResult = "비만";
			
		}
	}
}
