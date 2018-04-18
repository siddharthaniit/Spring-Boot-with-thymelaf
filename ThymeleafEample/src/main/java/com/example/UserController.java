package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

	@RequestMapping("/")
	public String index()
	{
		return "index";
	}
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public ModelAndView profile(@ModelAttribute User user)
	{
		
		String email = user.getEmail();
		
		System.out.println(email);
		
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.setViewName("profile");
		
		modelAndView.addObject("user",user);
		
		return modelAndView;
		
	}
}
