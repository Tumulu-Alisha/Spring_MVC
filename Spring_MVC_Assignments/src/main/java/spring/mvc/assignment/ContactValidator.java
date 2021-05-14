package spring.mvc.assignment;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ContactValidator implements ConstraintValidator<IsValidContact,String> {


	@Override
	public void initialize(IsValidContact isValidContact) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isValid(String city, ConstraintValidatorContext cxt) {
		return false;
	}
}
