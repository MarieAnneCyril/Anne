package com.cts;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeValidController {
@RequestMapping("/myvalid")
public String display(Model m){
	m.addAttribute("emp1",new EmployeeBean_Valid());
	return "EmpValid";
}
@RequestMapping("/callvalid")
public String submitForm(
		@Valid
		@ModelAttribute("emp1")
EmployeeBean_Valid e,
BindingResult br){
	if(br.hasErrors()){
		return "EmpValid";
	}
	else{
		return "EmpValidSuccess";
	}
}





}
