package com.example.demo;

//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;
//@NoArgsConstructor
//@AllArgsConstructor
//@ToString
//@Getter
//@Setter
public class Employee {
	private String eName;
	private String eAddr;
	private Department dept;

	public Employee(String eName, String eAddr, Department dept) {
		super();
		this.eName = eName;
		this.eAddr = eAddr;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [eName=" + eName + ", eAddr=" + eAddr + ", dept=" + dept + "]";
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteAddr() {
		return eAddr;
	}

	public void seteAddr(String eAddr) {
		this.eAddr = eAddr;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	
}
}