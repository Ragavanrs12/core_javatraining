package com.thirdware.collection;

public class PersonalInfo {
public int id;
public String phone,address;
public char gender;
public PersonalInfo(int id, String phone, String address, char gender) {
	super();
	this.id = id;
	this.phone = phone;
	this.address = address;
	this.gender = gender;
}


public int getId() {
	return id;
}


public String getPhone() {
	return phone;
}


public String getAddress() {
	return address;
}


@Override
public String toString() {
	return "PersonalInfo [id=" + id + ", phone=" + phone + ", address=" + address + ", gender=" + gender + "]";
}

public char getGender() {
	return gender;
}


@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + id;
	return result;
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	PersonalInfo other = (PersonalInfo) obj;
	if (id != other.id)
		return false;
	return true;
}

}

