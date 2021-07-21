package sh.controllers;

import javax.enterprise.inject.Model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import sh.model.Login;

@Controller
public class LoginControllerImpl {

	@RequestMapping("/login")
	public String login(org.springframework.ui.Model model){
		
		Login obj=new Login("unknow@gmail.com","");
		model.addAttribute("lg",obj);
		return "index";
	}
	
	@RequestMapping("/auth")
	public String authenticate(Login l)
	{
		boolean success = l.getEmail().contains(l.getPassword());
		if(success)
			return "welcome";
		else
			return "failed";

		
	}
	
}
