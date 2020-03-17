package com.dao;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//@Configuration
//@ComponentScan(basePackages={"com.cts","com.dao"})
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cts.EmployeeBean;

@Controller

public class MVCCRUD {
	@Autowired
EmpJDBCController dao2;
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String save(EmployeeBean emp){
		dao2.save1(emp);
		return "redirect:/viewemps";
	}
	@RequestMapping("/viewemps")
	public String viewemp(Model m){
		List<EmployeeBean> list=dao2.getEmployees();
		m.addAttribute("emplist",list);
		return "viewemps";
	}
	
	



	@RequestMapping(value="/delete/{eno}",method = RequestMethod.GET)

	 public String delete(@PathVariable int eno){

	  dao2.delete(eno);

	  return "redirect:/viewemps";

	}
	
}
