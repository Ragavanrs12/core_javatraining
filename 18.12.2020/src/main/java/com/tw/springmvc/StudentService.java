package com.tw.springmvc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Component
@Service
public class StudentService implements StudentInterface {
private  List<Student> st;
 public List<Student> display(){
st=new ArrayList<Student>();
st.add(new Student(1,"rana",60));
st.add(new Student(2,"ragav",70));
st.add(new Student(3,"nirmal",80));
st.add(new Student(4,"lucifer",56));

return st;
}
}