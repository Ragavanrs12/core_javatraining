package com.tw.aop;

import org.springframework.stereotype.Component;

@Component
public class Postpaid {
@Override
	public String toString() {
		return "Postpaid [name=" + name + "]";
	}

private String name="nitin";

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

}
