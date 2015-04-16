package com.springcamp.env;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springcamp.env.service.DatabaseProperties;

@Controller
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    private Environment environment;

    @Autowired
    private DatabaseProperties prop;

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Hello world!");
		model.addAttribute("profilesActives", Arrays.toString(environment.getActiveProfiles()));
		model.addAttribute("dbDriver", prop.getDriver());
		model.addAttribute("dbUrl", prop.getUrl());
		model.addAttribute("dbUser", prop.getUser());
		model.addAttribute("dbPassword", prop.getPassword());

		return "hello";
	}
}