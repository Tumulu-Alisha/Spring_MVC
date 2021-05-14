package spring.mvc.Q12;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GolbalExceptionClasshandl {
	
	
	@ExceptionHandler(value=ArithmeticException.class)
	public String handleExveption(Exception e)
	{   
		
		System.out.println("Balance insuffcient");
		return "insufficient balance";
		
		
		
	}

}
