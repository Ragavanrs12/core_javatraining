package com.tw.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Simcard")
public class Simcard {
	@Autowired
	private prepaid prepaid;
	@Autowired
private Postpaid postpaid;
public prepaid getPrepaid() {
	return prepaid;
}
public void setPrepaid(prepaid prepaid) {
	this.prepaid = prepaid;
}
public Postpaid getPostpaid() {
	return postpaid;
}
public void setPostpaid(Postpaid postpaid) {
	this.postpaid = postpaid;
}

}
