package spring.mvc.assignment;


import java.util.ArrayList;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;


public class Customer {
    @NotEmpty(message="Username should not be empty")
    @Size(min=8,max=20,message="Username Sholud be in bewteen 8 to 20 characters")
	private String usesrname;
	
    @NotEmpty(message="Password should not be empty")
    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$",message="password should be one uppercase and lower case and number and speical character")  
    @Size(min=8,max=20,message="Password Sholud be in bewteen 8 to 20")
	String password;
    
    @NotEmpty(message="Email should not be empty")
	String email;
    
    @Min(value =1000000000,message="the contact number must be 10 digit")
	long contact;
    
	ArrayList<String> city;
	
    @Min(value =100000,message="the zipcode number must be 6 digit")
	int zipcode;
	 
	 
	public String getUsesrname() {
		return usesrname;
	}
	public void setUsesrname(String usesrname) {
		this.usesrname = usesrname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public ArrayList<String> getCity() {
		return city;
	}
	public void setCity(ArrayList<String> city) {
		this.city = city;
	}
	public long getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	 
	
	

}
