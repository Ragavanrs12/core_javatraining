package com.tw.springmvc;

import java.util.List;

import org.springframework.stereotype.Component;
@Component
public interface StudentInterface {

	public List<Student> display();
}
