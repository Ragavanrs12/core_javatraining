package com.tw.springmvc;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class StudentController {
	@Autowired
	private StudentService service;
//	@GetMapping("/greeting")
//	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
//		model.addAttribute("name", name);
//		return "greeting";\
	//@GetMapping(value= "/greeting")
	@RequestMapping(value = "/greeting",method = RequestMethod.GET, produces = "application/json")
	public List<Student> getProduct(){
		List<Student> product =service.display();
		return product;
}
}


