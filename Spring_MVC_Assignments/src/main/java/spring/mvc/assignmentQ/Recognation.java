package spring.mvc.assignmentQ;

import org.springframework.stereotype.Service;

@Service
public class Recognation {
	
	public boolean RecongnationUser(String name,String accountNo)
	{
		
		if(name.equals("Alisha")&& accountNo.equals("1234567"))
		{
			
			return true;
		}
		return false;
		
	}

}
