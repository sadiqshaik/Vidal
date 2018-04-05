package com.vidal.Health;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.vidal.Health.bean.User;

@Controller
public class UserController {
	
	@RequestMapping(value="user", method= RequestMethod.GET)
	public User user() {
		return new User();
	}
	
@RequestMapping(value="createUser", method = RequestMethod.POST)
public ModelAndView createUser(@ModelAttribute("user") @Valid User user, BindingResult result, ModelMap model) {
	if(result.hasErrors()) {
		return new ModelAndView("user");
	}
	
	model.addAttribute("name",user.getName());
	model.addAttribute("age",user.getAge());
	model.addAttribute("location", user.getLocation());
	return new ModelAndView("success");
	//return new ModelAndView("redirect:views/success.jsp");
}
}
