package com.tw.Spelassignment;

import org.springframework.stereotype.Component;

@Component
public class User {
private String username;
private int money;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public int getMoney() {
	return money;
}
public void setMoney(int money) {
	this.money = money;
}
public User(String username, int money) {
	super();
	this.username = username;
	this.money = money;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "User [username=" + username + ", money=" + money + "]";
}

}
