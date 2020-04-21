package com.occamsrazor.web.grade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.occamsrazor.web.util.Credit;
import com.occamsrazor.web.util.Messenger;

public class GradeController {
	@Autowired GradeService gradeService;
	
	@PostMapping("/add")
	public Messenger add(@RequestBody Grade grade) {
		int current = gradeService.count();
		gradeService.add(grade);
		return (gradeService.count() == (current + 1)) ? Messenger.SUCCESS : Messenger.FAIL;
	}
	
	@PostMapping("/record")
	public Credit record(@RequestBody Grade grade) {
		Credit credit = gradeService.record(grade);
		return credit;
	}
	
}
