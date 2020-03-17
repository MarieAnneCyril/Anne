package com.cts;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Country_ResponseBody {
@RequestMapping(value="/country11",method=RequestMethod.GET)
public @ResponseBody CountryBean getCountry()
{
	//response is not as a view file
	//response is object.json
	return new CountryBean("India","Winter");
			}
@RequestMapping(value="/country12",method=RequestMethod.GET)
public @ResponseBody List<CountryBean>getCountries()
{
	List<CountryBean> comp=new ArrayList<CountryBean>();
	comp.add(new CountryBean("USA","tropical"));

	comp.add(new CountryBean("SYDNEY","winter dry"));

	comp.add(new CountryBean("FRANCE","ice core"));
	return comp;
}



}
