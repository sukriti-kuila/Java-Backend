package com.spring_mvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring_mvc.Model.User;

@Controller
public class HomeController {
	@ModelAttribute
	public void common(Model m)
	{
		m.addAttribute("Header","Spring MVC Practice");
	}
	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("name","sukriti");
		return "homepage";
	}
	@PostMapping("/add")
	public String add(@RequestParam("num1") int n1, @RequestParam("num2") int n2,
			Model model)
	{
		int sum = n1+n2;
		model.addAttribute("res",sum);
		return "result";
	}
	@PostMapping("/processForm")
	public String userData(@ModelAttribute User user)
	{
		return "Userpage";
	}
}
