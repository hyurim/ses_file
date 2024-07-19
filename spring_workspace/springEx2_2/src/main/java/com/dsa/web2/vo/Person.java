package com.dsa.web2.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
	private String name;
	private int age;
	private String phone;
	// private로 선언해서 접근할 때 변수가 가진 값을 불러올 때는 getter 값을 변경할 때는 setter
	// 
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public String getPhone() {
//		return phone;
//	}
//	public void setPhone(String phone) {
//		this.phone = phone;
//	}
//	@Override
//	public String toString() {
//		return "Person [name=" + name + ", age=" + age + ", phone=" + phone + "]";
//	}
	
}
