package com.cts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
/*Internationalization process of designing an application that can be adapted to various languages and regions*/
@Controller
public class InternationalizationController {
@RequestMapping(value="/user_i18n",method=RequestMethod.GET)
public ModelAndView initView(){
	ModelAndView modelview=new ModelAndView();
	modelview.addObject("msg","Spring Mvc Internationalization Example");
	modelview.setViewName("resourcebundleview");
	return modelview;
		
		
	}
}

