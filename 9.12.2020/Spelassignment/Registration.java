package com.tw.Spelassignment;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("registration")
public class Registration {
	@Value("nirmal@gmail.com")
	private String email;
//	
	//@Value("18")
	private int age;
	String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
	@Value("#{registration.email matches registration.regex}")
	private boolean validemail;
	private User user;
	@Value("#{registration.getAge > 18}")
	private boolean validage;
	@Value("#{registration.getAge eq 18}")
	private boolean ageEqualto18;
	@Value("#{registration.getAge lt 18}")
	private boolean agelessthan18;
	@Value("#{registration.getAge LE 18}")
	private boolean lessThanOrEqual18;
	@Value("#{registration.getAge GE 18}")
	private boolean greaterThanOrEqual18;
	@Value("#{registration.getAge GT 18}")
	private boolean greaterThanAlphabetic;
	@Value("#{registration.age}")
	private int b;
	
	
	
	
	public Registration(String email, int age, String regex, boolean validemail, User user, boolean validage,
			boolean ageEqualto18, boolean agelessthan18, boolean lessThanOrEqual18, boolean greaterThanOrEqual18,
			boolean greaterThanAlphabetic) {
		super();
		this.email = email;
		this.age = age;
		this.regex = regex;
		this.validemail = validemail;
		this.user = user;
		this.validage = validage;
		this.ageEqualto18 = ageEqualto18;
		this.agelessthan18 = agelessthan18;
		this.lessThanOrEqual18 = lessThanOrEqual18;
		this.greaterThanOrEqual18 = greaterThanOrEqual18;
		this.greaterThanAlphabetic = greaterThanAlphabetic;
		
	}
	public boolean isAgeEqualto18() {
		return ageEqualto18;
	}
	public void setAgeEqualto18(boolean ageEqualto18) {
		this.ageEqualto18 = ageEqualto18;
	}
	public boolean isAgelessthan18() {
		return agelessthan18;
	}
	public void setAgelessthan18(boolean agelessthan18) {
		this.agelessthan18 = agelessthan18;
	}
	public boolean isLessThanOrEqual18() {
		return lessThanOrEqual18;
	}
	public void setLessThanOrEqual18(boolean lessThanOrEqual18) {
		this.lessThanOrEqual18 = lessThanOrEqual18;
	}
	public boolean isGreaterThanOrEqual18() {
		return greaterThanOrEqual18;
	}
	public void setGreaterThanOrEqual18(boolean greaterThanOrEqual18) {
		this.greaterThanOrEqual18 = greaterThanOrEqual18;
	}
	public boolean isGreaterThanAlphabetic() {
		return greaterThanAlphabetic;
	}
	public void setGreaterThanAlphabetic(boolean greaterThanAlphabetic) {
		this.greaterThanAlphabetic = greaterThanAlphabetic;
	}
	public void printValidationResults(){
	         
	        StringBuilder sb = new StringBuilder();
	        sb.append("empNameValid: ").append(validemail).append("\n");
	        sb.append("validAge: ").append(validage).append("\n");
	        System.out.println(sb.toString());
	    }
	public String getRegex() {
		return regex;
	}
	public void setRegex(String regex) {
		this.regex = regex;
	}
	
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
public Registration() {
	super();
	
	// TODO Auto-generated constructor stub
}

public Registration(String email, int age, boolean validage, boolean validemail, User user) {
	super();
	this.email = email;
	this.age = age;
	this.validage = validage;
	this.validemail = validemail;
	this.user = user;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public boolean isValidage() {
	return validage;
}
public void setValidage(boolean validage) {
	this.validage = validage;
}
public boolean isValidemail() {
	return validemail;
}
public void setValidemail(boolean validemail) {
	this.validemail = validemail;
}
@Override
public String toString() {
	return "Registration [email=" + email + ", age=" + age +  ", validemail=" + validemail
			+ ", user=" + user + ", validage=" + validage + ", ageEqualto18=" + ageEqualto18 + ", agelessthan18="
			+ agelessthan18 + ", lessThanOrEqual18=" + lessThanOrEqual18 + ", greaterThanOrEqual18="
			+ greaterThanOrEqual18 + ", greaterThan18=" + greaterThanAlphabetic + ", greaterThan18=" + b+ "]";
	
}


}
