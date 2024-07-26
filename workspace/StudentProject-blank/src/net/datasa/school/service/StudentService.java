package net.datasa.school.service;

import java.util.ArrayList;
import java.util.List;

import net.datasa.school.vo.Student;

public class StudentService {
	List<Student> list = new ArrayList<>();
	
	public void insertStudent(Student student) {
		list.add(student);
	}
	
	public Student selectByStdNum(int StdNum) {
		for(Student s: list) {
			if (s.getStdNum() == StdNum) {
				return s;
			}
		}
		return null;
	}
	
	public List<Student> selectAll() {
		return list;
	}
	
	public boolean updateByStudent(int stdNum, int kor, int eng, int math) {
		Student student = selectByStdNum(stdNum);
		if (student != null) {
			student.setKor(kor);
			student.setEng(eng);
			student.setMath(math);
			student.calcAvg();
			return true;
		}
		return false;
	}
	
	public boolean deleteByStdNum(int stdNum) {
		Student student = selectByStdNum(stdNum);
		list.remove(student);
        return true;
	}
}










