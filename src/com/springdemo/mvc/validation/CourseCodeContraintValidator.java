package com.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeContraintValidator 
		implements ConstraintValidator<CourseCode, String>{

	private String[] coursePrefix;
	
	@Override
	public void initialize(CourseCode theCourseCode) {
		this.coursePrefix=theCourseCode.value();
	}
	
	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {
		
		boolean result=false;
		
		if(theCode!=null) {
			for(String value : coursePrefix) {
				result=theCode.startsWith(value);
				if(result) {
					break; 
				}
			}
		}else {
			result= true;
		}
		
		return result;
	}

}
