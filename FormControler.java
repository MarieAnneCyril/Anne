package com.cts;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormControler {
	@RequestMapping(value="/checkaccount",method=RequestMethod.POST)
	public String display(
			
			@RequestParam("user1")
			String username,
			@RequestParam("pass")
	String pass1,
	Model m
	)

	{
		if(username.equals("anne"))
				{
			String msg="hello"+username;
			m.addAttribute("message",msg);
			return "successpage";
					}
		else{
			String msg="Sorry invalid"+username;
			m.addAttribute("message",msg);
			return "errorpage";
					}
			
			
		}
		}
	
