package com.occamsrazor.web.grade;

import org.springframework.stereotype.Service;

@Service
public class GradeServiceImpl implements GradeService {
	private Grade[] grades;
	private int count;
	
	public GradeServiceImpl() {
		grades = new Grade[5];
		count = 0;
	}
	
	@Override
	public void add(Grade grade) {
		grades[count] = grade;
		count++;
		
	}

	@Override
	public Grade[] list() {
		return grades;
	}

	@Override
	public Grade detail(String userid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		return count;
	}

	@Override
	public void update(Grade grade) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Grade grade) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int total(Grade grade) {
		
		return Integer.parseInt(grade.getKor()+grade.getEng()+grade.getMath()+grade.getJava());
	}

	@Override
	public int avg(Grade grade) {
		
		return total(grade)/4;
	}

	@Override
	public String record(Grade grade) {
		String result = "";
		int avg = avg(grade);
		if (avg >= 90) {
			result = "A";
		} else if (avg >= 80) {
			result = "B";
		} else if (avg >= 70) {
			result = "C";
		} else if (avg >= 60) {
			result = "D";
		} else if (avg >= 50) {
			result = "E";
		} else {
			result = "F";
		}
		return result;
	}
	

}
